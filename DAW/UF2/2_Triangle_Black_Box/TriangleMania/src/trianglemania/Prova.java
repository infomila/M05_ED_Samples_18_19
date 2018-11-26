/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianglemania;

import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 *
 * @author Usuari
 */
public class Prova {
    public static void main(String[] args) {
        double a = 2.001;
        double b = 0.001;
        
         NumberFormat nf = NumberFormat.getInstance();
         nf.setRoundingMode(RoundingMode.UNNECESSARY);
         nf.setMinimumFractionDigits(20);
         
         
         
         
        System.out.println("a>"+String.format("%.20f", a));
        System.out.println("b>"+nf.format(b));
        
        
    }
}
