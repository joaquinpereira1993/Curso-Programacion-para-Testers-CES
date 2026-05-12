package tema04_expresiones_aritmetricas_y_funciones.ExpresionesAritméticasFuncionesM;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExpArimetricasMatematicas {
    public static void main(String[] args) {
/*
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

 */     //Funciones con Variables
        int x, y;
        x = 3;
        int valor = x + 9;
        System.out.println("El valor es: " + valor);

        y = 29;
        int variosOperadores = y + 4 + x + 10;
        System.out.println("El resultado es: " + variosOperadores);

        int ecuacion = y + x + 20 * 2;
        System.out.println("El resultado es: " + ecuacion);

        int parentesis = y + 3 - (x * 2);
        System.out.println("El resultado es: " + parentesis);

        double raizCuadrada = 4 - Math.sqrt(4);
        System.out.println("La raiz cuadrada es: " + raizCuadrada);

        int divisionEntera = 11 / 2;
        System.out.println("El resultado de la division entera es: " + divisionEntera);

        double divisionReal = 11.0 / 2.0;
        System.out.println("El resultado de la division real es: " + divisionReal);

        int resto = 11 % 2;
        System.out.println("El resto es: " + resto);
    }
}
