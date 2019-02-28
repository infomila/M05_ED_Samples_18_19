package examenuf2.refactoring;

/**
 *
 * @author Usuari
 */
public class HabitacioTriple extends Habitacio{

    public HabitacioTriple(int codi) {
        super(codi, TipusHabitacio.TRIPLE);
    }

    @Override
    public double getPreu(int diesEstansa, int numeroPersones) {
        double preu = diesEstansa * 120;
                        
        if(numeroPersones==1) { // rec?rrec per us individual
            preu += 80;
        } 
        return preu;
    }
    
}
