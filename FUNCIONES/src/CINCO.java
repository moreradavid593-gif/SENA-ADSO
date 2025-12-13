import java.util.Scanner;

public class CINCO {
    public static long calcularFactorial(int numero) {


        if (numero < 0) {
            return -1;
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = sc.nextInt();
        long resultado = calcularFactorial(num);
        if (resultado == -1) {
            System.out.println("Error: No se puede calcular factorial de número negativo.");
        } else {
            System.out.println("El factorial de " + num + " es: " + resultado);
        }
    }
}
