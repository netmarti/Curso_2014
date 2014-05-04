package beans;
import java.util.ArrayList;

/**
 *
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

    /**
     *Creamos el ArrayList con la listaMascotas donde almacenar las nuevas mascotas
     */
    protected ArrayList<Mascota> listaMascotas;
    private Mascota ArrayList;

    //creamos el constructor de la clase Mascota
    public Mascota(String chip, String tipoMascota, String nomMascota, String alimentacion, String habitat, String sangre, ArrayList<Mascota> listaMascotas, Mascota ArrayList) {
        this.chip = chip;
        this.tipoMascota = tipoMascota;
        this.nomMascota = nomMascota;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.sangre = sangre;
        this.listaMascotas = listaMascotas;
        this.ArrayList = ArrayList;
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

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public Mascota getArrayList() {
        return ArrayList;
    }

    public void setArrayList(Mascota ArrayList) {
        this.ArrayList = ArrayList;
    }

    @Override
    public String toString() {
        return "Mascota{" + "chip=" + chip + ", tipoMascota=" + tipoMascota + ", nomMascota=" + nomMascota + ", alimentacion=" + alimentacion + ", habitat=" + habitat + ", sangre=" + sangre + ", listaMascotas=" + listaMascotas + ", ArrayList=" + ArrayList + '}';
    }

    public void addMascota(Ave ave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addMascota(Pez pez) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  

    
    
}//cierra la clase Mascota
