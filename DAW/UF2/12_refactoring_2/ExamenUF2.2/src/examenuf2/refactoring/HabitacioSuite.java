package examenuf2.refactoring;

/**
 *
 * @author Usuari
 */
public class HabitacioSuite extends Habitacio {

    public HabitacioSuite(int codi) {
        super(codi, TipusHabitacio.SUITE);
    }

    @Override
    public double getPreuNit() {
        return 600;
    }

    @Override
    public double getRecarrecIndividual() {
        return 0;
    }    
}