/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_teatre_black_box;

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
        

        double resultatsEsperats[][] = 
                {  // 1          2               3              4
                    {0		,0		,0		,0      },  // <4
                    {45		,37.5           ,30		,22.5   },  // 4
                    {45		,37.5           ,30		,22.5   },  // [4 - 12)=
                    {60		,50		,40		,30     }, //12
                    {60		,50		,40		,30     },  // [12-60)
                    {30		,10		,8		,6      }, //60
                    {30		,10		,8		,6      }  // [ 60, inf)
                };
        //---------------------------------------------------------------------------
        
        int edatsProva[] = { 2, 4, 7, 12, 35,60,65 };
        
        for(int e=0; e<edatsProva.length;e++) {
            for(int t=1;t<5;t++) {
                double preu = tar.getPreu(t, edatsProva[e]);
                double esperat = resultatsEsperats[e][t-1];
                assertEquals(esperat, preu , 0.001);
            }
        }
        //-----------------------------------------------------------------------------
        // FORES DE RANG: tipus de seient
        int tipusSeientErronis[] = {-1, 0 , 5, 6 };
        
        for(int e=0; e<edatsProva.length;e++) {
            for(int t=0;t<tipusSeientErronis.length;t++) {
                
                try {
                    double preu = tar.getPreu(tipusSeientErronis[t], edatsProva[e]);
                    fail("Error: no has control·lat el tipus de seient erroni :"+tipusSeientErronis[t]);
                } catch( IllegalArgumentException ex) {
                    /* si  estic aquí, tot va bé */
                }
                
            }
        }
        //-----------------------------------------------------------------------------
        // FORES DE RANG: edat
        int edatsErronies[] = {-1, 0 , 120, 121 };
        
        for(int e=0;e<edatsErronies.length;e++) {
            try {
                double preu = tar.getPreu( 1 , edatsErronies[e]);
                fail("Error: no has control·lat el tipus de seient erroni :"+tipusSeientErronis[e]);
            } catch( IllegalArgumentException ex) {
                /* si  estic aquí, tot va bé */
            }
        }
        
        
    }
    
}
