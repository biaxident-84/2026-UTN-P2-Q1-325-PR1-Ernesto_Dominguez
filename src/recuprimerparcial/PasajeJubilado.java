
package recuprimerparcial;


public class PasajeJubilado implements Pasaje{

    @Override
    public void calcularCostoFinal() {
        System.out.println("Paga el 25% del costo base");
    }
    
}
