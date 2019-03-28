
package projecteempresa;

import java.util.Date;
import java.util.List;

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
    //-------------- Atributs derivats de relacions ---------------
    private Adreça adreçaEnviament;
    private List<Adreça> adrecesFacturacio;

    
    //-------------------------------------------------
    //----  Mètodes per gestionar/encapsular una llista
   
    public int getAdrecesFacturacioSize(){
        return adrecesFacturacio.size();
    }
    
    public Adreça getAdreçaFacturacio(int idx){
        return adrecesFacturacio.get(idx);
    }
    
    public Iterable<Adreça> getAdrecesFacturacio(){
        return adrecesFacturacio;
    }
    
    public Adreça removeAdreçaFacturacio(int idx){
        return adrecesFacturacio.remove(idx);
    }
    
    public boolean addAdreçaFacturacio(Adreça novaAdreça) {
        
        // cercar si l'adreça nova existeix, i en aquest cas no fer res i tornar fals
        adrecesFacturacio.add(novaAdreça);
        return true;
    }
    
    
    //--------------------------------------------------

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
        
        if(novaAdreçaEnviament==this.adreçaEnviament) return;
        
        
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
        
        if(adreçaEnviament!=null) {
            adreçaEnviament.setPersona(null);
        }
        this.adreçaEnviament = novaAdreçaEnviament;
                
        novaAdreçaEnviament.setPersona(this);
    }
            
            
}
