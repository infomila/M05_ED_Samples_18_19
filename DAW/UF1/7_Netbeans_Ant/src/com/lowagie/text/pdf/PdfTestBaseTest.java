package com.lowagie.text.pdf;

import java.io.ByteArrayOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;

public class PdfTestBaseTest {

    public void testCreatePdfStream() throws DocumentException {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        Document pdf = null;
        try {
            pdf = PdfTestBase.createPdf(stream);
            pdf.open();
            pdf.newPage();
            pdf.add(new Paragraph("Hello World!"));
        } finally {
            // close document
            if (pdf != null)
                pdf.close();
        }
 
    }

}