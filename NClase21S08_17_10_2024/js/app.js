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
cargarEventosListener();

function cargarEventosListener(){
    listaCursos.addEventListener('click',agregarCurso);
    carrito.addEventListener('click', eliminarCurso)
    vaciarCarritoBtn.addEventListener('click',vaciarCarrito);
    
}

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

    if(articulosCarrito.some(curso => curso.id===infoCurso.id)){
        const cursos=articulosCarrito.map(curso=>{
            if(curso.id===infoCurso.id){
                curso.cantidad++;
                return curso;
            }else{
                return curso;
            }
        })
        articulosCarrito=[...cursos]
    }else{
        articulosCarrito = [...articulosCarrito,infoCurso]
    }
    //Invoca al carrito de compras
    carritoHTML();
}

function eliminarCurso(e){
    if(e.target.classList.contains('borrar-curso')){
        //obtener el id del curso eliminar
        const cursoId =e.target.getAttribute('data-id')
        //crea o reemplaza un arrego nuevo con exepcion del id encontrado
        articulosCarrito=articulosCarrito.filter(curso => curso.id !== cursoId)
        //invocar id
        carritoHTML()
    }
}

function carritoHTML(){
    //Limpiar tabla
    vaciarCarrito()
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
            <a href="#" class="borrar-curso" data-id="${curso.id}">X</a>
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