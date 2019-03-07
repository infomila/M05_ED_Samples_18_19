package examenuf2.refactoring;

/**
 *
 * @author Usuari
 */
public enum TipusHabitacio {
    DOBLE("doble"), // 0
    TRIPLE("triple"), //1
    SUITE("suite"); //2 
    
    String description;
    
    TipusHabitacio(String desc) {
        this.description = desc;
    }
    
    public String getDescripcio(){
        return this.description;
    }
    
    public String getDescripcioPlural(){
        return getDescripcio()+"s";
    }
    
}
