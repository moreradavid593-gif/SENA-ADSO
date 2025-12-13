import java.util.Scanner;

public class DIEZ {
        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            if (numero == 2) {
                return true;
            }
            if (numero % 2 == 0) {
                return false;
            }


            int limite = (int) Math.sqrt(numero);
            for (int i = 3; i <= limite; i += 2) {
                if (numero % i == 0) {
                    return false;
                }
            }


            return true;
        }
        public static void mostrarPrimosHasta(int limite) {
            System.out.println("Números primos hasta " + limite + ":");
            for (int i = 2; i <= limite; i++) {
                if (esPrimo(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("=== VERIFICADOR DE NÚMEROS PRIMOS ===");
            System.out.println("1. Verificar si un número es primo");
            System.out.println("2. Mostrar todos los primos hasta un número");
            System.out.print("Elija una opción: ");


            int opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número entero positivo: ");
                    int numero = sc.nextInt();
                    if (esPrimo(numero)) {
                        System.out.println(numero + " es un número primo.");
                    } else {
                        System.out.println(numero + " no es un número primo.");
                    }
                    break;


                case 2:
                    System.out.print("Ingrese el límite: ");
                    int limite = sc.nextInt();
                    mostrarPrimosHasta(limite);
                    break;


                default:
                    System.out.println("Opción inválida");

            }
        }
}
