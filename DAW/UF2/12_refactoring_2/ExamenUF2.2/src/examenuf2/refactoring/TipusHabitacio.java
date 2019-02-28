package examenuf2.refactoring;

/**
 *
 * @author Usuari
 */
public enum TipusHabitacio {
    DOBLE("doble"),
    TRIPLE("triple"),
    SUITE("suite");
    
    String description;
    
    TipusHabitacio(String desc) {
        this.description = desc;
    }
    
    public String getDescripcio(){
        return this.description;
    }
    
}
