<?php
//Contador con While Switch Case

$i=0;

while (++$i) {
	
	switch ($i) {
		case 5:
			print "Este es el caso 5 <br>";
			break;

		case 10:
			print "Este es el caso 10. Saliendo <br>";
			break;

		defalut: 
			print "No hay Switch case :( <br>";
			break;
	}
}




?>
