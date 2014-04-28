<?php
//Encontrar el primer múltiplo de 11 en un rango entre 50 y 100

$i=50;

while ($i<100) {
	if ($i%11==0){
		print "El primer valor multiplo de 11 entre 50 y 100 es: ".$i.".";
		break;
	}
	
	$i++;

}



?>
