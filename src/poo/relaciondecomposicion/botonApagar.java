package poo.relaciondecomposicion;

/**
 * @author OscarNedzelsky
 */
public class botonApagar {
    //Atributos
    public Boolean IO;
    
    public botonApagar(){
        this.IO = false;    
    }
    
    public void presionar(){
        this.IO = !this.IO;
    }
    
}
