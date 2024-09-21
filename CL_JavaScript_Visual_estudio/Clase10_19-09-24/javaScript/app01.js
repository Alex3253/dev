/*
Crear un elemento html
*/

const boton=document.createElement('button');
boton.textContent='Procesar datos';
boton.className='btn';
boton.id='btnProcesar';

const contenedor=document.createElement('div');
contenedor.innerHTML='<p>Titulo principal del <i>blogger</i></p>';


/**
Insertar un documento al document
*/
//Seleccionar la tarjeta1(padre)
const t1p=document.querySelector('#card1 div');              //esto esp ra que este en un lugar especifico
//Insertar elemento(hijo)
t1p.appendChild(boton)

//Seleccionar la tarjeta2(padre)
const t2p=document.getElementById('card2');                 // el elelmento insertado va a la parte inferior por defecto
//Insertar elemento(hijo)
t2p.appendChild(contenedor)


/**
Eliminar un elemento hijo(parrafo) del padre(tarjeta3)
*/

//Seleccionar la tarjeta3(padre)
const t3p=document.querySelector('#card3 ');                 
//seleccionar el parrafo (hijo)
const p3=document.querySelector('#card3 p');
//Eliminar hijo
t3p.removeChild(p3)