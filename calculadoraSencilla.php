<?php
$y = $_POST['a'];
$z = $_POST['b'];

if (isset($_POST['btsuma'])){
	$c = $y + $z; echo "$y + $z es ".$c;
}
if (isset($_POST['btresta'])){
	$c = $y - $z; echo "$y - $z es ".$c;
}
if (isset($_POST['btmultiplica'])){
	$c = $y * $z; echo "$y * $z es ".$c;
}
if (isset($_POST['btdivide'])){
	
	if ($z !=0) $c = $y / $z; 
	else $c = 0;

	echo "$y / $z es ".$c;
}

?>
<br><br>
<a href='prueba3.html' style="text-decoration:none; border:1px solid black;padding:5px;background:peru">VOLVER</a>
