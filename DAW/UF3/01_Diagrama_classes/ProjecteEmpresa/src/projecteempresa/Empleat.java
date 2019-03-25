
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
    private ArrayList<Projecte> projectesActuals;

    public Empleat(int codiEmpleat, BigDecimal salari, long id, String NIF, String nom, String cognom1, Date dataNaixement, Adreça pAdreçaEnviament) {
        super(id, NIF, nom, cognom1, dataNaixement, pAdreçaEnviament);
        this.codiEmpleat =  codiEmpleat;
        this.salari = salari;
        this.projectesActuals = new ArrayList<Projecte>();
    }
//--------------------------------------
//----------------------------------------
    // encapsulem empleatsActuals
    public int getNumProjectes(){ return projectesActuals.size();}
    public Projecte getProjecte(int idx) {
        return projectesActuals.get(idx);
    }
    public Iterable<Projecte> getEmpleats() {return projectesActuals;}
    
    public void addProjecte( Projecte nou ) {
        if(!projectesActuals.contains(nou)) {
            projectesActuals.add(nou);
            nou.addEmpleat(this);
        }
    }
   
    public boolean removeProjecte( Projecte aDonarDeBaixa)
    {
        boolean esborrat = projectesActuals.remove(aDonarDeBaixa);
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
