package vehiculo;

public class Bicicleta extends Vehiculo {

    public Bicicleta() {
        super(35);
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta está rodando...");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se detuvo.");
    }
}
