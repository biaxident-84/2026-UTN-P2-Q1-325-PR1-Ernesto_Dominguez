
package recuprimerparcial;


public abstract class VehiculoTransporte {
    private String patente;
    private int capacidad;
    private String empresa;

    public VehiculoTransporte(String patente, int capacidad, String empresa) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.empresa = empresa;
    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getEmpresa() {
        return empresa;
    }
    
    public abstract void calcularCostoBase();

    @Override
    public String toString() {
        return "VehiculoTransporte{" + "patente=" + patente + ", capacidad=" + capacidad + ", empresa=" + empresa + '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof VehiculoTransporte ) {
            VehiculoTransporte v = (VehiculoTransporte) o;
            return this.patente.equals(v.getPatente());
        }
        return false;
    }
    
    
    
}
