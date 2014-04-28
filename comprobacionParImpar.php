<?php

// el valor que nos llega desde el formulario en una variable
$numero = $_POST['numero'];

//comprobamos si se ha introducido un valor 

if (isset($numero)){

	if ($numero%2==0){
		print $numero." Es un valor par.";
	}
	else{
		print $numero." Es un valor impar.";
	}
}

?>
<br><br>
<a href='FormCompruebaParImpar.html' style="color:black;text-decoration:none;border:1px solid black; padding:5px;background:lightgrey">Volver</a>
