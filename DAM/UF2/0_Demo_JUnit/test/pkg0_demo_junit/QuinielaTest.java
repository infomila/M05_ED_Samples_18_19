/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0_demo_junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class QuinielaTest {
    
    public QuinielaTest() {
    }

    /**
     * Test of getSigne method, of class Quiniela.
     */
    @Test
    public void testGetSigne() {
    
        char resultat = Quiniela.getSigne(0, 0);
        assertEquals('X', resultat);
        resultat = Quiniela.getSigne(3, 0);
        assertEquals('1', resultat);
        resultat = Quiniela.getSigne(1, 5);
        assertEquals('2', resultat);
        //---------------------------------------
        
        try {
            resultat = Quiniela.getSigne(-1, -5);           
            // si he arribat aquí
            fail("Error, els signes negatius en el resultat no han d'estar admesos");
        }catch(Exception ex){
            // si estic aquí , és normal
        }
                try {
            resultat = Quiniela.getSigne(42, 45);           
            // si he arribat aquí
            fail("Error, els signes negatius en el resultat no han d'estar admesos");
        }catch(Exception ex){
            // si estic aquí , és normal
        }
        
    }
    
}
