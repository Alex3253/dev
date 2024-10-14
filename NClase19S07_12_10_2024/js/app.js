/*
--------------------------DECLARACION DE VARIABLES-----------------------------------
--------------------------------------------------------------------------------------------------
*/

//-------------------------Contenedor HEADER --------------------------------------------
//---> (Contenedor principal - tabla y boton)
const carrito = document.querySelector('#carrito');
//---> (Tabla del carrito-<table> ----- > Cuerpo-<tbody>)
const contenedorCarrito = document.querySelector('#lista-carrito tbody');
//---> (Hipervinculo fuera de la boton-<a>)
const vaciarCarritoBtn = document.querySelector('#vaciar-carrito')
//-------------------------Contenedor CONTAINER ----------------------------------------
const listaCursos = document.querySelector('#lista-cursos')
//-------------Definir un arreglo para almacenar los cursos seleccionados----------
let articulosCarrito = [];

/*
-----------------------ENTRADA DE DATOS-------------------------------------------------
-------------------------------------------------------------------------------------------------
*/



listaCursos.addEventListener('click', agregarCurso);
vaciarCarritoBtncarrito.addEventListener('click', vaciarCarrito);

function agregarCurso(e){
    if(e.target.classList.contains('agregar-carrito')){
        e.preventDefault()
        const cursoSeleccionado = e.target.parentElement.parentElement
        leerDatosCurso(cursoSeleccionado)
    }
}

function leerDatosCurso(cursoSeleccionado){
    const infoCurso = {
        imagen: cursoSeleccionado.querySelector('img').src,
        titulo: cursoSeleccionado.querySelector('h4').textContent,
        precio: cursoSeleccionado.querySelector('span').textContent,
        id: cursoSeleccionado.querySelector('a').getAttribute('data-id'),
        cantidad: 1
    }
    articulosCarrito = [...articulosCarrito,infoCurso]
    //Invoca al carrito de compras
    carritoHTML();
}

function carritoHTML(){
    //limpiar tabla
    limpiarCarrito()
    //iterar el arrglos basico por elemento
    articulosCarrito.forEach((curso)=>{
        const row = document.createElement('tr')
        row.innerHTML = `
        <td>
            <img src="${curso.imagen}" width="100px">
        </td>
        <td>${curso.titulo}</td>
        <td>${curso.precio}</td>
        <td>${curso.cantidad}</td>
        <td>
            <a href="#" class="borrar-curso" data-id="${curso.id}">x</a>
        </td>
    `
    contenedorCarrito.appendChild(row)
    })
  
}

function vaciarCarrito(e){
    contenedorCarrito.innerHTML=""
    
}

function limpiarCarrito(){
    contenedorCarrito.innerHTML=""
    
}








/*
listaCursos.addEventListener('click', prueba);

function prueba(evento) {
    if (evento.target.classList.contains('agregar-carrito')) {
        evento.preventDefault();
        const curso = evento.target.parentElement.parentElement;

        const informacion = {
            imagen: curso.querySelector('img').src,
            titulo: curso.querySelector('h4').textContent,
            precio: curso.querySelector('span').textContent,
            id: curso.querySelector('a').getAttribute('data-id')
        };

        articulosCarrito = [...articulosCarrito, informacion];

        // Prepara carrito
        const fila = document.createElement('tr');
        fila.innerHTML = `
            <td>
                <img src="${informacion.imagen}" alt="${informacion.titulo}">
            </td>
            <td>${informacion.titulo}</td>
            <td>${informacion.precio}</td>
        `; // Asegúrate de usar el signo de igual (=) aquí

        contenedorCarrito.appendChild(fila);
        console.log(articulosCarrito);
    }
}
*/


/**
listaCursos.addEventListener('click', agregarCurso);

function agregarCurso(e) {
    if (e.target.classList.contains('agregar-carrito')) {
        e.preventDefault();
        const cursoSeleccionado = e.target.parentElement.parentElement;
        leerDatosCurso(cursoSeleccionado);
    }
}

function leerDatosCurso(cursoSeleccionado) {
    const infoCurso = {
        imagen: cursoSeleccionado.querySelector('img').src,
        titulo: cursoSeleccionado.querySelector('h4').textContent,
        precio: cursoSeleccionado.querySelector('span').textContent,
        id: cursoSeleccionado.querySelector('a').getAttribute('data-id'),
        cantidad: 1
    };

    // Verificar si el curso ya existe en el carrito
    const existe = articulosCarrito.some(curso => curso.id === infoCurso.id);
    if (existe) {
        // Incrementar cantidad
        articulosCarrito = articulosCarrito.map(curso => {
            if (curso.id === infoCurso.id) {
                curso.cantidad++;
            }
            return curso;
        });
    } else {
        // Agregar nuevo curso
        articulosCarrito = [...articulosCarrito, infoCurso];
    }

    // Invoca al carrito de compras
    carritoHTML();
}




function carritoHTML() {
    // Limpiar el contenedor antes de agregar los cursos
    contenedorCarrito.innerHTML = '';

    // Iterar el arreglo básico por elemento
    articulosCarrito.forEach((curso) => {
        const row = document.createElement('tr');
        row.innerHTML = `
        <td>
            <img src="${curso.imagen}" width="100px">
        </td>
        <td>${curso.titulo}</td>
        <td>${curso.precio}</td>
        <td>${curso.cantidad}</td>
    `;
        contenedorCarrito.appendChild(row);
    });
}

 
*/










/**
listaCursos.addEventListener('click', agregarCurso);

function agregarCurso(e) {
    if (e.target.classList.contains('agregar-carrito')) {
        e.preventDefault();
        const cursoSeleccionado = e.target.parentElement.parentElement;
        leerDatosCurso(cursoSeleccionado);
    }
}

function leerDatosCurso(cursoSeleccionado) {
    const infoCurso = {
        imagen: cursoSeleccionado.querySelector('img').src,
        titulo: cursoSeleccionado.querySelector('h4').textContent,
        precio: cursoSeleccionado.querySelector('span').textContent,
        id: cursoSeleccionado.querySelector('a').getAttribute('data-id'),
        cantidad: 1
    };

    // Verificar si el curso ya existe en el carrito
    const existe = articulosCarrito.some(curso => curso.id === infoCurso.id);
    if (existe) {
        // Incrementar cantidad
        articulosCarrito = articulosCarrito.map(curso => {
            if (curso.id === infoCurso.id) {
                curso.cantidad++;
            }
            return curso;
        });
    } else {
        // Agregar nuevo curso
        articulosCarrito = [...articulosCarrito, infoCurso];
    }

    // Invoca al carrito de compras
    carritoHTML();
}

function carritoHTML() {
    // Limpiar tabla
    LimpiarHtml();

    // Iterar el arreglo básico por elemento
    articulosCarrito.forEach((curso) => {
        const row = document.createElement('tr');
        row.innerHTML = `
        <td>
            <img src="${curso.imagen}" width="100px">
        </td>
        <td>${curso.titulo}</td>
        <td>${curso.precio}</td>
        <td>${curso.cantidad}</td>
    `;
        contenedorCarrito.appendChild(row);
    });
}

function LimpiarHtml() {
    contenedorCarrito.innerHTML = "";
}

// Agregar evento para vaciar el carrito
vaciarCarritoBtn.addEventListener('click', vaciarCarrito);

function vaciarCarrito() {
    // Limpiar el carrito
    articulosCarrito = []; // Vaciar el arreglo
    LimpiarHtml(); // Limpiar el HTML del carrito
}
 */