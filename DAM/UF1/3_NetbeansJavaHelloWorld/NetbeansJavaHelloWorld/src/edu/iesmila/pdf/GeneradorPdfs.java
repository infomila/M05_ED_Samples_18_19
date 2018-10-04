/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iesmila.pdf;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.test.annotations.WrapToTest;
 
import java.io.File;
import java.io.IOException;
 
/**
 *
 * @author Usuari
 */
public class GeneradorPdfs {
 
    public static final String DEST = "results/chapter01/hello_world.pdf";
 
    public static void main(String args[]) throws IOException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new GeneradorPdfs().createPdf(DEST);
    }
 
    public void createPdf(String dest) throws IOException {
        //Initialize PDF writer
        PdfWriter writer = new PdfWriter(dest);
 
        //Initialize PDF document
        PdfDocument pdf = new PdfDocument(writer);
 
        // Initialize document
        Document document = new Document(pdf);
 
        //Add paragraph to the document
        document.add(new Paragraph("Sóc el puto amo!"));
 
        //Close document
        document.close();
    }
}