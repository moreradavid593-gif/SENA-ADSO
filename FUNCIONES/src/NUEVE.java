import java.util.Scanner;

public class NUEVE {
        public static double areaCirculo(double radio) {
            double PI = 3.14159;
            return PI * radio * radio;
        }


        public static double areaRectangulo(double base, double altura) {
            return base * altura;
        }


        public static double areaTriangulo(double base, double altura) {
            return (base * altura) / 2;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("=== CALCULADORA DE ÁREAS ===");
            System.out.println("1. Área del círculo");
            System.out.println("2. Área del rectángulo");
            System.out.println("3. Área del triángulo");
            System.out.print("Seleccione una opción: ");


            int opcion = sc.nextInt();
            double base, altura, radio, area;


            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    radio = sc.nextDouble();
                    area = areaCirculo(radio);
                    System.out.println("El área del círculo es: " + area);
                    break;


                case 2:
                    System.out.print("Ingrese la base del rectángulo: ");
                    base = sc.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    altura = sc.nextDouble();
                    area = areaRectangulo(base, altura);
                    System.out.println("El área del rectángulo es: " + area);
                    break;


                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    base = sc.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    altura = sc.nextDouble();
                    area = areaTriangulo(base, altura);
                    System.out.println("El área del triángulo es: " + area);
                    break;


                default:
                    System.out.println("Opción inválida");
            }

        }
}
