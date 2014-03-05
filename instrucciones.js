//La instrucción RETURN (palabra reservada en JS)

<script type=”text/javascript” />

    function multipleReturn(num){

                                    var resto = num%2

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


