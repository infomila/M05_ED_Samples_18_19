/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0_demo_junit;

/**
 *
 * @author Usuari
 */
public class Quiniela {
    
    /**
     * Retorna el signe de la quiniela que correpon al resultat
     * @param golsCasa gols de l'equip de casa
     * @param golsVisitant golts de l'equip visitant 
     * @return els signe
     */
    public static char getSigne(int golsCasa, int golsVisitant ) {
        
        if(golsCasa<0 || golsCasa>50) 
            throw new RuntimeException("Gols casa fora de rang");
        if(golsVisitant<0 || golsVisitant>50) 
            throw new RuntimeException("Gols visitant fora de rang");
        
        if(golsCasa>golsVisitant) return '1';
        else if(golsCasa<golsVisitant) return '2';
        else return 'X';
    }
    
}
