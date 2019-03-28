package projecteempresa;

import java.util.Objects;

/**
 *
 * @author Usuari
 */
public class Participacio {

    private int hores;
    private String carrec;
    private Empleat empleat;
    private Projecte projecte;
    

    public Participacio( Empleat empleat, Projecte projecte, String carrec) {
        this(empleat, projecte, 0, carrec);
    }
    
    public Participacio( Empleat empleat, Projecte projecte, int hores, String carrec) {
        this.empleat = empleat;
        this.projecte = projecte;
        this.hores = hores;
        this.carrec = carrec;
    }

    public Empleat getEmpleat() {
        return empleat;
    }

    public Projecte getProjecte() {
        return projecte;
    }
    
    
    

    public int getHores() {
        return hores;
    }

    public void setHores(int hores) {
        this.hores = hores;
    }

    public String getCarrec() {
        return carrec;
    }

    public void setCarrec(String carrec) {
        this.carrec = carrec;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Participacio other = (Participacio) obj;
        if (!Objects.equals(this.carrec, other.carrec)) {
            return false;
        }
        if (!Objects.equals(this.empleat, other.empleat)) {
            return false;
        }
        if (!Objects.equals(this.projecte, other.projecte)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
