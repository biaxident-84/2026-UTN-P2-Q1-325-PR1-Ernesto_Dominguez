
package recuprimerparcial;


public class Colectivo extends VehiculoTransporte{
    private String marca;
    private int anio;

    public Colectivo(String marca, int anio, String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
        this.marca = marca;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public void calcularCostoBase() {
    
    }

    @Override
    public String toString() {
        return "Colectivo{" + "marca=" + marca + ", anio=" + anio + '}';
    }
    
    
    
    
}
