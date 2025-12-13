import java.util.Scanner;

public class SIETE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        boolean aproboExamen;
        System.out.println("Edad: ");
        edad = sc.nextInt();
        System.out.println("¿Aprobó examen teorico? TRUE/FALSE: ");
        aproboExamen = sc.hasNextBoolean();
        if (edad >= 16 && aproboExamen) {
            System.out.println("Licencia habilitada");
        } else {
            System.out.println("NO CUMPLE REQUISITOS");
        }
    }
}
