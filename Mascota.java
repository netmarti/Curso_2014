
 package beans;
import java.util.ArrayList;

/**
 *Clase padre de Ave, Mamifero, Reptil, Pez
 * @author dan
 */
public class Mascota {
    
    //propriedades de la superclase Mascota
    protected String chip;
    protected String tipoMascota;
    protected String nomMascota;
    protected String alimentacion;
    protected String habitat;
    protected String sangre;

  


    //creamos el constructor de la clase Mascota
    public Mascota(String chip, String tipoMascota, String nomMascota, String alimentacion, String habitat, String sangre) {
        this.chip = chip;
        this.tipoMascota = tipoMascota;
        this.nomMascota = nomMascota;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.sangre = sangre;
       
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    
    @Override
    public String toString() {
        
        return "Chip :"+chip+"<br/>"+
                "Tipo :"+tipoMascota+"<br/>"+
                "Nombre"+nomMascota+"<br/>"+
                "Alimentacion :"+alimentacion+"<br/>"+
                "Habitat :"+habitat+"<br/>"+
                "Sangre :"+sangre+"<br/>";
 
        
    }

  

    
    
}//cierra la clase Mascota
