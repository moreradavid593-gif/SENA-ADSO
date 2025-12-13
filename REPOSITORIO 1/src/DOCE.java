import java.util.Scanner;

public class DOCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String modo;
        double saldo;
        double CostoExpres = 50;
        System.out.println("Ingrese saldo disponible: ");
        saldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Elija modo de envío (express / estandar): ");
        modo = sc.nextLine().toLowerCase();
        if (modo.equals("express")){
            if (saldo >= CostoExpres){
                System.out.println("Envío Modo Express!");
            } else {
                System.out.println("Saldo Insuficiente!");
            }
        } else {
            System.out.println("Envío Modo Estandar!");
        }
    }
}
