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
            System.out.println("\n<----------------------    MENU PRINCIPAL    ---------------------->");
            System.out.println("1. Piramide");
            System.out.println("2. Clave");
            System.out.println("3. Juego de Piedra Papel o Tijera");
            System.out.println("4. Adivinar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = lea.nextInt(); // Lee la opción seleccionada por el usuario

            switch (opcion) {
                case 1:
                    System.out.println("\n<----------------------    PIRAMIDE   ---------------------->");
                    int filas=0;
                    do {
                        System.out.print("\nCantidad de la fila de la piramide: ");
                        filas = lea.nextInt();

                        if (filas < 0) {
                            System.out.println("Error. Ingresa un numero positivo.");
                        }

                    } while (filas < 0);
                    
                    int impar = 1;

                    for (int conta = 1; conta <= filas; conta++) {
                        int suma = 0;
                        for (int conta2 = 1; conta2 <= conta; conta2++) {
                            System.out.print(impar + " ");
                            suma += impar;
                            impar += 2; 
                        }
                    System.out.println("= " + suma); 
                    }
                    break;
                    
                case 2:
                    
                    int opcionEncrip;
                    do {
                    System.out.println("\n<----------------------    MENU CIFRAR Y DESCIFRAR   ---------------------->");
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

                            for (int contaCi = 0; contaCi < textoCi.length(); contaCi++) {
                                char letraCi = textoCi.charAt(contaCi);

                                // Letras minúsculas
                                if (letraCi >= 'a' && letraCi <= 'z') {
                                    letraCi = (char) ('z' - (letraCi - 'a'));
                                }
                                // Letras mayúsculas
                                else if (letraCi >= 'A' && letraCi <= 'Z') {
                                    letraCi = (char) ('Z' - (letraCi - 'A'));
                                }

                                // Otros caracteres no se modifican
                                cifrado += letraCi;
                            }

                            System.out.println("Mensaje cifrado: " + cifrado);
                            break;
                            
                        case 2:
                            System.out.print("Ingresa el mensaje a descifrar: ");
                            String textoDes = lea.next();
                            String descifrado = "";

                            for (int contaDes = 0; contaDes < textoDes.length(); contaDes++) {
                                char letraDes = textoDes.charAt(contaDes);

                                if (letraDes >= 'a' && letraDes <= 'z') {
                                    letraDes = (char) ('z' - (letraDes - 'a'));
                                } else if (letraDes >= 'A' && letraDes <= 'Z') {
                                    letraDes = (char) ('Z' - (letraDes - 'A'));
                                }

                                descifrado += letraDes;
                            }

                            System.out.println("Texto descifrado: " + descifrado);
                            break;
                            
                        case 3: 
                            System.out.println("Opcion Cifrado/Descifrado finalizado.");
                            break;
                            
                        default:
                            System.out.println("Opcion invalida.");
                        }
                    } while (opcionEncrip!=3);
                    break;
                    
                case 3:
                    System.out.println("\n<----------------------    PIEDRA, PAPEL O TIJERA   ---------------------->");
                    System.out.println ("              BIENVENIDO RETADOR/A AL JUEGO, PAPEL O TIJERA >:D");
                    
                    String usuario = "";
                    String computadora = "";
                    String respuesta = "";

                    do {
                        boolean entradaValida = false;

                        while (!entradaValida) {
                            System.out.print("\nEscribe piedra, papel o tijera: ");
                            usuario = lea.next().toLowerCase();

                            if (usuario.equals("piedra") || usuario.equals("papel") || usuario.equals("tijera")) {
                                entradaValida = true;
                            } else {
                                System.out.println("Error. Escribe literalmente unas de las opciones (piedra, papel o tijera). Intenta de nuevo");
                            }
                        }

                        int aleatorio = random.nextInt(3);
                        if (aleatorio == 0) {
                            computadora = "piedra";
                        } else if (aleatorio == 1) {
                            computadora = "papel";
                        } else {
                            computadora = "tijera";
                        }

                        System.out.println("Computadora eligio: " + computadora);

                        if (usuario.equals(computadora)) {
                            System.out.println("ES UN EMPATE :o");
                        } else if (
                            (usuario.equals("piedra") && computadora.equals("tijera")) ||
                            (usuario.equals("papel") && computadora.equals("piedra")) ||
                            (usuario.equals("tijera") && computadora.equals("papel"))
                        ) {
                            System.out.println("GANASTE LA RONDA :D!");
                        } else {
                            System.out.println("La computadora gano la ronda :c.");
                        }

                        System.out.print("Quieres retarme de nuevo >:)? (si/no): ");
                        respuesta = lea.next().toLowerCase();

                    } while (respuesta.equals("si"));

                    System.out.println("GRACIAS POR JUGAR. Retame cuando quieras :)");
                    
                    break;        
                case 4:
                    System.out.println("\n<------------------- ADIVINA EL NUMERO ------------------->");
                    System.out.println("               ADIVINA UN NUMERO ENTRE 1 Y 100");
                    System.out.println("             (Tienes 10 intentos para adivinarlo)");
                    
                    int numSecreto = random.nextInt(100) + 1;
                    int intentos = 0;
                    int intentosMax = 10;
                    int numUsuario = 0;
                    boolean adivinado = false;

                    while (intentos < intentosMax && !adivinado) {
                        System.out.print("\nIngresa tu numero: ");
                        numUsuario = lea.nextInt();
                        intentos++;
                        if (numUsuario < 1 || numUsuario > 100) {
                            System.out.println("Numero fuera del rango (1-100). Perdiste un intento.");
                        } else if (numUsuario < numSecreto) {
                            System.out.println("El numero es MAYOR.");
                        } else if (numUsuario > numSecreto) {
                            System.out.println("El numero es MENOR.");
                        } else {
                            adivinado = true;
                            System.out.println("FELICIDADESSSS");
                            System.out.println("Adivinaste el numero en " + intentos + " intento(s).");
                            break;
                        }
                        if (!adivinado) {
                            System.out.println("Intentos restantes: " + (intentosMax - intentos));
                        }
                    }

                    if (!adivinado) {
                        System.out.println("\nSe te acabaron los intentos, ni modo :c.");
                        System.out.println("El numero secreto era: " + numSecreto);
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("\n<----------------------    PROGRAMA FINALIZADO   ---------------------->");
                    break;
                    
            default:
                    System.out.println("Opción inválida (No salgas del rango 1-4, y 5 para finalizar."); 
            }
        } while (opcion != 5); 
    }
}
