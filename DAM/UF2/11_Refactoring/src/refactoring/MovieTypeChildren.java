package refactoring;

/**
 *
 * @author Usuari
 */
public class MovieTypeChildren extends MoviePriceHelper{

    
    @Override
    public double getAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3) {
            thisAmount += (daysRented - 3) * 1.5;
        }      
        return thisAmount;
    }
    
}
