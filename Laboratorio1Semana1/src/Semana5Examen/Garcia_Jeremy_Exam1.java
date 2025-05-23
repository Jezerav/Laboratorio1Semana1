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
            System.out.println("Menu:");
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
