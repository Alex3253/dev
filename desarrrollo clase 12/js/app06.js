//Declaacion de un arreglo vacio
const Nombre= [];
const edades = [];
//Declaracion de una constante
const tbody = document.querySelector('#salida tbody')

//Entrada ded atos
function btnAgregar(){
        let nombre = document.getElementById('txtNombre').value;
        let edad = document.getElementById('txtEdad').value;

        if (nombre || !edad) {
            alert("Por favor, complete ambos campos.");
            return; // Sale de la funcion si hay campos vacios
        }

        //Agregar un elemento al final del arreglo
        Nombre.push(nombre);
        edades.push(edad);
        //Limpiar la tabla
        tbody.innerHtml = "";
        for(let x =0 ; x<Nombre.length ; x++){
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