/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_teatre;

/**
 *
 * @author Usuari
 */
public class Tarificador {
    
    public double getPreu( int tipusSeient, int edat ){
        
        /*
        Tipus de seient: 
            1 (platea) : 60€
            2 (laterals) : 50€
            3 (primer  pis): 40€
            4 (segon pis): 30€

        */
        double[] preusBase = new double[]{60,50,40,30};        
        
        if(tipusSeient-1<0||tipusSeient-1>=preusBase.length) {
            throw new IllegalArgumentException("Tipus de seient fora de rang");
        }
        
        if(edat<0 || edat>=120) {
            throw new IllegalArgumentException("Edat fora de rang: el rang vàlid és [0,120) ");
        }
        
        //-------------------------------------------------------------------------------------------
        
        double preuBase = preusBase[tipusSeient-1];
        
        
        
        
        /*
        Edat del client:
            <4 anys: no paga
            [4-12) anys: 25% descompte sobre el seient.
            [12-60): tarifa normal
            edat>=60: 50% descompte a platea, la resta al 80% de descompte.
        */
        if(edat<4) return 0;
        if(edat<12) { return 0.75 * preuBase;}
        if(edat<60) { return preuBase;}
        else {
            if(tipusSeient==1) return 0.5*preuBase;
            else return preuBase - 0.8*preuBase;
        }        
    }
    
}
