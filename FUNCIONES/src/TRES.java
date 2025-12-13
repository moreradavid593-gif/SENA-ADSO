import java.util.Scanner;

public class TRES {
        public static void generarTabla(int numero, int limite) {


            for (int i = 1; i <= limite; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }


        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Ingrese el número para la tabla: ");
            int num = sc.nextInt();


            System.out.print("¿Hasta qué número quiere la tabla?: ");
            int lim = sc.nextInt();


            generarTabla(num, lim);
        }
}
