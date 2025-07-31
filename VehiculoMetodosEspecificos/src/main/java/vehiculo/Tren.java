package vehiculo;

public class Tren extends Vehiculo {

    public Tren() {
        super(300);
    }

    @Override
    public void mover() {
        System.out.println("El tren está en movimiento sobre los rieles...");
    }

    @Override
    public void detener() {
        System.out.println("El tren se ha detenido en la estación.");
    }

    public void activarFrenosEmergencia() {
        System.out.println("¡Frenos de emergencia activados en el tren!");
    }
}
