import java.util.Scanner;

public class ONCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Edad;
        System.out.println("INGRESE SU EDAD: ");
        Edad = sc.nextInt();
        int Cupos;
        System.out.println("CANTIDAD DE CUPOS RESTANTES: ");
        Cupos = sc.nextInt();
        if (Edad >= 18 && Cupos > 0){
            System.out.println("BIENVENIDO");
        } else {
            System.out.println("NO PUEDES SEGUIR");
        }
    }
}
