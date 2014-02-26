<?php
   
$dia= $_POST['dia'];
$mes= $_POST['mes'];
$any= $_POST['any'];

	if ($dia>=1 && $dia<=31 && $mes>=1 && $mes<=12 && $any >=1901 && $any<=2099)
		{
		switch($mes){
			case 4:
			case 6:
			case 9:
			case 11:
					
		if ($dia==31)
		
				{//incorrecto
				echo("La fecha no es correcta");
				}
	
		else{
			echo("La fecha es correcta");//correcto
			}
	
		break;
	
			case 2:
				if($dia>=30)
				{
					echo("La fecha no es correcta");//incorrecto
				}
				else{
					
					if ($dia == 29) {
							if($any%4==0)// es bisiesto
							{
				
								echo("La fecha es correcta");//correcto
							
							}
							else
							{
							echo("La fecha no es correcta");//incorrecto
							}
					}
				}		
				break;
	
				default: 
				echo("La fecha es correcta"); // correcto
		}//switch
		}
		



?>
