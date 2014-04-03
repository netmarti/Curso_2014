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
