<script type="text/javascript">
/*Practica15*/

var horas = 01 //establece las horas
var minutos = 10 //establece los minutos
var segundos = 05 //establece los segundos
var horas2,minutos2,segundos2

function cuentaAtras(){
	if(segundos > 0){
		segundos--
	}
	else{
		if(minutos > 0){
			segundos = 59;
			minutos--
		}
		else{
			if(horas > 0){
				minutos = 59;
				horas--
			}
		}
	}
	ceros()
	document.getElementById('ca').firstChild.nodeValue = horas2 + ":" + minutos2 + ":" + segundos2
	if(horas > 0 || minutos > 0 || segundos > 0){
		tiempo = setTimeout('cuentaAtras()',1000)
	}
}

function ceros(){
	segundos.toString().length < 2 ? segundos2="0" + segundos : segundos2 = segundos
	minutos.toString().length < 2 ? minutos2="0" + minutos : minutos2 = minutos
	horas.toString().length < 2 ? horas2="0" + horas : horas2 = horas
}

function escribe(){
	ceros()
	document.write ('<span id="ca">' + horas2 + ":" + minutos2 + ":" + segundos2 + '</span>')
}
</script>
