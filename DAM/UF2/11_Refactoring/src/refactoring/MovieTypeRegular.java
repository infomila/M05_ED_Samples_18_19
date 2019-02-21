package refactoring;

/**
 *
 * @author Usuari
 */
public class MovieTypeRegular  extends MoviePriceHelper {
    
    @Override
    public double getAmount(int daysRented) {
        double thisAmount = 2;
        if (daysRented> 2) {
            thisAmount += (daysRented - 2) * 1.5;
        }
        return thisAmount;
    }
}
