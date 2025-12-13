import java.util.Scanner;

public class DIECISEIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String traeMascota;
        String tipoMascota;
        System.out.print("¿Trae mascota? (si / no): ");
        traeMascota = sc.nextLine().toLowerCase();
        if (traeMascota.equals("si")) {
            System.out.print("¿Qué tipo de mascota trae? ");
            tipoMascota = sc.nextLine().toLowerCase();
            if (tipoMascota.equals("perro")) {
                System.out.println("Hay parque canino disponible.");
            } else {
                System.out.println("Bienvenido (zona común).");
            }
        } else if (traeMascota.equals("no")) {
            System.out.println("Sin restricciones.");
        } else {
            System.out.println("Respuesta no válida.");
        }
    }
}
