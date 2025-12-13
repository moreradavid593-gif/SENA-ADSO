package DOWHILE;

public class TRES {
    public static void main(String[] args) {
        int i = 1;
        int suma = 0;
        do {
            suma += i;
            i++;
        } while (i <= 5);
        System.out.println("La suma es: " + suma);

    }
}
