<?php 
//Para este script son necesarias las funciones definidas en el archivo primos.php:

 require('primos.php');

?>

<html>
  <head>
    Numeros Primos</head>
    <body style="text-align: center;">
  
  <?php
    $num=$_GET['num'];
      if (es_primo($num)) {
   
      //Si la función es_primo devolvió TRUE:
      echo "<h1>El número $num es primo</h1>";
      } else {
   
      //Si devolvió FALSE:
   
      echo "<h1>El número $num no es primo.</h1> <p>Los primos menores que $num son: ";
   
      // La función devuelve un array, que es recorrido en el foreach.
   
    foreach(lista_de_primos($num) as $n) echo "$n ";
    echo '</p>';   
      }
    ?>
  </body>
</html>
