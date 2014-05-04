package beans;

/**
 *
 * @author dan
 */
public class Mamifero extends Mascota {
    
    private String descripcion;

    /**
     *constructor de la clase mamífero con su llamadada al padre super, hemos añadido las patas
     * @param descripcion
     * @param chip
     * @param tipoMascota
     * @param nomMascota
     * @param alimentacion
     * @param habitat
     * @param sangre
     * @param listaMascotas
     * @param ArrayList
     */
    
    public Mamifero(String descripcion, String chip, String tipoMascota, String nomMascota, String alimentacion, String habitat, String sangre, java.util.ArrayList<Mascota> listaMascotas, Mascota ArrayList) {
        super(chip, tipoMascota, nomMascota, alimentacion, habitat, sangre, listaMascotas, ArrayList);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "descripcion=" + descripcion + '}';
    }

   
       
  
}
