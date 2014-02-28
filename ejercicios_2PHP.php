
<?php
/* 3.
Realic
e un programa que sume los primeros 20 números primos.
Un número primo es aquel que solo es divisible entre el mismo y la unidad.
Ejemplos de números primos: 1,2,3,5,7,11, ...
Ejemplos de números no primos: 4, 6,8,9, ... */

//----------------------------------------------------SI FUNCIONA---------
/* $n=1;
$contador=0;
$acumulador=0;
do{
$primo=true;

for($i=2; $i<$n-1; $i++)
	{
	
	if ($n%$i==0){
	
		$primo=false;
		break;
	
		}//if
	
	}//for
	if($primo==true){
	
		//echo "<br>"."Primos: ".$n; 
		$acumulador=$acumulador+$n;
		$contador++;
	}//if2
	
	$n++;
	
	}//do
	while($contador !=20);
	echo "La suma de los 20 primeros números Primos es: ".$acumulador; */
//----------------------------------------------------SI FUNCIONA---------


/*
4. 
Dada una fecha en el rango de 01 01 1980 al 31 12 2010, determine si es correcta
o incorrecta.
Por ejemplo:
1.
Dia:  21
Mes: 09
Año: 2006
¡Fecha correcta!
2. Dia:  31
Mes: 09
Año: 2006
¡Fecha incorrecta!
No todos los meses tienen 31 días.
Los valores introducidos por el usuario se deben comprobar y, si los valores no
son correctos, se debe indicar el motivo al usuario
*/


//----------------------------------------------------SI FUNCIONA---------
/* $dia=$_POST['dia'];
$mes=$_POST['mes'];
$anio=$_POST['anio'] ;

if($dia>=1 && $dia<=31 && $mes>=1 && $mes>=12 && $anio>=1901 && $anio=2099)
	{
	
	switch ($mes){
		case 4:
		case 6:
		case 9:
		case 11:
	break;
		}//if
	if ($dia==31){
	
	$dia=false;
	echo "Es correcto: "."Dia: ".$dia;
	
	}//if2
	else{
	
	$dia=true;
	echo "no es correcto por: "."Dia: ".$dia;
	}

	} */


//----------------------------------------------------SI FUNCIONA---------

/* 5.
Sabiendo que los números pares cumplen que al dividirlos entre dos da resto
cero, realizar un programa que muestre por
pantalla todos los números pares
comprendidos entre 1 y 5.000. Emplear el operador módulo '%' para decidir si un
número es o no par. */

//----------------------------------------------------SI FUNCIONA---------

/* $n=1;


for($i=1; $i<=5000; $i++)
	{
	
	if(($i%2)==0)
	
	echo " / " .$i;          
	
	}//for */
	
//----------------------------------------------------SI FUNCIONA---------

?>

