
package projecteempresa;

import java.util.Date;

/**
 *
 * @author Usuari
 */
public class Persona {
 
    private long id;
    private String NIF;
    private String nom;
    private String cognom1;
    private String cognom2;
    private Date dataNaixement;
    private  Adreça adreçaEnviament;

    public Persona(long id, String NIF, String nom, String cognom1, Date dataNaixement, Adreça pAdreçaEnviament) {
        this.id = id;
        this.NIF = NIF;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.dataNaixement = dataNaixement;
        setAdreçaEnviament(pAdreçaEnviament);
    }

    
    public Adreça getAdreçaEnviament() {
        return adreçaEnviament;
    }

    public void setAdreçaEnviament(Adreça novaAdreçaEnviament) {
        if(novaAdreçaEnviament==null) {
            throw new RuntimeException("Adreça obligatòria");
        }
        //-------------------------------------------
        Persona anticPropietari = 
                novaAdreçaEnviament.getPersona();
        if(anticPropietari!=null) {
            anticPropietari.adreçaEnviament = null;
        }
        //-------------------------------------------
        novaAdreçaEnviament.setPersona(this);
        
        if(adreçaEnviament!=null) {
            adreçaEnviament.setPersona(null);
        }
        this.adreçaEnviament = novaAdreçaEnviament;
    }
            
            
}
