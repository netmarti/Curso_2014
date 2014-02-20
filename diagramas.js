/**
* @author Daniel
*/

/**
 * diagrama01 solicita un valor y nos indica si es superior o inferior a 30
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

/**
 * diagrama02 solicita dos valores y nos indica cual es superior y cual es inferior
 */
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

/**
 * diagrama03 solicita dos valores por pantalla y nos indique cual es superior, cual es inferior y si son iguales nos lo indique
 */
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

/**
 * diagrama04 solicita tres valores y nos muestra cual es el mayor
 */
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

/**
 * diagrama05 solicita tres valores y nos los muestre ordenados de mayor a menor
 */
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

/**
 * diagrama06 un programa que nos pida el radio y nos muestre el perímetro de un círculo y el área 
 */
function diagrama06() {
	var Area, radio, Perimetro;
	var pi=3.141592;
	
	
	
	radio=prompt("Escribe el radio del círculo"," ");
	Area=pi*radio*radio;
	Perimetro=2*pi*radio;
	
	alert("Area del círculo="+Area);
	
	alert("El perímetro es="+Perimetro);
}

/**
 * diagrama07 solicita un número del 0 al 7 y devuelve el día de la semana empezando por lunes
 */
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

//* Un programa que nos pida un valor y nos de la bienvenida si el valor es múltiplo de 2 o superior a 20

function diagrama08() {
	
	var num, mensaje = "Bienvenid@ al diagrama 08";
	
	num=window.prompt("Dame un valor");
	num=window.parseInt(num);

		if ( num%2==0 || num>20){
	
 
   alert("Bienvenido/al diagrama 08 ");
		}
}


// * diagrama09 un programa que nos pida un nombre y un password y nos de la bienvenida si el texto es José y password "12345"
 
function diagrama09() {

	var nombre, password, mensaje ="Bienvenido/a al diagrama 09";
	
	nombre=window.prompt("Dime tu nombre");
	password=window.prompt("Indica un password");
	
		if (nombre=="Jose" && password=="12345"){
			
	alert("Bienvenido/a al diagrama 09");
		}
		else{
				alert("No te conozco, habla con el administrador de diagramas");
		}
}

// * diagrama10 un programa que nos pida valores hasta que el usuario ponga uno superior a 50
function diagrama10() {
	
	var num;
	
	num=window.prompt("Dame un valor");
	num=window.parseInt(num);
	
	
	while (num<50){
		num=window.prompt("Dame un valor");
		
	}
	

}

/*diagrama11 un programa que nos pida valores hasta que el usuario ponga uno superior a 50
/* y nos muestre al final los intentos hasta llegar al valor superior a 50*/

function diagrama11() {
	
	var num, intentos;
	
	intentos= 1;
	num=window.prompt("Dame un valor");
	num=window.parseInt(num);
	
	
	
	while (num<50){
		num=window.prompt("Dame un valor");
		intentos++;
	}

	alert("Has realizado"+intentos);

/*
Dejamos preparadas las funciones que vamos a utilizar para completar la práctica 14. 
Las iremos descomentando a medida que las vayamos completando.


function diagrama12() {

}
function diagrama13() {

}

function diagrama14() {

}
function diagrama15() {

}
*/
