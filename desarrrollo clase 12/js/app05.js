// Declaracion de arreglos vacios
const nombres = [];
const edades = [];

// Función para agregar estudiantes
function btnAgregar() {
    let rpta = 'S';

    while (rpta === 'S' || rpta === 's') {
        let nombre = prompt("Ingrese el nombre del estudiante: ");
        let edad = prompt("Ingrese la edad del estudiante: ");
        
        // Agregar elementos a los arreglos
        nombres.push(nombre);
        edades.push(edad);
        
        // Preguntar si desea continuar
        rpta = prompt("¿Deseas agregar otro estudiante S/N?");
    }

    // Mostrar la lista en la tabla
    mostrarEstudiantes();
}

// Función para mostrar estudiantes en la tabla
function mostrarEstudiantes() {
    const tbody = document.querySelector('tbody');
    tbody.innerHTML = ''; // Limpiar la tabla antes de agregar nuevos datos

    for (let i = 0; i < nombres.length; i++) {
        const tr = document.createElement('tr');
        
        const tdNombre = document.createElement('td');
        tdNombre.textContent = nombres[i];
        
        const tdEdad = document.createElement('td');
        tdEdad.textContent = edades[i];

        tr.appendChild(tdNombre);
        tr.appendChild(tdEdad);
        tbody.appendChild(tr);
    }
}
