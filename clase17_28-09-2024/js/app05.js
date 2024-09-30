//Declaacion de un arreglo vacio
const Nombre= [];

//Declaracion de una constante
const ul = document.querySelector('#lista ul');
let rpta ='S';

//Entrada ded atos
while(rpta=='S'|| rpta =='s'){
let nombre = prompt("Ingresa el nombre del estudiante :");

/*
Proceso de datos
Agregar un elemento al final del arreglo*/
Nombre.push(nombre);
rpta = prompt("Deseas continuar S/N :")
console.log(Nombre);
}

for(let x =0 ; x<Nombre.length ; x++){
    const li = document.createElement('li');
    li.textContent = Nombre[x];
    lista.appendChild(li);
}

