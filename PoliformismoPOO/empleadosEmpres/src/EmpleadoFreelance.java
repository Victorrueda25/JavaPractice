public class EmpleadoFreelance extends Empleado {
    double tarifaProyecto;

    public EmpleadoFreelance(String nombre, double tarifaProyecto) {
        super(nombre);
        this.tarifaProyecto = tarifaProyecto;
    }

    @Override
    public double calcularSalario() {
        return tarifaProyecto;
    }
}
