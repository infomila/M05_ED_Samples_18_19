package refactoring;

/**
 *
 * @author Usuari
 */
public class MoviePriceChildren extends MoviePriceCalculator{

    @Override
    public double getAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented - 3) * 1.5;
        }                   	
        return amount;   
    }
    
}
