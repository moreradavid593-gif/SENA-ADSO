import java.util.Scanner;

public class UNO {

        public static double calcularDescuento(double montoCompra) {
            double descuento;

            if (montoCompra > 100000) {
                descuento = montoCompra * 0.15;
            } else if (montoCompra >= 50000) {
                descuento = montoCompra * 0.10;
            } else {
                descuento = montoCompra * 0.05;
            }

            double precioFinal = montoCompra - descuento;
            return precioFinal;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese el monto de la compra: ");
            double monto = sc.nextDouble();

            double resultado = calcularDescuento(monto);

            System.out.println("El precio final es: $" + resultado);
        }
}
