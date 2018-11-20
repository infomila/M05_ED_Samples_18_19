
package triangle_blackbox;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class TriangleTest {
    
    public TriangleTest() {
    }

    @Test
    public void testGetTipusTriangle() {
        
        Triangle t = new Triangle();
        
        double costats [][] = {
            {2,2,2},
            {2.009,2,2},
            {2.001, 2,2},
            {2,2,1},
            {2,1,2},
            {1,2,2},
            {10,5.005,5.005},
            {2.001,2,1.999},
            {3,5,7},
            {10,1,1},                
        };
        
        TipusTriangle resultats[] = {
            TipusTriangle.EQUILATER,
            TipusTriangle.EQUILATER,
            TipusTriangle.ISOSCELES,
            TipusTriangle.ISOSCELES,
            TipusTriangle.ISOSCELES,
            TipusTriangle.ISOSCELES,
            TipusTriangle.ISOSCELES,
            TipusTriangle.ESCALE,
            TipusTriangle.ESCALE,
            TipusTriangle.NO_ES_TRIANGLE
        };
        
        for(int i=0;i<resultats.length;i++) {
            TipusTriangle tip = t.getTipusTriangle(costats[i][0], costats[i][1], costats[i][2]);
            assertEquals(resultats[i], tip);
        }
        //--------------------------------------------------------------
        double costats_erronis [][] = {
            {0,1,1},{1,0,1},{1,1,0},{0,0,0},{0,0,1},{0,1,0},{1,0,0},
            {-1,1,1},{1,-1,1},{1,1,-1},{-1,-1,-1},{-1,-1,1},{-1,1,-1},{1,-1,-1}             
        };

        for(int i=0;i<costats_erronis.length;i++) {
            
            try {
                TipusTriangle tip = t.getTipusTriangle(costats_erronis[i][0], costats_erronis[i][1], costats_erronis[i][2]);
                fail("Costat erroni no control·lat");
            }
            catch(IllegalArgumentException ex) {}
            
        }        
        
        
    }
    
}
