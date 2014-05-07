<?php
session_start();
 
session_unset();
 
session_destroy();
 
header('Location: ../login.php' );

/*
La función “sesión_start()” permite indicarle al sistema que se están utilizando variables de sesión, y es muy importante implementarla antes que otra función, de lo contrario, las funciones siguientes producirán un error.
La función “sesión_unset()” permite vaciar las variables de sesión que tienen valores actualmente.
La función “sesión_destroy()” permite eliminar todas las variables de sesión que se han creado hasta el momento.
Por ultimo, solo se utiliza la función “header()” para poder re direccionar a la pagina de Inicio de Sesión(login.php).
*/ 

?>

