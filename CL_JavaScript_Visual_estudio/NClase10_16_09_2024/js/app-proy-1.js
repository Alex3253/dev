/*
Declaracion de una funcion para iniciar los elelmentos html por medio id y los 
guardamos en variables
*/ 
function init(){
    //Declaracion de variables
    let resultado=document.getElementById('resultado');

    let igual=document.getElementById('igual')
    let reset=document.getElementById('reset')

    let suma=document.getElementById('suma')
    let resta=document.getElementById('resta')
    let multiplicacion=document.getElementById('multiplicacion')
    let division=document.getElementById('division')

    let cero=document.getElementById('cero')
    let uno=document.getElementById('uno')
    let dos=document.getElementById('dos')
    let tres=document.getElementById('tres')
    let cuatro=document.getElementById('cuatro')
    let cinco=document.getElementById('cinco')
    let seis=document.getElementById('seis')
    let siete=document.getElementById('siete')
    let ocho=document.getElementById('ocho')
    let nueve=document.getElementById('nueve')
}
//Declaracion de variables globales
let operandoa, operandob, operacion;

/* 
Asignando eventos a todos los elementos de tipo button que son 
numeros, operaciones, igual y reset
*/



cero.onclick=function(){
    resultado.textContent= resultado.textContent + "0";
}
uno.onclick=function(){
    resultado.textContent= resultado.textContent + "1";
}
dos.onclick=function(){
    resultado.textContent= resultado.textContent + "2";
}
tres.onclick=function(){
    resultado.textContent= resultado.textContent + "3";
}
cuatro.onclick=function(){
    resultado.textContent= resultado.textContent + "4";
}
cinco.onclick=function(){
    resultado.textContent= resultado.textContent + "5";
}
seis.onclick=function(){
    resultado.textContent= resultado.textContent + "6";
}
siete.onclick=function(){
    resultado.textContent= resultado.textContent + "7";
}
ocho.onclick=function(){
    resultado.textContent= resultado.textContent + "8";
}
nueve.onclick=function(){
    resultado.textContent= resultado.textContent + "9";
}


reset.onclick=function(){
    resetear();
}

//Operadores matematicos

suma.onclick=function(){
    operandoa=resultado.textContent;
    operacion="+";
    limpiar();
}

resta.onclick=function(){
    operandoa=resultado.textContent;
    operacion="-";
    limpiar();
}

multiplicacion.onclick=function(){
    operandoa=resultado.textContent;
    operacion="*";
    limpiar();
}

division.onclick=function(){
    operandoa=resultado.textContent;
    operacion="/";
    limpiar();
}

igual.onclick=function(){
    operandob=resultado.textContent;
    resolver();
}

/* 
Otras funciones
*/
function resetear(){
    resultado.textContent="";
    operandoa=0;
    operandob=0;
    operacion="";
}

function limpiar(){
    resultado.textContent="";

}



//Declaracon de una funcion poara reaizar la operacion seleccionada y mostarar el resultao

function resolver(){
    
    let res=0;
    switch(operacion){
        case  "+":
            res=parseFloat(operandoa) + parseFloat(operandob)
            break;
        case  "-":
            res=parseFloat(operandoa) - parseFloat(operandob)
            break;
        case  "*":
            res=parseFloat(operandoa) * parseFloat(operandob)
            break;
        case  "/":
            res=parseFloat(operandoa) / parseFloat(operandob)
            break;
        
    }
    resultado.textContent= res;

}
