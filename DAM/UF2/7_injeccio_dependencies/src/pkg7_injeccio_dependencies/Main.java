/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_injeccio_dependencies;

/**
 *
 * @author Usuari
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Factura f = new Factura(123, "1231 1234 1234 1234", 2345.3);
        PassarellaPagament p = new PassarellaPagament();
        f.facturar(p);
    }
    
}
