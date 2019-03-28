package projecteempresa;

/**
 *
 * @author Usuari
 */
public class Participacio {

    private int hores;
    private String carrec;

    public Participacio(int hores, String carrec) {
        this.hores = hores;
        this.carrec = carrec;
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
    
    
}
