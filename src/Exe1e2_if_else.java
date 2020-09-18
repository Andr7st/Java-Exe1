/**
* @author Andrés Segura
* 
* Ejecicio de programacion: Java | if_else
*/

import java.util.Scanner;

class Ejercicio2_if_else{
   public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingresa tu nombre: ");
    String nombre = entrada.nextLine();
    entrada.close();
    

    /// Si es este nombre, dará un mensaje en específico, de lo contrario uno genérico.
    if (nombre.equalsIgnoreCase("Andres Segura")) {
        System.out.println("¡Hola, Andres Segura!");
    } else {
        System.out.println("¡Hola, " + nombre + "! Que tengas un buen día." );
    }


    }
}
