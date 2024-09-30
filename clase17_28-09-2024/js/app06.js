//Declaacion de un arreglo vacio
const Nombre= [];
const edades = [];
//Declaracion de una constante
const tbody = document.querySelector('#salida tbody')

//Entrada de datos
function btnAgregar() {
    let nombre = document.getElementById('textNombre').value;
    let edad = document.getElementById('textEdad').value;

    // Verificar que ambos campos no estén vacíos
    if (nombre === "" || edad === "") {
        alert("Por favor, ingrese tanto el nombre como la edad.");
        return; // No continúa si hay campos vacíos
    }

    // Agregar un elemento al final del arreglo
    Nombre.push(nombre);
    edades.push(edad);
    
    // Limpiar la tabla
    tbody.innerHTML = "";

    // Mostrar los datos en la tabla
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

    // Limpiar los campos de entrada
    document.getElementById('textNombre').value = '';
    document.getElementById('textEdad').value = '';
}


    