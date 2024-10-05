/*
Tipos de metodods del arreglo
*/ 
const frutas=['pera','manzana','naranaja','fresa','platano'];
console.log(frutas);

//Elimina el ultimo elmento del arreglo
frutas.pop();
console.log(frutas);

//Eliminar el primer elemento del arreglo
frutas.shift();
console.log(frutas);

//como agregar un elemento al final del arreglo
frutas.push('Cereza');
console.log(frutas);

//como agregar un elemento al inicio del arreglo
frutas.unshift('kiwi');
console.log(frutas);

//eliminar un elemento a partir de la posicion[2]
//splice(posicion inicial,cantidad de elementos)
frutas.splice(2,1);
console.log(frutas);

//eliminar dos elemento a partir de la posicion[1]
//splice(posicion inicial,cantidad de elementos)
frutas.splice(1,2);
console.log(frutas);

//agregar un elementos a partir de la posicion 1
frutas.splice(1,0,'piña');
console.log(frutas);

//agregar dos elementos a partir de la posicion 2
frutas.splice(2,0,'mango','uva','pacay');
console.log(frutas);

//modififcar un elementos a partir de la posicion 0
//splice(posicion inicial,cantidad de elementos)
frutas.splice(0,1,'Melocoton')
console.log(frutas);
frutas.splice(2,2,'Sandia','ciruela')
console.log(frutas);

//Arreglar un arreglo d emanera ascendente(A-Z)
frutas.sort();
console.log(frutas);
//Obtener un arreglo de forma descendente(Z-A)
frutas.reverse();
console.log(frutas);

//Obtener el indice de un elemento "Melocoton"de un arreglo
const indice = frutas.indexOf('Melocoton');
console.log("indice del elemento del Melocoton : " + indice);

//Concatenar o unir arreglos
frutasActuales=['mango','uva','fresa'];
console.log(frutasActuales);
frutasNuevas=['kiwi','platano']
console.log(frutasNuevas);
const venta = frutasActuales.concaf(frutasNuevas);
console.log(venta);

//convertir un arreglo a una cadena de texto
const cadena = venta.join();
console.log(cadena);