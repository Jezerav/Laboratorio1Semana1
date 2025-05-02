/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

public class Garcia_Jeremy_Pagos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
     
        System.out.println("Ingrese el código del empleado:");
        String codigoEm = scanner.next();
        System.out.println("Ingrese el nombre del empleado:");
        String nombreEm = scanner.next();
        System.out.println("Ingrese el apellido del empleado:");
        String apellidoEm = scanner.next();
        System.out.println("Ingrese la cantidad total de horas trabajadas:");
        int horasTrabajadas = scanner.nextInt();
        
        int horasNormales = 0;
        int horasExtra = 0;

        if (horasTrabajadas <= 40) {
            horasNormales = horasTrabajadas;
            horasExtra = 0;
        } else {
            horasNormales = 40;
            horasExtra = horasTrabajadas - 40;
        }
        
        if (horasExtra > 15) {
            horasExtra = 15;
        }
        
        System.out.println("Categorías disponibles:");
        System.out.println("1 - $40 por hora extra");
        System.out.println("2 - $50 por hora extra");
        System.out.println("3 - $85 por hora extra");
        System.out.println("4 - $0 por hora extra");
        System.out.println("Ingrese la categoría del empleado (1 a 4):");
        int categoria = scanner.nextInt();
        
        double pagoHora = 35.99;
        double pagoExtra = 0;
        
        switch (categoria) {
            case 1:
                pagoExtra = horasExtra * 40;
                break;
            case 2:
                pagoExtra = horasExtra * 50;
                break;
            case 3:
                pagoExtra = horasExtra * 85;
                break;
            case 4:
                pagoExtra = 0;
                break;
            default:
                System.out.println("Categoría inválida.");
                scanner.close();
                return;
        }
        
        double pagoNormal = horasNormales * pagoHora;
        double pagoTotal = pagoNormal + pagoExtra;

        System.out.println("Código del Empleado: " + codigoEm);
        System.out.println("Empleado: " + nombreEm + " " + apellidoEm);
        System.out.println("Horas normales: " + horasNormales);
        System.out.println("Horas extra pagadas: " + horasExtra);
        System.out.println("Pago por horas normales: $" + String.format("%.2f", pagoNormal));
        System.out.println("Pago por horas extra: $" + String.format("%.2f", pagoExtra));
        System.out.println("Pago total: $" + String.format("%.2f", pagoTotal));

        scanner.close();
        
    }
}
