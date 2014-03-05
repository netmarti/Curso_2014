//La instrucción RETURN (palabra reservada en JS), retornamos valores desde las funciones además de finalizar la función.

//ejemplos de RETURN

<script type=”text/javascript”>
function suma(a,b){
			var resultado = a+b;
			alert(resultado);
			return resultado;
}//cierra función
//llamamos a la función suma pasándole dos parámetros el 2 y el 3
var resultadoEnPantalla = suma(2,3);
alert(resultadoEnPantalla);
</script>

// otro ejemplo de RETURN

<script type=”text/javascript” />

    function multipleReturn(num){

                                    var resto = (num%2);

                                    if(resto == 0){
							return 0;
                                                    }//cierra el if
                                    else
                                        {
	                                    return num;
                                        }//cierra el else

                                    }//cierra la función


</script>

//La instrucción BREAK;

<script type=”text/javascript”

    var palabra =””;
    while (palabra !=”fin”)
    {
      palabra = prompt(“Dime la palabra clave”);
      if(palabra == “fin”)
      {
        alert("Has escrito la palabra mágica");
        break;
      } 
}
</script>

// La instrucción CONTINUE;

<script type="text/javascript">

        var num = 0;
        
        for (num=0;num<100;num++){
            
            if (num/2 == parseInt(num/2))
            {
                continue
            }//cierra el if
            document.write("El número"+num+"<br/>");
        }//cierra el for
</script>


// TODO JUNTO EN UN EJEMPLO

<script type="text/javascript">

	function ejemplo (k=0;k<5;k++){
		break;	//sale del bucle y continúa leyendo el código.
			// el continue se salta lo que le quede del bucle pero continúa con el bucle, es decir aumenta la k, en este ejemplo.
			//el return sale de la función.
		alert(“Hola”)
		
		}//cierra la función
		
		alert(“adios”);

</script>

