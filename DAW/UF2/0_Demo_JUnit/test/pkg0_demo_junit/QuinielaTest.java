/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0_demo_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
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
        // verificar que resultat és X
        assertEquals('X', resultat);
        //-----------------------------------------------
        resultat = Quiniela.getSigne(1, 0);
        assertEquals('1', resultat);
        //-----------------------------------------------
        resultat = Quiniela.getSigne(0,1);
        assertEquals('2', resultat);
        //-----------------------------------------------
        try {
            resultat = Quiniela.getSigne(-10,-2);
            fail("La funció no controla gols fora de rang");
        } catch(Exception ex) {
            
        }
    }
    
}
