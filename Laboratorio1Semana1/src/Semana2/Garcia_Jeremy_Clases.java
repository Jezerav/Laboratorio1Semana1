/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

public class Garcia_Jeremy_Clases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("Ingrese la fecha actual (Día, DD/MM):");
        String fechaHoy = scanner.next();

        String diaTexto = fechaHoy.substring(0, fechaHoy.indexOf(","));
        String fechaNum = fechaHoy.substring(fechaHoy.indexOf(",") + 2);
        diaTexto = diaTexto.toLowerCase();

        String[] partesFecha = fechaNum.split("/");
        int diaNum = Integer.parseInt(partesFecha[0]);
        int mesNum = Integer.parseInt(partesFecha[1]);

        if (diaNum < 1 || diaNum > 31 || mesNum < 1 || mesNum > 12) {
            System.out.println("Error: Fecha inválida.");
            scanner.close();
            return;
        }

        if (!diaTexto.equals("lunes") && !diaTexto.equals("martes") &&
            !diaTexto.equals("miércoles") && !diaTexto.equals("jueves") &&
            !diaTexto.equals("viernes")) {
            System.out.println("Error: Día de la semana inválido.");
            scanner.close();
            return;
        }

        if (diaTexto.equals("lunes") || diaTexto.equals("martes") || diaTexto.equals("miércoles")) {
            System.out.println("¿Se tomaron exámenes? (si/no): ");
            String respuesta = scanner.next().toLowerCase();
            if (respuesta.equals("si")) {
                System.out.println("Ingrese cantidad de alumnos aprobados: ");
                int aprobados = scanner.nextInt();
                System.out.println("Ingrese cantidad de alumnos reprobados: ");
                int reprobados = scanner.nextInt();
                int total = aprobados + reprobados;
                if (total > 0) {
                    double porcentajeApr = (aprobados * 100) / total;
                    System.out.println("Porcentaje de aprobados: " + String.format("%.2f", porcentajeApr) + "%");
                } else {
                    System.out.println("No hay datos suficientes para calcular el porcentaje.");
                }
            } else {
                System.out.println("No se tomaron exámenes.");
            }

        } else if (diaTexto.equals("jueves")) {
            System.out.println("Ingrese el porcentaje de asistencia (sin signo de %): ");
            double asistencia = scanner.nextDouble();
            if (asistencia > 50) {
                System.out.println("Asistió la mayoría.");
            } else {
                System.out.println("No asistió la mayoría.");
            }

        } else if (diaTexto.equals("viernes")) {
            if (diaNum == 1 && (mesNum == 1 || mesNum == 7)) {
                System.out.println("Comienzo de nuevo ciclo.");
                System.out.println("Ingrese cantidad de alumnos: ");
                int cantidadAlum = scanner.nextInt();
                System.out.println("Ingrese el precio por alumno en $: ");
                double precioAlum = scanner.nextDouble();
                double ingresoTotal = cantidadAlum * precioAlum;
                System.out.println("Ingreso total del nuevo ciclo: $" + String.format("%.2f", ingresoTotal));
            } else {
                System.out.println("Clases normales de inglés para viajeros.");
            }
        }

        scanner.close();
    }
}