/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_teatre;

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
public class TarificadorTest {
    
    public TarificadorTest() {
    }
    

    /**
     * Test of getPreu method, of class Tarificador.
     */
    @Test
    public void testGetPreu() {

        Tarificador t = new Tarificador();
        double preu = t.getPreu(1, 2);
        assertEquals(0, preu,0.001);
        
        
    }
    
}
