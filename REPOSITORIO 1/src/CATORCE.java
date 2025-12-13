import java.util.Scanner;

public class CATORCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clima;
        System.out.print("Ingrese el clima (lluvia / soleado / nublado): ");
        clima = sc.nextLine().toLowerCase();
        if (clima.equals("lluvia")) {
            System.out.println("Recomendación: Lleva un paraguas.");
        } else if (clima.equals("soleado")) {
            System.out.println("Recomendación: Usa bloqueador solar.");
        } else if (clima.equals("nublado")) {
            System.out.println("Recomendación: Lleva una chaqueta ligera.");
        } else {
            System.out.println("Clima no reconocido.");
        }
    }
}
