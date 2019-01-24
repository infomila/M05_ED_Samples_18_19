
package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
public class Factura {

    private double importTotal;
    private String VISA;

    public Factura(double importTotal, String VISA) {
        this.importTotal = importTotal;
        this.VISA = VISA;
    }
    
    
    public boolean facturar( ) {
        
        // repercutir el pagament a la comptabilitat
        // refrescar stocks
        // ....
        
        // Fa el pagament mitjançant la classe PassarellaPagament
        PassarellaPagament pp = new PassarellaPagament();
        
        boolean pagamentOk = pp.cobrar(VISA, importTotal);
        if(pagamentOk==false) {
            pp.rollback();
        }
        return pagamentOk;
    }
    
}
