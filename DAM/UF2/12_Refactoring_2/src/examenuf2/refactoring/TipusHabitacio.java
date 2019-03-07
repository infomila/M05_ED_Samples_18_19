package examenuf2.refactoring;

/**
 *
 * @author Usuari
 */
public enum TipusHabitacio {
    DOBLE("doble"),
    TRIPLE("triple"),
    SUITE("suite");
    
    private String descripcio;
    TipusHabitacio(String desc) {
        descripcio = desc;
    }
    
    public String getDescripcio(){
        return descripcio;
    }
    
    public String getDescripcioPlural(){
        return descripcio + "s";
    }
    
}
