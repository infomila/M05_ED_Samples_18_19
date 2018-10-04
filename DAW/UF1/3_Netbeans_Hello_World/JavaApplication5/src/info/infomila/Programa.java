/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.infomila;

import info.infomila.db.Driver;
import info.infomila.pdfs.DocPdf;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Aquest programa fa moltes coses meravelloses i fantàstiques que triomfaran a l'univers
 * @author Usuari
 */
public class Programa {
    
    /**
     * 
     * @param a primer paràmetre de la suma
     * @param b segon paràmetre de la suma
     * @return  retorna la suma de a+b
     */
    public int suma(int a, int b) {
         return 0;
    }
    
    public static void main(String[] args) {
        System.out.println("Hola Món !!!");
        //-------------------------------
        Driver d = new Driver();
        d.startDriver();
        //--------------------------------
        String DEST = "results/hello_world.pdf";
        File file = new File(DEST);
        file.getParentFile().mkdirs();  
        try {
            new DocPdf().createPdf(DEST);
        } catch (IOException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("He acabat bé.");       
    }
}
