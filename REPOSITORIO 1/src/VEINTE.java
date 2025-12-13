import java.util.Scanner;

public class VEINTE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esDeNoche, puertaAbierta;
        System.out.print("¿Es de noche? (true/false): ");
        esDeNoche = sc.nextBoolean();
        System.out.print("¿La puerta está abierta? (true/false): ");
        puertaAbierta = sc.nextBoolean();
        if (esDeNoche && puertaAbierta) {
            System.out.println("Asegura la puerta");
        } else {
            System.out.println("Todo en orden");
        }
    }
}
