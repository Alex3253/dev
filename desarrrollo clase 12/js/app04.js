/* DECLARACION Y INICIALIZACION DE UN ARREGLO */
const nombres = ['Tejada', 'Serrato', 'Vardales', 'Castañeda', 'Medina', 'Villegas', 'Maradona', 'Calisto'];
/* DECLARACION DE CONSTANTES */
const lista = document.querySelector('#lista ul');

/* RECORRER EL ARREGLO PARA IMPRIMIRLO EN EL HTML */
nombres.forEach(nombre => {
    const li = document.createElement('li');
    li.textContent = nombre;
    lista.appendChild(li);
});
