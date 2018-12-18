/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class ParkingAppTest {
    
    public ParkingAppTest() {
    }

    @Test
    public void testBuscaLlocLliure() {
        
        // A) Casos negatius
        {
        //    A.1) Casos negatius (sóc soci)
            int placesCodiClient[] = {  10,   10 ,  10,             20,     20,     20,     20 ,        0,     0,       0,  };        
            boolean placesOcupades[]={  true, true, false ,         true,   true,  false,  false,       true,   true, false };
            int placesLongitudCm[]={    200,  201,  200,            200,    201,     200,    201,       200,    201,    200 };
            int resultat = ParkingApp.buscaLlocLliure(10, 200, placesCodiClient, placesLongitudCm, placesOcupades);
            assertEquals(-1, resultat);
        }
        
        {
        //    A.1) Casos negatius (no sóc soci)
            int placesCodiClient[] = {           20,     20,     20,     20 ,        0,     0,       0,  };        
            boolean placesOcupades[]={           true,   true,  false,  false,       true,   true, false };
            int placesLongitudCm[]={             200,    201,     200,    201,       200,    201,    200 };
            int resultat = ParkingApp.buscaLlocLliure(0, 200, placesCodiClient, placesLongitudCm, placesOcupades);
            assertEquals(-1, resultat);
        }
        // B) Casos en els que puc aparcar
        {
        //    B.1) No sóc soci
            int placesCodiClient[] = {      0 , 0, 0      };        
            boolean placesOcupades[]={      false  , false , false    };
            int placesLongitudCm[]={         201   , 201, 201  };
            int resultat = ParkingApp.buscaLlocLliure(0, 200, placesCodiClient, placesLongitudCm, placesOcupades);
            assertEquals(0, resultat);
        }
        {
        //    B.2) Sóc soci , plaça pública
            int placesCodiClient[] = {      0 , 0, 0      };        
            boolean placesOcupades[]={      false  , false , false    };
            int placesLongitudCm[]={         201   , 201, 201  };
            int resultat = ParkingApp.buscaLlocLliure(10, 200, placesCodiClient, placesLongitudCm, placesOcupades);
            assertEquals(0, resultat);
        }        
        {
        //    B.3) Sóc soci , plaça private
            int placesCodiClient[] = {      10 ,    10,     10      };        
            boolean placesOcupades[]={      true  , false , false    };
            int placesLongitudCm[]={         201   , 201,   201  };
            int resultat = ParkingApp.buscaLlocLliure(10, 200, placesCodiClient, placesLongitudCm, placesOcupades);
            assertEquals(1, resultat);
        }          
        //-----------------------------------------------------------------------------------------------------------
        // Joc de proves de casos erronis !
        {
        //    B.3) Sóc soci , plaça private
            int placesCodiClient[] = {      10 ,    10,     10      };        
            boolean placesOcupades[]={      true  , false , false    };
            int placesLongitudCm[]={         201   , 201,   201  };
            assertEquals(-2, ParkingApp.buscaLlocLliure(-1, 200, placesCodiClient, placesLongitudCm, placesOcupades));
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 99, placesCodiClient, placesLongitudCm, placesOcupades));
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, null, placesLongitudCm, placesOcupades));
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, placesCodiClient, null, placesOcupades));
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, placesCodiClient, placesLongitudCm, null));
            //--------------------------------------------------------------------------------------------------
            int placesCodiClient2[] = {      10 ,    10     };        
            boolean placesOcupades2[]={      true  , false   };
            int placesLongitudCm2[]={         201   , 201};            
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, placesCodiClient2, placesLongitudCm2, placesOcupades2));
            
            //--------------------------------------------------------------------------------------------------
            int placesCodiClient4[] = {      10 ,    10,     10    , 10  };        
            boolean placesOcupades4[]={      true  , false , false   , false };
            int placesLongitudCm4[]={         201   , 201,   201  , 201};
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, placesCodiClient4, placesLongitudCm, placesOcupades));
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, placesCodiClient, placesLongitudCm4, placesOcupades));
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, placesCodiClient, placesLongitudCm, placesOcupades4));
            //--------------------------------------------------------------------------------------------------
            int placesCodiClientNeg[] = {      -1 ,    -1,     -1     };                    
            int placesLongitudCmNeg[]= {      -1 ,    -1,     -1     };  
            int placesLongitudCmPetit[]= {      99 ,    99,     99     };  

            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, placesCodiClientNeg, placesLongitudCm, placesOcupades));
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, placesCodiClient, placesLongitudCmNeg, placesOcupades));
            assertEquals(-2, ParkingApp.buscaLlocLliure(0, 200, placesCodiClient, placesLongitudCmPetit, placesOcupades));
            
            
        }    
        
        
    }
    
}
