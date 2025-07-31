

public class Practicante extends Empleado{
    double bonificacionMensual;
    static final double SALARIO_MINIMO = 1300000;
    
    public Practicante(String nombre, int idEmpleado, double bonificacionMensual){
        super(nombre, idEmpleado);
        this.bonificacionMensual = bonificacionMensual;
    }
    
    @Override
    public double calcularSalario(){
        double salarioTotal = bonificacionMensual;
        if(salarioTotal < SALARIO_MINIMO){
            salarioTotal = SALARIO_MINIMO;
        }
        
        return salarioTotal;
        
    }
}
