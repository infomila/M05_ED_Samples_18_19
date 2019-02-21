package refactoring;

/**
 *
 * @author Usuari
 */
public class MovieTypeNewRelease  extends MoviePriceHelper {

    @Override
    public double getAmount(int daysRented) {
        return daysRented * 3;               
    }
    
}
