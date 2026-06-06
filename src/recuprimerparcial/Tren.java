
package recuprimerparcial;


public class Tren extends VehiculoTransporte{
    private String tipoServicio;

    public Tren(String tipoServicio, String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
        this.tipoServicio = tipoServicio;
    }

    

    public String getTipoServicio() {
        return tipoServicio;
    }

    @Override
    public void calcularCostoBase() {
        
    }

    @Override
    public String toString() {
        return "Tren{" + "tipoServicio=" + tipoServicio + '}';
    }
    
    
    
    
    
}
