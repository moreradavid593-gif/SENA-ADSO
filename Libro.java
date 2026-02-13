package EJERCICIOS;

public class Libro {
    String titulo;
    String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    void mostrarInfo() {
        System.out.println(titulo + " - " + autor);
    }
}
