/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iesmila;

import edu.iesmila.db.Driver;
import edu.iesmila.pdf.GeneradorPdfs;
import java.io.File;

/**
 *
 * @author Usuari
 */
public class Programa {

    /**
     * Funció que fa la suma dels dos paràmetres
     * @param a el primer operand de la suma
     * @param b el segon operand de la suma
     * @return torna a+b
     */
    public int suma(int a, int b) {
        return a+b;
    }
    
    /**
     * Funció d'inici del programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        System.out.println(">>>> Hola Món");
        
        // Usem el driver
        Driver d = new Driver();
        d.iniciarDriver();      
 
        //----------------------------------------------
        String DEST = "results/chapter01/hello_world.pdf";   
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        try {
            new GeneradorPdfs().createPdf(DEST);
        } 
        catch(Exception ex){
           System.out.println("He petat generant el pdf:"+ex.getMessage());
        }
        System.out.println("He acabat.");
        //---------------------------------------------- 
        
    }
    
}
