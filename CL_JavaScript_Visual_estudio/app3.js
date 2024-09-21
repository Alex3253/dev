/*
Ejercicio #01
Desarrollar una aplicacion que permita solicitar el nombre del cliente,
precio el producto y cantidad del producto, 
Para luego mostrar los sgtes datos :
nombre del cliente, precio, cantidad y total a pagar
*/


//Declaracion de variables
let nombre, precio, cantidad, total;
//Entrada de datos
nombre = prompt("Ingresa el nombre del cliente : ")
precio = parseFloat(prompt("Ingresa el precio del producto : "));
cantidad = parseInt(prompt("Ingresa la cantidad a comprar : "));
//Proceso de datos
total = precio * cantidad;
//Salida de datos
const contenedor = document.getElementsByClassName('container')
contenedor.innerHtml = `<pre>
    Nombre del cliente : ${nombre}
    Precio del producto : ${precio}
    Cantidad de productos : ${cantidad}
    Total a pagar : ${total}
</pre>`