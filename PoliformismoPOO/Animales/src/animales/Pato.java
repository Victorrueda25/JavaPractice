package animales;


class Pato extends Animal {

    public Pato(double peso) {
        super(peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pato hace cuac.");
    }

    public void nadar() {
        System.out.println("El pato está nadando.");
    }
}
