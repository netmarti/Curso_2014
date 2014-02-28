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
			
	
	


	

