const estudiantes = [];
const tbody = document.querySelector('#salida tbody');

function btnAgregar() {
    let codigo = document.getElementById('txtCodigo').value;
    let nombre = document.getElementById('txtNombre').value;
    let nivel = document.getElementById('txtNivel').value;

    if (codigo === "" || nombre === "" || nivel === "") {
        alert("Por favor, complete todos los campos.");
        return;
    }

    estudiantes.push({ codigo, nombre, nivel });

    // Limpiar la tabla y mostrar estudiantes
    mostrarEstudiantes();

    // Limpiar los campos de entrada
    document.getElementById('txtCodigo').value = '';
    document.getElementById('txtNombre').value = '';
    document.getElementById('txtNivel').value = '';
}

function mostrarEstudiantes() {
    tbody.innerHTML = "";
    for (let i = 0; i < estudiantes.length; i++) {
        const estudiante = estudiantes[i];
        const tr = document.createElement('tr');
        const td1 = document.createElement('td');
        const td2 = document.createElement('td');
        const td3 = document.createElement('td');
        const td4 = document.createElement('td');

        td1.textContent = estudiante.codigo;
        td2.textContent = estudiante.nombre;
        td3.textContent = estudiante.nivel;


        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);
        tr.appendChild(td4);
        tbody.appendChild(tr);
    }
}




function btnConsultarCodigo() {
    const codigoConsulta = document.getElementById('txtConsultaCodigo').value;
    const resultado = estudiantes.find(est => est.codigo === codigoConsulta);

    if (resultado) {
        alert(`Código: ${resultado.codigo}\nNombre: ${resultado.nombre}\nNivel: ${resultado.nivel}`);
    } else {
        alert("Estudiante no encontrado.");
    }
}

function btnConsultarNivel() {
    const nivelConsulta = document.getElementById('txtConsultaNivel').value;
    const resultados = estudiantes.filter(est => est.nivel === nivelConsulta);

    if (resultados.length > 0) {
        let mensaje = "Estudiantes en nivel " + nivelConsulta + ":\n";
        resultados.forEach(est => {
            mensaje += `Código: ${est.codigo}, Nombre: ${est.nombre}\n`;
        });
        alert(mensaje);
    } else {
        alert("No se encontraron estudiantes en este nivel.");
    }
}


