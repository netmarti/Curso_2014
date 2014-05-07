<?php
 
session_start();
 
include dirname(dirname(__FILE__))."/config.php";
 
$link=Conectarse();

/*
Primero se incluye la función “sesison_start()” para poder utilizar 
las variables de Sesión, que es lo que se va a utilizar para manejar 
el Inicio y Cierre de Sesión del sistema que estamos creando.

Luego se incluye el archivo “config.php”, se utiliza la función 
“dirname()”, este archivo se encuentra en la carpeta raíz, 
y el archivo actual “procesa_login.php” se encuentra dentro de la 
carpeta “procesos”, entonces es necesaria esta función para que 
virtualmente PHP se desplace dos directorios arriba, hasta la carpeta raíz y así poder encontrar el archivo “config.php”.
Posteriormente se manda a llamar la función “Conectarse()” y el 
resultado de ella se pasa a la variable $link, 
que es la que nos permitirá conectarnos a la Base de Datos.

Se crearan las variables para poder obtener 
los datos del formulario de inicio de sesión.
*/
 
$login = $_POST['login'];
 
$pass = $_POST['pass'];
 
$pass=sha1(md5($pass));

/*
Se obtiene los datos de los elementos del formulario por medio de 
“$_POST[]”.
En el caso de “$pass”, después de obtener la contraseña, 
se pasa la variable por la función “sha1” y por “md5”, 
que son las funciones que permiten encriptar la contraseña, así, 
en lugar de enviar la contraseña tal y como nosotros la escribirnos, 
se oculta y se envían un conjunto de letras y números a la BD, y 
eso es lo que se guarda, de tal manera que si por algún motivo 
hackean nuestra BD, no conozcan la clave real.

La variable “$query” es de suma importancia, 
en ella es donde se realiza la consulta a la BD, 
para poder obtener el usuario.
*/
 
$query = sprintf("SELECT usuarios.id,
 
usuarios.login,
 
usuarios.nombre,
 
usuarios.apaterno,
 
usuarios.amaterno,
 
usuarios.email,
 
usuarios.nivel
 
FROM usuarios WHERE usuarios.login='%s'&& usuarios.password = '%s'",
 
$login, $pass);
 
$result=mysql_query($query,$link);

/*
Posteriormente se utiliza la función “mysql_quey()” 
para poder ejecutar la consulta en la BD, y se le pasa la variable 
“$query”, que contiene la consulta, y también se pasa la variable 
“$link” que es la que contiene la cadena de conexión a la BD.

En caso de que la función ejecute correctamente la consulta en MySQL, 
devolverá TRUE, en caso de que ocurra algún error devolverá FALSE.

Tercera Parte:
Posteriormente sigue una sentencia “if”, que permitirá tomar una 
decisión en caso de que exista o no el usuario introducido en el 
formulario de inicio de sesión en la BD.

La función “mysql_num_rows()”, permite saber si se devolvieron 
filas en la consulta anterior, en caso de que devuelva TRUE, 
se introducen los datos de la variable “$result” a un arreglo, 
cuya variable es “$array”, 
para así tener un mejor control sobre los datos.
*/
 
if(mysql_num_rows($result)){

/*
Se usa la función “$_SESSION[]” para almacenar los datos obtenidos 
por la consulta de la variable “$query”.
Para mandar a llamar los datos de la variable “$array”, 
se utilizan los nombre de la columna de la tabla de la BD.
*/
 
$array=mysql_fetch_array($result);
 
$_SESSION["id_usuario"]= $array["id"];
 
$_SESSION["login"]= $array["login"];
 
$_SESSION["nombre"]= $array["nombre"];
 
$_SESSION["apaterno"]= $array["apaterno"];
 
$_SESSION["amaterno"]= $array["amaterno"];
 
$_SESSION["email"]= $array["email"];
 
$_SESSION["nivel"]= $array["nivel"];

/*
La función “header()” para redirecciona al usuario al “Panel de Usuario“, 
en este caso se llamara “user.php”. 
En este caso se utilizan dos puntos y una diagonal “../”, 
para poder subir dos niveles, hasta la “carpeta principal“, 
ya que nos encontramos en la carpeta “procesos”.

En caso de que no se haya encontrado a ningún usuario con los datos 
obtenidos del formulario de inicio de sesión, 
simplemente se manda un mensaje de error.
*/
 
header("Location:../admin/user.php");
 
} else {
 
echo "<h2>Login o Password Incorrectos</h2>";
 
}
 
?>
