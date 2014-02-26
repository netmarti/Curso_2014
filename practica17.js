/**
1. Declara una varaible global del tipos Array y coloca 7 
valores numéricos iniciales. Crea un botón en practica17.html que al clicarlo 
llame a una función que con un alert muestre el primer y el último valor 
del array.
 */
/*Alternativa 1 crear Array
 var arrayEj01= new Array();
 arrayEj01[0]=9; arrayEj01[0]=3; arrayEj01[0]=2; arrayEj01[0]=4;
 arrayEj01[0]=2; arrayEj01[0]=9; arrayEj01[0]=2;
 */
//var arrayEj01 = [9,3,2,4,2,9,2];	//alternativa 2 crear Array

var arrayEj01 = new Array(9,3,2,4,2,9,2); //alternativa 3 crear array

function ejercicioArr01(){
	var primerValor = arrayEj01[0];
	var ultimoValor = arrayEj01[6];
	
	alert("primer valor:"+primerValor+" ultimo valor:"+ultimoValor);
}

/*
function ejercicioArr01(){
	var text;
	text = "primer valor:"+arrayEj01[0];
	
	var longitud = arrayEj01.length;
	var ultimaPosicion = longitud-1;
	
	text+ = "ultimo valor:" + arrayEj01[ultimaPosicion];
	alert(text);
}
*/

/**
 * 2. Coloca un nuevo botón en practica17.html que llame a una función que recorra
 *  el Array del punto anterior con un bucle y con un alert muestre el valor mayor.
 */

function ejercicioArr02(){
	var valorMayor = arrayEj01[0]; //primer valor como mayor
	
	for(var k = 1;k<arrayEj01.length;k++){ //recorremos el array
		var nextValor = arrayEj01[k]; //obtenemos el siguiente valor
		
		if( nextValor>valorMayor){	//comporbamos que valor es mayor
			valorMayor = nextValor;	//
		}
	}
	alert("valor Mayor:"+valorMayor);
}

/**3. Crea 7 inputs tipo text dentro de un formulario. 
 * Crea un botón que al clicarlo llame a una función que recorra con un 
 * bucle el array del primer punto y muestre dentro de cada input text un valor
 * del array (en el primer input, el valor de la posición 0, etc..)
 * */

function ejercicioArr03(){
	for(var k = 0; k <7;k++){
		var nameInput ='input'+k;
	
	//document.forms.ej03[nameInput].value = arrayEj01[k];
	  document.forms['ej03'][nameInput].value = arrayEj01[k]; //alternativa 
	} 
}

/**4. Crea un botón que guarde los valores de los inputs 
 * del punto anterior en el array definida en el punto 1.
 */

function ejercicioArr04(){
	for(var k = 0;k<7;k++){
		
	  arrayEj01[k] = document.forms.ej03["input"+k].value;
	  
	  //var nombre = "input"+k;
	  //arrayEj01[k] = document.forms.ej03[nombre].value;		
	}
}



/**5. Crea un formulario con los valores DNI, Nombre, Apellido y Edad. 
 * 
 Crea un botón que al clicarlo guarde estos valores en un array. 
 Los valores se han de guardar teniendo como referencia: 
 “dni”, “nombre”, “apellido” y “edad” respectivamente (en vez de 0,1,2 y 3).  
 * 
 */

function guardaValorsEj05(){

	var dni = window.document.forms.ej04.dni.value;
	var nombre = window.document.forms.ej04.nombre.value;
	var apellido = window.document.forms.ej04.apellido.value;
	var edad = document.forms.ej04.edad.value;
	
	contacto["dni"] = window.document.forms.ej04.dni.value;
	contacto['nombre'] = window.document.forms.ej04.nombre.value;
	contacto['apellido'] = window.document.forms.apellido.value;
	contacto['edad'] = window.document.forms.ej04.edad.value;
}

/**
  Crea un botón que pida al usuario si quiere ver el
   “nombre”, el “apellido” y la “edad” y muestre el valor desde el array.
 */

/*
function muestraValoresEj05(){
	var opcion = prompt("Indica datos a mostrar: nombre, apellido, edad, dni");
	if(opcion == 'nombre'){
		var texto = contacto['nombre'];
		alert("Nombre: "+ texto);
	}else{
		if(opcion == 'apellido'){
			alert("Apellido: "+ contacto['apellido']);
		}else{
			if(opcion == 'edad'){
			alert("Edad: "+ contacto['edad']);
			}
		}
	}
}
*/

/** Utilitzando el Switch
  Creamos un botón que pida al usuario si quiere ver el
   “nombre” el “apellido” y la “edad” y retorne el valor desde el array.
 */

/*
function muestraValoresEj05() {
	var opcion = prompt("Indica datos a mostrar: nombre, apellido, edad, dni");
	switch(opcion) {
		case "nombre":
			var texto = contacto['nombre'];
			alert("Nombre: " + texto);
			break;

		case "apellido":
			alert("Apellido: " + contacto['apellido']);
			break;

		case "edad":
			alert("Edad: " + contacto['edad']);
			break;

		case "dni":
			alert("Dni: " + contacto['dni']);
			break;
	}
}*/

function muestraValoresEj05(){
	var opcion = prompt("Indica datos a mostrar: nombre, apellido, edad, dni");
	var texto= contacto[opcion];
	alert(texto);
}

/**EXTRA!: Muestra todos los valores del Array contacto
 */

function muestraTodosValoresEj05(){
	var textoFinal = " ";
	for(var clave in contacto){
		var texto = contacto[clave];
		
		textoFinal = textoFinal+"  "+clave+":"+texto;
	}
	alert(textoFinal);	
}

/**
6- Añade al punto anterior un input con un input text y un botón “incluir teléfono”.
 Programa que al clicar incluya el teléfono dentro de una nueva Array con todos los teléfonos.
Conseguir que funcione teniendo definido el Array con los teléfonos como un nuevo valor 
en el Array del punt anterior.
*/

/* Alternativa
var contacto = new Array();
var arrayTel = new Array();
contacto['telefono'] = arrayTel;

function addTelefon(){
	var tel= window.document.forms.ej04.telefono.value;
	var lastPos= arrayTel.length;
	arrayTel[lastPos]=tel;
}
*/

/* 

//Alternativa 2: sin definir un array telefonos

var contacto = new Array();
contacto['telefono'] = new Array();
function addTelefon(){
	var tel = window.document.forms.ej04.telefono.value;
	var lastPost = contacto['telefono'].length;
	contacto['telefono'][lastPost] = tel;
}
*/

/**Altenativa3: sin definir un array telefonos y utilizando .push()*/

var contacto = new Array();
contacto['telefono'] = new Array();
function addTelefon(){
	var tel= window.document.forms.ej04.telefono.value;
	contacto['telefono'].push(tel);
}

/*
7. Crea un DIV con id “resultado” y crea un botón que al clicarlo muestre todos 
los valores del Array anterior dentro del DIV “resultado”
NOTA: document.getElementById(“resultat”).innerHTML=”valor” añadirá el texto “valor"
dentro del div con id “resultado”*/

function muestraValoresDiv(){
	var textoFinal = " ";
	
	for(var clave in contacto){
		var texto = contacto[clave];
		window.document.getElementById('resultado').innerHTML+ = " <br /> "+clave+":"+texto;
	}
	window.document.getElementById('resultado').style.backgroundColor="peru";
	var contingutHTML = window.document.getElementById('resultado').innerHTML;
	
	var t = ' ';
}










