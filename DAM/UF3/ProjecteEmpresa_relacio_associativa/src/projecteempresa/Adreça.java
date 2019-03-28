package projecteempresa;

/**
 *
 * @author Usuari
 */
public class Adreça {
    private byte [] CP;
    String liniaAdreça;
    String municipi;
    String provincia;
    
    Persona persona;

    public Adreça( byte[] CP, String liniaAdreça, String municipi, String provincia) {
        this.CP = CP;
        this.liniaAdreça = liniaAdreça;
        this.municipi = municipi;
        this.provincia = provincia;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {                
        if(persona==this.persona) return;                        
        if(persona!=null) persona.setAdreçaFacturacio(this);
        this.persona = persona;
    }
    
}
