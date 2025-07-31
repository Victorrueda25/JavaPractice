
package modelos;


public class Persona {
    private String nombre;
    private int edad;
    
    //constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodo para mostrar informacion
    public void mostrarInformacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
    }
    
}
