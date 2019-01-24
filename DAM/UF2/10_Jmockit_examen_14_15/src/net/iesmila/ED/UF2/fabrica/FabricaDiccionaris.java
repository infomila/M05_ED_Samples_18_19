
package net.iesmila.ED.UF2.fabrica;

/**
 *
 * @author Usuari
 */
class FabricaDiccionaris {

    // evitem que ningú es dediqui a crear nous diccionaris
    private FabricaDiccionaris(){}
    
    private static DiccionariOnline _online;
    private static DiccionariOnlineFake _onlineFake;
    
    private static boolean _modeReal = true;
    
    public static void setModeReal(boolean modeReal) {
        _modeReal = modeReal;
    }
    
    public static IDiccionari getDiccionari() {
    
        if(_modeReal) {
            if(_online==null){
                _online = new DiccionariOnline();
            }
            return _online;
            
        } else {
            if(_onlineFake ==null){
                _onlineFake = new DiccionariOnlineFake();
            }
            return _onlineFake;
        }
    }
    
}
