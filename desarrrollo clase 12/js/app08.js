// Array para almacenar los estudiantes
let estudiantes = [];

// Funcion para agregar un estudiante
function btnAgregar() {
    const codigo = document.getElementById("txtcodigo").value; 
    const nombre = document.getElementById("txtnombre").value; 
    const nivel = document.getElementById("txtnivel").value; 

    // Verifica que el codigo sea un numero de 8 digitos
    if (!/^\d{8}$/.test(codigo)) { 
        alert("El codigo debe ser un numero de 8 digitos.");
        return; 
    }

    // Verifica que todos los campos estan completos
    if (nombre && nivel) {
        estudiantes.push({ codigo, nombre, nivel }); 
        alert("Estudiante agregado exitosamente"); 
        limpiarCampos();
        mostrarEstudiantes(); 
    } else {
        alert("Por favor, completa todos los campos."); 
    }
}

// Funcion para limpiar los campos de entrada
function limpiarCampos() {
    document.getElementById("txtcodigo").value = ''; 
    document.getElementById("txtnombre").value = ''; 
    document.getElementById("txtnivel").value = ''; 
}

// Funcion para mostrar la lista de estudiantes
function mostrarEstudiantes(estudiantesList = estudiantes) { 
    const tbody = document.querySelector("tbody"); 
    tbody.innerHTML = ''; 

    // Itera sobre la lista de estudiantes y crea filas en la tabla
    estudiantesList.forEach((estudiante, index) => {
        const tr = document.createElement("tr"); 
        tr.innerHTML = `
            <td>${estudiante.codigo}</td>
            <td>${estudiante.nombre}</td>
            <td>${estudiante.nivel}</td>
            <td>
                <button onclick="editarEstudiante(${index})">Editar</button> <!-- Boton para editar -->
                <button onclick="eliminarEstudiante(${index})">Eliminar</button> <!-- Boton para eliminar -->
            </td>
        `;
        tbody.appendChild(tr); 
    });
}

// Funcion para eliminar un estudiante
function eliminarEstudiante(index) {
    estudiantes.splice(index, 1); 
    mostrarEstudiantes(); 
}

// Funcion para editar un estudiante
function editarEstudiante(index) {
    const estudiante = estudiantes[index]; 
    document.getElementById("txtcodigo").value = estudiante.codigo; 
    document.getElementById("txtnombre").value = estudiante.nombre; 
    document.getElementById("txtnivel").value = estudiante.nivel; 

    // Cambiar el comportamiento del boton de agregar a actualizar
    const btnAgregar = document.querySelector(".btn-container button");
    btnAgregar.innerText = "Actualizar"; 
    btnAgregar.setAttribute("onclick", `actualizarEstudiante(${index})`); 
}

// Funcion para actualizar un estudiante
function actualizarEstudiante(index) {
    const codigo = document.getElementById("txtcodigo").value; 
    const nombre = document.getElementById("txtnombre").value; 
    const nivel = document.getElementById("txtnivel").value; 

    // Verifica que el codigo sea un numero de 8 digitos
    if (!/^\d{8}$/.test(codigo)) { 
        alert("El codigo debe ser un numero de 8 digitos.");
        return; 
    }

    // Verifica que todos los campos esten completos
    if (nombre && nivel) {
        estudiantes[index] = { codigo, nombre, nivel }; 
        alert("Estudiante actualizado exitosamente"); 
        limpiarCampos(); 

        // Resetear el boton de agregar
        const btnAgregar = document.querySelector(".btn-container button");
        btnAgregar.innerText = "Agregar"; 
        btnAgregar.setAttribute("onclick", "btnAgregar()"); 

        mostrarEstudiantes(); 
    } else {
        alert("Por favor, completa todos los campos."); 
    }
}

// Funcion para buscar un estudiante
function buscarEstudiante() {
    const codigo = document.getElementById("txtConsultaCodigo").value; 
    const nivel = document.getElementById("txtConsultaNivel").value; 

    let resultados = estudiantes; 

    // Filtra los resultados segun el codigo ingresado
    if (codigo) {
        resultados = resultados.filter(est => est.codigo === codigo); 
        if (resultados.length === 0) {
            alert("No se encontraron estudiantes con el codigo ingresado."); 
            return; 
        }
    } else {
        alert("Por favor, ingrese un codigo de estudiante."); 
        return; 
    }

    // Filtra los resultados segun el nivel ingresado
    if (nivel) {
        resultados = resultados.filter(est => est.nivel === nivel); 
        if (resultados.length === 0) {
            alert("No se encontraron estudiantes en el nivel ingresado."); 
        }
    } else {
        alert("Por favor, ingrese un nivel de estudiante."); 
        return; 
    }

    mostrarEstudiantes(resultados); 

    // Mensaje final si no se encontraron estudiantes
    if (resultados.length === 0) {
        alert("No se encontraron estudiantes."); 
    }
}
