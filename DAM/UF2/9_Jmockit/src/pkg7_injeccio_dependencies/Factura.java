
package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
public class Factura {
    
    
    int numero;
    String VISA;
    double importTotal;

    public Factura(int numero, String VISA, double importTotal) {
        this.numero = numero;
        this.VISA = VISA;
        this.importTotal = importTotal;
    }
    
    public boolean facturar() {
        // Comptabilitzar la factura
        // Actualitzar els stocks
        // Fer el cobrament
        PassarellaPagament p = new PassarellaPagament();
        boolean pagamentOk = p.cobrar(VISA, importTotal);        
        if(!pagamentOk) {
            p.rollback();
        }
        return pagamentOk;
    }
    
}
