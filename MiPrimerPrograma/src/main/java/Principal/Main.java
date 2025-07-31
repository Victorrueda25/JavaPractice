

package Principal;


public class Main {

    public static void main(String[] args) {
        // Crear objeto de tipo Persona
        Persona persona1 = new Persona("Juan Pérez", 25);

        // Mostrar información de la persona
        persona1.mostrarInformacion();
    }
}

// Clase Persona
class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
