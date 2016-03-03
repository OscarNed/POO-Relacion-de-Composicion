package poo.relaciondecomposicion;

/**
 * @author OscarNedzelsky
 */
public class POORelacionDeComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefono starTac = new Telefono ();
        starTac.EA.presionar();
        System.out.println("El starTac está " + starTac.EA.IO);
        starTac.EA.presionar();
        System.out.println("El starTac está " + starTac.EA.IO);
        starTac.EA.presionar();
        System.out.println("El starTac está " + starTac.EA.IO);
        starTac.setTeclado();
        System.out.println("Teclado:");
        for (int i = 0; i < starTac.Teclado.length; i++) {
            for (int j = 0; j < starTac.Teclado[0].length; j++) {
                System.out.print(starTac.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        }
        
        Telefono.guardarContacto("Oscar", "833-123-45-67", "oscar@hotmail.com");
        Telefono.guardarContacto("Francisco", "833-456-78-90", "paco@hotmail.com");
        Telefono.guardarContacto("José", "833-987-65-43", "pepe@hotmail.com");
        Telefono.MostrarContacto(0);
        System.out.println("");
        Telefono.MostrarLista();
    }
    
}