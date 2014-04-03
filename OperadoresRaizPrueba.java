package RaizCuadrada;

public class RaizCuadrada {

public static void main(String[] args) {
    double numero, raizcuadrada, errorredondeo;
    
for (numero = 1.0; numero < 100.0; numero++){
    raizcuadrada = Math.sqrt(numero);
    System.out.println("La Raíz cuadrada de " + numero + "es" + raizcuadrada);
    
    errorredondeo = numero - (raizcuadrada * raizcuadrada);
    System.out.println("el error de redondeo es" + errorredondeo);
    System.out.println();
}
}
}

/*Función potencia y raíz cuadrada

Para elevar un número x a la potencia y, se emplea pow(x, y)

   System.out.println("pow(10.0, 3.5) es " +  Math.pow(10.0,3.5));
 
Para hallar la raíz cuadrada de un número, se emplea la función sqrt

   System.out.println("La raíz cuadrada de " + x + " is " + Math.sqrt(x));
   */
