package refactoring;


import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Logger;


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

        String result = "Rental Record for " + getName() + "\n";
        for( Rental rental : _rentals) {
                double thisAmount = rental.getAmount();					                                                
                // show figures for this rental
                result += "\t" + rental.getMovie().getTitle() + "\t" + valueOf(thisAmount) + "\n";
        }
        // add footer lines
        result += "Amount owed is " + valueOf(getTotalAmount()) + "\n";
        result += "You earned " + valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }
    
    private double getTotalAmount(){
        double totalAmount = 0;
        for( Rental rental : _rentals) {
            totalAmount += rental.getAmount();	
        }
        return totalAmount;
    }

    private int getTotalFrequentRenterPoints(){
        int points = 0;
        for( Rental rental : _rentals) {
            points += rental.getPoints();	
        }
        return points;
    }
    
    
    private static final Logger LOG = Logger.getLogger(Customer.class.getName());
}
