<?php

/*en la primer linea, usamos “include” para incluir en nuestro código
del archivo “config.php” y así poder mandar a llamar los métodos en 
ella, en este caso el método “Conectarse()”.

Usamos la funcion “dirname“, ya que el el archivo actual(crea_usuarios.php) 
se encuentra en la carpeta “procesos“, y el archivo “config.php” se encuentra un nivel mas arriba, 
o sea, en la carpeta raiz, y la función “dirname” permite subir  
“virtualmente” una carpeta para poder llegar a la carpeta raiz donde 
se encuentra “config.php“, si no se incluyera esta función, 
ocurriria un error.

Luego se declara una variable llamada “$link” que es la que nos dará 
el acceso a las base de dato y así poder trabajar con MySQL de manera
fácil.*/ 

include dirname(dirname(__FILE__))."/config.php";
 
$link=Conectarse();

/*
Recibimos las variables del formulario, 
todo es recibido por el método POST. 
Para esto declaramos variables y le asignamos nombres 
según el dato a recibir, esto para mayor legibilidad.
*/
 
$login = $_POST['login'];
 
$pass1 = $_POST['pass1'];
 
$pass2 = $_POST['pass2'];
 
$nombre= $_POST['nombre'];
 
$apaterno=$_POST['apaterno'];
 
$amaterno= $_POST['amaterno'];
 
$email = $_POST['email'];
 
$nivel = $_POST['nivel'];

/*
Primero se declara una variable que contendrá la consulta que se ejecutara 
en MySQL, para este caso un SELECT.
Se consulta si en la tabla “usuarios”, en el campo “login”, 
existe algún registro que coincida con el dato recibido y almacenado 
en la variable “$login”.

Luego se ejecuta la función mysql_query para ejecutar la consulta en la BD.
Luego con la sentencia IF y la función mysql_num_rows se comprueba 
si el nombre de usuario de la variable “$login” existe en la BD.

En caso de que no haya ningún usuario con el mismo nombre, 
se libera la memoria con la función mysql_free_result, 
de lo contrario se manda un mensaje de error indicando que el 
nombre de usuario recibido ya existe en la BD.
*/
 
$query = sprintf("SELECT login FROM usuarios WHERE usuarios.login = '%s'" ,
 
$login);
 
$result=mysql_query($query,$link);
 
if(mysql_num_rows($result)){
 
echo "El usuario ya existe en la Base de Datos";
 
} else {
 
mysql_free_result($result);
 
if($pass1!=$pass2) {
 
echo "Las claves deben coincidir";
 
} else {
 
/*Para verificar si las dos contraseñas provistas son diferente 
se utiliza el operador “!=” con una sentencia IF, 
si las contraseñas son diferentes se manda un mensaje de error 
al usuario, indicando que las contraseñas no coinciden.
Luego si las dos contraseñas son iguales se declara una variable 
para almacenar la contraseña ya encriptada.*/

$pass1=sha1(md5($pass1));

/*
Se realiza el encriptado de la contraseña contenida por la variable $pass1, 
se utiliza las funciones sha1 y md5 para hacerlo, 
como resultado obtendremos una cadena hexadecimal de 32 números y letras, 
esto por motivos de seguridad.
*/
 
$query = sprintf("INSERT INTO usuarios (login, nombre, apaterno, amaterno, password, email, nivel)
 
/*Declarar una variable para introducir la consulta que se ejecutara en MySQL.
En este caso un INSERT INTO para introducir los valores de las variables en la BD.*/

VALUES ('%s', '%s', '%s', '%s', '%s', '%s','%s')",$login, $nombre, $apaterno,$amaterno, $pass1, $email, $nivel);
 
$result=mysql_query($query,$link);
 
if(mysql_affected_rows()){
 
header("Location: ../login.php");
 
} else {
 
echo "Ocurrio un Error al Introducir los Datos";

/*
Con la función mysql_query se ejecuta la consulta en MySQL.
Posteriormente se checa si se han insertado los datos con la función
mysql_affected_rows, en caso de que se hayan insertado se realiza 
la redirección a alguna ruta determinada.
En este caso se esta utilizado dos puntos y una diagonal dos veces
(../login.php), por que la redirección implica subir dos niveles de 
carpeta, ya que estamos en la carpeta “procesos”, 
y se quiere dirigir a la carpeta principal.
*/
 
}
 
}
 
}
 
?>
