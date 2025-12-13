import java.util.Scanner;
public class UNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color;
        System.out.print("COLOR DEL SEMAFORO: ");
        color = sc.nextLine().toLowerCase();
        if (color.equals("rojo")) {
            System.out.println("DETENTE");
        } else if (color.equals("amarillo")) {
            System.out.println("PRECAUCIÓN");
        } else if (color.equals("verde")) {
            System.out.println("AVANZA");
        } else {
            System.out.println("ERROR, COLOR NO RECONOCIDO");
        }
    }
}