package beans;

/**
*
* @author dan
*/
public class Ave extends Mascota {
    
    private String comportamiento;

    /**
*
* @param chip
* @param tipoMascota
* @param nomMascota
* @param alimentacion
* @param habitat
* @param sangre
* @param listaMascotas
* @param ArrayList
* @param comportamiento // diurno o nocturno
*/
    public Ave(String chip, String tipoMascota, String nomMascota, String alimentacion, String habitat, String sangre,String comportamiento) {
        super(chip, tipoMascota, nomMascota, alimentacion, habitat, sangre);
        this.comportamiento = comportamiento;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

  /*  @Override
    public String toString() {
        return "Ave{" + "comportamiento=" + comportamiento + '}';
    }
*/
   
}//cierra la clase, útlima llave del documento
