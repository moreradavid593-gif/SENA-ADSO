import java.util.ArrayList;
import java.util.Comparator;

public class ARRAYLIST {
    public static void main(String[] args) {

        // 1. Crear un ArrayList y agregar 10 números
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(25);
        numeros.add(60);
        numeros.add(41);
        numeros.add(8);
        numeros.add(90);
        numeros.add(33);
        numeros.add(72);
        numeros.add(5);
        numeros.add(54);

        // 2. Mostrar solo los números pares (usando ArrayList)
        System.out.println("Números pares:");
        ArrayList<Integer> pares = new ArrayList<>();

        for (Integer n : numeros) {
            if (n % 2 == 0) {
                pares.add(n);
            }
        }

        pares.forEach(n -> System.out.println(n));

        // 3. Calcular la suma de todos los elementos (usando ArrayList)
        int suma = 0;
        for (Integer n : numeros) {
            suma += n;
        }
        System.out.println("Suma total: " + suma);

        // 4. Ordenar la lista de forma descendente (ArrayList)
        numeros.sort(Comparator.reverseOrder());

        System.out.println("Lista ordenada de forma descendente:");
        numeros.forEach(n -> System.out.println(n));

        // 5. Contar cuántos números son mayores que 50 (ArrayList)
        int mayores50 = 0;
        for (Integer n : numeros) {
            if (n > 50) {
                mayores50++;
            }
        }

        System.out.println("Cantidad de números mayores que 50: " + mayores50);
    }
}
