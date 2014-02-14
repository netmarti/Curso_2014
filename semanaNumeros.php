</head>
<body>
<h1>Dame un valor</h>
<fieldset>
<legend> de 0 a 6</legend>
<form action="semanaNumeros.php method="POST">
<input type="number" name="dia" min="0" max="6" required="required">
<br/><br/> 
<input type="submit" value="ENVIAR">
<input type="reset" value="BORRAR">
<fieldset>
<legend>Dame un valor del 0 al 6</legend>
</fieldset>

< ?php
$dia=$_POST[‘dia’]
switch($dia) {
case 0: echo "Es domingo";
break;
case 1: echo "Es Lunes";
break;
case 2: echo "Es Martes";
break;
case 3: echo "Es Miercoles";
break;
case 4: echo "Es Jueves";
break;
case 5: echo "Es Sabado";
break;
case 6: echo "Es Sabado";
break;
}
?>
</body>
</html>
