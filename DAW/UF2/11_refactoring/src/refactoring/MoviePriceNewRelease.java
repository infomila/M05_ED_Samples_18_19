package refactoring;

/**
 *
 * @author Usuari
 */
public class MoviePriceNewRelease extends MoviePriceCalculator{

    @Override
    public double getAmount(int daysRented) {
        return  daysRented * 3;
    }    
}
