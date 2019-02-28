package examenuf2.refactoring;

/**
 *
 * @author bernat
 */
public abstract class Habitacio {

 
    private int codi;
    private TipusHabitacio tipusHabitacio;

    public Habitacio(int codi, TipusHabitacio tipusHabitacio) {
        this.codi = codi;
        this.tipusHabitacio = tipusHabitacio;
    }

    public int getCodi() {
        return codi;
    }

    public TipusHabitacio getTipusHabitacio() {
        return tipusHabitacio;
    }

    public abstract double getPreuNit();
    public abstract double getRecarrecIndividual();
}
