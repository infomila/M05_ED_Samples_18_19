package refactoring;

import static java.lang.String.valueOf;

/**
 *
 * @author Usuari
 */
public abstract class InvoiceBuilder {
    
    
    Customer mCustomer;
    
    public InvoiceBuilder(Customer aCustomer) {
        mCustomer = aCustomer;
    }
    
    public String build(){
        
        String result    = getHeader();
        result          += getStartRentalList();
        for( Rental rental : mCustomer.getRentals()) {
            result      += getLine(rental);
        }
        result          += getEndRentalList();
        result          += getFooter();
        return result;

    }

    abstract String getHeader();

    abstract String getStartRentalList();

    abstract String getLine(Rental rental);

    abstract String getEndRentalList() ;

    abstract String getFooter();
    
    
}
