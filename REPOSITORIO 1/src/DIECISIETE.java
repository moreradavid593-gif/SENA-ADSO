import java.util.Scanner;

public class DIECISIETE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bateria;
        System.out.print("Ingrese el porcentaje de batería (0-100): ");
        bateria = sc.nextInt();
        if (bateria < 0 || bateria > 100) {
            System.out.println("Porcentaje inválido. Debe estar entre 0 y 100.");
        } else if (bateria < 20) {
            System.out.println("Cargar");
        } else if (bateria < 80) {
            System.out.println("Batería suficiente");
        } else {
            System.out.println("Nivel alto");
        }
    }
}
