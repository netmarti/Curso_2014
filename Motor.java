package beans;

public class Motor {
    
    private String potencia;
    private String cilindros;

    public Motor(String potencia, String cilindros) {
        this.potencia = potencia;
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", cilindros=" + cilindros + '}';
    }
  
}
