<?php
session_start();
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Panel de Usuario</title>
</head>

<body>

	<h1>Bienvenido <?php echo $_SESSION["nombre"]." ".$_SESSION["apaterno"]." ".$_SESSION["amaterno"]; ?></h1>

<p>Has iniciado sesión como:</p>
<?php
if($_SESSION["nivel"] == "AD"){
	echo "<p><b>Administrador</b></p>";
} else {
	echo "<b><p>Usuario</b></p>";
}
?>
<p><a href="logout.php">Cerrar Sesión</a></p>
</body>
</html>
