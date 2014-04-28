<?php
//mostrar los múltiplos de 2, entre 1 y 10
//usaremos el bucle while

$num=1;

while ($num<=10){

	if ($num%2==0){ //podemos cambiar y poner %3 para múltiplos de 3
		print "El valor ".$num." es multiplo de 2 <br>";
	}
	else{
		print "El valor ".$num." no es multiplo de 2 <br>";
	}

	$num++;
	//colocamos el contador para que compruebe la condición
	//antes de volver a entrar al bucle, si no se cumple termina el bucle
}

?>
