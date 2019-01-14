/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_injeccio_dependencies;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class FacturaTest {
    
    public FacturaTest() {
    }

    @Test
    public void testFacturar() {       
        Factura f = new Factura();
        //------------------------------------
        {
            //Provem la factura amb una passarel·la que funciona
            PassarellaPagamentFake fake = new PassarellaPagamentFake(true);
            boolean resultat = f.facturar(fake);        
            assertEquals(true, resultat);
        }
        //------------------------------------
        // Provem la factura amb una passarel·la que no funciona
        {
            PassarellaPagamentFake fake = new PassarellaPagamentFake(false);
            boolean resultat = f.facturar(fake);        
            assertEquals(false, resultat);       
        }
    }
    
}
