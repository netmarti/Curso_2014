package beans;

/**
 *
 * @author dan
 * tipoAcuario: dulce o salado
 */
public class Pez extends Mascota {

    private String tipoAcuario;
    //constructor de la clase Pez con llamada al padre y sus propiedades particulares

    public Pez(String chip, String tipoMascota, String nomMascota, String alimentacion, String habitat, String sangre, String tipoAcuario) {
        super(chip, tipoMascota, nomMascota, alimentacion, habitat, sangre);
        this.tipoAcuario = tipoAcuario;
    }

    public String getTipoAcuario() {
        return tipoAcuario;
    }

    public void setTipoAcuario(String tipoAcuario) {
        this.tipoAcuario = tipoAcuario;
    }
/*
    @Override
    public String toString() {
        return "Pez{" + "tipoAcuario=" + tipoAcuario + '}';
    }

*/    
    
}//cierra la clase útlima llave del documento
