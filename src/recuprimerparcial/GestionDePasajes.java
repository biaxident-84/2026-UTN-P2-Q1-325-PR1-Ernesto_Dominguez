
package recuprimerparcial;

import java.util.ArrayList;
import java.util.Collections;

public class GestionDePasajes {
    private ArrayList<VehiculoTransporte>  transportes = new ArrayList<>();
    
    
    public void mostrarViajesRealizados() {
        for (VehiculoTransporte vehiculo : transportes)
            System.out.println("Vehiculo en viaje: " + vehiculo.toString());
            
    }
    
    
    public void agregarViaje(VehiculoTransporte transporte) {
        if (!transportes.contains(transporte)) {
            transportes.add(transporte);
            System.out.println("Viaje agregado exitosamente.");
        } else {
            System.out.println("No se puedo agregar el viaje");
        }
    }
    
    
    
}
