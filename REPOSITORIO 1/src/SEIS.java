import java.util.Scanner;

public class SEIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String claveCorrecta = "Brayan123";
        String claveIngresada;
        System.out.println("Ingresa la contraseña");
        claveIngresada = sc.nextLine();
        if (claveIngresada.equals(claveCorrecta)) {
            System.out.println("Acceso Concedido");
        } else {
            System.out.println("Acceso Denegado");
        }
    }
}
