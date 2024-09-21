/* ----- Implementar un evento como atributo desde html */
function sumar(){
    let n1,n2,resultado;
    //entrada de datos
    n1 = parseFloat(document.getElementById('txtn1').value);
    n2 = parseFloat(document.getElementById('txtn2').value);
    //proceso de datos
    resultado = n1+n2;
    //salida de datos
    document.getElementById('txtsalida').value = resultado;
}

/* ----- Implementar un evento como propiedad desde javascript */
const btnResta = document.getElementById('btnRestar');
btnResta.ondblclick = function(){
    let n1,n2,resultado;
    //entrada de datos
    n1 = parseFloat(document.getElementById('txtn1').value);
    n2 = parseFloat(document.getElementById('txtn2').value);
    //proceso de datos
    resultado = n1-n2;
    //salida de datos
    document.getElementById('txtsalida').value = resultado;
}

/* ----- Implementar un evento como oyente desde javascript */
const btnMultiplica = document.getElementById('btnMultiplicar');
btnMultiplica.addEventListener('mouseover',()=>{
    let n1,n2,resultado;
    //entrada de datos
    n1 = parseFloat(document.getElementById('txtn1').value);
    n2 = parseFloat(document.getElementById('txtn2').value);
    //proceso de datos
    resultado = n1*n2;
    //salida de datos
    document.getElementById('txtsalida').value = resultado;
});

/* ----- Implementar varios eventos como oyentes desde javascript */
const btnDivideReside = document.getElementById('btnDividirResidir');
btnDivideReside.addEventListener('click',dividir);
btnDivideReside.addEventListener('dblclick',residir);

function dividir(){
    let n1,n2,resultado;
    //entrada de datos
    n1 = parseFloat(document.getElementById('txtn1').value);
    n2 = parseFloat(document.getElementById('txtn2').value);
    //proceso de datos
    resultado = n1/n2;
    //salida de datos
    document.getElementById('txtsalida').value = resultado;
}

function residir(){
    let n1,n2,resultado;
    //entrada de datos
    n1 = parseFloat(document.getElementById('txtn1').value);
    n2 = parseFloat(document.getElementById('txtn2').value);
    //proceso de datos
    resultado = n1%n2;
    //salida de datos
    document.getElementById('txtsalida').value = resultado;
}






