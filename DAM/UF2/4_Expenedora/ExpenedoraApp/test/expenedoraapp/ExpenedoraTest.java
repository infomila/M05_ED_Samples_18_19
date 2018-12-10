/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenedoraapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class ExpenedoraTest {
    
    public ExpenedoraTest() {
    }

    @Test
    public void testPagarMetalic() {
        
        provaUnCas(4 , new byte[]{0,0,4}, new byte[]{0,0,0}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,0,0}, new byte[]{0,0,4});
        provaUnCas(15 , new byte[]{0,3,0}, new byte[]{0,0,0}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,0,0}, new byte[]{0,3,0});
        provaUnCas(100 , new byte[]{2,0,0}, new byte[]{0,0,0}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,0,0}, new byte[]{2,0,0});
        provaUnCas(157 , new byte[]{3,1,2}, new byte[]{0,0,0}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,0,0}, new byte[]{3,1,2});

        provaUnCas(7 , new byte[]{0,2,0}, new byte[]{0,0,3}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,0,3}, new byte[]{0,2,0});
        provaUnCas(45 , new byte[]{1,0,0}, new byte[]{0,1,0}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,1,0}, new byte[]{1,0,0});
        provaUnCas(100 , new byte[]{3,0,0}, new byte[]{0,0,0}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{1,0,0}, new byte[]{2,0,0});
        provaUnCas(43 , new byte[]{1,0,0}, new byte[]{0,1,2}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,1,2}, new byte[]{1,0,0});
        provaUnCas(40 , new byte[]{1,0,0}, new byte[]{0,2,10}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,2,0}, new byte[]{1,0,10});
        provaUnCas(40 , new byte[]{1,0,0}, new byte[]{0,1,5}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,1,5}, new byte[]{1,0,0});
        provaUnCas(40 , new byte[]{1,0,0}, new byte[]{0,0,10}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,0,10}, new byte[]{1,0,0});
        provaUnCas(15 , new byte[]{0,4,0}, new byte[]{0,0,0}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,1,0}, new byte[]{0,3,0});
        provaUnCas(15 , new byte[]{0,2,6}, new byte[]{0,0,0}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,0,1}, new byte[]{0,2,5});
        provaUnCas(14 , new byte[]{0,4,0}, new byte[]{0,0,1}, TipusCanvi.VENDA_OK_CANVI_EXACTE , new byte[]{0,1,1}, new byte[]{0,3,0});

        provaUnCas(20 , new byte[]{1,0,0}, new byte[]{0,0,0}, TipusCanvi. VENDA_OK_NO_TE_CANVI , new byte[]{0,0,0}, new byte[]{1,0,0});
        provaUnCas(18 , new byte[]{0,4,0}, new byte[]{0,0,1}, TipusCanvi. VENDA_OK_NO_TE_CANVI , new byte[]{0,0,1}, new byte[]{0,4,0});
        provaUnCas(70 , new byte[]{2,0,0}, new byte[]{3,0,0}, TipusCanvi. VENDA_OK_NO_TE_CANVI , new byte[]{0,0,0}, new byte[]{5,0,0});
        provaUnCas(70 , new byte[]{2,0,0}, new byte[]{0,4,5}, TipusCanvi. VENDA_OK_NO_TE_CANVI , new byte[]{0,4,5}, new byte[]{2,0,0});

        provaUnCas(10 , new byte[]{0,0,0}, new byte[]{0,0,0}, TipusCanvi.VENDA_FAIL_IMPORT_INSUFICIENT, new byte[]{0,0,0}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{0,1,4}, new byte[]{0,0,0}, TipusCanvi.VENDA_FAIL_IMPORT_INSUFICIENT, new byte[]{0,1,4}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{0,1,0}, new byte[]{0,0,0}, TipusCanvi.VENDA_FAIL_IMPORT_INSUFICIENT, new byte[]{0,1,0}, new byte[]{0,0,0});

        provaUnCas(0 , new byte[]{1,1,1}, new byte[]{0,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(-10 , new byte[]{1,1,1}, new byte[]{0,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{-1,1,1}, new byte[]{0,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,-1,1}, new byte[]{0,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,1,-1}, new byte[]{0,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,1,1}, new byte[]{-1,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,1,1}, new byte[]{0,-1,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,1,1}, new byte[]{0,0,-1}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , null, new byte[]{0,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,1,1}, null, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,1}, new byte[]{0,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,1,1}, new byte[]{0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,1,1,1}, new byte[]{0,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
        provaUnCas(10 , new byte[]{1,1,1}, new byte[]{0,0,0,0}, TipusCanvi. VENDA_FAIL_ERROR_DADES, new byte[]{1,1,1}, new byte[]{0,0,0});
                        
    }

    private void provaUnCas(int preu, byte[] monedesClient, byte[] monedesCaixa, TipusCanvi resultat, byte[] monedesCanvi, byte[] monedesCaixaResultants) {
        TipusCanvi r = Expenedora.pagarMetalic(preu, monedesClient, monedesCaixa);
        assertEquals(resultat , r);
        if(resultat != TipusCanvi.VENDA_FAIL_ERROR_DADES) {
            assertArrayEquals(monedesCanvi, monedesClient);
            assertArrayEquals(monedesCaixaResultants, monedesCaixa );
        }
    }
    
}
