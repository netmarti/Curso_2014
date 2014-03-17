/* Practica 22 – jQuery
 realiza los siguientes puntos en un mismo documento HTML nuevo y su respectivo JS.
 El codigo JS ha de estar comentado para facilitar su comprensión.

 1. Importa las librerias jQuery y programa en un nuevo archivo JS los siguientes puntos: */

/* ALTERAR CSS
 http://api.jquery.com/css/
 2. Al clicar sobre #setBlueColor establece el div #divMobil con color de fondo azul. */

function eje02() {
	$('#divMobil').css('background-color', 'blue');

}

/* 3. Al clicar sobre #setBlueRed establece el div #divMobil con color de fondo rojo. */
function eje03() {
	$('#divMobil').css('background-color', 'red');

}

/* 4. Utiliza el seguiente codigo para que al iniciarse la web el elemento #divMobil se muestre con color de fondo
 azul.*/

$(document).ready(function() {
	//selecciona #divMobil i modifica el CSS en color Blau
	$('#divMobil').css('background-color', 'blue');

	/* EFECTOS DE FUNDIDO
	 http://api.jquery.com/category/effects/fading/ */

	/* 5. Al clicar sobre #setInvisible vuelve invisible el div #divMobil con la función .fadeOut() */

	$("#setInvisible").click(function() {
		$('#divMobil').fadeOut("slow");
	});
	/* 6. Al clicar sobre #setVisible vuelve visible el div #divMobil con la función .fadeIn() */

	$("#setVisible").click(function() {
		$('#divMobil').fadeIn("slow");
	});

	/* 7. Al clicar sobre #toggleVisible vuelve como visible/invisible el div #divMobIl con la
	 función .fadeToggle() */

	$("#toggleVisible").click(function() {
		$('#divMobil').fadeToggle("slow");
	});
	
	/* 8. Al clicar sobre #setSizes vuelve como a visible el div #divMobil. */

	$(" #setSizes").click(function() {
		$('#divMobil').show("slow");

	});
	
	/*9. Al clicar sobre #incSize aumenta “50px” la altura del elemento #divMobil con una transición.*/
	
	$("#incSize").click(function(){
		$('#divMobil').css('height','+=50');
	});


/*10. Al clicar sobre #decSize disminuye “50px” la altura del elemento #divMobil con una transición.*/
	
	$("#decSize").click(function(){
	$('#divMobil').css('height','-=50');
	});

/* TRANSICIONES
 http://api.jquery.com/animate/
 
 
 11. Al clicar sobre #toggleVisible vuelve como visible/invisible el div #divMobil con la
 función .fadeToggle() 
 
  12 Movimiento continuo*/
  $('#movimentContinu').click(function(){
  	$('#divMobil').css("position","absolute");
  	der();
  });
  $("#divMobil").click(function(){$('#divMobil').stop(true);});
  
});

 
 /*Movimiento regreso*/
function der(){
	$('#divMobil').animate( {left:600},"slow", izq);
  };
  
var izq = function(){
$('#divMobil').animate( {left:10},"slow", der);
  };



