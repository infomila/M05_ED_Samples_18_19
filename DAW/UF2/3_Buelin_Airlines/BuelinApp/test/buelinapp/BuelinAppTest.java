/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        assertEquals( 0, app.getSobrecostPerEquipatge(null, 0, new int[]{0}, false), 0.001); // No portem res ( :-( )
        assertEquals( 0, app.getSobrecostPerEquipatge(null, 0, null, false), 0.001); // No portem res ( :-( )
        assertEquals( 0, app.getSobrecostPerEquipatge(null, 0, new int[]{}, false), 0.001); // No portem res ( :-( )
        assertEquals( 0, app.getSobrecostPerEquipatge(new int[]{20,20,20}, 15, null, false), 0.001); // Equipatge de mà OK
        assertEquals( 0, app.getSobrecostPerEquipatge(new int[]{30,30,30}, 20, null, false), 0.001); // Equipatge de mà al límit
        assertEquals( 60, app.getSobrecostPerEquipatge(new int[]{31,30,30}, 20, null, false), 0.001); // Equipatge de mà excedint límit
        assertEquals( 60, app.getSobrecostPerEquipatge(new int[]{30,31,30}, 20, null, false), 0.001); // Equipatge de mà excedint límit
        assertEquals( 60, app.getSobrecostPerEquipatge(new int[]{30,30,31}, 20, null, false), 0.001); // Equipatge de mà excedint límit
        assertEquals( 20, app.getSobrecostPerEquipatge(new int[]{30,30,30}, 21, null, false), 0.001); // Equipatge de mà excedint pes
        assertEquals( 100, app.getSobrecostPerEquipatge(new int[]{31,31,31}, 22, null, false), 0.001); // Equipatge de mà , excès total
        assertEquals( 0, app.getSobrecostPerEquipatge(null, 0, new int[]{15}, false), 0.001); // Maletes dins dels límits
        assertEquals( 0, app.getSobrecostPerEquipatge(null, 0, new int[]{15,15}, false), 0.001); // Maletes dins dels límits
        assertEquals( 0, app.getSobrecostPerEquipatge(null, 0, new int[]{20,20}, false), 0.001); // Maletes dins dels límits
        assertEquals( 150, app.getSobrecostPerEquipatge(null, 0, new int[]{20,20, 15}, false), 0.001); // Maletes, excès per quantitat
        assertEquals( 20, app.getSobrecostPerEquipatge(null, 0, new int[]{21,20}, false), 0.001); // Maletes, excès per pes
        assertEquals( 20, app.getSobrecostPerEquipatge(null, 0, new int[]{20,21}, false), 0.001); // Maletes, excès per pes
        assertEquals( 240, app.getSobrecostPerEquipatge(null, 0, new int[]{21,21,20}, false), 0.001); // Maletes, excès total
        assertEquals( 440, app.getSobrecostPerEquipatge(null, 0, new int[]{21,21,20,20}, false), 0.001); // Maletes, excès total
        assertEquals( 0, app.getSobrecostPerEquipatge(new int[]{20,20,20}, 15, new int[]{15,15}, false), 0.001); // Tot dins dels límits
        assertEquals( 80, app.getSobrecostPerEquipatge(new int[]{32,30,30}, 21, new int[]{15,15}, false), 0.001); // equipatge de mà fora, maletes ok
        assertEquals( 240, app.getSobrecostPerEquipatge(new int[]{20,20,20}, 15, new int[]{21,21,20}, false), 0.001); // equipatge de mà ok, maletes fora
        assertEquals( 320, app.getSobrecostPerEquipatge(new int[]{32,30,30}, 21, new int[]{21,21,20}, false), 0.001); // tot fora
        assertEquals( 322, app.getSobrecostPerEquipatge(new int[]{32,30,30}, 21, new int[]{21,21,20}, true), 0.001); // Pagament amb tarja
        assertEquals( 0, app.getSobrecostPerEquipatge(new int[]{20,20,20}, 15, new int[]{15,15}, true), 0.001); // Tarja informada, però sense pagament

        // Casos erronis
        try {app.getSobrecostPerEquipatge(new int[]{10}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{10,10}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{10,10,10,10}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{-1,20,20}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{20,-1,20}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{20,20,-1}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{0,20,20}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{20,0,20}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{20,20,0}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{20,20,20}, -1, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(new int[]{20,20,20}, 0, null, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(null, 0, new int[]{-1}, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(null, 0, new int[]{10,-1 }, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(null, 0, new int[]{10,10, -1}, false);   fail("error");   }catch(IllegalArgumentException ex){} // 
        try {app.getSobrecostPerEquipatge(null, 0, new int[]{10,0, 10}, false);   fail("error");   }catch(IllegalArgumentException ex){} // 

        
    }
    
}
