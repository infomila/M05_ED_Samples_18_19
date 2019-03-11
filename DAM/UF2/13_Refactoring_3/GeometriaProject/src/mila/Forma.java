package mila;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Professor
 */
public abstract class Forma {


    
    private TipusForma tipusForma;
    private double mida;

    public Forma(TipusForma _tipusForma, double _mida) {
        this.tipusForma = _tipusForma;
        this.mida = _mida;
    }

    public double getMida() {
        return mida;
    }

    public TipusForma getTipusForma() {
        return tipusForma;
    }

    public String getNom() {
      return tipusForma.getNomSingular();
    }
    
    public abstract double getArea();
    
}