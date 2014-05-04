package beans;

/**
 *
 * @author dan
 */
public class Reptil extends Mascota {
    
    private String movimiento;
    private boolean caparazon;

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
     * @param movimiento //nada, repta, camina
     * @param caparazon //si o no
     */
    public Reptil(String chip, String tipoMascota, String nomMascota, String alimentacion, String habitat, String sangre, String movimiento, boolean caparazon) {
        super(chip, tipoMascota, nomMascota, alimentacion, habitat, sangre);
        this.movimiento = movimiento;
        this.caparazon = caparazon;
    }
/*
    @Override
    public String toString() {
        return "Reptil{" + "movimiento=" + movimiento + ", caparazon=" + caparazon + '}';
    }*/

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public boolean isCaparazon() {
        return caparazon;
    }

    public void setCaparazon(boolean caparazon) {
        this.caparazon = caparazon;
    }

   
}
