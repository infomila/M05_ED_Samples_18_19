
package projecteempresa;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

 public class PersonaTest {
    
    public PersonaTest() {
    }

    @Test
    public void testSetAdreçaFacturacio() {
        
        Adreça adPaco = new Adreça(new byte[]{0,8,7,0,0},"C/Capdevall 4", "Igualada", "Barcelona" );
        Adreça adMaria = new Adreça(new byte[]{0,8,7,0,0},"C/Santa Maria 7", "Igualada", "Barcelona" );
        
        Persona paco = new Persona(1, "11111111H", "Paco", "Maroto", new Date(), adPaco );
        Persona maria = new Persona(2, "12345678Z", "Maria", "Mateu", new Date(), adMaria );
        //---------------------------------------------------------------
        paco.setAdreçaFacturacio(adPaco);        
        assertEquals( paco.getAdreçaFacturacio(), adPaco);
        //---------------------------------------------------------------
        // verifiquem l'altre direcció 
        assertEquals( adPaco.getPersona(), paco );
        //---------------------------------------------------------------
        // 
        paco.setAdreçaFacturacio(adMaria);
        assertEquals( paco.getAdreçaFacturacio(), adMaria);
        assertEquals( adPaco.getPersona(), null );
        assertEquals( adMaria.getPersona(), paco );
        assertEquals( maria.getAdreçaFacturacio(), null);
        //---------------------------------------------------------------
        
    }
    
    
    @Test
    public void testSetAdreçaFacturacioViaAdreca() {
        
        Adreça adPaco = new Adreça(new byte[]{0,8,7,0,0},"C/Capdevall 4", "Igualada", "Barcelona" );
        Adreça adMaria = new Adreça(new byte[]{0,8,7,0,0},"C/Santa Maria 7", "Igualada", "Barcelona" );
        
        Persona paco = new Persona(1, "11111111H", "Paco", "Maroto", new Date(), adPaco );
        Persona maria = new Persona(2, "12345678Z", "Maria", "Mateu", new Date(), adMaria );
        //---------------------------------------------------------------
        //paco.setAdreçaFacturacio(adPaco);        
        adPaco.setPersona(paco);
        assertEquals( paco.getAdreçaFacturacio(), adPaco);
        //---------------------------------------------------------------
        // verifiquem l'altre direcció 
        assertEquals( adPaco.getPersona(), paco );
        //---------------------------------------
        //paco.setAdreçaFacturacio(adMaria);
        adMaria.setPersona(paco);
        assertEquals( paco.getAdreçaFacturacio(), adMaria);
        assertEquals( adPaco.getPersona(), null );
        assertEquals( adMaria.getPersona(), paco );
        assertEquals( maria.getAdreçaFacturacio(), null);
        
    }    
    
    
}
