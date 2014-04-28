<?php
//Este archivo se utiliza junto con TablaMultiplicar.php
// el valor que nos llega desde el formulario en una variable

$num=$_POST['numero'];


//comprobamos si se ha introducido un valor 

if(isset($num)){

	for ($i=0;$i<=10;$i++){
		print $num." x ".$i." = ".($num*$i)."<br>";
	}
}


?>
<br><br>
<a href='TablaMultiplicar.html' style="color:black;text-decoration:none;border:1px solid black; padding:5px;background:lightgrey">Volver</a>
