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
        
        // Posem la fàbrica en mode test
        FabricaICobradors.setModeReal(false);
        //------------------------------------
        Factura f = new Factura(123, "1231 1234 1234 1234", 2345.3);
             
        boolean resultat = f.facturar();        
        assertEquals(true, resultat);
        
    }
    
}
