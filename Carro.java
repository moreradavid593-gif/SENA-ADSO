package EJERCICIOS;
class Carro {
    String marca;
    boolean encendido = false;

    void encender() {
        encendido = true;
        System.out.println("El carro está encendido.");
    }


    public class Main {
        public static void main(String[] args) {
            Carro c = new Carro();
            c.marca = "Mazda";
            c.encender();
        }
    }
}
