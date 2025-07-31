package vehiculo;

public class Auto extends Vehiculo {

    public Auto() {
        super(180); // ejemplo de velocidad máxima
    }

    @Override
    public void mover() {
        System.out.println("El auto está conduciendo...");
    }

    @Override
    public void detener() {
        System.out.println("El auto se detuvo.");
    }
}
