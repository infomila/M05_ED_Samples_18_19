package trianglemania;

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
        
        
        double costatsOK[][] = {
                {2	,2	,2} , 
                {2	,2	,2.0009} , 
                {10	,5.001	,5.001} , 
                {2	,2	,2.001} , 
                {4	,4	,2} , 
                {4	,2	,4} , 
                {2	,4	,4} , 
                {4	,2	,4.0009} , 
                {10	,5	,7} , 
                {4	,2	,2.001} , 
                {10	,1	,1} , 
                {10	,5	,5} 
        };
        
        TipusTriangle resultatsOK[] = {
            TipusTriangle.EQUILATER     ,
            TipusTriangle.EQUILATER     ,
            TipusTriangle.ISOSCELES     ,
            TipusTriangle.ISOSCELES     ,
            TipusTriangle.ISOSCELES     ,
            TipusTriangle.ISOSCELES     ,
            TipusTriangle.ISOSCELES     ,
            TipusTriangle.ISOSCELES     ,
            TipusTriangle.ESCALE        ,
            TipusTriangle.ESCALE        ,
            TipusTriangle.NO_ES_TRIANGLE,
            TipusTriangle.NO_ES_TRIANGLE
        };
        

        double costatsERR[][] = {
                {-2	,2	,2} , 
                {2	,-2	,2} , 
                {2	,2	,-2} , 
                {0	,2	,2} , 
                {2	,0	,2} , 
                {2	,2	,0} , 
                {-2	,-2	,-2} , 
                {0	,0	,0} 
        };
        //-------------------------------------------------
        // Test dels triangles amb dades correctes
        for(int i=0;i<resultatsOK.length;i++) {
             TipusTriangle tip = Triangle.getTipusTriangle(
                     costatsOK[i][0],
                     costatsOK[i][1],
                     costatsOK[i][2]);
            assertEquals("Error amb:" 
                    +costatsOK[i][0]+", "+
                     costatsOK[i][1]+", "+
                     costatsOK[i][2]+"." 
                    , resultatsOK[i], tip );       
        }
        //-------------------------------------------------
        // Test dels triangles amb errors
        for(int i=0;i<costatsERR.length;i++) {
            try {
                TipusTriangle tip = Triangle.getTipusTriangle(
                        costatsERR[i][0],
                        costatsERR[i][1],
                        costatsERR[i][2]);
                // no he d'arribar a aquesta línia, els casos
                // són tots erronis !!!
                fail("Combinacion de costats errònia no controlada:"+
                       costatsERR[i][0]+","+
                        costatsERR[i][1]+","+
                        costatsERR[i][2]+"." );
            } catch (IllegalArgumentException e) {
                // TOT VA BÉ
            }
        }

    }
    
}
