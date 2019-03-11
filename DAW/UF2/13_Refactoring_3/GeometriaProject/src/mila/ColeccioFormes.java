package mila;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Professor
 */
public class ColeccioFormes {

    private Vector<Forma> formes;

    public ColeccioFormes() {
        formes = new Vector<Forma>();
    }

    public void addForma(Forma f) {
        formes.add(f);
    }

    public static void main(String args[]) {
        ColeccioFormes c = new ColeccioFormes();
        c.addForma(new Triangle(2));
        c.addForma(new Cercle(2));
        c.addForma(new Cercle(3));
        c.addForma(new Quadrat(3));
        c.addForma(new Triangle(4));
        c.addForma(new Quadrat(3));
        c.addForma(new Quadrat(1));

        System.out.println(c.informeFormes());
    }

    public String informeFormes() {
        //int quadrats = 0, cercles = 0, triangles = 0, 
        int total = 0;
        //double areaQuadrats = 0, areaCercles = 0, areaTriangles = 0;
        double areaAcumulada = 0, mida;
        int numFig = 1;
        TipusForma tf;
        String informe = "";
        NumberFormat nf = DecimalFormat.getNumberInstance(new Locale("ca", "es"));
        nf.setMaximumFractionDigits(2);
        
        int comptadorFigures[]  = new int[TipusForma.values().length];
        double comptadorArees[] = new double[TipusForma.values().length];
                   
        //---------------------- Iteració principal -------------------
        informe += getLine();
        for (Forma f : formes) {
            mida = f.getMida();
            tf = f.getTipusForma();
            total++;
            numFig++;
            informe += "- Figura <" + numFig + ">: ";            
            informe += f.getNom();
            double area = f.getArea();
            informe += "\t mida - "+mida+" - area " + nf.format(area) + "\n";
            areaAcumulada +=area;      
            
            
            comptadorFigures[tf.ordinal()]++;
            comptadorArees[tf.ordinal()]+= area;

        } // end foreach forma
        // ---------------------- totalitzacions --------------------------
        informe += getLine();
        informe += "Total figures:" + total + ", area total:" + nf.format(areaAcumulada) + "\n";
        informe += getLine();
        //for (int n = 1; n <= TipusForma.getValues().length; n++) {
        for(TipusForma tfIter :   TipusForma.values() ) {
                    
          informe += "Total "+tfIter.getNomPlural()+":" + comptadorFigures[tfIter.ordinal()] + ", area final:" + nf.format(comptadorArees[tfIter.ordinal()]) + "\n";          
          informe += getLine();
        }//end for       
        return informe;
    }
    
    /**
     * Funció per "dibuixar" una línia de caràcters.
     */
    private String getLine(){
      return "========================\n";
    }
}