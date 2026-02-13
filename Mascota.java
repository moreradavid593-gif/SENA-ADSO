package EJERCICIOS;

public class Mascota {
    private String nombre;
    private String tipo;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    void saludar() {
        System.out.println("Hola, soy " + nombre + " el " + tipo);
    }
}
