//Uso del atributo "type": 
//Cuando colocamos una etiqueta SCRIPT debemos usar el atributo "type" para indicar que tipo de codificación de script estamos haciendo y el lenguaje utilizado.

<script type="text/javascript">

//El atributo "type" es necesario para que valide correctamente e documento en las versiones más actuales del HTML.

// abrir una ventana secundaria con el buscador de Google, sin barra de menu.

//incluir ficheros externos para incluir scripts en páginas web, implementada a partir de Javascript 1.1

<SCRIPT type="text/javascript" src="archivo_externo.js">
//estoy incluyendo el fichero "archivo_externo.js"
</SCRIPT>

<script> 
window.open("http://www.google.com","","width=550,height=420,menubar=no")
</script>


//mostrar caja de texto emergente, que podría dar la bienvenida a los visitantes. 

<script> 
window.alert("Bienvenido a mi sitio web. Gracias...") 
</script>

//mostrar la fecha actual, colocar en el cuerpo de la página en el lugar donde queramos que aparezca la fecha.
<script> document.write(new Date()) </script>

//botón de volver, código que mezcla HTML y Javascript para crear este botón, muestra la página anterior en el historial, si es que la hubiera.

<input type=button value=Atrás onclick="history.go(-1)">


/*Algunas funciones útiles*/

function toolLinks(){
var tools = document.createElement('ul');
var item = document.createElement('li');
var itemlink = createLink('#', 'close', closeWindow);
item.appendChild(itemlink);
tools.appendChild(item);
var item2 = document.createElement('li');
var itemlink2 = createLink('#', 'print', printWindow);
item2.appendChild(itemlink2);
tools.appendChild(item2);
document.body.appendChild(tools);
}

function printWindow(){
window.print();
}

function closeWindow() {
window.close();
}

function createLink(url,text,func){
var temp = document.createElement('a');
temp.setAttribute('href', url);
temp.appendChild(document.createTextNode(text));
temp.onclick = func;
return temp;
}





