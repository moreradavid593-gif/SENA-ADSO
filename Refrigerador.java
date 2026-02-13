package EJERCICIOS;

public class Refrigerador {
    String contenido = "";

    void agregar(String comida) {
        contenido += comida + ", ";
        System.out.println("Agregado: " + comida);
    }
}
