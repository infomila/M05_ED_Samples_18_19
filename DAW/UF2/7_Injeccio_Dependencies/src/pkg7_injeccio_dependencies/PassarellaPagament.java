package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
class PassarellaPagament implements ICobrador {

    
    
    
    @Override
    public boolean cobrar(String VISA, double importTotal) {
       
        System.out.println("Estic fent un pagament REAL....prepara la cartera !!!");
        
        return true; //s'ha pogut fer el pagament.
    }
    
}
