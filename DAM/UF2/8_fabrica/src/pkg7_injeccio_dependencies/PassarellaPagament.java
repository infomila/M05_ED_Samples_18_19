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
public class PassarellaPagament implements ICobrador {
    
    @Override
    public boolean cobrar(String VISA, double importTotal ) {
        
        // Manca la implementació real del cobrament....
        System.out.println("PAGAMENT REAL");        
        return true;
    }        
}
