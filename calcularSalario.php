<?php
$num1=$_POST['pn'];
$irpfvalor=$_POST['sn'];
$bruto=$_POST ['bruto'];
$irpf=$_POST ['irpf'];
$neto=$_POST ['neto'];
$bruto=$num1;
$bruto=$bruto;
$irpfvalor=0.15;

echo "El bruto es: ".$bruto;


$irpf=$bruto*$irpfvalor;
echo "Quitando el IRPF es: ".$irpf;

$neto=$bruto-$irpf;
echo "Neto es: ".$neto;
?>
