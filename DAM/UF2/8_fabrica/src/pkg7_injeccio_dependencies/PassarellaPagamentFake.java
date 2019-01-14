package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
 
public class PassarellaPagamentFake implements ICobrador {
    
    @Override
    public boolean cobrar(String VISA, double importTotal ) {
        
        System.out.println("PAGAMENT SIMULAT");        
        return true;
    }        
}
