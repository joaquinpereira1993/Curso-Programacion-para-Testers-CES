package tema03_variables_y_tipos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DatosDePrueba {
    public static void main(String[] args) {

       //Declaracion de variables
        boolean loginExitoso = true;
        int cantidadDeErrores = 0;
        double tiempoDeRespuesta = 1.35;
        char ambiente = 'J';

        String usuario = "admin";
        String password = "1234";

        System.out.println("Usuario: " + usuario);
        System.out.println("Contraseña: " + password);
        System.out.println("Ambiente: " + ambiente);


        //Programa mediante el metodo Scanner
        System.out.println("Ingrese su nombre");
        String nombre;
        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();

        int edad;
        System.out.println("Ingrese su edad");
        edad = scan.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);




    }
}
