package tema04_expresiones_aritmetricas_y_funciones.ExpresionesAritméticasFuncionesM;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExpArimetricasMatematicas {
    public static void main(String[] args) {

        //1- Obtener el largo del rectangulo
        System.out.println("Ingrese el largo del rectangulo");

        float largo;
        Scanner scan = new Scanner(System.in);
        largo = scan.nextFloat();

       // 2- Obtener el ancho del rectangulo
        System.out.println("Ingrese el ancho del rectangulo");

        float ancho;
        ancho = scan.nextFloat();

       //3- calcular el area
        float area;
        area = largo * ancho;

       // 4- imprimir el resultado
        System.out.println("El area del rectangulo es: " + area);

    }
}
