import java.util.Scanner;

public class TRECE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Intentos;
        System.out.println("Cantidad de Intentos: ");
        Intentos = sc.nextInt();
        if (Intentos >= 13){
            System.out.println("CUENTA BLOQUEADA JAJA");
        } else {
            System.out.println("SIGUE INTENTANDO");
        }
    }
}
