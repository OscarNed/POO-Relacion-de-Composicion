package poo.relaciondecomposicion;

/**
 *
 * @author OscarNedzelsky
 */
public class Contacto {
    //Atributos
    private String nombre, telefono, correo;
    
    //Métodos
    
    //Constructor
    public Contacto(String nombre, String telefono, String correo){
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public void getContacto(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Télefono: " + this.telefono);
        System.out.println("Correo: " + this.correo);
    }
}
