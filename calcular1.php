<?php
if ($_POST ["valor1"] !="" and $_POST ["valor2"]!=""){
if ($_POST["operador"] == "suma") {
print ($resultado = $_POST ["valor1"] + $_POST ["valor2"]);
print ('<br /><a href="calcula1.html">Volver</a>');
}
elseif ($_POST["operador"] == "resta") {
print ($resultado = $_POST ["valor1"] - $_POST ["valor2"]);
print ('<br /><a href="calcula1.html">Volver</a>');
}
elseif ($_POST["operador"] == "multiplica") {
print ($resultado = $_POST ["valor1"] * $_POST ["valor2"]);
print ('<br /><a href="calcula1.html">Volver</a>');
}
elseif ($_POST["operador"] == "divide") {
print ($resultado = $_POST ["valor1"] / $_POST ["valor2"]);
print ('<br /><a href="calcula1.html">Volver</a>');
}
elseif ($_POST["operador"] == "dividSinDecimal") {
print ($resultado = ((int)($_POST ["valor1"] / $_POST ["valor2"])));
print ('<br /><a href="calcula1.html">Volver</a>');
}
else {
print("Dame un valor");
print ('<br /><a href="calcula1.html">Volver</a>');
}
}
?>
