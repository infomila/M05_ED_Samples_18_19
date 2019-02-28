
package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public enum RegimEnum {
    NOMES_ALLOTJAMENT("SA"),
    ESMORCAR("AD"),
    MITJA_PENSIO("MP"),
    PENSIO_COMPLETA("PC") ;
    
    String descripcio;
    RegimEnum( String desc) {
        this.descripcio = desc;
    }
    public String getDescripcio(){
        return descripcio;
    }
    
}
