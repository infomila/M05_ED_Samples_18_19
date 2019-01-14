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
        
        // Posem la fàbrica en mode test, de tal manera que ens crea objectes falsos.
        FabricaICobradors.setModeReal(false);
        
        //------------------------------------
        {
            //Provem la factura amb una passarel·la que funciona

            boolean resultat = f.facturar();        
            assertEquals(true, resultat);
        }
        //------------------------------------
        // Provem la factura amb una passarel·la que no funciona
        {
            
            FabricaICobradors.setResultatPagamentEnModeFals(false); // el pagament ha de fallar !
        
            boolean resultat = f.facturar();        
            assertEquals(false, resultat);       
        }
    }
    
}
