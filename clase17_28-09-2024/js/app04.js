/*DECLARACION Y INICIALIZACION DE UN ARREGLO */
const nombres = ['tejada','serrato','vardales','castañeda','medina','villegas','maradona','calisto'];
/*DECLARACION DE CONSTANTES */
const lista = document.querySelector('#lista ul')

/*RECORRER EL ARREGLO PARA IMPRIMIRLO EN EL HTML */

for(let x =0 ; x<nombres.length ; x++){
    const li = document.createElement('li');
    li.textContent = nombres[x];
    lista.appendChild(li);
}