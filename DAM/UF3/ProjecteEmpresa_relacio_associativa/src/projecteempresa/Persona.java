
package projecteempresa;

import java.util.ArrayList;
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
    private Adreça adreçaFacturacio;
    private List<Adreça> adrecesEnviament;
    

    public Persona(long id, String NIF, String nom, String cognom1, Date dataNaixement, Adreça adreçaFacturacio) {
        this(id, NIF, nom, cognom1, null, dataNaixement,adreçaFacturacio);
    }

    public Persona(long id, String NIF, String nom, String cognom1, String cognom2, Date dataNaixement, Adreça adreçaFacturacio) {
        this.id = id;
        this.NIF = NIF;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.dataNaixement = dataNaixement;
        setAdreçaFacturacio(adreçaFacturacio);
        adrecesEnviament = new ArrayList<Adreça>();
    }

    //------------------------------------------------------------
    // encapsulació d'una llista:
    // a) mètode de recompte
    public int getSizeOfAdrecesEnviament() {
        return adrecesEnviament.size();
    }
    // b) accés indexat
    public Adreça getAdreçaEnviament(int index) {
        return adrecesEnviament.get(index);
    }
    public Iterable<Adreça> getAdrecesEnviament(){
        return adrecesEnviament;
    }
    public Adreça removeAdreçaEnviament(int idx){
        return adrecesEnviament.remove(idx);
    }
    public void addAdreçaEnviament(Adreça novaAdreça) {
        adrecesEnviament.add(novaAdreça);
    }    
    //------------------------------------------------------------
    
    
    public Adreça getAdreçaFacturacio() {
        return adreçaFacturacio;
    }

    public void setAdreçaFacturacio(Adreça novaAdreçaFacturacio) {
        
        if(novaAdreçaFacturacio==this.adreçaFacturacio) return;
        
        if(novaAdreçaFacturacio==null) {
            throw new RuntimeException("Adreça de facturació obligatòria");
        }
       
        if(adreçaFacturacio!=null) {
            adreçaFacturacio.setPersona(null);
        }
        this.adreçaFacturacio = novaAdreçaFacturacio;
        
        if(novaAdreçaFacturacio!=null) {                        
            Persona anticPropietari = novaAdreçaFacturacio.getPersona();
            if(anticPropietari!=null) anticPropietari.adreçaFacturacio = null;            
            novaAdreçaFacturacio.setPersona(this);
        }        
    }
           
    
    
    
    
    
    
}
