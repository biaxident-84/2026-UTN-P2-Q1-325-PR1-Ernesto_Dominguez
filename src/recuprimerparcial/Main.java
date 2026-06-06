
package recuprimerparcial;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        GestionDePasajes gestion = new GestionDePasajes();
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        
        do {
            mostrarMenu();
            System.out.println("Seleccione una opcion.");
            while(!teclado.hasNextInt()) {
                System.out.println("Ingrese un numero valido.");
                teclado.next();
            }
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1: {
                    seleccionarTipoVehiculo();
                    System.out.println("Seleccione una opcion");
                    while (!teclado.hasNextInt()){teclado.next();}
                    int tipoVehiculo = teclado.nextInt();
                    
                    switch(tipoVehiculo) {
                        case 1: {
                            System.out.println("Marca: ");
                            String marca = teclado.next();
                            System.out.println("Año:");
                            int anio = teclado.nextInt();
                            System.out.println("Ingrese la empresa: ");
                            String empresa = teclado.next();
                            System.out.println("Ingrese la capacidad: ");
                            int capacidad = teclado.nextInt();
                            System.out.println("Ingrese la patente del vehiculo: ");
                            String patente = teclado.next();
                    
                            Colectivo colectivo = new Colectivo(marca, anio, empresa, capacidad, patente);
                            gestion.agregarViaje(colectivo);
                            break;
                        }
                        case 2: {
                            System.out.println("Tipo de servicio: ");
                            String servicio = teclado.next();
                            System.out.println("Patente: ");
                            String patente = teclado.next();
                            System.out.println("Capacidad: ");
                            int capacidad = teclado.nextInt();
                            System.out.println("Empresa: ");
                            String empresa = teclado.next();
                            
                            Tren tren = new Tren(servicio, patente, capacidad, empresa );
                            gestion.agregarViaje(tren);
                        }
                        
                    }
                    
                    
                    
                }
                    
                    break;
                case 2:
                    gestion.mostrarViajesRealizados();
                    break;
                case 3:
                    
                    break;
                case 4:
                    
            }
        } while (opcion != 5);
        teclado.close();
    }
    
    public static void mostrarMenu(){
        System.out.println(" ==== Menu de viajes =====");
        System.out.println("1.Registrar un nuevo viaje.");
        System.out.println("2.Mostrar los viajes realizados.");
        System.out.println("3.Ordenar los viajes por costo.");
        System.out.println("4.Ordenar los viajes por nombre de pasajero");
        System.out.println("5.Mostrar el total recaudado.");
        System.out.println("---------------------------------");
    }
    
   public static void seleccionarTipoVehiculo () {
       System.out.println("Seleccione el tipo de vehiculo");
       System.out.println("1. Colectivo.");
       System.out.println("2. Tren.");
       System.out.println("3. Subte.");
   }
        
        
        
        
        
        
        
       
  
   
}
