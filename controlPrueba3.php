<?php

// edad >18 años bienvenid@ <18 no puedes entrar a esta web

$usuario=$_POST['usuario'];
$edad=$_POST['edad'];

if (isset($usuario)&&($edad)){

	if ($edad<18){
		print "Hola ".$usuario.". No puedes acceder a este sitio web porque tu edad ".$edad." es inferior a la requerida.";
	}

	else{
		print "Hola ".$usuario.". Puedes acceder a este sitio web porque tu edad ".$edad." es adecuada. Bienvenid@ a este sitio web.";
	}

}
?>
<br><br>
<a href='prueba3.html' style="text-decoration:none; border:1px solid black;padding:5px;background:peru">VOLVER</a>
