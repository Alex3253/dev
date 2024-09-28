/*Declaracion de un arreglo vacio*/
const nombres=['carlos','enrique', 'sara', 'oscar', 'malina', 'ria'];
const edades=[10,15,20,25,30,35];

/*Declaracion de constantes */
const tbody=document.querySelector('#salida tbody');

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


function btnBuscar() {
    let edad = parseInt(document.getElementById("txtEdad").value);
    /*Limpiar la tabla */
    tbody.innerHTML="";

    /*recorre el arreglo para imprimirlo */
    for(let x=0;x<edades.length;x++){
        if(edades[x]>=edad ){
            const tr=document.createElement('tr');
            const td1=document.createElement('td');
            const td2=document.createElement('td');
            td1.textContent=nombres[x];
            td2.textContent=edades[x];
            tr.appendChild(td1);
            tr.appendChild(td2);
            tbody.appendChild(tr)
        }
        
    }
    document.getElementById("txtEdad").value="";
}




