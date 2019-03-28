package projecteempresa;

import java.util.ArrayList;

/**
 *
 * @author Usuari
 */
public class Projecte {
    private int id;
    private String nom;
    private ArrayList<Empleat> empleatsActuals;      //  Paco     ,  Maria    ,  Joana
    private Empleat capActual;
    
    public Projecte(Empleat cap, int id, String nom) {
        this.id = id;
        this.nom = nom;
        
        empleatsActuals = new ArrayList<Empleat>();
        //empleatsActuals.add(cap);
        capActual = cap;
    }
//----------------------------------------
    // encapsulem empleatsActuals
    public int getNumEmpleats(){ return empleatsActuals.size();}
    public Empleat getEmpleat(int idx) {
        return empleatsActuals.get(idx);
    }
    public Iterable<Empleat> getEmpleats() {return empleatsActuals;}
    
    public void addEmpleat( Empleat nou ) {
        
        if( !empleatsActuals.contains(nou)) {        
            empleatsActuals.add(nou);
            nou.addProjecte(this);
        }
    }
    
    public boolean removeEmpleat( Empleat aDonarDeBaixa)
    {
        boolean esborrat = empleatsActuals.remove(aDonarDeBaixa);
        if(esborrat) 
        {
            aDonarDeBaixa.removeProjecte(this);
        }
        return esborrat;
    }
    
      
//----------------------------------------    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
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

    public Empleat getCapActual() {
        return capActual;
    }

    public void setCapActual(Empleat capActual) {
        this.capActual = capActual;
    }
    
    
    
}
