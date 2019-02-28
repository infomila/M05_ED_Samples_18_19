
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
    
    public int getDiesEstança(){
        return nitsDiferencia( getDiaEntrada(), getDiaSortida()) ;
    }  

    public double getPreu() {
 
        double preu = 0;
        switch(getRegim()){
            case ESMORCAR: preu+=10*getNumeroPersones();break;
            case MITJA_PENSIO: preu+=40*getNumeroPersones();break;
            case PENSIO_COMPLETA: preu+=70*getNumeroPersones();break;
        }

        preu += getDiesEstança() * getHabitacio().getPreuNit();                        
        if(getNumeroPersones()==1) { // rec?rrec per us individual
                preu += getHabitacio().getRecarrecIndividual();
        }
        return preu;
    }

    
}
