import java.util.Scanner;

public class TRES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("RIFA");
        System.out.println("1. Boleta Plata");
        System.out.println("2. Boleta oro");
        System.out.println("3. Boleta Diamante");
        System.out.println("ELIJA UN TIPO DE BOLETA:");
        int opcion = sc.nextInt();
        //validar opcion
        if (opcion <1 || opcion >3) {
            System.out.println("ERROR, ELIJA UNA OPCIÓN CORRECTA");
            return;
        }
        System.out.println("INGRESE CANTIDAD DE BOLETAS");
        int cantidad = sc.nextInt();
        if (cantidad <0) {
            System.out.println("ELIJA UNA OPCIÓN CORRECTA");
            return;
        }
        String TipoBoleta = "";
        int Precio = 0;
        switch (opcion) {
            case 1:
                TipoBoleta = "Boleta de plata";
                if (cantidad <3) {
                    Precio = 5000;
                } else {
                    Precio = 4000;
                }
                break;
            case 2:
                TipoBoleta = "Boleta de oro";
                if (cantidad <3) {
                    Precio = 10000;
                } else {
                    Precio = 9000;
                }
                break;
            case 3:
                TipoBoleta = "Boleta de diamante";
                if (cantidad <20) {
                    Precio = 20000;
                } else {
                    Precio = 18000;
                }
                break;
        }
        int Total = Precio * cantidad;
        System.out.println("COMPRA:");
        System.out.println("Boletas: " + TipoBoleta);
        System.out.println("cantidad " + cantidad);
        System.out.println("Precio Unitario: " + Precio);
        System.out.println("Total: " + Total);
    }
}
