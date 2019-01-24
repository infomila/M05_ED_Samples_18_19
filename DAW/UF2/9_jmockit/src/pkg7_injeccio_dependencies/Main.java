package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura f = new Factura(234.8, "1234123412341234");
        boolean resultat = f.facturar();        
    }
    
}
