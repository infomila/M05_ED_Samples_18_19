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
public class Factura {
    
    
    int numero;
    String VISA;
    double importTotal;

    public Factura(int numero, String VISA, double importTotal) {
        this.numero = numero;
        this.VISA = VISA;
        this.importTotal = importTotal;
    }
    
    public boolean facturar(ICobrador c) {
        // Comptabilitzar la factura
        // Actualitzar els stocks
        // Fer el cobrament
        //PassarellaPagament p = new PassarellaPagament();
        return c.cobrar(VISA, importTotal);        
    }
    
}
