import java.util.Scanner;

public class CINCO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPremium;
        double monto;
        System.out.println("¿Tiene membresia premium? TRUE/FALSE");
        esPremium = sc.nextBoolean();
        System.out.println("Monto de la compra: ");
        monto = sc.nextDouble();
        if (esPremium || (monto > 50)){
            System.out.println("Envio gratis");
        } else {
            System.out.println("Envio con costo");
        }
    }
}
