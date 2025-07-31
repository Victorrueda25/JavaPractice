public class Nomina {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoTiempoCompleto("Lucía", 3000000),
            new EmpleadoMedioTiempo("Carlos", 25000, 80),
            new EmpleadoFreelance("Diana", 1800000)
        };

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.nombre + " | Salario: $" + e.calcularSalario());
        }
    }
}
