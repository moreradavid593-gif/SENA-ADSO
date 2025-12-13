import java.util.Scanner;

public class DIECINUEVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mensaje;
        System.out.print("Ingrese su mensaje: ");
        mensaje = sc.nextLine().toLowerCase();
        if (mensaje.contains("spoiler")) {
            System.out.println("Advertencia: tu mensaje contiene un spoiler.");
        } else {
            System.out.println("Mensaje publicado: " + mensaje);
        }
    }
}
