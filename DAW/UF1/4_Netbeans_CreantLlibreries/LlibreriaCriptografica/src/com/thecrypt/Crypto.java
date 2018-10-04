package com.thecrypt;

/**
 *
 * @author Usuari
 */
public class Crypto {

    public String encripta(String src) {
        String dst="";
        for(int i=0;i<src.length();i++) {
            dst += (char)(src.charAt(i)+15);
        }
        return dst;
    }
    public String desencripta(String src) {
        String dst="";
        for(int i=0;i<src.length();i++) {
            dst += (char)(src.charAt(i)-15);
        }
        return dst;
    }
    public static void main(String[] args) {
        Crypto c = new Crypto();
        String cadena = "Soc una cadena";
        String encriptada = c.encripta(cadena);
        System.out.println(encriptada);
        System.out.println(c.desencripta(encriptada));
    }
    
}

