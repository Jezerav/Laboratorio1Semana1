/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3;

import java.util.Scanner;
import java.util.Random;

public class Garcia_Jeremy_Estructura {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        
                int opcion1 = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0;
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Palabra Alrevés");
            System.out.println("2. Número perfecto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    opcion1++;
                    System.out.print("¿Cuántas palabras deseas ingresar?: ");
                    int cantidad = lea.nextInt();
                    
                    String reves = "";
                    String palabraMax1 = "";
                    String palabraMax2 = "";
                    int caracterMax = 0;

                    for (int contador1 = 1; contador1 <= cantidad; contador1++) {
                        System.out.print("Palabra #" + contador1 + ": ");
                        String palabra = lea.next();

                        for (int contador2 = 0; contador2 < palabra.length(); contador2++) {
                            reves += palabra.charAt(palabra.length() - 1 - contador2);
                        }

                        System.out.println("Al revés: " + reves);

                        if (palabra.length() > caracterMax) {
                            caracterMax = palabra.length();
                            palabraMax1 = palabra;
                            palabraMax2 = " ";
                        } else if (palabra.length() == caracterMax && !palabra.equals(palabraMax1)) {
                            palabraMax2 = palabra;
                        }

                        reves = " ";
                    }

                    System.out.println("Palabra(s) con más letras (" + caracterMax + "):");

                    if (!palabraMax1.equals(" ")) {
                        System.out.print("- " + palabraMax1 + ": ");
                        String invertida = " ";
                        for (int contador1 = palabraMax1.length() - 1; contador1 >= 0; contador1--) {
                            invertida += palabraMax1.charAt(contador1);
                        }
                        switch (palabraMax1.equalsIgnoreCase(invertida) ? "si" : "no") {
                            case "si":
                                System.out.println("es un palíndromo.");
                                break;
                            case "no":
                                System.out.println("no es un palíndromo.");
                                break;
                        }
                    }

                    if (!palabraMax2.equals("")) {
                        System.out.print("- " + palabraMax2 + ": ");
                        String invertida = "";
                        for (int i = palabraMax2.length() - 1; i >= 0; i--) {
                            invertida += palabraMax2.charAt(i);
                        }
                        switch (palabraMax2.equalsIgnoreCase(invertida) ? "si" : "no") {
                            case "si":
                                System.out.println("es un palíndromo.");
                                break;
                            case "no":
                                System.out.println("no es un palíndromo.");
                                break;
                        }
                    }
                    break;

                case 2:
                    opcion2++;
                    System.out.print("Ingrese un número: ");
                    int numero = lea.nextInt();

                    int suma = 0;

                    for (int contador1 = 1; contador1 < numero; contador1++) {
                        if (numero % contador1 == 0) {
                            suma += contador1;
                        }
                    }

                    if (suma == numero) {
                        System.out.println(numero + " es un número perfecto.");
                    } else {
                        System.out.println(numero + " NO es un número perfecto.");
                    }
                    break;

                case 3:
                    opcion3++;
                    System.out.print("Ingrese un número: ");
                    
                    break;

                case 4:
                    opcion4++;

                    break;

                case 5:
                    System.out.println("\nVeces que se usó cada opción:");
                    System.out.println("1. Palabra Alrevés: " + opcion1);
                    System.out.println("2. Número perfecto: " + opcion2);
                    System.out.println("3. Primos: " + opcion3);
                    System.out.println("4. Votaciones: " + opcion4);
                    System.out.println("¡Programa finalizado!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);

        lea.close();
    }
}
