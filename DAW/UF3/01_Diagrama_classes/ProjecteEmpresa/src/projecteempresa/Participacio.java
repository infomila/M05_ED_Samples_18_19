package projecteempresa;

/**
 *
 * @author Usuari
 */
public class Participacio {
    private int hores;
    private String rol;

    public Participacio(int hores, String rol) {
        this.hores = hores;
        this.rol = rol;
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
    
    
}
