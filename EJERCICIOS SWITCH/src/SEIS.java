import java.util.Scanner;

public class SEIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("LISTA REPRODUCCION SPOTIFY:");
        System.out.println("1: ESTUDIO");
        System.out.println("2: ENTRENAMIENTO");
        System.out.println("3: FIESTA");
        System.out.println("ELIJA UNA OPCION:");
        int Lista = sc.nextInt();
        if (Lista < 1 || Lista > 3) {
            System.out.println("ERROR, ELIGA UNA OPCION VALIDA");
        }
        String NombreLista = "";
        String TipoVersion = "";
        String NumeroCanciones = "";
        String DuracionEstimada = "";
        System.out.println("ELIJA UNA VERSION:");
        System.out.println("1: Version Corta");
        System.out.println("2: Version Larga");
        int version = sc.nextInt();
        switch (Lista) {
            case 1:
                NombreLista = "ESTUDIO";
                if (version == 1) {
                    TipoVersion = "corta";
                    NumeroCanciones = "10";
                    DuracionEstimada = "35min";
                } else if (version == 2) {
                    TipoVersion = "larga";
                    NumeroCanciones = "25";
                    DuracionEstimada = "1h 25min";
                } else {
                    TipoVersion = "NO VALIDA";
                }
                break;
            case 2:
                NombreLista = "ENTRENAMIENTO";
                if (version == 1) {
                    TipoVersion = "corta";
                    NumeroCanciones = "8";
                    DuracionEstimada = "32min";
                } else if (version == 2) {
                    TipoVersion = "larga";
                    NumeroCanciones = "20";
                    DuracionEstimada = "1h 12min";
                } else {
                    TipoVersion = "NO VALIDA";
                }
                break;
            case 3:
                NombreLista = "FIESTA";
                if (version == 1) {
                    TipoVersion = "corta";
                    NumeroCanciones = "15";
                    DuracionEstimada = "45min";
                } else if (version == 2) {
                    TipoVersion = "larga";
                    NumeroCanciones = "32";
                    DuracionEstimada = "2h 21min";
                } else {
                    TipoVersion = "NO VALIDA";
                }
                break;
        }
        System.out.println("SPOTIFY:");
        System.out.println("Lista: " + NombreLista + " | Tipo: " + TipoVersion);
        System.out.println("Numero de Canciones: " + NumeroCanciones);
        System.out.println("Duracion estimada: " + DuracionEstimada);
    }
}
