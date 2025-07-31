public class EmpleadoMedioTiempo extends Empleado {
    double salarioPorHora;
    int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, double salarioPorHora, int horasTrabajadas) {
        super(nombre);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}
