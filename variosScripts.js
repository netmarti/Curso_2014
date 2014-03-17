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

