package refactoring;

//From book: 'Refactoring' by Martin Fowler
import java.util.logging.Logger;
import static refactoring.Movie.CHILDRENS;
import static refactoring.Movie.NEW_RELEASE;
import static refactoring.Movie.REGULAR;
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
        double thisAmount = 0;
        //determine amounts for each line
        switch (this.getMovie().getPriceCode()) {
            case REGULAR:
                thisAmount += 2;
                if (this.getDaysRented() > 2) {
                    thisAmount += (this.getDaysRented() - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                thisAmount += this.getDaysRented() * 3;
                break;
            case CHILDRENS:
                thisAmount += 1.5;
                if (this.getDaysRented() > 3) {
                    thisAmount += (this.getDaysRented() - 3) * 1.5;
                }
                break;
        }

        return thisAmount;

    }

    public int getPoints() {
        // add frequent renter points
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if ((this.getMovie().getPriceCode() == NEW_RELEASE) && this.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

}
