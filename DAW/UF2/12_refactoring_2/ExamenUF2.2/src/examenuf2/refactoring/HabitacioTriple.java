package examenuf2.refactoring;

/**
 *
 * @author Usuari
 */
public class HabitacioTriple extends Habitacio {

    public HabitacioTriple(int codi) {
        super(codi, TipusHabitacio.TRIPLE);
    }

    @Override
    public double getPreuNit() {
        return 120;
    }

    @Override
    public double getRecarrecIndividual() {
        return 80;
    }    
}