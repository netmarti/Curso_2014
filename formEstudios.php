
Solicitamos el nombre y 
elegimos entre tres controles de tipo radio el nivel de estudios: 
1-no tiene estudios. 
2-estudios primarios. 
3-estudios secundarios. 
Procesamos el formulario para mostrar el nombre de la 
persona y un mensaje indicando el tipo de estudios que posee.


<?php
  echo "<br><br>Hola :) ".$_REQUEST['nombre'];
  echo "<br>";
  if ($_REQUEST['radio1']=="sin")
  {
    echo "Sin estudios.<br>";
  }
  if ($_REQUEST['radio1']=="primario")
  {
      echo "Estudios primarios.<br>";
  }
  if ($_REQUEST['radio1']=="secundario")
  {
    echo "Estudios secundarios.<br>";	
  }
  
?>
