package examenuf2.refactoring;

/**
 *
 * @author Usuari
 */
public class HabitacioDoble extends Habitacio{

    public HabitacioDoble(int codi) {
        super(codi, TipusHabitacio.DOBLE);
    }

    @Override
    public double getPreu(int diesEstansa, int numeroPersones) {
        double preu = diesEstansa * 85;

        if(numeroPersones==1) { // rec?rrec per us individual
            preu += 50;
        }
        return preu;
    }
    
}
