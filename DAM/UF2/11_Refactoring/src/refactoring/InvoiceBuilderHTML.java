package refactoring;

import static java.lang.String.valueOf;

/**
 *
 * @author Usuari
 */
public class InvoiceBuilderHTML extends InvoiceBuilder{

    public InvoiceBuilderHTML(Customer aCustomer) {
        super(aCustomer);
    }
    @Override
    String getHeader() {
        return "<html><body><header>Rental Record for " + mCustomer.getName() + "</header>\n";
    }

    @Override
    String getListBegin() {
        return "<ul>\n";
    }

    @Override
    String getLine(Rental rental) {
        return "\t<li>" + rental.getMovie().getTitle() + "\t" + valueOf(rental.getAmount()) + "<li>\n";
    }

    @Override
    String getListEnd() {
        return "</ul>";
    }

    @Override
    String getFooter() {
        String result = "";
        result += "<footer>Amount owed is " + valueOf(mCustomer.getTotalAmount()) + "\n";
        result += "You earned " + valueOf(mCustomer.getTotalFrequentRenterPoints()) + " frequent renter points </footer></body></html>";
        return result;
    }
    
    
}
