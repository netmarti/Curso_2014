<?php
    
 
      function lista_de_primos($x) {
      
      //Retorna un array con los números primos menores que $x.
  
      
      for($i=1;$i<$x;$i++) {
      
      //Si es primo, lo agrego a la lista:
    
      if(es_primo($i)) $lista[]=$i; 
      }
      return $lista;  //Retorno el array completo.
     }
 
    
      function es_primo($n) {
      //Retorna TRUE si el número es primo; FALSE si no lo es.
  
      $divisor=2;
      while($divisor<$n) {
  
      //Si el resto de alguna división es igual a 0, no es primo.
    
      if(($n%$divisor)==0) return false; //Alternativa:  return 0;
      $divisor++;
    }
    
    //si se ha ejecutado el programa hasta aquí, es porque ninguna división dio resto 0, es decir, es primo.
  
    return true; //Alternativa: return 1;
    }
?>
