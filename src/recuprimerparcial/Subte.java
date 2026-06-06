
package recuprimerparcial;

/**
 *
 * @author ernesto
 */
public class Subte extends VehiculoTransporte{
    private String linea;

    public Subte(String linea, String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
        this.linea = linea;
    }

    @Override
    public void calcularCostoBase() {
        
    }

    @Override
    public String toString() {
        return "Subte{" + "linea=" + linea + '}';
    }
    
    
    
}
