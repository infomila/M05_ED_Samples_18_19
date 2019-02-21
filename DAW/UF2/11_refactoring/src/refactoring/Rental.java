package refactoring;

//From book: 'Refactoring' by Martin Fowler

import java.util.logging.Logger;

//From book: 'Refactoring' by Martin Fowler
//This is the original code before refactoring begins

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

	private final Movie _movie;
	private final int _daysRented;
	
    /**
     *
     * @param movie
     * @param daysRented
     */
    public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

    /**
     *
     * @return
     */
    public int getDaysRented() {                                     
        
		return _daysRented;
	}

    /**
     *
     * @return
     */
    public Movie getMovie() {
		return _movie;
	}
    private static final Logger LOG = Logger.getLogger(Rental.class.getName());

    public double getAmount() {
        
       return _movie.getAmount(getDaysRented());
    }

    public int getPoints() {
         // add frequent renter points
        int frequentRenterPoints=1;
        // add bonus for a two day new release rental
        if ((getMovie().getPriceCode() == MovieTypeEnum.NEW_RELEASE) && getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;			
    }
	
	
	
}
