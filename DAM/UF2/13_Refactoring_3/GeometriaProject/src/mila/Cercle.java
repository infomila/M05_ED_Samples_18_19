package mila;

/**
 *
 * @author BERNAT
 */
public class Cercle  extends Forma{

    public Cercle(double _mida) {
        super(TipusForma.CERCLE, _mida);
    }


    @Override
    public double getArea() {
        return Math.PI *getMida() * getMida() ;
    }
    
}