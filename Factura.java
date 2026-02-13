package EJERCICIOS;

public class Factura {
    double precio;
    int cantidad;

    public Factura(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    double calcularTotal() {
        return precio * cantidad;
    }
}
