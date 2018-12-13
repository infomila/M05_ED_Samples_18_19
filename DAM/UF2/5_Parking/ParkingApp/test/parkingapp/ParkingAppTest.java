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
        
        // A) Amb usuari soci
        //    A.1) Casos negatius 
        int placesCodiClient[] = {10, 10 , 10,               20,     20,     20,     20 ,        0,     0,      0,  };        
        boolean placesOcupades[]={true, true, false ,      true,   true,  false,  false,           true,   true, false };
        int placesLongitudCm[]={200, 50, 99,            200,    50,     200,    50,               200,  50,     99};
        int resultat = ParkingApp.buscaLlocLliure(10, 100, placesCodiClient, placesLongitudCm, placesOcupades);
        assertEquals(-1, resultat);
    }
    
}
