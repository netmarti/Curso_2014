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
   
   
   /*Clicando sobre el div #addDiv se crea un DIV , 
    * 
    *pide al usuario un texto y lo añade dentro de #domNodes. 
    * 
    *Además el DIV creado ha de ser de la clase .addDiv */
   
   function ej05(){
   		
   		var div = document.createElement('DIV');
   		var texto = window.prompt('Dame el texto para el nuevo DIV');
   		div.innerHTML=texto;
   		div.className="addDiv";// formamos todo el elemento para luego añadirle el nuevo DIV
   		
   		var padre = document.getElementById('domNodes');// le queremos añadir el nuevo DIV
   		padre.appendChild(div); //añadimos el texto en domNodes para ello usamos appendChild(div)
   		
   		}//cierra la funcion 05();
   
   
   /*Cuando clicamos sobre addSpan se debe pedir al usario un texto y añadir al */
  
  	function ej06(){
  		
  		var span = document.createElement('Span');
   		var texto = window.prompt('Dame el texto para el nuevo Span');
   		span.innerHTML = texto;
   		span.className = "addSpan";
   		var padre = document.getElementById('domNodes');
   		padre.appendChild(span);
  		}
  	
  	/**07 Cuando se clicke sobre 
    * */
   	
   	function ej07(){
   		
   		var nomAtr = window.prompt('Dame un nombre de atributo');
   		var valorAtr = window.prompt('Dame un valor de atributo');
   		
   		
   		var atributo = document.createAttribute(nomAtr);//creamos un nodo atributo
   		atributo.value = valorAtr; // establecemos el valor del atributo
   		
   		// hasta aquí hemos quedado el atributo, ahora debemos asignarlo
   		
   		var divActual = document.getElementById('addAttr');
   		divActual.setAttributeNode(atributo); //asignamos un atributo a un elemento
		
		
		/* alternativa 
		 * 
		 /*var divActual = document.getElementById('addAttr');
		divActual.setAttribute(nomAtr,valorAtr);//pasamos las variables y el crea el objeto
		**/
		
   		}//cierra la función ej07
   
   
   /* Clicando sobre el div # addAttrElem se pide al usuario un id de un elemento, 
    * un nombre de atributo, un valor de atributo y establecer un elemento de atributo
     un valor de atributo y establecer en el elemento con el id indicado l’atribut de nom i
valor indicat.
    * */
   
   	function ej08(){
   		
   		var idElem = window.prompt("Dame un id");
   		var nomAtr = window.prompt("Dame un nuevo atributo");
   		var valorAtr = window.prompt("Dame un nuevo valor de atributo");
   		
   		var elem = document.getElementById(idElem);
   		
   		elem.setAttribute(nomAtr,valorAtr);
   		
   	}//cierra la función ej08
   
   /**09 Quan es cliqui sobre el div #delAllType es demani a l’usuari el tipus 
    * d’elements que es volen eliminar (DIV, SPAN..) 
    * i s’elimini de #domNodes tots els elements del tipus indicat.*/
   
   function ej09(){
   	
   	var text = window.prompt("Indicar elemento a borrar");
   	var domNod = document.getElementById('domNodes');
   	
   	var arrayTags= domNod.getElementsByTagName(text);
   	
   	//recorremos el Array y eliminamos los elementos que encontremos de su padre
   	arrayTags[0];
   	
   	var lon = arrayTags.length;
   	
   	//Borra de delante hacia atrás
   		/*for (var k=0; k < lon;k++);{
   		var elem = arrayTags[0];
   		domNod.removeChild(elem);
   		}//cierra el for
   		*/
   		
   		// Borra de delante hacia atrás
   			while(arrayTags.length>0){
   			var elem = arrayTags[0];
   			}//cierra el while
   		
   		
   		/* Borra de detrás a delante
   		 * 
   		 * for (var k=lon-1;k>=0;k--){
   		 * 		var elem = arrayTags[k];
   		 * 		domNod.removeChild(elem);	   		 
   		 * }//cierra el for
   		 * 
   		 */
   		
   		 /*
   		  *
   		  * */
   		 
   }//cierra funcion 09
   
   /**10 Cuando se clicke sobre el div de 
    * */
   
   function delPrevNode(){
   	var elm = document.createElement('Div'); //creamos el elemento DIV
   	elm.innerHTML="Remove Preview";
   	elm.className="delPrewNode";
   	elm.onclick=function(){
   		
   		var nodoAnterior = this.previousSibling;
   		var padre= nodoAnterior.parentNode; // o var padre= this.parentNode;
   		padre.removeChild(nodoAnterior);
   	}
   	
   	var padre=document.getElementById('domNodes');
   	padre.appendChild(elm);
   	
   }
	 

