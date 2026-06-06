
package recuprimerparcial;

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
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
                    System.out.println("Ingrese su nombre: ");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el tipo de Vehiculo de transporte: ");
                    String vehiculo = teclado.next();
                    System.out.println("Ingrese el tipo de pasaje: (C) COMUN |(J) JUBILADO |(E) ESTUDIANTE: ");
                    String tipo = teclado.next();
                }
                    
                    break;
                case 2:
                    
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
    
      
        
        
        
        
        
        
        
       
  
   
}
