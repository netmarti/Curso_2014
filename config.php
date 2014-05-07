<?php
 
/*La función llamada Conectarse, 
que será la que utilizaremos para conectarnos a la BD durante 
todo el desarrollo del sistema.*/ 

function Conectarse(){
 
/*archivo para dejar dentro de la carpeta principal,  
para poder acceder a este archivo fácilmente en un futuro.
En el código: “link=mysql_connect(“localhost”,”root”,””)))” 
si estas usando un servidor online real, 
en “localhost” va el nombre “hostname” que estas utilizando, 
en “root”, el nombre usuario de la BD, 
y en el ultimo apartado donde esta vacío va la clave de la BD, 
como es simulado el servidor, 
se deja en blanco este apartado.

Se utiliza la función “mysql_select_db” para seleccionar la BD 
a la que nos vamos a conectar.
*/
 
if (!($link=mysql_connect("localhost","root",""))) {
echo "Error conectando a la base de datos.";
exit();
}
 
if (!mysql_select_db("usuario_login",$link)){
echo "Error seleccionando la base de datos.";
exit();
}
return $link;
}
$link = Conectarse();
mysql_close($link); //cierra la conexion
 
?>
