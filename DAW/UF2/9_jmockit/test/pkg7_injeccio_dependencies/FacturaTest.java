/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_injeccio_dependencies;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Verifications;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class FacturaTest {
    
    public FacturaTest() {
    }
    // Activar per a funcionar amb Expectations
    //@Mocked PassarellaPagament pas;
    
    @Test
    public void testFacturar() {  
        /*
        //--------------------------------------------------------------------
        // El bloc Expectations va dins del test, abans del codi de test
        new NonStrictExpectations() {{
            //pas.cobrar(anyString, anyDouble);result=true;

            //Programar els resultats de "cobrar" segons l'ordre d'execució
            //pas.cobrar(anyString, anyDouble);returns(true,false);
            
            // Programar els resultats de "cobrar" segons els valors dels paràmetres.
            // a) programem el número de VISA pel qual esperem que hi hagi un error de pagament.
            pas.cobrar("666", anyDouble); result = false;
            // b) programem la resta de casos on volem que funcioni la passarel·la.
            pas.cobrar(anyString, anyDouble); result = true;
            
        }};
        */        
        //--------------------------------------------------------------------
        // Versió amb falsificació de classe
        //--------------------------------------------------------------------
        new MockUp<PassarellaPagament>(){
            
            @Mock // estic falsificant el mètode
            public boolean cobrar(String VISA, double importTotal) {
                return !VISA.equals("666");
            }
        };
        
                
        //------------------------------------
        {
            Factura f = new Factura(100, "111111111111");
            //Provem la factura amb una passarel·la que funciona
            boolean resultat = f.facturar();        
            assertEquals(true, resultat);
        }
        //------------------------------------
        // Provem la factura amb una passarel·la que no funciona
        {
            Factura f = new Factura(100, "666");
            boolean resultat = f.facturar();        
            assertEquals(false, resultat);       
        }
        //------------------------------------
        {
            Factura f = new Factura(100, "22222");
            //Provem la factura amb una passarel·la que funciona
            boolean resultat = f.facturar();        
            assertEquals(true, resultat);
        }
        //------------------------------------
        // Provem la factura amb una passarel·la que no funciona
        {
            Factura f = new Factura(100, "666");
            boolean resultat = f.facturar();        
            assertEquals(false, resultat);       
        }      
        
        //---------------------------------------------------
        // Bloc de verificacions
        /*new Verifications() {{
            pas.rollback();
        }};*/
    }
    
}
