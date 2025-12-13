import java.util.Scanner;

public class OCHO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp;
        System.out.println("TEMPERATURA EN °C: ");
        temp = sc.nextDouble();
        if (temp < 10){
            System.out.println("FRIO");
        }else if (temp <=25){
            System.out.println("AGRADABLE");
        }else {
            System.out.println("CALUROSO");
        }
    }
}
