
package projecteempresa;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class EmpleatTest {
    
    public EmpleatTest() {
    }
 
    @Test
    public void testAddProjecte() {
        
        Adreça adPaco = new Adreça(new byte[]{0,8,7,0,0}, "C/ Martiri, n7", "Igualada", "BCN");
        Adreça adMaria = new Adreça(new byte[]{0,8,7,0,0}, "C/ Dolors, n56", "Igualada", "BCN");
        //---------------------        
        Empleat paco = new Empleat(10,new BigDecimal(120) , 1, "11111111H","Paco", "Maroto", new Date(), adPaco);
        Empleat maria = new Empleat(20,new BigDecimal(120), 1, "12345678Z","Maria", "Marango", new Date(), adMaria);
        //---------------------------
        
        Projecte p1 = new Projecte(maria, 1, "P1");
        Projecte p2 = new Projecte(maria, 1, "P2");
        
        //-----------------------------------------------------------------
        p1.addEmpleat(paco);        
        assertEquals( paco , p1.getEmpleat(0) );
        assertEquals( paco.getProjecte(0), p1 );
        //-----------------------------------------------------------------        
        System.out.println("ZZZZZZZZZZZZZZZZZZZ");
        
        maria.addProjecte(p2);
        assertEquals(p2.getEmpleat(0), maria  );
        assertEquals( maria.getProjecte(0), p2);        
        
        
    }

    @Test
    public void testRemoveProjecte() {
        
        Adreça adPaco = new Adreça(new byte[]{0,8,7,0,0}, "C/ Martiri, n7", "Igualada", "BCN");
        Adreça adMaria = new Adreça(new byte[]{0,8,7,0,0}, "C/ Dolors, n56", "Igualada", "BCN");
        //---------------------        
        Empleat paco = new Empleat(10,new BigDecimal(120) , 1, "11111111H","Paco", "Maroto", new Date(), adPaco);
        Empleat maria = new Empleat(20,new BigDecimal(120), 1, "12345678Z","Maria", "Marango", new Date(), adMaria);
        //---------------------------
        
        Projecte p1 = new Projecte(maria, 1, "P1");
        Projecte p2 = new Projecte(maria, 1, "P2");
        
        //-----------------------------------------------------------------
        p1.addEmpleat(paco);               
        maria.addProjecte(p2);
        //-----------------------------------------------------------------
        paco.removeProjecte(p1);
        assertEquals( paco.getNumProjectes(), 0  );
        assertEquals( p1.getNumEmpleats(), 0  );
        //-----------------------------------------------------------------
        p2.removeEmpleat(maria);
        assertEquals( maria.getNumProjectes(), 0  );
        assertEquals( p2.getNumEmpleats(), 0  );
    }
 
    
}
