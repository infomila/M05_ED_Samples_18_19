/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.iesmila.ED.UF2.capsa_blanca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuari
 */
public class TheIncredibleMachineTest {
    
    public TheIncredibleMachineTest() {
    }

    @Test
    public void testCrunch() {
        
        TheIncredibleMachine tim = new TheIncredibleMachine();
        int data[] = {1,4,4,4,4,4,4, 8,8,8,8,7,7,7,7,5,5,5,5,1,10,1,3,5,5}; 
        tim.crunch(data);
          
        TheIncredibleMachine tim1 = new TheIncredibleMachine();
        int data1[] = {-1,13,13,13}; 
        tim1.crunch(data1);
       
    }
    
}
