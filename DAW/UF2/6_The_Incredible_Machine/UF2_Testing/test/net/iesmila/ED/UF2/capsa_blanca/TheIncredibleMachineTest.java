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
        int data[] = {1,-2,13,1,1,1,1,1,1, 3,3,3,3,5,5,5,5,6,6,6,6,1,10,1,3}; // put your magic numbers ;-D
        tim.crunch(data);
        
        int data2[] = {-1,12};
        TheIncredibleMachine tim2 = new TheIncredibleMachine();
        tim2.crunch(data2);
    }
    
}
