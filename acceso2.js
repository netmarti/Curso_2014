<script type="text/javascript">
//Acceso con password restriccion de acceso al site por imagenes

document.write ('<div id="capa" style="position:absolute; width:100%; height:500; z-index:10; background-color: #FFFFFF; layer-background-color: #FFFFFF"></div>')
function acceso(){
	document.getElementById('capa').style.visibility = 'hidden'
}
function denegado(){
	location.href ='denegado.html'
}
var clave = null
cualquiercosa = unescape(document.cookie)
l = cualquiercosa.split(";")
for (m=0;m<l.length;m++){
	l2 = l[m].split("=")
	if(l2[0] == "acceso"){
		clave = l2[1]
		break;
	}
}

imagen = new Image(0,0)
imagen.src = "clave/" + clave + '.gif'
document.write ('<img style="position:absolute" src ="' + imagen.src + '" width = "0" height="0" onload="acceso()" onerror="denegado()">')
</script>
