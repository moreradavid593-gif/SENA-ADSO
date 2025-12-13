import java.util.Scanner;

public class TRES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA HORA: ");
        int hora = sc.nextInt();
        if (hora >= 6 && hora < 12){
            System.out.println("BUENOS DIAS");
        } else if (hora >= 12 && hora < 18){
            System.out.println("BUENAS TARDES");
        } else if (hora >= 18 && hora <= 23 || hora < 6){
            System.out.println("BUENAS NOCHES");
        } else {
            System.out.println("HORA NO VALIDA");
        }

    }
}
