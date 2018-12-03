
package buelinapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class BuelinAppTest {
    
    public BuelinAppTest() {
    }

    @Test
    public void testGetSobrecostPerEquipatge() {
        
        BuelinApp app = new BuelinApp();
        float cost;

        // casos OK
        assertEquals( 0 , app.getSobrecostPerEquipatge(null, 10, null,false), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(null, 10, new int[]{},false), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(null, 10, new int[]{0},false), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(new int[]{20,20,20}, 10, new int[]{0},false), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(new int[]{20,20,20}, 10, new int[]{0},false), 0.001);
        assertEquals( 20 , app.getSobrecostPerEquipatge(new int[]{20,20,20}, 10, new int[]{0},false), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(new int[]{30,30,30}, 10, new int[]{0},false), 0.001);
        assertEquals( 60 , app.getSobrecostPerEquipatge(new int[]{31,15,15}, 10, new int[]{0},false), 0.001);
        assertEquals( 60 , app.getSobrecostPerEquipatge(new int[]{15,31,15}, 10, new int[]{0},false), 0.001);
        assertEquals( 60 , app.getSobrecostPerEquipatge(new int[]{15,15,31}, 10, new int[]{0},false), 0.001);
        assertEquals( 120 , app.getSobrecostPerEquipatge(new int[]{15,15,31}, 10, new int[]{0},false), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(null, 10, new int[]{15},false), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(null, 10, new int[]{15,15},false), 0.001);
        assertEquals( 150 , app.getSobrecostPerEquipatge(null, 10, new int[]{15,15,15},false), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(null, 10, new int[]{20,20},false), 0.001);
        assertEquals( 20 , app.getSobrecostPerEquipatge(null, 10, new int[]{21,20},false), 0.001);
        assertEquals( 40 , app.getSobrecostPerEquipatge(null, 10, new int[]{21,21},false), 0.001);
        assertEquals( 190 , app.getSobrecostPerEquipatge(null, 10, new int[]{21,21,15},false), 0.001);
        assertEquals( 340 , app.getSobrecostPerEquipatge(null, 10, new int[]{21,21,15,15},false), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(new int[]{20,20,20}, 10, new int[]{15,15},false), 0.001);
        assertEquals( 220 , app.getSobrecostPerEquipatge(new int[]{31,30,30}, 10, new int[]{21,21,10},false), 0.001);
        assertEquals( 222 , app.getSobrecostPerEquipatge(new int[]{31,30,30}, 10, new int[]{21,21,10},true), 0.001);
        assertEquals( 0 , app.getSobrecostPerEquipatge(new int[]{20,20,20}, 10, new int[]{15,15},true), 0.001);

        // casos amb entrada errònia

        try { app.getSobrecostPerEquipatge(new int[]{}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{10}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{10,10}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{10,10,10,10}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{-1,15,15}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{15,-1,15}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{15,15,-1}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{0,15,15}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{15,0,15}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{15,15,0}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{15,15,15}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(null, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(new int[]{15,15,15}, 10, new int[]{0},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(null, 0, new int[]{-1},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(null, 0, new int[]{15,-1},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(null, 0, new int[]{15,15,-1},false); fail(""); } catch(IllegalArgumentException e){}//
        try { app.getSobrecostPerEquipatge(null, 0, new int[]{15,0,15},false); fail(""); } catch(IllegalArgumentException e){}//



    }

 
    
}
