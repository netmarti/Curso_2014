<?php
session_start();
//iniciamos el sistema de sesiones, no podemos dejar ni un espacio delante. Cargamos la variable de sesion 

$_SESSION['nombre'] = $_POST['nombre'];
$_SESSION['clave'] = $_POST['clave'];

//finalizamos la sesión
session_start();
session_unset();//finalizamos desconectando la sesión
session_destroy();//borra la sesión completamente, si queremos acceder debemos volver a crearla

?>

