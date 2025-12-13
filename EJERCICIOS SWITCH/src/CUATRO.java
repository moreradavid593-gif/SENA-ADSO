import java.util.Scanner;

public class CUATRO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ELIJE UNA OPCION DEL AUTO : ");
        System.out.println("1: ENCENDER / APAGAR LUCES ");
        System.out.println("2: Ajustar VELOCIDAD (acelerar o frenar) ");
        System.out.println("3: Activar MODO DE CONDUCCION (Normal, Eco y Sport) ");
        int opcion = sc.nextInt();
        if (opcion < 1 || opcion > 3) {
            System.out.println("ERROR, ELIGE UNA OPCION VALIDA");
            return;
        }
        switch (opcion) {
            case 1: // LUCES
                System.out.println("¿Quieres encender / apagar?");
                System.out.println("(Escribe encender / apagar): ");
                sc.nextLine();
                String accion = sc.next().toLowerCase();
                if (accion.equals("encender")) {
                    System.out.println("¡LAS LUCES SE ENCENDIERON!");
                } else if (accion.equals("apagar")) {
                    System.out.println("LAS LUCES SE APAGARON");
                } else {
                    System.out.println("ERROR");
                }
                break;
            case 2: // VELOCIDAD
                System.out.println("Velocidad objetivo: 30km/h");
                System.out.println("Ingresa tu velocidad actual:");
                int velocidad = sc.nextInt();
                if (velocidad < 30) {
                    System.out.println("ACELERAR");
                } else if (velocidad > 30) {
                    System.out.println("FRENAR / DISMINUIR");
                } else {
                    System.out.println("MANTENER VELOCIDAD");
                }
                break;
            case 3: // MODO DE CONDUCCION
                System.out.println("ELIJE MODO DE VELOCIDAD:");
                System.out.println("1: Normal (uso diario)");
                System.out.println("2: Eco (ahorro de combustible)");
                System.out.println("3: Sport (máxima deportividad)");
                int modo = sc.nextInt();
                if (modo < 1 || modo > 3) {
                    System.out.println("ERROR, ELIGE UNA OPCION VALIDA");
                    return;
                }
                if (modo == 1) {
                    System.out.println("MODO NORMAL ACTIVADO");
                } else if (modo == 2) {
                    System.out.println("MODO ECO ACTIVADO");
                } else {
                    System.out.println("MODO SPORT ACTIVADO");
                }
                break;
        }
    }
}
