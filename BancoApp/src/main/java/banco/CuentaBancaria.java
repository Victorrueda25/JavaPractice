package banco;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private int contadorTransacciones = 0;

    // Constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            contadorTransacciones++;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            contadorTransacciones++;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }

    // ✅ Nuevo método para transferir dinero entre cuentas
    public void transferir(CuentaBancaria destino, double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.saldo -= cantidad;
            destino.saldo += cantidad;
            this.contadorTransacciones++;
            System.out.println("Transferencia de $" + cantidad + " a " + destino.titular + " completada.");
        } else {
            System.out.println("No se pudo realizar la transferencia: fondos insuficientes o cantidad inválida.");
        }
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("Transacciones realizadas: " + contadorTransacciones);
    }
}
