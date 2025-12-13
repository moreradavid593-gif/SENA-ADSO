import java.util.Scanner;

public class SIETE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAMAS:");
        System.out.println("1) GESTIÓN EMPRESARIAL");
        System.out.println("2) MANTENIMIENTO EQUIPOS DE CÓMPUTO");
        System.out.println("3) DISEÑO GRÁFICO");
        System.out.print("Elige un programa: ");
        int programas = sc.nextInt();
        sc.nextLine();
        if (programas < 1 || programas > 3) {
            System.out.println("ERROR: Programa inválido.");
            return;
        }
        System.out.println("ELIGE UNA MODALIDAD:");
        System.out.println("1) Virtual");
        System.out.println("2) Presencial");
        System.out.print("Elige: ");
        String Modalidad = sc.nextLine().toLowerCase();
        if (!Modalidad.equals("virtual") && !Modalidad.equals("presencial")) {
            System.out.println("ERROR: ELIGE UNA MODALIDAD VÁLIDA");
            return;
        }
        System.out.println("ELIGE UNA JORNADA:");
        System.out.println("1) mañana");
        System.out.println("2) tarde");
        System.out.print("Elige: ");
        String Jornada = sc.nextLine().toLowerCase();
        if (!Jornada.equals("mañana") && !Jornada.equals("tarde")) {
            System.out.println("ERROR: Jornada inválida.");
            return;
        }
        String NombreProgramas = "";
        switch (programas) {
            case 1:
                NombreProgramas = "Gestión Empresarial";
                break;
            case 2:
                NombreProgramas = "Mantenimiento Equipos de Cómputo";
                break;
            case 3:
                NombreProgramas = "Diseño Gráfico";
                break;
        }
        System.out.println("DETALLES DEL REGISTRO:");
        System.out.println("Programa: " + NombreProgramas);
        System.out.println("Modalidad: " + Modalidad);
        System.out.println("Jornada: " + Jornada);
    }
}
