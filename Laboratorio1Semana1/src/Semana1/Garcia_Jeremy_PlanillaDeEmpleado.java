
package Semana1;
import java.util.Scanner;

public class Garcia_Jeremy_PlanillaDeEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("Ingrese su nombre completo: ");
        String nombreEmpleado = scanner.next();
        System.out.println("Ingrese sus horas laborales: ");
        int horasMes = scanner.nextInt();
        System.out.println("Ingrese su tarifa por hora: ");
        double tarifaHora = scanner.nextDouble();
        
        double salarioMensual = horasMes * tarifaHora;
        double salarioSemanal = salarioMensual / 4.33;
        
        System.out.println("----- Boleta de Pago -----");
        System.out.println("Nombre del empleado: "+nombreEmpleado);
        System.out.println("Hora de trabajo mensual: "+horasMes);
        System.out.println("Tarifa por hora: "+tarifaHora);
        System.out.println("Salario del empleado semanal: "+salarioSemanal+" Lps.");
        
        scanner.close();
}
}