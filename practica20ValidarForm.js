/**
 * valida los valores de los inputs del formulario
 * y si algún input es incorrecto envía un mensaje al usuario
 */

var formCorrecto;
function validaForm(formulari){
	formCorrecto=true;
	var usuari = formulari.usuari;
	var email = formulari.email;
	var password = formulari.password;
	var password2 = formulari.password2;
	
	validaCampOblig(usuari);
	validaCampOblig(email);
	validaCampOblig(password);
	validaCampOblig(password2);

	
	return formCorrecto;
}
/**Valida que el input indicado es obligatorio
 * 
 */
function validaCampOblig(camp){
	var texto = camp.value;
	var elem1 = camp.nextElementSibling;
	if(texto==""){
		//var elem1 = camp.nextElementSibling;
		elem1.innerHTML="campo obligatorio";
		camp.className="error";
		formCorrecto=false;
	}else{
		elem1.innerHTML="OK";
		camp.className="ok";
	}
}
