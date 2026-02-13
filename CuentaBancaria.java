package EJERCICIOS;

public class CuentaBancaria {

    private String propietario;
    private double saldo;

    public CuentaBancaria(String propietario) {
        this.propietario = propietario;
        saldo = 0;
    }

    void depositar(double monto) {
        saldo += monto;
    }

    void retirar(double monto) {
        saldo -= monto;
    }
}
