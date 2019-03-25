package projecteempresa;

import java.util.ArrayList;

/**
 *
 * @author Usuari
 */
public class Projecte {

    private int id;
    private String nom;
    private ArrayList<Empleat> empleatsActuals;
    private Empleat cap;
    public Projecte(int id, String nom, Empleat cap) {
        this.id = id;
        this.nom = nom;
        this.cap = cap;
       
        empleatsActuals = new ArrayList<>();
    }
//--------------------------------------------
    public int getNumEmpleatsActuals() {
        return empleatsActuals.size();
    }
    public Empleat getEmpleat(int idx) {
        return empleatsActuals.get(idx);
    }
    public Iterable<Empleat> getEmpleats(){
        return empleatsActuals;
    }
    public void addEmpleat(Empleat nou) {
        
        if (!empleatsActuals.contains(nou)) {        
            empleatsActuals.add(nou);
                        
            nou.addProjecte(this);
        }
    }    
    public boolean removeEmpleat(Empleat aEsborrar) {
        boolean esborrat = empleatsActuals.remove(aEsborrar);
        if(esborrat) {
            aEsborrar.removeProjecte(this);
        }
        return esborrat;
    }   
//--------------------------------------------    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Empleat getCap() {
        return cap;
    }

    public void setCap(Empleat cap) {
        this.cap = cap;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
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
        final Projecte other = (Projecte) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
