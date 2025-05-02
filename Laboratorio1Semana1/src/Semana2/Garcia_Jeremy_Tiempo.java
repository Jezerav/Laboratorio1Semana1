/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana2;

import java.util.Scanner;

public class Garcia_Jeremy_Tiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println ("Ingrese el número en segundos: ");
        int segundos = scanner.nextInt();
        System.out.println((segundos <= 0) ? "No se permite ese valor." : "");
        
        int horas = segundos/3600;
        int extra = segundos%3600;
        int minutos = extra/60;
        int segundosFin = segundos%60;
        
        if (segundos>0) {
        
        System.out.println("La conversión da como resultado: ");
        System.out.println(horas+" horas");
        System.out.println(minutos+" minutos");
        System.out.println(segundosFin+" segundos");
        }
}
}
