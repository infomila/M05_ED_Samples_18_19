
package examenuf2.refactoring;

import static examenuf2.refactoring.Hotel.nitsDiferencia;
import java.util.Date;

/**
 *
 * @author bernat
 */
public class Estansa {

    private Habitacio habitacio;
    private Date diaEntrada;
    private Date diaSortida;
    private int numeroPersones;
    private RegimEnum regim;

    public Estansa(Habitacio habitacio, Date diaEntrada, Date diaSortida, int numeroPersones, RegimEnum regim) {
        this.habitacio = habitacio;
        this.diaEntrada = diaEntrada;
        this.diaSortida = diaSortida;
        this.numeroPersones = numeroPersones;
        this.regim = regim;
    }

    public Habitacio getHabitacio() {
        return habitacio;
    }

    public Date getDiaEntrada() {
        return diaEntrada;
    }

    public Date getDiaSortida() {
        return diaSortida;
    }

    public int getNumeroPersones() {
        return numeroPersones;
    }

    public RegimEnum getRegim() {
        return regim;
    }

    public int getDiesEstansa() {
        return nitsDiferencia( getDiaEntrada(), getDiaSortida()) ;
    }
    
    double getPreu() {
            double preu = 0;            
            switch(getRegim()){
                case ESMORZAR: preu+=10*getNumeroPersones();break;
                case MITJA_PENSIO: preu+=40*getNumeroPersones();break;
                case PENSIO_COMPLETA: preu+=70*getNumeroPersones();break;
            }
            int nitsDiff =  getDiesEstansa();
            
            preu += getHabitacio().getPreu(nitsDiff, getNumeroPersones());
                        
            return preu;
    }

    
}
