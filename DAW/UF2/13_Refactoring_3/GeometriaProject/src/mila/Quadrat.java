package mila;

/**
 *
 * @author BERNAT
 */
public class Quadrat  extends Forma{

    public Quadrat(double _mida) {
        super(TipusForma.QUADRAT, _mida);
    }

    @Override
    public String getNom() {
        return "Quadrat";
    }

    @Override
    public double getArea() {
        return getMida() * getMida() ;
    }
    
}