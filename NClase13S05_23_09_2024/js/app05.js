/*Declaracion de un arreglo vacio*/
const nombres=[];

/*Declaracion de constantes */
const ul=document.querySelector('#listas ul');

let rpta='S';            // Debe estar declarado con let para poder reasignarlo
while(rpta=='S' || rpta=='s'){
    let nombre=prompt("Ingrese el mombre del estudiante: ");
    nombres.push(nombre);                                                 /*Agregar un elemento al final del arreglo */
    rpta=prompt("Deseas continuar S/N: ")
    console.log(nombres)
    
}
for(let x=0;x<nombres.length;x++){
    const li=document.createElement('li');
    li.textContent=nombres[x];
    lista.appendChild(li);
}






