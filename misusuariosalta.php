<?php
    $conexion = mysql_connect("localhost","root","")or die ("Error de servidor");
	mysql_select_db("misusuarios") or die ("Error BD");
	
	$ssql="INSERT INTO usuarios(login, password) values ('".$_POST['nombreusu']."','".$_POST['password']."')";
	
	echo $ssql;
	mysql_query($ssql, $conexion);
	mysql_close($conexion);
?>
