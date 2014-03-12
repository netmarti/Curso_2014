var formCorrecto;

/**Valida que els valors dels inputs del forulari siguin correctes
 * Retorna false si hi ha algún element incorrecte 
 * NOTA:funció a utilitzar amb el HTML:
 * <form onsubmit="return validaForm(this);">
 */
/*
function validaForm(formulari){
	formCorrecto=true;	//si vale false, no se enviará el formulario
	var usuari = formulari.usuari;	
	var email = formulari.email;
	var password = formulari.password;
	var password2 = formulari.password2;

	validaCampOblig(usuari);	//valida si el input usuari tiene algun valor
	validaCampPatron(usuari,/^[A-z]{3,15}$/,'solo de 3 a 5 caracteres.'); //valida input amb info del usuari
	
	validaCampOblig(email);	//valida si el input email tien algun valor
	validaCampOblig(password);
	validaCampOblig(password2);

	
	return formCorrecto;
}*/

window.onload=function(){
	var formulari =document.forms.miForm;
	addEvent(formulari,"submit",validaForm);
	
	
	addEvent(document.forms.miForm.usuari,"blur",function(evt){
		validaCampOblig(evt.target);	//valida si el input usuari tiene algun valor
		validaCampPatron(evt.target,/^[A-z]{3,15}$/,'solo de 3 a 5 caracteres.'); //valida input amb info del usuari
	});
	
	addEvent(document.forms.miForm.usuari,"keydown",function(){
		validaCampOblig(this);	//valida si el input usuari tiene algun valor
		validaCampPatron(this,/^[A-z]{3,15}$/,'solo de 3 a 5 caracteres.'); //valida input amb info del usuari
	});
	

};
/**Valida que els valors dels inputs del forulari siguin correctes
 * Retorna false si hi ha algún element incorrecte 
 * NOTA:funció a utilitzar amb el HTML: <form> i amb el JS:
		window.onload=function(){
			var formulari =document.forms.miForm;
			addEvent(formulari,"submit",validaForm);
		};
 * */
var validaForm = function (evt){
	//Obtenemos el Objeto evento tanto si estamos en IE como en otro navegador */
	var ie=false; //indica si estamos en IE
	if (!evt){ 
		ie=true;
		evt = window.event;
	}
	formulari = evt.target; //elemento sobre el que se ha ejecutado el evento
	
	formCorrecto=true;	//si vale false, no se enviará el formulario
	var usuari = formulari.usuari;	
	var email = formulari.email;
	var password = formulari.password;
	var password2 = formulari.password2;

	validaCampOblig(usuari);	//valida si el input usuari tiene algun valor
	validaCampPatron(usuari,/^[A-z]{3,15}$/,'solo de 3 a 5 caracteres.'); //valida input amb info del usuari
	
	validaCampOblig(email);	//valida si el input email tien algun valor
	
	
	validaCampOblig(password);
	validaCampOblig(password2);

	if(formCorrecto==false){  //el forlumario es incorrecto y no debe enviarse
		//Evitem ació per defecte tanto si estamos en IE como en otros navegadores
   		if(ie){ evt.returnValue = false;}//IE
  		else{  evt.preventDefault();  	}// Firefox, Safari, Opera
   		return false;
	}
};

/**Valida si el input indicado cumple con la expresion regular.
 * Si no la cumple muestra el textError .
 * @param input del que queremos comprovar los valores.
 * @param expresion regular que utilizaremos para comprovar los valores.
 * @param mensaje de error a mostrar si no se cumple la expresion regular.
 */
function validaCampPatron(camp, RegExPattern,textError){
 	var texto=camp.value;
    if ( texto.match(RegExPattern) ) { //cumple con el patron
   		muestraOK(camp);
    } else {
    	muestraError(camp,textError);
        formCorrecto=false;
    } 
}

/**Valida que el usuari hagi introduït algún valor en el input indicat.
 * @param input a comprovar si tiene algún valor.  
 */
function validaCampOblig(camp){
	var texto = camp.value;
	if(texto==""){
		muestraError(camp,"Dato obligatorio");
	}else{
		muestraOK(camp);
	}
}
/**Muestra un mensaje de error en el span continguo al input indicado y 
 * marca el input en rojo. 
 * @param input que validamos 
 * @param texto de error que mostramos
 */
function muestraError(inputError,textoError){
	inputError.className="error";
	var span = inputError.nextElementSibling;
	span.innerHTML=textoError;
	formCorrecto=false;
}
/**Muestra un mensaje de OK en el span contiguo al input indicado
 * @param input a mostrar como correcto.
 */
function muestraOK(inputOk){
	inputOk.className="ok";
	var span = inputOk.nextElementSibling;
	span.innerHTML="OK";
}


/**Cross browser Add Event
* @param {Object} objeto al que añadir el evento
 * @param {Object} tipo de evento (click, mouseover,..)
 * @param {Object} funcion a añadir
 */
function addEvent(obj, evType, fn){
	if (obj.addEventListener){
		obj.addEventListener(evType, fn, false);
		return true;
	} else if (obj.attachEvent){
		var r = obj.attachEvent("on"+evType, fn);
		return r;
	} 
}
