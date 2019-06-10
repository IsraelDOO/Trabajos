function mostrarmensaje() {
	var nombre, apellidos, pais, correo, fecha, hora, comentarios;
	nombre = getElementById('n').value;
	apellidos = getElementById('a').value;
	pais = getElementById('p').value;
	correo = getElementById('c').value;
	fecha = getElementById('f').value;
	hora = getElementById('h').value;
	comentarios = getElementById('com').value;
	expresion = /\w+@\w+\.+[a-z]/;

	if (nombre == "" || apellidos == "" || pais == "" || correo == "" || fecha == "" || hora == "") {
		alert("Todos los campos son obligatorios.");
		return;
	} 
	else if (!expresion.text(correo)) {
		alert("El correo no es válido.");
		return;
	}
}

function validar(){
	alert("La información se ha enviado.");
}
