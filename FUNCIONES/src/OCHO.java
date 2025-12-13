import java.util.Scanner;

public class OCHO {
        public static void encontrarMayorMenor() {
            Scanner sc = new Scanner(System.in);


            boolean primerNumero = true;
            int mayor = 0;
            int menor = 0;
            int numero;


            do {
                System.out.print("Ingrese un número (0 para terminar): ");
                numero = sc.nextInt();


                if (numero != 0) {
                    if (primerNumero) {
                        mayor = numero;
                        menor = numero;
                        primerNumero = false;
                    } else {
                        if (numero > mayor) {
                            mayor = numero;
                        }
                        if (numero < menor) {
                            menor = numero;
                        }
                    }
                }
            } while (numero != 0);
            if (!primerNumero) {
                System.out.println("El número mayor es: " + mayor);
                System.out.println("El número menor es: " + menor);
            } else {
                System.out.println("No se ingresaron números.");
            }
        }
        public static void main(String[] args) {
            encontrarMayorMenor();

        }
}
