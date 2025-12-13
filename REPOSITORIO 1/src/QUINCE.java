import java.util.Scanner;

public class QUINCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alias;
        System.out.print("Ingrese su alias: ");
        alias = sc.nextLine();
        if (!alias.startsWith("@")) {
            System.out.println("Error: el alias debe comenzar con '@'.");
        } else if (alias.length() < 4) {
            System.out.println("Error: el alias es demasiado corto (mínimo 4 caracteres).");
        } else if (alias.length() > 15) {
            System.out.println("Error: el alias es demasiado largo (máximo 15 caracteres).");
        } else {
            System.out.println("Alias aceptado.");
        }
    }
}
