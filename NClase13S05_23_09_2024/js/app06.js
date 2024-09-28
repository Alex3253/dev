/*Declaracion de un arreglo vacio*/
const nombres=[];
const edades=[];

/*Declaracion de constantes */
const tbody=document.querySelector('#salida tbody');

function btnAgregar() {
    let nombre=document.getElementById('txtNombre').value;
    let edad=document.getElementById("txtEdad").value;

    nombres.push(nombre);  
    edades.push(edad);                                               /*Agregar un elemento al final del arreglo */
    /*Limpiar la tabla */
    tbody.innerHTML="";
    /*recorre el arreglo para imprimirlo */

    for(let x=0;x<nombres.length;x++){
        const tr=document.createElement('tr');
        const td1=document.createElement('td');
        const td2=document.createElement('td');
        td1.textContent=nombres[x];
        td2.textContent=edades[x];
        tr.appendChild(td1);
        tr.appendChild(td2);
        tbody.appendChild(tr)
    }
    document.getElementById('txtNombre').value="";
    document.getElementById("txtEdad").value="";
}



