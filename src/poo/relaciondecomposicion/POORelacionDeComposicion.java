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
    }
    
}