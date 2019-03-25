package projecteempresa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuari
 */
class Empleat extends Persona {
    
    private String carrec;
    private int codiEmpleat;
    private BigDecimal salari;
    private ArrayList<Projecte> projectesActuals;
    
    public Empleat(
            int codiEmpleat, String carrec, BigDecimal salari,
            long id, String NIF, String nom, String cognom1, Date dataNaixement, Adreça adreçaFacturacio) {
        super(id, NIF, nom, cognom1, dataNaixement, adreçaFacturacio);
        
        this.codiEmpleat = codiEmpleat;
        this.carrec = carrec;
        this.salari = salari;
        
        projectesActuals = new ArrayList<>();
               
    }
//--------------------------------------------
    public int getNumProjectesActuals() {
        return projectesActuals.size();
    }
    public Projecte getProjecte(int idx) {
        return projectesActuals.get(idx);
    }
    public Iterable<Projecte> getProjectes(){
        return projectesActuals;
    }
    public void addProjecte(Projecte nou) {
        
        if (!projectesActuals.contains(nou)) {        
            projectesActuals.add(nou);
            
            nou.addEmpleat(this);
        }
    }
    
    public boolean removeProjecte(Projecte aEsborrar) {
        boolean esborrat = projectesActuals.remove(aEsborrar);
        if(esborrat) {
            aEsborrar.removeEmpleat(this);
        }
        return esborrat;
    }
   
//--------------------------------------------    
    public String getCarrec() {
        return carrec;
    }

    public void setCarrec(String carrec) {
        this.carrec = carrec;
    }

    public int getCodiEmpleat() {
        return codiEmpleat;
    }

    public void setCodiEmpleat(int codiEmpleat) {
        this.codiEmpleat = codiEmpleat;
    }

    public BigDecimal getSalari() {
        return salari;
    }

    public void setSalari(BigDecimal salari) {
        this.salari = salari;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.codiEmpleat;
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
