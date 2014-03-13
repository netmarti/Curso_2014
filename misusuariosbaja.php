    <?php
    $conexion = mysql_connect("localhost","root","")or die ("Error de servidor");
	mysql_select_db("misusuarios") or die ("Error BD");
	
	$ssql="DELETE FROM misusuarios WHERE login='".$_POST['loginbaja']."'";
	

	echo $ssql;
	mysql_query($ssql, $conexion);
	mysql_close($conexion); 

// DELETE FROM misusuarios WHERE campo1 ='valor1' que viene de la caja loginbaja

?>
