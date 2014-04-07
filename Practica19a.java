/*
 * Este archivo debe llamarse Deitel_5_14.java en el programa para que se ejecute junto con 
 * UsaDeitel_5_14
 *
 */

package controller;

/**
 *
 * @author dan
 */
public class Deitel_5_14

    {             // Abre clase Deitel_5_14
     private double capital;
     private double inicial = 5000;


     
     public void Interes()
     {      //Abre método Interes


     for(double tasa = 0.05; tasa <= 0.1; tasa += 0.01 )
     {  // Abre primer for 


     System.out.printf("\n%s%20s", "Any", "Capital en la cuenta");
     System.out.printf(" para una tasa igual a: %.2f\n", tasa);

     for( int any = 1; any <= 10; any++ )
     {  // Abre for
     capital = inicial * Math.pow( 1.0 + tasa, any );
     System.out.printf("%4d%,20.2f\n", any, capital);
     }  // Cierra for

     System.out.println("\n");
     }   // Cierra primer for 

     }      // Cierra método Interes

    }             // Cierra clase Deitel_5_14
