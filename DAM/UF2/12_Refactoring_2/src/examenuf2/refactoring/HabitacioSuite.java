package examenuf2.refactoring;
import examenuf2.refactoring.Habitacio;
import examenuf2.refactoring.TipusHabitacio;


/**
 *
 * @author Usuari
 */
public class HabitacioSuite extends Habitacio{

    public HabitacioSuite(int codi) {
        super(codi, TipusHabitacio.SUITE);
    }

    @Override
    public double getPreu(int diesEstansa, int numeroPersones) {
        return diesEstansa * 600;
    }
    
}
