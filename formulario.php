<form name="user_form" action="procesos/crea_usuarios.php" method="POST">Nombre de Usuario(nick):<br />

<?php
/* El “method=”POST” los datos recogidos se enviaran por medio del método POST, 
que pasa los datos al archivo que procesa sin que veamos el contenido, 
al contrario del método GET que pasa todas las variables por la URL.*/
?>
 
<input type="text" name="login" size="30" maxlength="100" />
 
<br />Clave:
 
<br />
 
<input type="password" name="pass1" />
 
<br />Repite Clave:
 
<br />
 
<input type="password" name="pass2" />
 
<br />Nombre:
 
<br />
 
<input type="text" name="nombre" size="30" maxlength="100" />
 
<br />Primer Apellido:
 
<br />
 
<input type="text" name="apaterno" size="30" maxlength="100" />
 
<br />Segundo Apellido:
 
<br />
 
<input type="text" name="amaterno" size="30" maxlength="100" />
 
<br />E-mail:
 
<br />
 
<input type="text" name="email" size="30" maxlength="100" />
 
<br />
<br />Nivel del Usuario:
<br />
 
<select name="nivel">
 
<option value="AD">Administrador</option>
<option value="UN">Uusario</option>
 
</select>
 
<br />
 
<input type="submit" name="crear" value="Crear Usuario" />
 
</form>
