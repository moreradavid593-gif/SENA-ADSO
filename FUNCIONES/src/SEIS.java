import java.util.Scanner;

public class SEIS {
        public static void calcularPromedio() {
            Scanner sc = new Scanner(System.in);
            double suma = 0;
            int contador = 0;
            int invalidas = 0;
            double calificacion;
            do {
                System.out.print("Ingrese una calificación (0-10) o -1 para terminar: ");
                calificacion = sc.nextDouble();


                if (calificacion != -1) {


                    if (calificacion >= 0 && calificacion <= 10) {
                        suma += calificacion;
                        contador++;
                    } else {
                        invalidas++;
                        System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
                    }
                }
            } while (calificacion != -1);


            if (contador > 0) {
                double promedio = suma / contador;
                System.out.println("Promedio: " + promedio);
                System.out.println("Calificaciones válidas: " + contador);
                System.out.println("Calificaciones inválidas: " + invalidas);
            } else {
                System.out.println("No se ingresaron calificaciones válidas.");
            }
        }


        public static void main(String[] args) {
            calcularPromedio();

        }
}
