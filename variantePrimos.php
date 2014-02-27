<?
//$n nos lo pasa el usuario $c variable contador, encontrar los 5 primeros primos
$ac=0; //acumulador
$n=1;
$c=0; //contador iniciado a 0
$primo= true;
do{
	$primo = true;
	for ($i=2;$i<(int)(sqrt($n)+1);$i++)
	
	{
		if ($n%$i==0)
		{
		$primo=false;$i=$n;
		}
	}//cierra el for
	
		if ($primo == true)
		{
		//echo "Es PRIMO".$n; //muestra el número por pantalla
		$ac=$ac+$n;
		$c++;
		}
	$n++
	
	}while (!=5);//condición que ha de cumplirse para salir del bucle
	
	
	
?>
