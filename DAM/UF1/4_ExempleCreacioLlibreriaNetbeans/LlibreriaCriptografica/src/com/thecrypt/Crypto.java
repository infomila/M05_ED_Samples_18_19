package com.thecrypt;

/**
 *
 * @author Usuari
 */
public class Crypto {

    public String encripta(String original) {
        String out="";
        for(int i=0;i<original.length();i++) {
            out += (char)(original.charAt(i)-15);
        }
        return out;
    }
    public String desencripta(String original) {
        String out="";
        for(int i=0;i<original.length();i++) {
            out += (char)(original.charAt(i)+15);
        }
        return out;
    }
    //----------------------------------------
    public static void main(String[] args) {
        Crypto c = new Crypto();
        String encriptada = c.encripta("Hola Món");
        System.out.println(encriptada);
        System.out.println(c.desencripta(encriptada));        
    }
    
    
}
