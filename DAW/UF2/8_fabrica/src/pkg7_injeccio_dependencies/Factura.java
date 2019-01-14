
package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
public class Factura {

    private double importTotal;
    private String VISA;
    
    

    public boolean facturar( ) {
        
        // repercutir el pagament a la comptabilitat
        // refrescar stocks
        // ....
        
        // Fa el pagament mitjançant la classe PassarellaPagament
        //PassarellaPagament pp = new PassarellaPagament();
        
        ICobrador c = FabricaICobradors.fabricaCobrador();       
        return c.cobrar(VISA, importTotal);
        
    }
    
}
