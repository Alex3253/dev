/*
Ejercicio #02
Desarrolla una aplicacion que permita solicitar el nombre y 3 evaluciones del 
estudiante mediante la ventana emergente, para luego mostrar el nombre, promedio
y observacion (Aprobado/Desaprobado)de sus evaluaciones en el documento html.
*/ 
//Declaracion de variable global
let observacion
//Entra de datos
let nombre =prompt("ingresa el nombre del estudiante: ");
let eva1=parseFloat(prompt("Ingrese la evaluacion #01: "));
let eva2=parseFloat(prompt("Ingrese la evaluacion #02: "));
let eva3=parseFloat(prompt("Ingrese la evaluacion #03: "));

//Proceso de datos
promedio=(eva1+eva2+eva3)/3;
if(promedio <=12.4){
    observacion="Desaprobado";
}else{
    observacion="Aprobado";
}

//Salida de datos
const principal=document.getElementById('principal');
principal.innerHTML=`<pre>
                    Detalle del  estudiante
                    -----------------------------------
                    Nombre del estudiante: ${nombre}
                    Promedio de lestudiante: ${promedio}
                    Observacon de estudiante: ${observacion}
                    </pre>`
console.log(principal);