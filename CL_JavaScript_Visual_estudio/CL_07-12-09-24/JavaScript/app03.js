/* 
Tipos de eventos
*/

//Inplementando un evento como atributo desde html
function sumar(){
    //Declaracion 
    let n1, n2, resultado;

    //Entradda de datos
    n1= document.getElementById('txtn1').textContent
    n2= document.getElementById('txtn2').textContent

    //Proceso de datos
    resultado=n1+n2

    //Salida de datos
    document.getElementById('txtresultado').textContent=resultado
}