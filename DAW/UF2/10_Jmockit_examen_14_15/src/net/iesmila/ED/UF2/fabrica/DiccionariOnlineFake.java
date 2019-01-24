package net.iesmila.ED.UF2.fabrica;

import java.util.HashMap;


public class DiccionariOnlineFake implements IDiccionari {
    
    private HashMap<String, TipusParaula> taulaDeTipus = new HashMap<>();
    private HashMap<String, String> taulaDeDescripcions = new HashMap<>();
    
    public DiccionariOnlineFake(){
        // Posem els tipus de les paraules que tenim al test:
        /*  
        "El gos i el gat viuen a casa"  
        */                
        taulaDeTipus.put("El", TipusParaula.ARTICLE);
        taulaDeTipus.put("gos", TipusParaula.NOM);
        taulaDeTipus.put("i", TipusParaula.CONJUNCIO);
        taulaDeTipus.put("el", TipusParaula.ARTICLE);
        taulaDeTipus.put("gat", TipusParaula.NOM);
        taulaDeTipus.put("viuen", TipusParaula.VERB);
        taulaDeTipus.put("a", TipusParaula.CONJUNCIO);
        taulaDeTipus.put("casa", TipusParaula.NOM);
        
        // Posem a la taula de descripcions les paraules que requereix el test
        /*
            "gos: mamifer cannid,gat: mamifer feli,casa: llar dolça llar";
        */
        taulaDeDescripcions.put("gos", "mamifer cannid");
        taulaDeDescripcions.put("gat", "mamifer feli");
        taulaDeDescripcions.put("casa", "llar dolça llar");
        
    }
    /**
     * donada una paraula en retorna el tipus ( nom, adjectiu, verb...)
     */
    @Override
    public TipusParaula getTipusParaula(String paraula) {
        
        return taulaDeTipus.get(paraula);
    }
    
    @Override
    public String getDescripcio(String paraula) {
        
        return taulaDeDescripcions.get(paraula);
    }
}
