package EJERCICIOS;

public class Celular {
    private String marca;
    private String numero;

    public void setMarca(String marca) { this.marca = marca; }
    public String getMarca() { return marca; }

    void llamar(String destino) {
        System.out.println("Llamando a " + destino + " desde " + numero);
    }
}
