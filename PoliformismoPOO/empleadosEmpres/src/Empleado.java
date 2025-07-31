public abstract class Empleado {
    String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public abstract double calcularSalario();
}
