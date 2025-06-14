
package Semana1;

import java.util.Scanner;
public class Garcia_Jeremy_Formulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("****EJERCICIO A*****");
        System.out.println("Valor de Numerador 1: ");
        double numerador1 = scanner.nextDouble();
        System.out.println("Valor de Denominador 1: ");
        double denominador1 = scanner.nextDouble();
        System.out.println("Valor de Numerador 1: ");
        double numerador2 = scanner.nextDouble();
        System.out.println("Valor de Denominador 2: ");
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
        System.out.println("Valor de Numerador: ");
        double numeradorEj3 = scanner.nextDouble();
        System.out.println("Valor de Denominador: ");
        double denominadorEj3 = scanner.nextDouble();
        System.out.println("Valor numero adicional: ");
        double numeroEj3 = scanner.nextDouble();
        double total3 = (numeradorEj3 / denominadorEj3) + numeroEj3;
        System.out.println("El total del ejercicio 3 es: " + String.format("%.2f", total3));
        
        System.out.println("***EJERCICIO D*****");
        System.out.println("Valor de numero a: ");
        double numeroEj4 = scanner.nextDouble();
        System.out.println("Valor de Numerador: ");
        double numeradorEj4 = scanner.nextDouble();
        System.out.println("Valor de Denominador: ");
        double denominadorEj4 = scanner.nextDouble();
        double total4 = numeroEj4 + (numeradorEj4 / denominadorEj4);
        System.out.println("El total del ejercicio 4 es: " + String.format("%.2f", total4));
        
        System.out.println("***EJERCICIO E*****");
        System.out.print("Valor de a: ");
        double valora = scanner.nextDouble();
        System.out.print("Valor de b: ");
        double valorb = scanner.nextDouble();
        System.out.print("Valor de c: ");
        double valorc = scanner.nextDouble();
        System.out.print("Valor de d: ");
        double valord = scanner.nextDouble();
        System.out.print("Valor de e: ");
        double valore = scanner.nextDouble();
        System.out.print("Valor de f: ");
        double valorf = scanner.nextDouble();
        System.out.print("Valor de g: ");
        double valorg = scanner.nextDouble();
        System.out.print("Valor de h: ");
        double valorh = scanner.nextDouble();
        System.out.print("Valor de j: ");
        double valorj = scanner.nextDouble();
        double total5 = (valora, 2) / (valorb - valorc) + ((valord - valore) / (valorf - ((valorg * valorh) / valorj)));
        System.out.println("El total del ejercicio E es: " + String.format("%.2f", total5));

        System.out.println("***EJERCICIO F*****");
        System.out.print("Valor de m: ");
        double valorm = scanner.nextDouble();
        System.out.print("Valor de n: ");
        double valorn = scanner.nextDouble();
        System.out.print("Valor de p: ");
        double valorp = scanner.nextDouble();
        double total6 = (valorm / valorn) + valorp;
        System.out.println("El total del ejercicio F es: " + String.format("%.2f", total6));

        System.out.println("***EJERCICIO G*****");
        System.out.print("Valor de m: ");
        double valormg = scanner.nextDouble();
        System.out.print("Valor de n: ");
        double valorng = scanner.nextDouble();
        System.out.print("Valor de p: ");
        double valorpg = scanner.nextDouble();
        System.out.print("Valor de q: ");
        double valorqg = scanner.nextDouble();
        double resultadoG = valormg + (valorng / (valorpg - valorqg));
        System.out.println("El total del ejercicio F es: " + String.format("%.2f", total7));


        scanner.close();
}
}