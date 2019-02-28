
package examenuf2.refactoring;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bernat
 */
public class Hotel {
    
    private List<Estansa> mEstancesActuals = new ArrayList<Estansa>();
    

    public void addEstansa(Estansa e){
        mEstancesActuals.add(e);
    }
    
    public String getFacturacio(){
        
        double totalImports=0;
        double totalDobles=0, totalTriples=0, totalSuites=0;
        double preu;
        StringBuilder sb = new StringBuilder();
        sb.append("> Facturació pendent: \n");
        for(Estansa e: mEstancesActuals) {
            String descripcioTipusHabitacio = e.getHabitacio().getTipusHabitacio().getDescripcio();
            preu = e.getPreu();
            
            if(e.getHabitacio().getTipusHabitacio()==TipusHabitacio.DOBLE) {
                totalDobles+= preu;                        
            } else if(e.getHabitacio().getTipusHabitacio()==TipusHabitacio.TRIPLE) {
                totalTriples+= preu;  
            } else {
                totalSuites+= preu;                                  
            }                          
            totalImports+=preu;            
            sb.append("\t-"+e.getHabitacio().getCodi()+":("+descripcioTipusHabitacio+"+"+e.getRegim().getDescripcio()+"),\t nits d'estança:"+e.getDiesEstança()+",\t preu total "+preu+"€ \n");    
        }
        sb.append("=========================================================\n");        
        sb.append(" Total dobles:\t"+totalDobles+"€ \n");    
        sb.append(" Total triples:\t"+totalTriples+"€ \n");    
        sb.append(" Total suites:\t"+totalSuites+"€ \n");    
        sb.append("=========================================================\n");        
        sb.append(" Total:\t"+totalImports+"€ \n");    
        sb.append("=========================================================\n");        

        
        return sb.toString();
    }
    
    public static int nitsDiferencia( Date a, Date b) {
        Calendar cala = Calendar.getInstance();
        cala.setTime(a);
        Calendar calb = Calendar.getInstance();
        calb.setTime(b);
         long millis1 = cala.getTimeInMillis();
        long millis2 = calb.getTimeInMillis();

        // Calculate difference in milliseconds
        long diff = millis2 - millis1;
        return  (int)Math.ceil(diff / (24 * 60 * 60 * 1000));
    }
    
}
