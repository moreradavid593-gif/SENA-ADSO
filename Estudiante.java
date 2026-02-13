package EJERCICIOS;

public class Estudiante {

    private String nombre;
    private double nota1, nota2;

    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }
}
