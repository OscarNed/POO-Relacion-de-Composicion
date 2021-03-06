package poo.relaciondecomposicion;

/**
 *
 * @author OscarNedzelsky
 */
public class Telefono {
    //Atributo, instanciar objeto
    public botonApagar EA = new botonApagar();
    public static Contacto[] Lista = new Contacto[100];
    
    public Tecla[][] Teclado = new Tecla [5] [3];
    
    public void setTeclado(){
        int num = 1;
        for (int i = 0; i < ((Teclado.length) - 1); i++) {
            for (int j = 0; j < Teclado[0].length; j++) {
                Tecla aux = new Tecla();
                aux.setDigito((String.valueOf(num)).charAt(0));
                Teclado[i][j] = aux;
                 num = num + 1;
            }
        }
        
        Tecla aux1 = new Tecla();
        Tecla aux2 = new Tecla();
        Tecla aux3 = new Tecla();
        Tecla aux4 = new Tecla();
        Tecla aux5 = new Tecla();
        Tecla aux6 = new Tecla();
        
        aux1.setDigito('0');
        Teclado [3][1] = aux1;
        aux2.setDigito('*');
        Teclado [3][0] = aux2;
        aux3.setDigito('#');
        Teclado [3][2] = aux3;
        aux4.setDigito('L');
        Teclado [4][0] = aux4;
        aux5.setDigito('E');
        Teclado [4][1] = aux5;
        aux6.setDigito('C');
        Teclado [4][2] = aux6;
    }
    public static void  guardarContacto(String nombre, String telefono, String correo){
        int espacio = buscarEspacio(Lista);
        if (espacio < 0){
            System.out.println("La lista está llena.");
        }
        else {
            Contacto aux = new Contacto (nombre, telefono, correo);
            Lista[espacio] = aux;
        }
    }
    
    private static int buscarEspacio(Contacto [] Lista){
        int x = -1;
        for (int i = 0; i <= Lista.length; i++) {
            if (Lista[i] == null){
                x = i;
                i = 101;
            }
            
        }
        return x;
    }
    
    public static void MostrarContacto(int n){
        Lista[n].getContacto();
    }
    
    public static void MostrarLista(){
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i] != null){
                System.out.println("Contacto #" + (i+1) + ":");
                Lista[i].getContacto();
                System.out.println("");
            }
        }
    }
}