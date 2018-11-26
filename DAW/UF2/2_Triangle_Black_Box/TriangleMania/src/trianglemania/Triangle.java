/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglemania;

/**
 *
 * @author Usuari
 */
public class Triangle {

    public static TipusTriangle getTipusTriangle(
            double a, double b, double c) {                
        //---------------------------------
        //   assercions
        //---------------------------------
        if( a<=0 ) throw new IllegalArgumentException("a erronia");
        if( b<=0 ) throw new IllegalArgumentException("b erronia");
        if( c<=0 ) throw new IllegalArgumentException("c erronia");        
        //---------------------------------
        //  no triangles !
        //---------------------------------
        if(     a+b-c <TOLERANCIA ||
                a+c-b <TOLERANCIA || 
                b+c-a < TOLERANCIA ) {
            return TipusTriangle.NO_ES_TRIANGLE;
        }     
        
        //---------------------------------
        if(ig(a,b) && ig(c,b)) return TipusTriangle.EQUILATER;
        if( ig(a,b) || ig(c,b) || ig(a,c))  return TipusTriangle.ISOSCELES;
        return TipusTriangle.ESCALE;        
    }
    public static double TOLERANCIA = 0.0009999;
    
    private static boolean ig(double a, double b) {
        return Math.abs(a-b)< TOLERANCIA;
    }
    
}










