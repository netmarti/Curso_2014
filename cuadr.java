/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.*;

/**
 *
 * @author dan
 */
public class cuadr {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
    // ax^+bx+c=0
        System.out.print("a: ");
        double a = teclado.nextDouble();
        System.out.print("b: ");
        double b = teclado.nextDouble();
        System.out.print("c: ");
        double c = teclado.nextDouble();
        
        double x1;
        double x2;
        
        if (Math.pow(b,2) - (4*a*c) >= 0){
            
        
        x1= (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
        x2= (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/(2*a);
        
        System.out.println("Solución x1: " + x1);
        System.out.println("Solución x2: " + x2);
        }
        else System.out.println("Soluciones complejas");
    }
    
}
