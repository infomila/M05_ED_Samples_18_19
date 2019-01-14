package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
public class FabricaICobradors {

    private static boolean _modeReal = true;
    
    public static void setModeReal( boolean modeReal ) {
        _modeReal = modeReal;
    }

    //------------------------------------------------------------
    
    public static ICobrador fabrica(){
        if(_modeReal) {
            return new PassarellaPagament();
        } else {
            return new PassarellaPagamentFake();
        }
    }    
}
