import java.util.Scanner;

public class DOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA NUMERO ENTERO");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("EL numero es par");
        } else {
            System.out.println("EL numero es impar");
        }
    }
}
