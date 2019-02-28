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
    public String getInvoce() {
        InvoiceBuilder builder = new InvoiceBuilderPlainText(this);
        return builder.build();
    }
    
    public String getInvoceHTML() {
        InvoiceBuilder builder = new InvoiceBuilderHTML(this);
        return builder.build();
    }    
    
    public double getTotalAmount() {
        double totalAmount = 0;
        for (Rental rental : _rentals) {
            totalAmount += rental.getAmount();  
        }
        return totalAmount;
    }

    public int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental : _rentals) {
            frequentRenterPoints += rental.getPoints();  
        }
        return frequentRenterPoints;
    }

    
    
    private static final Logger LOG = Logger.getLogger(Customer.class.getName());

    public Iterable<Rental> getRentals() {
        return _rentals;
    }


}
