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
    public static final int CHILDRENS = 2;

    /**
     *
     */
    public static final int NEW_RELEASE = 1;

    /**
     *
     */
    public static final int REGULAR = 0;
	
	private final String _title;
	private int _priceCode;
	
    /**
     *
     * @param title
     * @param priceCode
     */
    public Movie(String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}
	
    /**
     *
     * @return
     */
    public int getPriceCode() {
		return _priceCode;
	}

    /**
     *
     * @param arg
     */
    public void setPriceCode(int arg) {
		_priceCode = arg;
	}

    /**
     *
     * @return
     */
    public String getTitle() {
		return _title;
	}
    private static final Logger LOG = Logger.getLogger(Movie.class.getName());
	
	
}
