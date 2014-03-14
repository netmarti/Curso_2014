function enviaFormulari(formulari) {
	var nom = formulari.nombre.value;

	//FUNCION AJAX
	var xmlHttp = new XMLHttpRequest();

	urlDestino = "validaForm.php?nombre=" + nom;
	xmlHttp.open("GET", urlDestino, true);

	xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {

			//funcion a ejecutar al recibir la respuesta
			repResposta(xmlHttp);
		}
	};
	xmlHttp.send(null);

	return false;
}

function repResposta(xmlHttp) {
	if (xmlHttp.status == 200) {
		var resp = xmlHttp.responseXML;
		var info = resp.firstElementChild;
		var valor = info.firstElementChild;
		var correcte = valor.nextElementSibling; valor
		textValor = valor.firstChild.nodeValue; valor
		textCorrecte = correcte.firstChild.nodeValue;

		if (textCorrecte == "si") {
			alert("el texto: " + textValor + " es correcto");

		}//cierra el if
		else {
			alert("el texto: " + textValor + " no es correcto");
		}//cierra el else

		/*contendrá todos los tag info que hay, queremos el primero
		var listResp = resp.getElementsByTagName("info");
		var info= listResp[0];

		var valor = listResp.getElementsByTagName("valor");
		var correcte = listResp.getElementsByTagName("correcte");
		*/

		//for (var k = 0; k < listResp.length; k++) {
		//var result = listResp[k].childNodes[0].nodeValue;
		//alert(result);
		//}
	}
}

/*

 */
