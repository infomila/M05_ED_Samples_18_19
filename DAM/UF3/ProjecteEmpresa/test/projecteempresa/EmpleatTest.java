
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
        
        Adreça adPaco = new Adreça(new byte[]{0,8,7,0,0},"C/Capdevall 4", "Igualada", "Barcelona" );
        Adreça adMaria = new Adreça(new byte[]{0,8,7,0,0},"C/Santa Maria 7", "Igualada", "Barcelona" );
        
        Empleat paco = new Empleat(
                10, "Capo", new BigDecimal(1000),
                1, "11111111H", "Paco", "Maroto", new Date(), adPaco );
        Empleat maria = new Empleat(
                20, "Jefa", new BigDecimal(1000),
                2, "12345678Z", "Maria", "Mateu", new Date(), adMaria );        
        
        Projecte p1 = new Projecte( 1, "P1", maria);
        Projecte p2 = new Projecte( 2, "P2", maria);
        //------------------------------------------------------------------        
        p1.addEmpleat(paco);
        assertEquals( paco.getProjecte(0), p1 );
        assertEquals( p1.getEmpleat(0), paco);
        //------------------------------------------------------------------
        maria.addProjecte(p2);
        assertEquals( maria.getProjecte(0), p2 );
        assertEquals( p2.getEmpleat(0), maria);
        //------------------------------------------------------------------
        
    }

    @Test
    public void testRemoveProjecte() {
        
        Adreça adPaco = new Adreça(new byte[]{0,8,7,0,0},"C/Capdevall 4", "Igualada", "Barcelona" );
        Adreça adMaria = new Adreça(new byte[]{0,8,7,0,0},"C/Santa Maria 7", "Igualada", "Barcelona" );
        
        Empleat paco = new Empleat(
                10, "Capo", new BigDecimal(1000),
                1, "11111111H", "Paco", "Maroto", new Date(), adPaco );
        Empleat maria = new Empleat(
                20, "Jefa", new BigDecimal(1000),
                2, "12345678Z", "Maria", "Mateu", new Date(), adMaria );        
        
        Projecte p1 = new Projecte( 1, "P1", maria);
        Projecte p2 = new Projecte( 2, "P2", maria);
        //------------------------------------------------------------------        
        p1.addEmpleat(paco);
        maria.addProjecte(p2);
        //------------------------------------------------------------------        
        p1.removeEmpleat(paco);
        assertEquals( paco.getNumProjectesActuals(), 0 );
        assertEquals( p1.getNumEmpleatsActuals(), 0);
        //------------------------------------------------------------------  
        maria.removeProjecte(p2);
        assertEquals( maria.getNumProjectesActuals(), 0 );
        assertEquals( p2.getNumEmpleatsActuals(), 0);
    }    
}
