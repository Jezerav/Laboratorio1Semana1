package Semana3;

import java.util.Scanner; 
import java.util.Random; 

public class Garcia_Jeremy_Estructura {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        lea.useDelimiter("\n"); 

        // Contadores para llevar el registro de cuántas veces se ha seleccionado cada opción
        int opcion1 = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0;
        int opcion;

        // Menú principal que se ejecuta hasta que el usuario seleccione la opción 5 para salir
        do {
            System.out.println("Menu:");
            System.out.println("1. Palabra Alrevés");
            System.out.println("2. Número perfecto");
            System.out.println("3. Primos");
            System.out.println("4. Votaciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lea.nextInt(); // Lee la opción seleccionada por el usuario

            // Según la opción seleccionada, ejecutamos el bloque correspondiente
            switch (opcion) {
                case 1:
                    opcion1++; // Incrementa el contador para la opción 1
                    System.out.print("\n¿Cuántas palabras deseas ingresar?: ");
                    int cantidad = lea.nextInt(); // Lee cuántas palabras el usuario quiere ingresar

                    String reves = ""; // Variable para almacenar la palabra invertida
                    String palabraMax1 = ""; // Para la palabra más larga
                    String palabraMax2 = ""; // Para manejar el caso de palabras con igual longitud máxima
                    int caracterMax = 0; // Para guardar la longitud de la palabra más larga

                    // Bucle para procesar cada palabra que ingresa el usuario
                    for (int contador1 = 1; contador1 <= cantidad; contador1++) {
                        System.out.print("Palabra #" + contador1 + ": ");
                        String palabra = lea.next(); // Lee la palabra

                        // Invertir la palabra
                        for (int contador2 = 0; contador2 < palabra.length(); contador2++) {
                            reves += palabra.charAt(palabra.length() - 1 - contador2);
                        }

                        // Muestra la palabra invertida
                        System.out.println("Al revés: " + reves);

                        // Comparar la longitud de la palabra para ver la más larga
                        if (palabra.length() > caracterMax) {
                            caracterMax = palabra.length();
                            palabraMax1 = palabra;
                            palabraMax2 = " ";
                        } else if (palabra.length() == caracterMax && !palabra.equals(palabraMax1)) {
                            palabraMax2 = palabra;
                        }

                        reves = " "; // Reinicia la variable de la palabra invertida para la siguiente palabra
                    }

                    // Muestra las palabras con la mayor longitud
                    System.out.println("Palabra(s) con más letras (" + caracterMax + "):");

                    // Verifica si la palabra más larga es un palíndromo
                    if (!palabraMax1.equals(" ")) {
                        System.out.print("- " + palabraMax1 + ": ");
                        String invertida = " ";
                        for (int contador1 = palabraMax1.length() - 1; contador1 >= 0; contador1--) {
                            invertida += palabraMax1.charAt(contador1);
                        }
                        // Verifica si la palabra es un palíndromo (igual al revés)
                        switch (palabraMax1.equalsIgnoreCase(invertida) ? "si" : "no") {
                            case "si":
                                System.out.println("es un palíndromo.");
                                break;
                            case "no":
                                System.out.println("no es un palíndromo.");
                                break;
                        }
                    }

                    // Mismo proceso para la segunda palabra más larga
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
                    opcion2++; // Incrementa el contador para la opción 2
                    System.out.print("\nIngrese un número: ");
                    int numero = lea.nextInt(); // Lee el número ingresado por el usuario

                    int suma = 0; // Variable para sumar los divisores del número

                    // Bucle para encontrar los divisores del número (excluyendo el mismo número)
                    for (int contador1 = 1; contador1 < numero; contador1++) {
                        if (numero % contador1 == 0) { // Si el número es divisible entre contador1
                            suma += contador1; // Sumar el divisor
                        }
                    }

                    // Verifica si la suma de los divisores es igual al número
                    if (suma == numero) {
                        System.out.println(numero + " es un número perfecto.");
                    } else {
                        System.out.println(numero + " NO es un número perfecto.");
                    }
                    break;

                case 3:
                    opcion3++; // Incrementa el contador para la opción 3
                    int numeroRandom = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
                    int cantidadDivisores = 0; // Contador de divisores
                    String divisores = ""; // Para almacenar los divisores del número

                    System.out.println("\nNúmero generado: " + numeroRandom);

                    // Bucle para encontrar los divisores del número aleatorio
                    for (int contador = 1; contador <= numeroRandom; contador++) {
                        if (numeroRandom % contador == 0) { // Si el número es divisible entre contador
                            cantidadDivisores++; // Contar el divisor
                            divisores += contador + ", "; // Añadir el divisor a la lista
                        }
                    }

                    // Verifica si el número tiene exactamente 2 divisores (es primo)
                    if (cantidadDivisores == 2) {
                        System.out.println("Primo " + numeroRandom + " porque solo tiene dos divisores.");
                    } else {
                        System.out.println(numeroRandom + " NO es primo porque tiene " + cantidadDivisores + " divisores.");
                    }

                    // Muestra la lista de divisores
                    System.out.println("Divisores de " + numeroRandom + " son: " + divisores);
                    break;

                case 4:
                    opcion4++; // Incrementa el contador para la opción 4
                    System.out.println("\n¿Cuantos votantes hay en el país?: ");
                    int cantidadVotos = lea.nextInt(); // Lee la cantidad de votantes
                    int azul = 0, rojo = 0, negro = 0, amarillo = 0, nulo = 0; // Contadores de votos para cada planilla
                    
                    // Bucle para ingresar los votos de cada votante
                    for (int contador = 1; contador <= cantidadVotos; contador++) {
                        System.out.println("ELIJA LA PLANILLA A VOTAR:");
                        System.out.println("Votante #" + contador);
                        System.out.println("1. Azul");
                        System.out.println("2. Rojo");
                        System.out.println("3. Negro");
                        System.out.println("4. Amarillo");
                        int planilla = lea.nextInt(); // Lee la planilla elegida por el votante
                        
                        // Incrementa el contador correspondiente según el voto
                        switch (planilla) {
                            case 1:
                                azul++;
                                break;
                            case 2:
                                rojo++;
                                break;
                            case 3:
                                negro++;
                                break;
                            case 4:
                                amarillo++;
                                break;
                            default:
                                nulo++;
                                System.out.println("Voto nulo.");
                                break;
                        }
                    }
                    
                    // Calcular el total de votos válidos y su porcentaje
                    int votosValidos = azul + rojo + negro + amarillo;
                    double porcentaje = (votosValidos * 100.0) / cantidadVotos;
                    
                    // Muestra los resultados de la votación
                    System.out.println("--- Resultados de la votación ---");
                    System.out.println("Votos AZUL: " + azul);
                    System.out.println("Votos ROJO: " + rojo);
                    System.out.println("Votos NEGRO: " + negro);
                    System.out.println("Votos AMARILLO: " + amarillo);
                    System.out.println("Votos NULOS: " + nulo);
                    
                    // Verifica si la votación fue válida (al menos 60% de votos válidos)
                    if (porcentaje < 60) {
                        System.out.println("VOTACIÓN FALLIDA - El porcentaje de votos válidos es menor que el 60%.");
                    } else {
                        String ganador = " ";
                        int mayor = 0;

                        // Determina el ganador según los votos
                        if (azul > mayor) {
                            ganador = "AZUL";
                            mayor = azul;
                        }
                        if (rojo > mayor) {
                            ganador = "ROJO";
                            mayor = rojo;
                        }
                        if (negro > mayor) {
                            ganador = "NEGRO";
                            mayor = negro;
                        }
                        if (amarillo > mayor) {
                            ganador = "AMARILLO";
                            mayor = amarillo;
                        }

                        // Muestra el ganador
                        System.out.println("\n PLANILLA GANADORA: " + ganador + " CON " + mayor + " VOTOS.");
                    }
                    break;

                case 5:
                    // Si elige salir, muestra cuántas veces se usaron las opciones
                    System.out.println("\nVeces que se usó cada opción:");
                    System.out.println("1. Palabra Alrevés: " + opcion1);
                    System.out.println("2. Número perfecto: " + opcion2);
                    System.out.println("3. Primos: " + opcion3);
                    System.out.println("4. Votaciones: " + opcion4);
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida."); // Si la opción no es válida
            }
        } while (opcion != 5); // Repite el menú hasta que el usuario elija salir (opción 5)

        lea.close(); // Cierra el scanner al final
    }
}
