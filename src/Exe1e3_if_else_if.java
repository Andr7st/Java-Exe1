/**
* @author Andrés Segura
* 
* Ejecicio de programacion: Java | if_else_if
*/

import java.util.Scanner;

class Ejercicio3_if_else_if{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa uno de los primeros 6 meses del año en español: ");
        String mesNacimiento = entrada.nextLine();
        
        entrada.close();
        
        String mensaje = "mes del año.";
        
        if (mesNacimiento.equalsIgnoreCase("enero")){
            System.out.println("Primer " + mensaje);
        }
        else if(mesNacimiento.equalsIgnoreCase("febrero")){
            System.out.println("Segundo " + mensaje);
        }
        else if(mesNacimiento.equalsIgnoreCase("marzo")){
            System.out.println("Tercer " + mensaje);
        }
        else if(mesNacimiento.equalsIgnoreCase("abril")){
            System.out.println("Cuarto " + mensaje);
        }
        else if(mesNacimiento.equalsIgnoreCase("mayo")){
            System.out.println("Quinto " + mensaje);
        }
        else if(mesNacimiento.equalsIgnoreCase("junio")){
            System.out.println("Sexto " + mensaje);
        }
        else{
            System.out.println("Ingreso incorrecto o no comprendido entre los primeros 6");
        }
        
    }
}
