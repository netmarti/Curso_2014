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
			

function diagrama06 (){
	var Area, radio, Perimetro;
	var pi=3.141592;
	
	
	
	radio=prompt("Escribe el radio del círculo"," ");
	Area=pi*radio*radio;
	Perimetro=2*pi*radio;
	
	alert("Area del círculo="+Area);
	
	alert("El perímetro es="+Perimetro);
}

}

function diagrama07() {
	
	var num;
	
	d=window.prompt("Introduce un número de 0 a 6");
	
	
switch (d)
  {
  case "0":
    num="hoy es Lunes";
    break;
  case "1":
    num="hoy es Martes";
    break;
  case "2":
    num="hoy es Miércoles";
    break;
  case "3":
    num="hoy es Jueves";
    break;
  case "4":
    num="hoy es Viernes";
    break;
  case "5":
    num="hoy es Sabado";
    break;
  case "6":
    num="hoy es Domingo";
    break;
  default:
    
   }
   alert("El valor introducido indica que "+num);
}

/*
Dejamos preparadas las funciones que vamos a utilizar para completar la práctica 14. 
Las iremos descomentando a medida que las vayamos completando.



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
