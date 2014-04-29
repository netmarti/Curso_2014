<?php

$valor=$_POST['valor'];

//comprobamos que se ha pasado un valor

if (isset($valor)){

	//hacemos la primera tabla con un FOR

	for ($i=0;$i<10;$i++){

		print $valor." x ".$i." = ".($valor*$i)."<br>";
	}
	print "<br>La tabla anterior utiliza un bucle FOR<br><br>";


	//inicializamos fuera la variable contador que usamos en el while

	$i=0;
	while($i<10){
		print $valor." x ".$i." = ".($valor*$i)."<br>";
		$i++;
	} 
	print "<br>La tabla anterior utiliza un bucle WHILE<br><br>";


	//Hacemos la tabla con DoWhile

	$i=0;
	do {

		print $valor." x ".$i." = ".($valor*$i)."<br>";
		$i++;
	} while ($i<= 10);
	print "<br>La tabla anterior utiliza un bucle DoWhile<br><br>";
}
?>
<br>
<a href='prueba3.html' style="text-decoration:none; border:1px solid black;padding:5px;background:peru">VOLVER</a>
