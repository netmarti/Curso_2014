/**
 * @author Daniel
 */

function ej01(){
	var texto = window.prompt("Introduce un texto"); //el usuario nos pasa el texto desde el div
	
	var elemDIV = document.getElementById('addText'); //hemos guardado el elemento que contiene addText
	
	elemDIV.innerHTML = texto;
	
	}//cierra la funcion ej01()
	
	
	/**Cuando clickemos setColor pide un color al usario y lo coloca en el background del botón**/
	
function ej02(){
	
	var cambiaColor = window.prompt("Dime un color");// el usuario nos pasa un nuevo color
	
	var elemCol = document.getElementById('setColor');// guardamos el elemento que contiene setColor
	
	elemCol.style.backgroundColor = cambiaColor;
	
	if(color == "blue"){
				elemCol.style.backgroundColor="red";
			}
				else{
				elemCol.style.backgroundColor="blue";
			}//cierra el else

}//cierra la funcion ej02()
			
//ejercicio funcion ej03() para colocar un texto en el elemento anterior al botón que clicamos
	
	
	function ej03(){
		
	var text = window.prompt("Dame un texto");
	var elemActual = document.getElementById('setContentPrev');
	var elemAnterior = elemActual.previousElementSibling;
	
	elemAnterior.innerHTML += text;

	var t;
		
	}// cierra la funcion ej03
	
	
	/**El primer click sobre #augmentaTamanys , augmenta el tamaño del div.
    **Si clicamos por segunda vez una vez se disminuya el tamaño (with y height).
    **Añade una regla CSS de transition en los tamaños*/
   
   
   var click = 0;
   
   function ej04(){
   	
   	var elm = document.getElementById('augmentaTamanys');
   	
   		if(click==0)
   		{
   			elm.style.width="auto";
   			elm.style.height="200px";
   			click=1;
   		}//cierra el if
   	
   		else{
   			
   			elm.style.width="auto";
   			elm.style.height="50px";
   			click=0;
   		}//cierra el else
   	
   	
   }//cierra la funcion ej04	
	


	

