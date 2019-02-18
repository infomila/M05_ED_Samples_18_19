package refactoring;

import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Logger;
import static refactoring.Movie.CHILDRENS;
import static refactoring.Movie.NEW_RELEASE;
import static refactoring.Movie.REGULAR;

//From book: 'Refactoring' by Martin Fowler
//This is the original code before refactoring begins
/**
 *
 * @author Usuari
 */
public class Customer {

    private final String _name;
    private final LinkedList<Rental> _rentals = new LinkedList<Rental>();

    /**
     *
     * @param name
     */
    public Customer(String name) {
        _name = name;
    }

    /**
     *
     * @param arg
     */
    public void addRental(Rental arg) {
        _rentals.add(arg);
    }

    /**
     *
     * @return
     */
    public String getName() {
        return _name;
    }

    /**
     *
     * @return
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + getName() + "\n";

        for (Rental rental : _rentals) {
            double thisAmount = rental.getAmount();          
            frequentRenterPoints += rental.getPoints();
            
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + valueOf(totalAmount) + "\n";
        result += "You earned " + valueOf(frequentRenterPoints) + " frequent renter points";

        return result;
    }
    private static final Logger LOG = Logger.getLogger(Customer.class.getName());
}
