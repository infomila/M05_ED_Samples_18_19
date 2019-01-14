package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
public class FabricaICobradors {

    private static boolean _modeReal = true;
    
    /**
     * Aquest mètode serveix per posar la fàbrica en mode real o de test.
     * @param real 
     */
    public static void setModeReal( boolean real ) {
        _modeReal = real;
    }
    
    
    private static boolean _resultatPagamentEnModeFals = true;
    public static void setResultatPagamentEnModeFals( boolean resultatPagament ) {
        _resultatPagamentEnModeFals = resultatPagament;
    }
            
    
    public static ICobrador fabricaCobrador(){
        
        if(_modeReal ) {
            return new PassarellaPagament();
        } else {
            return new PassarellaPagamentFake(_resultatPagamentEnModeFals);
        }
        
    }
    
    
}
