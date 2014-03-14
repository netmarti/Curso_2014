<?php

$nombre = $_GET['nombre'];

@header("Content-type: text/xml");
$xml = '<?xml version="1.0" encoding="utf-8"?>'. "\n";

if (strlen($nombre)>2 && strlen($nombre)<15){
	$xml.='<info>'."\n";
	$xml.='<valor><![CDATA['.$nombre.']]></valor>'."\n";
	
}//cierra el if

?>
