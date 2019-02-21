package refactoring;

/**
 *
 * @author Usuari
 */
public class MoviePriceRegular extends MoviePriceCalculator {

    @Override
    public double getAmount(int daysRented) {
        
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5;
        }

        return amount;   
    }
    
}
