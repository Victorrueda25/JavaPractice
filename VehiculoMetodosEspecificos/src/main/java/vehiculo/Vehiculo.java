package vehiculo;

// Clase abstracta
public abstract class Vehiculo {
    protected int velocidadMaxima;

    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void mover();
    public abstract void detener();

    public void mostrarEstado() {
        System.out.println("Tipo: " + this.getClass().getSimpleName() + " | Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}
