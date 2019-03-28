package projecteempresa;

import java.util.Objects;

/**
 *
 * @author Usuari
 */
public class Participacio {
    private int hores;
    private String rol;
    
    private Empleat empleat;
    private Projecte projecte;

    public Participacio(Empleat empleat, Projecte projecte, String rol){
        this(empleat, projecte, 0, rol);
    }
    
    public Participacio(Empleat empleat, Projecte projecte, int hores, String rol) {
        this.empleat = empleat;
        this.projecte = projecte;
        this.hores = hores;
        this.rol = rol;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        if (!Objects.equals(this.rol, other.rol)) {
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
