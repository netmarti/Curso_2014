<?php
    $conexion = mysql_connect("localhost","root","")or die ("Error de servidor");
	mysql_select_db("misusuarios") or die ("Error BD");
	
	$ssql="UPDATE misusuarios SET login='".$_POST['nuevologin']."',password='".$_POST['nuevopass']."'WHERE login='".$_POST['loginb']."'";
	
	echo $ssql;
	mysql_query($ssql, $conexion);
	mysql_close($conexion); 

// nuevologin, nuevopass y loginb son los nombres de las nuevas variables del formulario

?>
