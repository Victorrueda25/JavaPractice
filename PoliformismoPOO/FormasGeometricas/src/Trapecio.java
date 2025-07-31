public class Trapecio extends Forma {
    private double baseMayor, baseMenor, altura;

    public Trapecio(double baseMayor, double baseMenor, double altura, String color) {
        super(color);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
}
