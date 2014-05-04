/*
 *PRACTICA 32
 */
package beans;

import java.util.ArrayList;

public class Categoria {

    private String tipo;
    private String descripcion;
    private ArrayList<Vehiculo> listaVehiculos;
    
    public Categoria(String tipo, String descripcion) {

        this.tipo = tipo;
        this.descripcion = descripcion;
        this.listaVehiculos = new ArrayList<Vehiculo>();
       

    }
    
    public void addVehiculo(Vehiculo vehiculo) {
        
        this.listaVehiculos.add(vehiculo);
    }

    public Categoria() {

    }

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

    @Override
    public String toString() {
        String categoriaString;

        categoriaString = "[Tipo: " + this.tipo + "]<br>"
                + "[Descripcion: " + this.descripcion + "]<br>"
                + this.listaVehiculos.toString() +"]<br>";
                

        return categoriaString;
    }
}
