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

        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 35, new byte[]{0, 0, 35}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 35});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 35, new byte[]{0, 7, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 7, 0});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 100, new byte[]{2, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{2, 0, 0});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 106, new byte[]{2, 1, 1}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{2, 1, 1});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 54, new byte[]{1, 1, 0}, new byte[]{0, 0, 1}, new byte[]{0, 0, 1}, new byte[]{1, 1, 0});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 45, new byte[]{1, 0, 0}, new byte[]{0, 1, 0}, new byte[]{0, 1, 0}, new byte[]{1, 0, 0});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 100, new byte[]{3, 0, 0}, new byte[]{1, 0, 0}, new byte[]{1, 0, 0}, new byte[]{3, 0, 0});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 82, new byte[]{2, 0, 0}, new byte[]{0, 3, 3}, new byte[]{0, 3, 3}, new byte[]{2, 0, 0});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 82, new byte[]{2, 0, 0}, new byte[]{0, 100, 100}, new byte[]{0, 3, 3}, new byte[]{2, 97, 97});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 82, new byte[]{2, 0, 0}, new byte[]{0, 0, 100}, new byte[]{0, 0, 18}, new byte[]{2, 0, 82});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 82, new byte[]{2, 0, 0}, new byte[]{0, 2, 100}, new byte[]{0, 2, 8}, new byte[]{2, 0, 92});
        provaUnCas(TipusCanvi.VENDA_OK_CANVI_EXACTE, 4, new byte[]{0, 1, 1}, new byte[]{0, 0, 1}, new byte[]{0, 0, 2}, new byte[]{0, 1, 0});

        provaUnCas(TipusCanvi.VENDA_OK_NO_TE_CANVI, 4, new byte[]{0, 1, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 1, 0});
        provaUnCas(TipusCanvi.VENDA_OK_NO_TE_CANVI, 35, new byte[]{1, 0, 0}, new byte[]{1, 2, 1}, new byte[]{0, 2, 1}, new byte[]{2, 0, 0});

        provaUnCas(TipusCanvi.VENDA_OK_NO_TE_CANVI, 1, new byte[]{0, 1, 0}, new byte[]{100, 100, 0}, new byte[]{0, 0, 0}, new byte[]{100, 101, 0});

        provaUnCas(TipusCanvi.VENDA_FAIL_IMPORT_INSUFICIENT, 14, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_IMPORT_INSUFICIENT, 14, new byte[]{0, 2, 3}, new byte[]{0, 0, 0}, new byte[]{0, 2, 3}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_IMPORT_INSUFICIENT, 100, new byte[]{1, 3, 0}, new byte[]{0, 0, 0}, new byte[]{1, 3, 0}, new byte[]{0, 0, 0});

        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, -10, new byte[]{1, 1, 1}, new byte[]{0, 0, 0}, new byte[]{1, 1, 1}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{-1, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{0, -1, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{0, 0, -1}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{0, 0, 0}, new byte[]{-1, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{0, 0, 0}, new byte[]{0, -1, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{0, 0, 0}, new byte[]{0, 0, -1}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});

        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, null, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{1, 1}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{1, 1, 1, 1}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{1, 1, 1}, null, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{1, 1, 1}, new byte[]{0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});
        provaUnCas(TipusCanvi.VENDA_FAIL_ERROR_DADES, 10, new byte[]{1, 1, 1}, new byte[]{0, 0, 0, 0}, new byte[]{0, 0, 0}, new byte[]{0, 0, 0});

    }

    private void provaUnCas(TipusCanvi resultat, int preu, byte[] monedesClient, byte[] monedesCaixa, byte[] expectedClient, byte[] expectedCaixa) {
        TipusCanvi t = Expenedora.pagarMetalic(preu, monedesClient, monedesCaixa);
        assertEquals(resultat, t);
        // Només té sentit mirar si la resposta és correcta quan el resultat no és error
        if (resultat != TipusCanvi.VENDA_FAIL_ERROR_DADES) {
            assertArrayEquals(expectedClient, monedesClient);
            assertArrayEquals(expectedCaixa, monedesCaixa);
        }

        //----------------------------------------------------------------------
    }

}
