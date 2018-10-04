/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        Crypto c = new Crypto();
        String cadena = "Soc una cadena";
        String encriptada = c.encripta(cadena);
        System.out.println(encriptada);
        System.out.println(c.desencripta(encriptada));    }
    
}
