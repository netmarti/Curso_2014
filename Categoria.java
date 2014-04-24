/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.util.ArrayList;

/**
 *
 * @author dan
 */
public class Categoria{
    private String tipo;
    private String descripcion;
    private ArrayList<Coche> coches;
    
    
 
    //creamos el constructor
    public Categoria(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.coches = new ArrayList<Coche>();
        this.coches.toString();
    }
    
    //creamos getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //creamos el override
    
    @Override
 public String toString(){
     String categoriaString;
     
     categoriaString = 
                "[Tipo: "+this.tipo+"]<br>"+
                "[Descripción: "+this.descripcion+"]<br>"+
                this.coches.toString();
                return categoriaString;
    
}

    public void addCoche(Coche coche) {
        this.coches.add(coche);
    }
}

