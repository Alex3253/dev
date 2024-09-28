/*Declaracion e inicializacion de un arreglo*/

const nombres=['tejada','briseño', 'benites','castañeda', 'molleda', 'medina', 'villegas', 'bardales','serrato']
/*Declaracion de constantes */
const lista=document.querySelector('#lista ul')  //para insertar datos

/*Recorrer el arreglo para imprimirlo en el html */
for(let x=0;x<nombres.length;x++){
    const li=document.createElement('li');
    li.textContent=nombres[x];
    lista.appendChild(li);
}