import java.util.Scanner;

public class NUEVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean tieneLicencia;
        boolean estaVigente;
        boolean cumpleCategoria;
        System.out.println("TRUE/FALSE");
        System.out.println("¿Tiene Licencia?");
        tieneLicencia = sc.nextBoolean();
        System.out.println("¿Esta Vigente?");
        estaVigente = sc.nextBoolean();
        System.out.println("¿Cumple categoria?");
        cumpleCategoria = sc.nextBoolean();
        if (tieneLicencia == false){
            System.out.println("NO PUEDE APLICAR");
        } else if (estaVigente == false){
            System.out.println("NO PUEDE APLICAR");
        } else if (cumpleCategoria == false){
            System.out.println("NO PUEDE APLICAR");
        } else {
            System.out.println("PUEDE APLICAR");
        }
    }
}
