
package examenuf2.refactoring;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
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
        
        double totalsXtipus[] = new double[ TipusHabitacio.values().length ];
        
        for(Estansa e: mEstancesActuals) {
            String descripcioTipusHabitacio = e.getHabitacio().getTipusHabitacio().getDescripcio();
            preu = e.getPreu();            
            totalsXtipus[e.getHabitacio().getTipusHabitacio().ordinal()]+= preu;                 
            totalImports+=preu;            
            sb.append("\t-"+e.getHabitacio().getCodi()+":("+descripcioTipusHabitacio+"+"+e.getRegim().getDescripcio()+"),\t nits d'estança:"+e.getDiesEstança()+",\t preu total "+preu+"€ \n");    
        }
        drawLine(sb); 
        for(int i=0;i<TipusHabitacio.values().length;i++) {
            sb.append(" Total "+TipusHabitacio.values()[i].getDescripcioPlural()+
                    ":\t"+totalsXtipus[i]+"€ \n");        
        }
        drawLine(sb);        
        sb.append(" Total:\t"+totalImports+"€ \n");    
        drawLine(sb);               
        return sb.toString();
    }

    private void drawLine(StringBuilder sb) {
        sb.append("=========================================================\n");
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
