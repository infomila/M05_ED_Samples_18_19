
package projecteempresa;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class AdreçaTest {
    
    public AdreçaTest() {
    }

    @Test
    public void testGetPersona() {
        
        Adreça adPaco = new Adreça(new byte[]{0,8,7,0,0}, "C/ Martiri, n7", "Igualada", "BCN");
        Adreça adMaria = new Adreça(new byte[]{0,8,7,0,0}, "C/ Dolors, n56", "Igualada", "BCN");
        //---------------------
        Persona paco = new Persona(1, "11111111H","Paco", "Maroto", new Date(), adPaco);
        Persona maria = new Persona(1, "12345678Z","Maria", "Marango", new Date(), adMaria);
        //---------------------------
        assertEquals(adPaco,  paco.getAdreçaEnviament());
        assertEquals( adPaco.getPersona(), paco  );
        
        //---------------------------------------------------
        paco.setAdreçaEnviament(adMaria);
     
        assertEquals( adMaria,  paco.getAdreçaEnviament());
        assertEquals( adMaria.getPersona(), paco);
        assertEquals( adPaco.getPersona(), null);
        assertEquals( maria.getAdreçaEnviament(), null);
        //--------------------------------------------------
        
    }
    
    @Test
    public void testCanviAdreçaPerAdreça() {
        
        Adreça adPaco = new Adreça(new byte[]{0,8,7,0,0}, "C/ Martiri, n7", "Igualada", "BCN");
        Adreça adMaria = new Adreça(new byte[]{0,8,7,0,0}, "C/ Dolors, n56", "Igualada", "BCN");
        //---------------------
        Persona paco = new Persona(1, "11111111H","Paco", "Maroto", new Date(), adPaco);
        Persona maria = new Persona(1, "12345678Z","Maria", "Marango", new Date(), adMaria);
        //---------------------------
        assertEquals(adPaco,  paco.getAdreçaEnviament());
        assertEquals( adPaco.getPersona(), paco  );
        
        //---------------------------------------------------
        //paco.setAdreçaEnviament(adMaria);
        adMaria.setPersona(paco);     
        assertEquals( adMaria.getPersona(), paco);
        assertEquals( adMaria,  paco.getAdreçaEnviament());        
        assertEquals( adPaco.getPersona(), null);
        assertEquals( maria.getAdreçaEnviament(), null);
        //--------------------------------------------------
        
    }    
    
    

}
