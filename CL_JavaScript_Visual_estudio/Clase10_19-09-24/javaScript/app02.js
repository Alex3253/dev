/**
Desplazamiento dentro del arbol de elementos
*/

//Desplazamiento de un nivel inferior (Parrafo "(p)" ) a un nivel superior(Section)
const parrafot1=document.querySelector('#card1 p');
const tarjeta1=parrafot1.parentElement;                    //Significa que subiremos un nivel

//Obtener el contenido de los elementos
const titulo1=tarjeta1.textContent
const parrafo1=tarjeta1.textContent

//Desplazamiento de un nivel inferior (button ) a un nivel superior(Section)
const boton2=document.querySelector('#card2 button');
const tarjeta2=boton2.parentElement.parentElement;

//Obtener el contenido de los elementos
const titulo2=tarjeta2.textContent
const parrafo2=tarjeta2.textContent
const boton22=tarjeta2.textContent
console.log(titulo2)
console.log(parrafo2)
console.log(boton22)