package pkg7_injeccio_dependencies;

import org.junit.Test;
import static org.junit.Assert.*;
import mockit.Mocked;
import mockit.Expectations;
import mockit.NonStrictExpectations;
import mockit.Verifications;
import mockit.MockUp;
import mockit.Mock;
/**
 *
 * @author Usuari
 */
public class FacturaTest {
    
    public FacturaTest() {
    }

    // Desactivem QUALSEVOL utilització de la clase Passarellapagament durant el test.
    //@Mocked PassarellaPagament pas;
    
    @Test
    public void testFacturar() {
        
        new MockUp<PassarellaPagament>() {
            
            @Mock // indica que estem falsificant/reemplançant el mètode original
            public boolean cobrar(String VISA, double importTotal ) {
                if(VISA.equals("666")) {
                    return false; // PETA.
                } else {
                    return true; // PER A QUASEVOL ALTRE CAS, FUNCIONA.
                }
            }              
        };
        
        
        //--------------------------------------------------
        // Abans de començar el test, enregistrem les respostes
        // que han de donar les funcions falsificades.
        //   EXPECTATIONS
        //          Estrictes: Expectations
        //          No estrictes: NonStrictExpectations
        //--------------------------------------------------
        /*new NonStrictExpectations(){{
            //A) per a qualsevol crida de la funció cobrar, retorna sempre "cert"
            //pas.cobrar(anyString, anyDouble); result = true;
            
            // B) domen una llista de valors "precarregats" que la funció anirà retornant
            //    per a cada crida.
            //pas.cobrar(anyString, anyDouble); returns( true, false );
            
            // C) també podem especificar els valors retornats en funció dels paràmetres de la funció:
            // Si la VISA és 666, fem rebentar el test.
            pas.cobrar("666", anyDouble); result = false;
            // Per a qualsevol altre cas, diem que la passarel·la funciona
            pas.cobrar(anyString, anyDouble); result = true;
        }};*/
        
        
        //------------------------------------------------------
        // Prova de facturació correcta
        {
            Factura f = new Factura(123, "1231 1234 1234 1234", 2345.3);

            boolean resultat = f.facturar();        
            assertEquals(true, resultat);
        }
        //---------------------------------------
        // Prova de facturació amb error a la passarel·la.
        {
            Factura f = new Factura(123, "666", 2345.3);
            boolean resultat = f.facturar();        
            assertEquals(false, resultat);
        }
        
        //-------------------------------------------------
        // JMockit permet fer validacions posteriorment al test
        /*new Verifications() {{
            pas.rollback();
        }};*/
        
        
        
    }
    
}
