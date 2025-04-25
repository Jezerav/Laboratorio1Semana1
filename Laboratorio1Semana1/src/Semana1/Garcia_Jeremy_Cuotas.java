
package Semana1;
import java.util.Scanner;
public class Garcia_Jeremy_Cuotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("Ingrese el monto del prestamo: ");
        double monto = scanner.nextDouble();
        System.out.println("Ingrese el plazo establecido (en meses): ");
        int plazoMeses = scanner.nextInt();
        System.out.println("Ingrese el porcentaje de tasa de interes mensual: ");
        double tasaMensual = scanner.nextDouble();
        System.out.println("Ingrese la comision por cuota: ");
        double comisionCuota = scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de seguro mensual sobre la couta: ");
        double porcentajeMensual = scanner.nextDouble();
        
        double interesTotal = monto * plazoMeses * (tasaMensual/100);
        double montoInteres = monto + interesTotal;
        double cuotaMensual = montoInteres / plazoMeses;
        double seguroMensual = cuotaMensual * (porcentajeMensual/100);
        double cuotaTotal = cuotaMensual + comisionCuota + seguroMensual;
        double total = cuotaTotal * plazoMeses;
        
        System.out.println("**** CUOTAS MENSUALES *******");
        System.out.println("Cuota de Pago Mensual: HNL "+cuotaTotal);
        System.out.println("Total a Pagar: HNL "+total);
        
        scanner.close();
}
}