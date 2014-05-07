<h1>Identificación</h1>

<?php/*
Al igual que en el formulario del tutorial anterior, 
el método de envió de la información es el método “POST”, 
y se le asigna un nombre al formulario, 
en este caso es el de “miform”, y por ultimo el “action”, 
contiene la ruta al archivo que procesará la información obtenida 
por el formulario. En este caso el archivo que procesara la 
información es “procesa_login.php”, y se creará dentro de la carpeta 
“procesos”
 */?>
 
<form class="miform" action="procesos/procesa_login.php" method="POST">
 
<br />Login:
 
<br />
 
<input type="text" name="login">
 
<br />Clave:
 
<br />
 
<input type="password" name="pass">
 
<br />
 
<br />
 
<input class="boton" type="submit" value="Entrar">
 
</form>
 
<p><a href="formulario.php">Registro en el Sistema</a></p>
