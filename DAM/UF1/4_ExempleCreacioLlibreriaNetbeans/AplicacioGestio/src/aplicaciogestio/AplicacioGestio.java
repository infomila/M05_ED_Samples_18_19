package aplicaciogestio;

import com.thecrypt.Crypto;

/**
 *
 * @author Usuari
 */
public class AplicacioGestio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomClient = "Pepito Grillo";
        Crypto c = new Crypto();
        String nomClientEncriptat = c.encripta(nomClient);
        System.out.println(">"+nomClientEncriptat);
        System.out.println(">"+c.desencripta(nomClientEncriptat));
    }
    
}
