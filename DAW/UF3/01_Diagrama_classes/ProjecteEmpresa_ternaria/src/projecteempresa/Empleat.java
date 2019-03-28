
package projecteempresa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuari
 */
public class Empleat extends Persona{
    private int codiEmpleat;
    private  BigDecimal salari;
    private ArrayList<Participacio> participacionsActuals;   //   p1        ,    p2     ,   p3

    public Empleat(int codiEmpleat, BigDecimal salari, long id, String NIF, String nom, String cognom1, Date dataNaixement, Adreça pAdreçaEnviament) {
        super(id, NIF, nom, cognom1, dataNaixement, pAdreçaEnviament);
        this.codiEmpleat =  codiEmpleat;
        this.salari = salari;
        this.participacionsActuals = new ArrayList<Participacio>();
    }
//--------------------------------------
//----------------------------------------
    // encapsulem empleatsActuals
    public int getNumParticipacions(){ return participacionsActuals.size();}
    
    public Participacio getParticipacio(int idx) {
        return participacionsActuals.get(idx);
    }
    public Iterable<Participacio> getParticipacions() {return participacionsActuals;}
    
    public void addProjecte( Projecte nou, String rol ) {
        
        Participacio p = new Participacio(this,nou, rol);
        
        if(!participacionsActuals.contains(p)) {
            participacionsActuals.add(p);
            //nou.addEmpleat(this);// ???????????????
        }
    }
   
    public boolean removeProjecte( Projecte aDonarDeBaixa)
    {
        boolean esborrat = participacionsActuals.remove(aDonarDeBaixa);
        if(esborrat) 
        {
            aDonarDeBaixa.removeEmpleat(this);
        }
        return esborrat;
    }
    
      
//----------------------------------------    
    
    
    
//--------------------------------------    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codiEmpleat;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleat other = (Empleat) obj;
        if (this.codiEmpleat != other.codiEmpleat) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
