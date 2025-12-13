import java.util.Scanner;

public class DIECIOCHO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double multaPendiente;
        System.out.print("Ingrese el monto de multas pendientes: ");
        multaPendiente = sc.nextDouble();
        if (multaPendiente > 0) {
            System.out.println("Préstamo denegado. Debe pagar la multa pendiente.");
        } else {
            System.out.println("Préstamo aprobado. Puede conservar el libro por 7 días.");
        }
    }
}
