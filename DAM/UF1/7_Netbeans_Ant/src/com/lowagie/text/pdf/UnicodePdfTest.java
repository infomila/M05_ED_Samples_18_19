package com.lowagie.text.pdf;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;

public class UnicodePdfTest {

    private static final String INPUT = "Symbol: '\u25b2' Latin: 'HELLO WORLD'";

    public void testSimplePdf() throws FileNotFoundException, DocumentException {
        // create document
        Document document = PdfTestBase.createPdf("unicode.pdf");
        // Probably a good idea to write the document to a byte array, so you can read the result and make some checks.
        // ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        // Document document = PdfTestBase.createPdf(outputStream);
        try {
            // new page with a rectangle
            document.open();

            final BaseFont font = BaseFont.createFont("resources\\AmaticSC-Bold.ttf",
                    BaseFont.IDENTITY_H, false);
            Element unicodeParagraph = new Paragraph(INPUT, new Font(font, 15));
            document.add(unicodeParagraph);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // close document
            if (document != null)
                document.close();
        }
    }

    
    
}
