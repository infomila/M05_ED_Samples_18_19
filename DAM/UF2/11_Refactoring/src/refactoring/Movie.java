package refactoring;

// From book: 'Refactoring' by Martin Fowler

import java.util.logging.Logger;
// From book: 'Refactoring' by Martin Fowler
// This is the original code before refactoring begins

/**
 *
 * @author Usuari
 */

public class Movie {

    /**
     *
     */

    private final String _title;
    private MovieType _priceCode;
    private MoviePriceHelper _priceHelper;
	
    /**
     *
     * @param title
     * @param priceCode
     */
    public Movie(String title, MovieType priceCode) {
		_title = title;		
                setPriceCode(priceCode);
    }
    
    
	
    /**
     *
     * @return
     */
    public MovieType getPriceCode() {
		return _priceCode;
    }

    /**
     *
     * @param arg
     */
    public void setPriceCode(MovieType arg) {
            _priceCode = arg;
            switch(_priceCode) {
                case REGULAR: _priceHelper = new MovieTypeRegular(); break;
                case NEW_RELEASE: _priceHelper = new MovieTypeNewRelease(); break;
                case CHILDRENS: _priceHelper = new MovieTypeChildren(); break;                            
            }
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
        return _priceHelper.getAmount(daysRented);
    }
    /*{
        double thisAmount = 0;
        switch (getPriceCode()) {
            case REGULAR:
                thisAmount += 2;
                if (daysRented> 2) {
                    thisAmount += (daysRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3) {
                    thisAmount += (daysRented - 3) * 1.5;
                }
                break;
        }

        return thisAmount;
    }*/
	
	
}
