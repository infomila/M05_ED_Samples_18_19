package refactoring;

// From book: 'Refactoring' by Martin Fowler

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
// From book: 'Refactoring' by Martin Fowler
// This is the original code before refactoring begins

/**
 *
 * @author Usuari
 */

public class Movie {



    private final String _title;
    private MovieTypeEnum _priceCode;
    private MoviePriceCalculator priceCalculator;
    /**
     *
     * @param title
     * @param priceCode
     */
    public Movie(String title, MovieTypeEnum priceCode) {
		_title = title;              
		setPriceCode(priceCode);
	}
	
    /**
     *
     * @return
     */
    public MovieTypeEnum getPriceCode() {
		return _priceCode;
	}

    /**
     *
     * @param arg
     */
    public void setPriceCode(MovieTypeEnum arg)  {
        _priceCode = arg;
              
        switch(_priceCode) {
            case REGULAR: priceCalculator = new MoviePriceRegular();break;
            case NEW_RELEASE: priceCalculator = new MoviePriceNewRelease();break;
            case CHILDRENS: priceCalculator = new MoviePriceChildren();break;
        }
        /*
        // Versió avançada
        Class priceClass = arg.getPriceClass();                
        try {
            //priceCalculator = (MoviePriceCalculator) priceClass.getConstructors()[0].newInstance();           
        } catch (Exception ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }*/
    }

    /**
     *
     * @return
     */
    public String getTitle() {
		return _title;
	}
    private static final Logger LOG = Logger.getLogger(Movie.class.getName());

    public double getAmount(int daysRented) {
        return priceCalculator.getAmount(daysRented);
    }
    /* {
        double amount = 0;
        //determine amounts for each line
        switch (getPriceCode()) {
            case REGULAR:
                    amount += 2;
                    if (daysRented > 2) {
                        amount += (daysRented - 2) * 1.5;
                    }
                    break;
            case NEW_RELEASE:
                    amount += daysRented * 3;
                    break;
            case CHILDRENS:
                    amount += 1.5;
                    if (daysRented > 3) {
                        amount += (daysRented - 3) * 1.5;
                    }
                    break;
        }			
        return amount;        
    }*/
	
	
}
