/**
* @author Daniel
*/

function diagrama01() {
	num_1 = window.prompt("Dame un valor")
	if (num_1 > 30) {
		alert(num_1 + "Es mayor de 30");
		} 
		
		else {
		alert(num_1 + "Es inferior a 30");
	}

}


function diagrama02() {
	var num_1;
	var num_2;
	num_1 = window.prompt("Dame un valor");
	num_2 = window.prompt("Dame otro valor");



			if (num_1 > num_2)
 
			alert(num_1 + " es superior");

				else (num_1 > num_2);

			alert (num_2 + " es inferior");


}


function diagrama03() {
	var num_1;
	var num_2;
	num_1 = window.prompt("Dame un valor");
	num_2 = window.prompt("Dame otro valor");

	if (num_1==num_2)

		alert ("Vuelve a empezar poniendo números diferentes");

		else

		{
			if (num_1 > num_2)
 
			alert(num_1 + " es superior");

				else (num_1 > num_2);

			alert (num_2 + " es inferior");
		}

}


function diagrama04() {
	var num_1;
	var num_2;
	var num_3;
	num_1 = window.prompt("Dame valor 1");
	num_2 = window.prompt("Dame valor 2");
	num_3 = window.prompt("Dame valor 3");



			if((num_1 > num_2)&(num_1>num_3))
 
			alert(num_1 + " es el mayor");
			
				else

		{
			if ((num_1 < num_2)&(num_2>num_3))
 
			alert(num_2 + " es el mayor");

				else (num_3 > num_2);

			alert (num_3 + " es el mayor");
		}

}

function diagrama05() {
	var num_1 = window.prompt("Dame un valor");
	var num_2 = window.prompt("Dame otro valor");
	var num_3 =window.prompt("Dame otro valor para terminar");
	var mayor;
	var medio;
	var menor;


			if(num_1 > num_2 && num_1>num_3){
 
			mayor=num_1;
			
				}else
					{ if (num_2 > num_1 && num_2>num_3){
 
						mayor=num_2;}
					
						else{
						mayor=num_3;}
					}
					
			if(num_1<num_2 && num_1<num_3){
					menor=num_1;
					}else{
							if (num_2<num_1 && num_2<num_3){
							menor=num_2;
							}
							else{
							menor=num_3;}
				
					}
			medio=(parseInt(num_1)+parseInt(num_2)+parseInt(num_3))-(parseInt(mayor)+parseInt(menor));
			alert(mayor+" "+medio+" "+menor);
			

}

/*
Dejamos preparadas las funciones que vamos a utilizar para completar la práctica 14. 
Las iremos descomentando a medida que las vayamos completando.

function diagrama06() {

}
function diagrama07() {

}

function diagrama08() {

}
function diagrama09() {

}

function diagrama10() {

}
function diagrama11() {

}

function diagrama12() {

}
function diagrama13() {

}

function diagrama14() {

}
function diagrama15() {

}
*/
