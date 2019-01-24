package net.iesmila.ED.UF2.fabrica;

import net.iesmila.ED.UF2.fabrica.TipusParaula;

/**
 *
 * @author Usuari
 */
public interface IDiccionari {
    
    public TipusParaula getTipusParaula(String paraula);
    
    public String getDescripcio(String paraula);
}

