/**
 * @author Andrés Segura
 * 
 * Ejecicio de programacion: Java | if
 */

import java.util.Scanner;

class Ejercicio1_if{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int miEdad = Integer.parseInt(entrada.nextLine());

        entrada.close();

        //// Si es menor de 18 años de edad.
        if(miEdad < 18){
            System.out.println("Tu edad es " + miEdad + ", eres menor de edad.");

            System.exit(0);
        }

        System.out.println("Tu edad es " + miEdad + ", puedes continuar.");

    }
}