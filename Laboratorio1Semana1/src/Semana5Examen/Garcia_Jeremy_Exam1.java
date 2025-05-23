/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana5Examen;

import java.util.Random;
import java.util.Scanner;

public class Garcia_Jeremy_Exam1 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        lea.useDelimiter("\n"); 
        
        int opcion;
        
        do {
            System.out.println("<----------------------    MENU PRINCIPAL    ---------------------->");
            System.out.println("1. Piramide");
            System.out.println("2. Clave");
            System.out.println("3. Juego de Piedra Papel o Tijera");
            System.out.println("4. Adivinar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = lea.nextInt(); // Lee la opción seleccionada por el usuario

            // Según la opción seleccionada, ejecutamos el bloque correspondiente
            switch (opcion) {
                case 1:
                    System.out.println ("Cantidad de la fila de la piramide: ");
                    int filas = lea.nextInt();

                    int impar = 1;

                    for (int conta = 1; conta <= filas; conta++) {
                        int suma = 0;
                        for (int conta2 = 1; conta2 <= conta; conta2++) {
                            System.out.print(impar + " ");
                            suma += impar;
                            impar += 2; // Siguiente número impar
                        }
                    System.out.println("= " + suma); // Muestra la suma (cubo del número de fila)
                    }
                    break;
                    
                case 2:
                    
                    int opcionEncrip;
                    do {
                    System.out.println("\n<----------------------    MENÚ CIFRAR Y DESCIFRAR   ---------------------->");
                    System.out.println("1. Cifrar");
                    System.out.println("2. Descifrar");
                    System.out.println("3. Salir");
                    System.out.print("Ingrese opcion: ");
                    opcionEncrip = lea.nextInt();

                    switch (opcionEncrip) {

                        case 1:
                            System.out.println ("Ingrese el texto a cifrar: ");
                            String textoCi = lea.next();

                            String cifrado = "";

                            for (int contaC2 = 0; contaC2 < textoCi.length(); contaC2++) {
                                char letra = textoCi.charAt(contaC2);

                                // Letras minúsculas
                                if (letra >= 'a' && letra <= 'z') {
                                    letra = (char) ('z' - (letra - 'a'));
                                }
                                // Letras mayúsculas
                                else if (letra >= 'A' && letra <= 'Z') {
                                    letra = (char) ('Z' - (letra - 'A'));
                                }

                                // Otros caracteres no se modifican
                                cifrado += letra;
                            }

                            System.out.println("Mensaje cifrado: " + cifrado);
                            break;
                            
                        case 2:
                            System.out.print("Ingresa el mensaje a descifrar: ");
                            String textoDes = lea.next();
                            String descifrado = "";

                            for (int i = 0; i < textoDes.length(); i++) {
                                char c = textoDes.charAt(i);

                                if (c >= 'a' && c <= 'z') {
                                    c = (char) ('z' - (c - 'a'));
                                } else if (c >= 'A' && c <= 'Z') {
                                    c = (char) ('Z' - (c - 'A'));
                                }

                                descifrado += c;
                            }

                            System.out.println("Texto descifrado: " + descifrado);
                            break;
                            
                        case 3: // Salir
                            System.out.println("\nOpcion Cifrado/Descifrado finalizado.");
                            
                        default:
                            System.out.println("Opción inválida."); // Si la opción no es válida
                        }
                    } while (opcionEncrip!=5);
                            break;
                case 3:
                    
                    
                    break;        
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
            default:
                    System.out.println("Opción inválida."); // Si la opción no es válida
            }
        } while (opcion != 5); // Repite el menú hasta que el usuario elija salir (opción 5)
    }
}
