
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
        
        double totalsXtipus[] = new double[TipusHabitacio.values().length];
        
        double preu;
        StringBuilder sb = new StringBuilder();
        sb.append("> Facturació pendent: \n");
        
        for(Estansa e: mEstancesActuals) {
            String descripcioHabitacio = e.getHabitacio().getTipusHabitacio().getDescripcio();           
            preu = e.getPreu();          
            totalsXtipus[e.getHabitacio().getTipusHabitacio().ordinal()] += preu;
            totalImports+=preu;
            sb.append("\t-"+e.getHabitacio().getCodi()+":("+descripcioHabitacio+"+"+e.getRegim().getDescripcio()+"),\t nits d'estança:"+e.getDiesEstansa()+",\t preu total "+preu+"€ \n");                
        }
        putLine(sb);        
        for(int i=0;i<TipusHabitacio.values().length;i++) {
            String tipusHabDescPlural = TipusHabitacio.values()[i].getDescripcioPlural();
            sb.append(" Total "+ tipusHabDescPlural +":\t"+totalsXtipus[i]+"€ \n");                   
        }
        putLine(sb);        
        sb.append(" Total:\t"+totalImports+"€ \n");    
        putLine(sb);        

        
        return sb.toString();
    }

    private void putLine(StringBuilder sb) {
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
