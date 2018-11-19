/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_teatre;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class TarificadorTest {
    
    public TarificadorTest() {
    }

    @Test
    public void testGetPreu() {
        
        Tarificador tar = new Tarificador();
        double preu;
        double valorEsperat;
        
        double preusTest[][] = new double[][]        
                //platea laterals   primer   segon
            {
                {0	,0	    , 0     ,0      }, // <4
                {45	,37.5       ,30     ,22.5   }, //  4
                {45	,37.5       ,30     ,22.5   }, //  [4-12)
                {60	,50	    ,40     ,30     }, //  12
                {60	,50	    ,40     ,30     }, //  [12-60)
                {30	,10	    ,8      ,6      }, //  60
                {30	,10	    ,8      ,6      }  //  >60
            };
        
        
        int edatsTest[] = new int[]{2,4, 6,12, 30, 60, 65};
        //-----------------------------------------------
        for(int t=0;t<4;t++) {
            for(int e=0;e<edatsTest.length;e++) {
                preu = tar.getPreu(t+1, edatsTest[e]);
                
                valorEsperat = preusTest[e][t];
                
                assertEquals("error amb tipus seient " + (t+1) + 
                                " i edat "+ edatsTest[e] + 
                                 " e=" +e , valorEsperat, preu , 0.001);        
            }
        }
        
        //---------------------------------------------------
        // fores de rang de seient
        int tipusSeientErronis[] = new int[]{0,5,-1, 6};
        for(int t=0;t<tipusSeientErronis.length;t++) {
            for(int e=0;e<edatsTest.length;e++) {
                
                try {
                    preu = tar.getPreu(tipusSeientErronis[t], edatsTest[e]);
                    //
                    fail("No es  gestiona el tipus de seient erroni :"+ tipusSeientErronis[t] );
                } catch( IllegalArgumentException ex) { /* si estic aquí, tot va bé */}
            }
        }
        //---------------------------------------------------
        // fores de rang per edat
        try {
            preu = tar.getPreu(1, 120);
            //
            fail("No es  gestiona el fora de rang per edat (120 anys)");
        } catch( IllegalArgumentException ex) { /* si estic aquí, tot va bé */}        
        try {
            preu = tar.getPreu(1, -1);
            //
            fail("No es  gestiona el fora de rang per edat (-1 anys)");
        } catch( IllegalArgumentException ex) { /* si estic aquí, tot va bé */}        
        //--------------------------------
  
    }
    
}
