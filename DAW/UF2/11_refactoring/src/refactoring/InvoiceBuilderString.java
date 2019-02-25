package refactoring;

import static java.lang.String.valueOf;

/**
 *
 * @author Usuari
 */
public class InvoiceBuilderString extends InvoiceBuilder{

    public InvoiceBuilderString(Customer aCustomer) {
        super(aCustomer);
    }

    @Override
    String getHeader() {
        return "Rental Record for " + mCustomer.getName() + "\n";
    }

    @Override
    String getStartRentalList() {
        return "";
    }

    @Override
    String getLine(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + valueOf(rental.getAmount()) + "\n";
    }

    @Override
    String getEndRentalList() {
        return "";
    }

    @Override
    String getFooter() {
        String  result = "Amount owed is " + valueOf(mCustomer.getTotalAmount()) + "\n";
                result += "You earned " + valueOf(mCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }
    
}
