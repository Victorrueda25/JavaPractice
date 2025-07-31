package vehiculo;

public class Trafico {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Auto(),
            new Bicicleta(),
            new Avion()
        };

        // Polimorfismo en acción
        for (Vehiculo v : vehiculos) {
            v.mover();
            v.detener();
            System.out.println("---");
        }
    }
}
