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
        Factura f = new Factura();
        PassarellaPagament pp = new PassarellaPagament();
        boolean resultat = f.facturar(pp);
        
    }
    
}
