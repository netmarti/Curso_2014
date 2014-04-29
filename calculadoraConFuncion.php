<?php
// comprobamos si se han enviado los datos
if(isset($_POST['ej']) && $_POST['ej'] == 'Ejecutar') {
// comprobamos si no hay campos vacíos
if(!empty($_POST['a']) && !empty($_POST['b']) && !empty($_POST['opr'])) {
// ahora, verificamos si son solo digitos
if(ctype_digit($_POST['a']) && ctype_digit($_POST['b'])) {
// creamos y damos valor a las variables
// con que vamos a trabajar
$a = $_POST['a'];
$b = $_POST['b'];
$opr = $_POST['opr'];
// aqui la funcion que
// retornara la operacion matematica
function operar($a, $b, $opr) {
switch($opr) {
case "+":
$result = $a + $b;
break;
case "-":
$result = $a - $b;
break;
case "*":
$result = $a * $b;
break;
case "/":
$result = $a / $b;
break;
}
return $result;
}
// imprimimos el resultado de la operación
echo "$a $opr $b = ". operar($a, $b, $opr);
} else {
// ERROR en caso de datos no válidos
echo "a y b tienen que ser numeros";
}
} else {
// ERROR en caso de campos vacíos
echo "No puede enviar campos vacios";
}
}
?>
