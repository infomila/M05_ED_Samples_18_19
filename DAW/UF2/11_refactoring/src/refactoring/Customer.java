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
        InvoiceBuilder ib = new InvoiceBuilderString(this);
        return ib.build();
    }
    
    public String statementHTML() {
        InvoiceBuilder ib = new InvoiceBuilderHTML(this);
        return ib.build();
    }
        
    
    
    public static void main(String[] args) {
        Customer customer1 = new Customer("David");
		//Movie movie1 = new MoviePriceChildren("Madagascar");
                Movie movie1 = new Movie("Madagascar", MovieTypeEnum.CHILDRENS);
		Rental rental1 = new Rental(movie1, 6); // 6 day rental
		//Movie movie2 = new MoviePriceNewRelease("Star Wars");
                Movie movie2 = new Movie("Star Wars", MovieTypeEnum.NEW_RELEASE);
		Rental rental2 = new Rental(movie2, 2); // 2 day rental
		//Movie movie3 = new MoviePriceRegular("Gone with the Wind");
                Movie movie3 = new Movie("Gone with the Wind", MovieTypeEnum.REGULAR);
		Rental rental3 = new Rental(movie3, 8); // 8 day rental
		customer1.addRental(rental1);
		customer1.addRental(rental2);
		customer1.addRental(rental3);
                
                System.out.println(""+customer1.statement());
                
    }
         
    
   
    
    public double getTotalAmount(){
        double totalAmount = 0;
        for( Rental rental : _rentals) {
            totalAmount += rental.getAmount();	
        }
        return totalAmount;
    }

    public int getTotalFrequentRenterPoints(){
        int points = 0;
        for( Rental rental : _rentals) {
            points += rental.getPoints();	
        }
        return points;
    }
    
    
    private static final Logger LOG = Logger.getLogger(Customer.class.getName());

    public Iterable<Rental> getRentals() {
        return _rentals;
    }
}
