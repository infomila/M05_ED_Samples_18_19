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


    public static char getSigne( int golsCasa, int golsVisitant) {
        //----------------------------------------------
        //  Assercions
        //----------------------------------------------
        if(golsCasa<0 | golsCasa>40) throw new RuntimeException("Error en golsCasa");
        if(golsVisitant<0 | golsVisitant>40) throw new RuntimeException("Error en golsVisitant");
        //----------------------------------------------
        if(golsCasa==golsVisitant) {
            return 'X';
        } else if(golsCasa>golsVisitant) {
            return '1';
        } else {
            return '2';
        }
    }
    
}
