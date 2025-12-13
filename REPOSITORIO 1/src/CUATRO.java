import java.util.Scanner;

public class CUATRO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esvip;
        boolean tienecupon;
        System.out.println("¿Eres Vip?TRUE/FALSE");
        esvip = sc.nextBoolean();
        System.out.println("¿Tienes cupon?TRUE/FALSE");
        tienecupon = sc.nextBoolean();
        if (esvip || tienecupon){
            System.out.println("SE APLICA DESCUENTO");
        } else {
            System.out.println("PRECIO REGULAR");
        }
    }
}
