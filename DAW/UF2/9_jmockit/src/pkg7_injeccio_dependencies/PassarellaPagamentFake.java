
package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
public class PassarellaPagamentFake implements ICobrador {
    
    private boolean mResultatPagament;
    
    public PassarellaPagamentFake( boolean resultatPagament ){
     mResultatPagament = resultatPagament;
    }
    
    @Override
    public boolean cobrar(String VISA, double importTotal) {
       
        System.out.println("SIMULACIÓ DEL PAGAMENT !!!");
        
        return mResultatPagament; //s'ha pogut fer el pagament.
    }
    
}
