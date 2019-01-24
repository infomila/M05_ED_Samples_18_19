package net.iesmila.ED.UF2.fabrica;

import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Test;
import static org.junit.Assert.*;


public class LectorTest {
    
    public LectorTest() {
    }

    /**
     * Test of extreuParaulesAmbDefinicio method, of class Lector.
     */
    
//    @Mocked DiccionariOnline dicc;

    @Test
    public void testInformeText() {
        
//        new NonStrictExpectations() {{
//            /*dicc.getTipusParaula(anyString); returns(
//                    TipusParaula.ARTICLE, 
//                    TipusParaula.NOM,
//                    TipusParaula.CONJUNCIO,
//                    TipusParaula.ARTICLE,
//                    TipusParaula.NOM,
//                    TipusParaula.VERB,
//                    TipusParaula.CONJUNCIO,
//                    TipusParaula.NOM
//            );*/
//            dicc.getTipusParaula("El"); result= TipusParaula.ARTICLE;
//            dicc.getTipusParaula("gos"); result= TipusParaula.NOM;
//            dicc.getTipusParaula("i"); result= TipusParaula.CONJUNCIO;
//            dicc.getTipusParaula("el"); result= TipusParaula.ARTICLE;
//            dicc.getTipusParaula("gat"); result= TipusParaula.NOM;
//            dicc.getTipusParaula("viuen"); result= TipusParaula.VERB;
//            dicc.getTipusParaula("a"); result= TipusParaula.CONJUNCIO;
//            dicc.getTipusParaula("casa"); result= TipusParaula.NOM;
//            
//            
//            /*dicc.getDescripcio(anyString); returns(
//                                                "mamifer cannid", 
//                                                "mamifer feli", 
//                                                "llar dolça llar");
//            */
//            dicc.getDescripcio("gos"); result = "mamifer cannid";
//            dicc.getDescripcio("gat"); result = "mamifer feli";
//            dicc.getDescripcio("casa"); result = "llar dolça llar";
//        }};
        
  
            new MockUp<DiccionariOnline> (){
                
                @Mock
                public TipusParaula getTipusParaula(String paraula) {
                    switch(paraula.toLowerCase()) {
                        case "el": return TipusParaula.ARTICLE;
                        case "gos": case "gat": case "casa": return TipusParaula.NOM;
                        default:return TipusParaula.CONJUNCIO;
                    }
                }

                @Mock
                public String getDescripcio(String paraula) {
                switch(paraula) {
                        case "gos": return "mamifer cannid";
                        case "gat": return "mamifer feli";
                        case "casa": return "llar dolça llar";
                        default: return "";
                    }
                }                                
            };
    




        Lector l = new Lector();
        String informeObtingut = l.extreuParaulesAmbDefinicio("El gos i el gat viuen a casa");
        String informeEsperat = "gos: mamifer cannid,gat: mamifer feli,casa: llar dolça llar";
        
        System.out.println(">"+informeObtingut);
        System.out.println(">"+informeEsperat);
        
        assertEquals(informeEsperat, informeObtingut );
        
         
               
    }
}
