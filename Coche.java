/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

public class Coche {
   private String matricula;
   private String color;
   private String fabricante;
   private  int velocidadMax;
   private String tipo;
   
   
   
   public Coche(){
   }
   
   public Coche (String matricula, String color, String fabricante, int velocidadMax)
   {
    this.matricula= matricula;
    this.color= color;
    this.fabricante= fabricante;
    this.velocidadMax=velocidadMax;
   }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
           
 @Override
 public String toString(){
     String cocheString;
     
     cocheString = "[Matricula: "+this.matricula+"]<br>"+
                "[Color: "+this.color+"]<br>"+
                "[Fabricante: "+this.fabricante+"]<br>"+
                "[VelocidadMax: "+this.velocidadMax+"]<br>";
                return cocheString;
                     
 
 }
 
}

