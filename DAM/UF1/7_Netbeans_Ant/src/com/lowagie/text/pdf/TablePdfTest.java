package com.lowagie.text.pdf;

import java.io.FileNotFoundException;


import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import java.util.List;
import com.lowagie.text.Phrase;

public class TablePdfTest {

	public void testTableSpacingPercentage() throws FileNotFoundException,
			DocumentException {
		Document document = PdfTestBase
				.createPdf("testTableSpacingPercentage.pdf");
		document.setMargins(72, 72, 72, 72);
		document.open();
		PdfPTable table = new PdfPTable(1);
		table.setSpacingBefore(20);
		table.setWidthPercentage(100);
		PdfPCell cell;
		cell = new PdfPCell();
		Phrase phase = new Phrase("John Doe");
		cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER); // This has no
															// effect
		cell.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE); // This has no effect
		cell.addElement(phase);
		table.addCell(cell);
		document.add(table);
		document.close();
	}

	public void testTableArrayOutOfBoundsSpan(String filePath,  String fontName, String title, List<String[]>  items) throws Exception,
			DocumentException {
		
            if(items.size()==0) return;
            
            Document document = PdfTestBase
				.createPdf("output\\"+filePath);
		document.open();
                
                
                
                float widths[] = new float[1+items.get(0).length];
                for(int i=0;i<widths.length;i++)
                {
                    widths[i] = 1;
                }
                widths[0] = 2;
		PdfPTable table = new PdfPTable(widths);
		table.setComplete(false);

                final BaseFont font = BaseFont.createFont("resources\\"+fontName,   BaseFont.IDENTITY_H, false);
              
                
                
		// First page

		// add five rows
		// the first cell has rowspan 10
		// the second column gets just 5 cells

		PdfPCell cellWithRowspan = new PdfPCell();
		cellWithRowspan.setRowspan(items.size());
		cellWithRowspan.addElement(new Paragraph(title, new Font(font, 15)));
                cellWithRowspan.setHorizontalAlignment(Element.ALIGN_CENTER);
		table.addCell(cellWithRowspan);

		for (int i = 0; i < items.size(); ++i) {
                    for(int j=0; j <items.get(i).length;j++) {
			PdfPCell cell = new PdfPCell();
			cell.addElement(new Paragraph(items.get(i)[j], new Font(font, 15)));
			table.addCell(cell);			
                    }
                    table.completeRow();
		}

		// force page break (this would result from business rules)

		document.add(table);
		document.newPage();
 

		// finish second page

		table.setComplete(true);
		document.add(table);
		document.close();
	}

	public void testCreateTable() throws FileNotFoundException,
			DocumentException {
		// create document
		Document document = PdfTestBase.createPdf("testCreateTable.pdf");
		try {
			// new page with a table
			document.open();
			document.newPage();

			PdfPTable table = createPdfTable(2);

			for (int i = 0; i < 10; i++) {
				PdfPCell cell = new PdfPCell();
				cell.setRowspan(2);
				table.addCell(cell);

			}
			table.calculateHeights(true);
			document.add(table);
			document.newPage();

		} finally {
			// close document
			if (document != null)
				document.close();
		}

	}

	private PdfPTable createPdfTable(int numberOfColumns)
			throws DocumentException {

		PdfPTable table = new PdfPTable(numberOfColumns);

		table.getDefaultCell().setBorder(1);
		table.setSpacingBefore(0f);
		table.setSpacingAfter(0);
		table.setKeepTogether(true);
		table.getDefaultCell().setUseAscender(true);
		table.getDefaultCell().setUseDescender(true);
		table.getDefaultCell().setUseBorderPadding(false);

		return table;
	}

}
