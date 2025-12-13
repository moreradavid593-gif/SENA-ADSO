import java.util.Scanner;
public class UNO {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ALQUILER DE LAVADORAS");
        System.out.println("1. LAVADORA ESTANDAR");
        System.out.println("2. LAVADORA GRANDE");
        System.out.println("3. LAVADORA INDUSTRIAL");
        System.out.println("SELECCIONE EL TIPO DE LAVADORA (1-2-3):");
        int tipo = sc.nextInt();
        System.out.println("Ingrese el numero de horas de alquiler:");
        int horas = sc.nextInt();
        //VALIDACION DE HORAS
        if (horas <=0) {
            System.out.println("ERROR, Las horas deben ser mayores a 0");
            return;
        }
        int Tarifahora = 0;
        switch (tipo) {
            case 1: //lavadora estandar
                if (horas <= 3) Tarifahora = 5000;
                else Tarifahora = 4000;
                break;
            case 2: //lavadora grande
                if (horas <= 3) Tarifahora = 7000;
                else Tarifahora = 6000;
                break;
            case 3: //lavadora industrial
                if (horas <= 3) Tarifahora = 10000;
                else Tarifahora = 8000;
                break;
            default:
                System.out.println("ERROR, Tipo de lavadora invalido");
                return;
        }
        int Total = Tarifahora * horas;
        System.out.println("FACTURA:");
        System.out.println("Tipo lavadora " + tipo);
        System.out.println("Horas alquiladas " + horas);
        System.out.println("Tarifa por hora " + Tarifahora);
        System.out.println("Total a pagar " + Total);

    }
}