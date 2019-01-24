package net.iesmila.ED.UF2.fabrica;

import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Verifications;
import org.junit.Test;
import static org.junit.Assert.*;


public class LectorTest {
    
    public LectorTest() {
    }

    /**
     * Test of extreuParaulesAmbDefinicio method, of class Lector.
     */
//    @Mocked DiccionariOnline diccionari;
    
    @Test
    public void testInformeText() {
//        
//        new NonStrictExpectations() {{
//            
//            /*diccionari.getTipusParaula(anyString);returns(TipusParaula.ARTICLE, 
//                                                TipusParaula.NOM,
//                                                TipusParaula.CONJUNCIO , 
//                                                TipusParaula.ARTICLE,
//                                                TipusParaula.NOM,
//                                                TipusParaula.VERB,
//                                                TipusParaula.CONJUNCIO,
//                                                TipusParaula.NOM
//                                                );*/
//            
//            diccionari.getTipusParaula("El"); result = TipusParaula.ARTICLE;
//            diccionari.getTipusParaula("gos"); result = TipusParaula.NOM;
//            diccionari.getTipusParaula("i"); result = TipusParaula.CONJUNCIO;
//            diccionari.getTipusParaula("el"); result = TipusParaula.ARTICLE;
//            diccionari.getTipusParaula("gat"); result = TipusParaula.NOM;
//            diccionari.getTipusParaula("viuen"); result = TipusParaula.VERB;
//            diccionari.getTipusParaula("a"); result = TipusParaula.CONJUNCIO;
//            diccionari.getTipusParaula("casa"); result = TipusParaula.NOM;
//             
//            
//            /*diccionari.getDescripcio(anyString); returns (  "mamifer cannid",
//                                                            "mamifer feli",
//                                                            "llar dolça llar"
//                                                            );*/          
//            diccionari.getDescripcio("gat"); result = "mamifer feli";
//            diccionari.getDescripcio("gos"); result = "mamifer cannid";
//            diccionari.getDescripcio("casa"); result = "llar dolça llar";
//        }};
//        
        
        // creem una nova classe falsa per reemplaçar el DiccionariOnline
        new MockUp<DiccionariOnline> () {
            
            @Mock
            public TipusParaula getTipusParaula(String paraula) {
                switch(paraula.toLowerCase()) {
                    case "el": return TipusParaula.ARTICLE;
                    case "gos": return TipusParaula.NOM;
                    case "i": return TipusParaula.CONJUNCIO;
                    case "gat": return TipusParaula.NOM;
                    case "viuen": return TipusParaula.VERB;
                    case "a": return TipusParaula.CONJUNCIO;
                    case "casa": return TipusParaula.NOM;                        
                }
                return TipusParaula.CONJUNCIO;
            }

            @Mock
            public String getDescripcio(String paraula) {
                switch(paraula) {
                    case "gos":     return "mamifer cannid";
                    case "gat":     return "mamifer feli";
                    case "casa":    return "llar dolça llar";
                }
                return "";
            }
        };

        Lector l = new Lector();
        String informeObtingut = l.extreuParaulesAmbDefinicio("El gos i el gat viuen a casa");
        String informeEsperat = "gos: mamifer cannid,gat: mamifer feli,casa: llar dolça llar";
        
        System.out.println(">"+informeObtingut);
        System.out.println(">"+informeEsperat);
        
        assertEquals(informeEsperat, informeObtingut );
        
        FabricaDiccionaris.setModeReal(true);
               
    }
}
