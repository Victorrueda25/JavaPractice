package vehiculo;

public class Avion extends Vehiculo {

    public Avion() {
        super(850);
    }

    @Override
    public void mover() {
        System.out.println("El avión está despegando...");
    }

    @Override
    public void detener() {
        System.out.println("El avión aterrizó.");
    }
}
