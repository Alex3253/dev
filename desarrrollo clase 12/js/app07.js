// Declaración de arreglos
const Nombre = ['Carlos', 'Enrique', 'Lucia', 'Cesar', 'Goku', 'Gohan'];
const edades = [10, 15, 20, 25, 30, 35];
// Declaración de una constante para el tbody
const tbody = document.querySelector('#salida tbody');

// Rellenar la tabla inicialmente
for (let x = 0; x < Nombre.length; x++) {
    const tr = document.createElement('tr');
    const td1 = document.createElement('td');
    const td2 = document.createElement('td');
    td1.textContent = Nombre[x];
    td2.textContent = edades[x];
    tr.appendChild(td1);
    tr.appendChild(td2);
    tbody.appendChild(tr);
}

function btnBuscar() {
    tbody.innerHTML = ""; // Limpiar la tabla

    // Obtener la edad del input
    const edad = parseInt(document.getElementById('txtEdad').value, 10);
    
    // Comprobar si la edad es un número válido
    if (isNaN(edad)) {
        alert('Por favor, ingrese una edad válida.');
        return;
    }

    // Recorrer los arreglos
    for (let x = 0; x < Nombre.length; x++) {
        if (edades[x] >= edad) { // Filtrar por edad
            const tr = document.createElement('tr');
            const td1 = document.createElement('td');
            const td2 = document.createElement('td');
            td1.textContent = Nombre[x];
            td2.textContent = edades[x];
            tr.appendChild(td1);
            tr.appendChild(td2);
            tbody.appendChild(tr);
        }
    }
}