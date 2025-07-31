package animales;

public class Granja {
    public static void main(String[] args) {
        Animal[] animales = {new Vaca(), new Gallo(), new Cerdo()};

        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
