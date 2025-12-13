import java.util.Scanner;

public class CINCO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: EMISORA POP");
        System.out.println("2: EMISORA ROCK");
        System.out.println("3: EMISORA VALLENATO");
        System.out.println("ELIJA UNA OPCION: ");
        int Emisora = sc.nextInt();
        if (Emisora < 1 || Emisora > 3) {
            System.out.println("ERROR, ELIGA UNA OPCION VALIDA");
            return;
        }
        System.out.println("INGRESE HORA ACTUAL (00-24):");
        int hora = sc.nextInt();
        String NombreEmisora = "";
        String Programa = "";
        switch (Emisora) {
            case 1:
                NombreEmisora = "EMISORA POP";
                if (hora >= 6 && hora < 12) {
                    Programa = "HORA DE LA MAÑANA";
                } else if (hora >= 12 && hora < 18) {
                    Programa = "MUSICA POP";
                } else if (hora >= 18 && hora <= 24) {
                    Programa = "NOCHE POP";
                } else {
                    Programa = "SIN SINTONIA";
                }
                break;
            case 2:
                NombreEmisora = "EMISORA ROCK";
                if (hora >= 6 && hora < 12) {
                    Programa = "ROCK DE LA MAÑANA";
                } else if (hora >= 12 && hora < 18) {
                    Programa = "ROCK EN ESPAÑOL";
                } else if (hora >= 18 && hora <= 24) {
                    Programa = "ROCK PESADO";
                } else {
                    Programa = "SIN SINTONIA";
                }
                break;
            case 3:
                NombreEmisora = "EMISORA VALLENATO";
                if (hora >= 6 && hora < 12) {
                    Programa = "VALLENATO TRADICIONAL";
                } else if (hora >= 12 && hora < 18) {
                    Programa = "VALLENATO MODERNO";
                } else if (hora >= 18 && hora <= 24) {
                    Programa = "PARRANDA VALLENATA";
                } else {
                    Programa = "SIN SINTONIA";
                }
                break;
        }
        System.out.println("EMISORA: ");
        System.out.println("EMISORA SELECCIONADA: " + NombreEmisora);
        System.out.println("HORA INGRESADA: " + hora);
        System.out.println("PROGRAMA EN EMISION: " + Programa);

    }
}
