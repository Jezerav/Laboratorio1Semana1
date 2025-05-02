/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

public class Garcia_Jeremy_Fecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("Ingrese la fecha 1 (DD/MM/AA):");
        String fecha1 = scanner.next();

        System.out.println("Ingrese la fecha 2 (DD/MM/AA):");
        String fecha2 = scanner.next();

        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1.substring(3, 5));
        int anio1 = Integer.parseInt(fecha1.substring(6, 8));

        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int anio2 = Integer.parseInt(fecha2.substring(6, 8));

        if (dia1 < 1 || dia1 > 31 || mes1 < 1 || mes1 > 12 || anio1 < 0) {
            System.out.println("Error: Fecha 1 inválida.");
            scanner.close();
            return;
        }

        if (dia2 < 1 || dia2 > 31 || mes2 < 1 || mes2 > 12 || anio2 < 0) {
            System.out.println("Error: Fecha 2 inválida.");
            scanner.close();
            return;
        }

        int totalDias1 = (anio1 * 360) + (mes1 * 30) + dia1;
        int totalDias2 = (anio2 * 360) + (mes2 * 30) + dia2;

        int diferencia;
        if (totalDias1 > totalDias2) {
            diferencia = totalDias1 - totalDias2;
        } else {
            diferencia = totalDias2 - totalDias1;
        }

        System.out.println("La diferencia entre fechas es de " + diferencia + " días.");

        scanner.close();
    }
}