import java.util.Scanner;

public class DOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SUSCRIPCION AL GIMNASIO:");
        System.out.println("ELEGIR UN PLAN 1-2-3:");
        System.out.println("1. Plan basico");
        System.out.println("2. Plan intermedio");
        System.out.println("3. Plan premium");
        int Plan = sc.nextInt();
        System.out.println("Ingrese la cantidad de meses (1, 3, 6, 12):");
        int Meses = sc.nextInt();
        if (Meses <= 0) {
            System.out.println("CANTIDAD INCORRECTA, DEBE SER MAYOR A 0");
            return;
        }
        int Precio = 0;
        String NombrePlan = "";
        switch (Plan) {
            case 1: //Plan Basico
                if (Meses ==1) Precio = 30000;
                else if (Meses ==3) Precio=80000;
                else if (Meses ==6) Precio=150000;
                else {
                    System.out.println("No hay tarifa");
                    return;
                }
                NombrePlan = "Plan Basico";
                break;
            case 2: //Plan intermedio
                if (Meses ==1) Precio = 40000;
                else if (Meses==3) Precio =100000;
                else if (Meses==6) Precio =200000;
                else {
                    System.out.println("No hay tarifa");
                    return;
                }
                NombrePlan = "Plan intermedio";
                break;
            case 3: //Plan premium
                if (Meses==1) Precio = 60000;
                else if (Meses==3) Precio =110000;
                else if (Meses==6) Precio =280000;
                else {
                    System.out.println("No hay tarifa");
                    return;
                }
                NombrePlan = "Plan premium";
                break;
        }
        System.out.println("SUSCRIPCION:");
        System.out.println("Plan Elegido: " + Plan);
        System.out.println("Tiempo de suscripcion: " + Meses);
        System.out.println("Valor a pagar: " + Precio);
    }
}
