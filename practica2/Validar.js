function mostrarmensaje() {
	var nombre, contrasena, correo, fecha;
	nombre = getElementById('a').value;
	contrasena = getElementById('b').value;
	correo = getElementById('c').value;
	fecha = getElementById('d').value;
	expresion = /\w+@\w+\.+[a-z]/;

	if (nombre.length == 0 || contrasena.length == 0 || correo.length == 0 
        || fecha.length == 0) {
            alert("Todos los campos son obligatorios.");
            return false;
	} 
	else if (!expresion.text(correo)) {
		alert("El correo no es válido.");
		return false;
	}
}

function validar(){
	alert("La información se ha enviado.");
}

function resetear(){
	alert("Se borrará la información.");
}
