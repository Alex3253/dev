//Declaacion de un arreglo vacio
const codigo= [];
const nombre = [];
const nivel = [];
//Declaracion de una constante
const tbody = document.querySelector('#salida tbody')

//Entrada de datos
function btnAgregar() {
    let Codigo = document.getElementById('textCodigo').value;
    let Nombre = document.getElementById('textNombre').value;
    let Edad = document.getElementById('textNivel').value;

    if (codigo === "" || nombre === "" || nivel === "") {
        alert("Por favor, complete todos los campos.");
        return;
    }

    // Agregar un elemento al final del arreglo
    codigo.push(codigo);
    nombre.push(nombre);
    nivel.push(nivel);
    
    // Limpiar la tabla
    tbody.innerHTML = "";

    // Mostrar los datos en la tabla
    for (let x = 0; x < Nombre.length; x++) {
        const tr = document.createElement('tr');
        const td1 = document.createElement('td');
        const td2 = document.createElement('td');
        const td3 = document.createElement('td');
        td1.textContent = codigo[x];
        td2.textContent = nombre[x];
        td3.textContent = nivel[x];
        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);
        tbody.appendChild(tr);
    }

    // Limpiar los campos de entrada
    document.getElementById('textCodigo').value = '';
    document.getElementById('textNombre').value = '';
    document.getElementById('textNivel').value = '';
}


    