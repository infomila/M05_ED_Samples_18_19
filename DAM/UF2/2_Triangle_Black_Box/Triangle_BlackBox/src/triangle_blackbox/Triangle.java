package triangle_blackbox;

/**
 *
 * @author Usuari
 */
public class Triangle {
    
    public static final double TOLERANCIA = 0.000999999;
    
    public static final float CC = 0.1f;
    
    
    public TipusTriangle getTipusTriangle( double a, double b, double c ) {        
        //------------------------------------
        //  Assercions
        //------------------------------------
        if(a<=0) throw new IllegalArgumentException("Valor a erroni");
        if(b<=0) throw new IllegalArgumentException("Valor b erroni");
        if(c<=0) throw new IllegalArgumentException("Valor c erroni");              
        //------------------------------------
        // Veure si estem en el cas de que no formen triangle
        //------------------------------------    
        if( a+b-c<=TOLERANCIA || a+c-b <=TOLERANCIA || b+c -a <= TOLERANCIA) {
            return TipusTriangle.NO_ES_TRIANGLE;
        }
        //------------------------------------
        // Determinar el tipus de triangle
        //------------------------------------    
        if( ig(a,b)  && ig(b,c)) {
            return TipusTriangle.EQUILATER;
        } 
        if( ig(a,b) || ig(a,c) || ig(c,b)) {
            return TipusTriangle.ISOSCELES;
        }
        return TipusTriangle.ESCALE;                
    }
    

    
    private boolean ig(double a, double b) {
        return Math.abs(a-b) < TOLERANCIA;
    }
    
}
