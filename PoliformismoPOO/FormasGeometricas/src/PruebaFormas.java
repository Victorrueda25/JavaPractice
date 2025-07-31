import java.util.Scanner;
import java.util.ArrayList;

public class PruebaFormas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Forma> formas = new ArrayList<>();

        System.out.println("¿Cuántas figuras deseas crear?");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nFigura #" + (i + 1));
            System.out.println("¿Qué figura deseas crear?");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Radio: ");
                    double radio = sc.nextDouble();
                    formas.add(new Circulo(radio));
                    break;
                case 2:
                    System.out.print("Base: ");
                    double baseR = sc.nextDouble();
                    System.out.print("Altura: ");
                    double alturaR = sc.nextDouble();
                    formas.add(new Rectangulo(baseR, alturaR));
                    break;
                case 3:
                    System.out.print("Base: ");
                    double baseT = sc.nextDouble();
                    System.out.print("Altura: ");
                    double alturaT = sc.nextDouble();
                    formas.add(new Triangulo(baseT, alturaT));
                    break;
                default:
                    System.out.println("Opción inválida. Se omitirá esta figura.");
                    i--; // repetir turno
            }
        }

        // Mostrar área
        System.out.println("\n----- ÁREAS -----");
        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }

        sc.close();
    }
}
