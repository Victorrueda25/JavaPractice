package banco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Maria", 500);
        Scanner scanner = new Scanner(System.in);

        // Crear cuenta personalizada
        System.out.println("Ingrese el nombre del titular: ");
        String titular = scanner.nextLine();

        System.out.println("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        CuentaBancaria cuentaPersonalizada = new CuentaBancaria(titular, saldoInicial);

        // Mostrar información inicial
        cuentaPersonalizada.mostrarInformacion();

        // Realizar operaciones
        System.out.println("\nIngrese monto a depositar: ");
        double deposito = scanner.nextDouble();
        cuentaPersonalizada.depositar(deposito);

        System.out.println("\nIngrese monto a retirar: ");
        double retiro = scanner.nextDouble();
        cuentaPersonalizada.retirar(retiro);

        // Mostrar información final
        System.out.println("\nInformación final de la cuenta:");
        cuentaPersonalizada.mostrarInformacion();

        // Prueba adicional con cuenta de Jose
        CuentaBancaria cuentaJose = new CuentaBancaria("Jose", 1000);
        cuentaJose.mostrarInformacion();
        cuentaJose.depositar(200);
        cuentaJose.mostrarInformacion();

        // ✅ Prueba de transferencia entre cuentas
        System.out.println("\n--- Transferencia de Juan a Maria ---");
        cuenta1.transferir(cuenta2, 300);

        // Mostrar información después de la transferencia
        System.out.println("\nInformación de Juan:");
        cuenta1.mostrarInformacion();
        System.out.println("\nInformación de Maria:");
        cuenta2.mostrarInformacion();
    }
}
