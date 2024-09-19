/*
Tipos de funciones
*/

//Funciones declarativas (tradicionales)
//--->Funcion sin parametros y sin retorno
function saludo(){
    alert("Curso de NodeJS........")
}

saludo();

//--->Funcion con parametros y sin retorno
function saludo2(nombre){
    alert("Bienbenido estimado " + nombre)
}

usuario=prompt("Ingresa tu nombre: ")
saludo2(usuario);

//--->Funcion sin parametros y con retorno

function saludo3(nombre){
    return "Instituto Certus"
}

mensaje3=saludo3();
alert(saludo3());

//--->Funcion con paramentro y con retorno

function operacion(n1,n2){
    resultado=(n1+n2)
    return resultado
}
n1=parseInt(prompt("Ingrese el primer valor:"))
n2=parseInt(prompt("Ingrese el segundo valor:"))
suma= operacion(n1, n2)
alert("La suma de los numeros es: " + suma)