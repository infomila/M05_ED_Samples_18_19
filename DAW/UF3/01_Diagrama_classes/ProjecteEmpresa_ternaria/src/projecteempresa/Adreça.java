package projecteempresa;

/**
 *
 * @author Usuari
 */
public class Adreça {
    private byte[] CP;
    private String liniaAdreça;
    private String municipi;
    private String provincia;
    
    private Persona persona;

    public Adreça(byte[] CP, String liniaAdreça, String municipi, String provincia) {
        this.CP = CP;
        this.liniaAdreça = liniaAdreça;
        this.municipi = municipi;
        this.provincia = provincia;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona pPersona) {
        
      
        
        if(pPersona==this.persona) return;
        
        
        if(pPersona!=null) pPersona.setAdreçaEnviament(this);
        this.persona = pPersona;
    }
    
    
}
