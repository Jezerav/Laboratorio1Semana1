
package Semana1;
import java.util.Scanner;
public class Garcia_Jeremy_Clics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        int clics1 = 60;
        double costoClics1 = 0.30;
        int clics2 = 100;
        double costoClics2 = 0.25;
        int clics3 = 20;
        double costoClics3 = 0.80;
        
        double totalClics1 = clics1*costoClics1;
        double totalClics2 = clics2*costoClics2;
        double totalClics3 = clics3*costoClics3;
        
        double costoTotal = totalClics1 + totalClics2 + totalClics3;
        int totalDeClics = clics1+clics2+clics3;
        double costoPromedio = costoTotal / totalDeClics;
        double isv = costoTotal * 0.16;
        double isvTotal = costoTotal + isv;
        
        System.out.println("El numero total de clics es: $"+totalDeClics);
        System.out.println("El costo total es: $"+ String.format ("%.2f"+costoTotal));
        System.out.println("El costo promedio es: $"+ String.format ("%.2f"+costoPromedio));
        System.out.println("El ISV es de: $"+ String.format ("%.2f"+isv));
        System.out.println("El costo Total con ISV es de: $"+ String.format ("%.2f"+isvTotal));
        
        scanner.close();
}
}
