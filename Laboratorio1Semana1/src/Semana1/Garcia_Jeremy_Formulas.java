
package Semana1;

import java.util.Scanner;
public class Garcia_Jeremy_Formulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("****EJERCICIO A*****");
        System.out.println("Ingrese el Numerador 1: ");
        double numerador1 = scanner.nextDouble();
        System.out.println("Ingrese el Denominador 1: ");
        double denominador1 = scanner.nextDouble();
        System.out.println("Ingrese el Numerador 1: ");
        double numerador2 = scanner.nextDouble();
        System.out.println("Ingrese el Denominador 2: ");
        double denominador2 = scanner.nextDouble();
        double total1 = (numerador1 / denominador1) + (numerador2 / denominador2);
        System.out.println("El total del ejercicio 1 es:" + total1);
        
        System.out.println("***EJERCICIO B*****");
        System.out.print("Valor de x: ");
        double variableX = scanner.nextDouble();
        System.out.print("Valor de y: ");
        double variableY = scanner.nextDouble();
        double total2 = (1 / (variableX - 5)) - ((3 * variableX * variableY) / 4);
        System.out.println("El total del ejercicio 2 es: " + String.format("%.2f", total2));
        
        System.out.println("***EJERCICIO C*****");
        System.out.println("Ingrese el Numerador: ");
        double numeradorEj3 = scanner.nextDouble();
        System.out.println("Ingrese el Denominador: ");
        double denominadorEj3 = scanner.nextDouble();
        System.out.println("Ingrese un numero adicional: ");
        double numeroEj3 = scanner.nextDouble();
        double total3 = (numeradorEj3 / denominadorEj3) + numeroEj3;
        System.out.println("El total del ejercicio 3 es: " + String.format("%.2f", total3));
        
        System.out.println("***EJERCICIO D*****");
        System.out.println("Ingrese el Numerador: ");
        double numeradorEj3 = scanner.nextDouble();
        System.out.println("Ingrese el Denominador: ");
        double denominadorEj3 = scanner.nextDouble();
        System.out.println("Ingrese un numero adicional: ");
        double numeroEj3 = scanner.nextDouble();
        double total3 = (numeradorEj3 / denominadorEj3) + numeroEj3;
        System.out.println("El total del ejercicio 3 es: " + String.format("%.2f", total3));
        scanner.close();
}
}