<script type="text/javascript">
//Acceso con Password
//
//http://indicarRutaDeAcceso/
var clave
function comprueba(valor){
	clave = valor
	document.imagen.onload = acceso
	document.imagen.onerror = denegado
	document.imagen.src = "clave/" + valor + ".gif"; 
}
function denegado(){
	location.href = 'denegado.htm'
}
function acceso(){
	document.cookie = escape('acceso=' + clave)
	location.href = 'ok.html'
}
</script>
