/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_parking;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class AparqueitorTest {
    
    public AparqueitorTest() {
    }

    @Test
    public void testBuscaLlocLliure() {
        
        {
            int placesCodiClient[] = {  10,     10,     10,     60,     60,     60,     60  , 0,    0,      0      };
            boolean placesOcupades[] = { true,  true,  false,   true,   true,   false, false, true, true,   false  };        
            int placesLongitudCm[] = {   200,   201 ,   200,    200,    201,    200,    201 , 201,  200,    200 };

           int resultat =  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClient , placesLongitudCm, placesOcupades);
           assertEquals( -1, resultat );
        }
       //--------------------------------------------------------------------------
        {
            int placesCodiClient[] = {      60,     60,     60,     60  , 0,    0,      0      };
            boolean placesOcupades[] = {    true,   true,   false, false, true, true,   false  };        
            int placesLongitudCm[] = {      200,    201,    200,    201 , 201,  200,    200 };

           int resultat =  Aparqueitor.buscaLlocLliure(0, 200,placesCodiClient , placesLongitudCm, placesOcupades);
           assertEquals( -1, resultat );
        }       
       //--------------------------------------------------------------------------
        {
            int placesCodiClient[] = {      0   , 0, 0};
            boolean placesOcupades[] = {    false , false, false};        
            int placesLongitudCm[] = {      201 , 200,200 };

           int resultat =  Aparqueitor.buscaLlocLliure(0, 200,placesCodiClient , placesLongitudCm, placesOcupades);
           assertEquals( 0, resultat );
        }       
       //--------------------------------------------------------------------------       
       {
            int placesCodiClient[] = {      0  ,  0, 0 };
            boolean placesOcupades[] = {    false , false, false};             
            int placesLongitudCm[] = {      201  , 200,200 };

           int resultat =  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClient , placesLongitudCm, placesOcupades);
           assertEquals( 0, resultat );
        }       
       //--------------------------------------------------------------------------    
        {
            int placesCodiClient[] = {    10,   10   , 10};
            boolean placesOcupades[] = {  true,   false , false};        
            int placesLongitudCm[] = {    201,   201 , 201 };

           int resultat =  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClient , placesLongitudCm, placesOcupades);
           assertEquals( 1, resultat );
        }       
       //--------------------------------------------------------------------------           
       // Provem els casos d'error 
       //--------------------------------------------------------------------------
       {
            int placesCodiClient[] = {    10,   10   };
            boolean placesOcupades[] = {  true,   false };        
            int placesLongitudCm[] = {    201,   201  };

           assertEquals(-2,  Aparqueitor.buscaLlocLliure(-1, 200,placesCodiClient , placesLongitudCm, placesOcupades));
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, 99,placesCodiClient , placesLongitudCm, placesOcupades));
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, -1,placesCodiClient , placesLongitudCm, placesOcupades));
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, -1,null , placesLongitudCm, placesOcupades));
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, -1,placesCodiClient , null, placesOcupades));
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, -1,placesCodiClient , placesLongitudCm, null));
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClient , placesLongitudCm, placesOcupades));
           
           int placesCodiClient3[] = {    10,   10  , 10 };
           boolean placesOcupades3[] = {  true,   false, false };        
           int placesLongitudCm3[] = {    201,   201 , 201 };

           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClient3 , placesLongitudCm, placesOcupades));
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClient , placesLongitudCm3, placesOcupades));
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClient , placesLongitudCm, placesOcupades3));

           int placesCodiClientNeg[] = {    -10,   -10  , -10 };
            assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClientNeg , placesLongitudCm, placesOcupades));

           int placesLongitudCmNeg[] = {    -201,   -201 , -201 };
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClient , placesLongitudCmNeg, placesOcupades));
           
           int placesLongitudCmLim[] = {    99,   99 , 99 };
           assertEquals(-2,  Aparqueitor.buscaLlocLliure(10, 200,placesCodiClient , placesLongitudCmLim, placesOcupades));
           
           
        }
       
       
    }
    
}
