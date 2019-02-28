package examenuf2.refactoring;

/**
 *
 * @author Usuari
 */
public class HabitacioDoble extends Habitacio {

    public HabitacioDoble(int codi) {
        super(codi, TipusHabitacio.DOBLE);
    }

    @Override
    public double getPreuNit() {
        return 85;
    }

    @Override
    public double getRecarrecIndividual() {
        return 50;
    }    
}
