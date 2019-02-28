package refactoring;

import static java.lang.String.valueOf;

/**
 *
 * @author Usuari
 */
public abstract class InvoiceBuilder {
    
    protected Customer mCustomer;
    
    public InvoiceBuilder( Customer aCustomer) {
        mCustomer = aCustomer;
    }
    
    public String build(){
        String result ="";
        result = getHeader();
        result += getListBegin();
        for (Rental rental : mCustomer.getRentals()) {
            result += getLine(rental);
        }
        result += getListEnd();
        result += getFooter();
        return result;
       
    }

    abstract String getHeader();

    abstract  String getListBegin();

    abstract  String getLine(Rental rental) ;

    abstract  String getListEnd();

    abstract  String getFooter();
    
}
