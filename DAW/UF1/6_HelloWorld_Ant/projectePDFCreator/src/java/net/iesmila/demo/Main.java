package net.iesmila.demo;

import com.lowagie.text.pdf.TablePdfTest;
import com.lowagie.text.pdf.UnicodePdfTest;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 *
 * @author bernat
 */
public class Main {
    public static void main(String[] args) throws Exception {
        
        

        
        TablePdfTest t = new TablePdfTest();
        System.out.println(args.length+">"+args[0]);
        if(args.length<3) {
            System.out.println("Invalid usage: [font-name.ttf] [title] [csv_file.csv] ");
            System.exit(-1);
        }
        
                
        List<String[]> data = loadCSV("data/"+args[2]) ;
        
        String outputName = args[2].substring(0, args[2].indexOf(".")) + ".pdf";
        
        t.testTableArrayOutOfBoundsSpan(outputName, args[0], args[1], data);
        
    }
    

    static private List<String[]> loadCSV(String path) throws Exception{
        List<String[]> rows = new ArrayList<>();
        System.out.println("Working Directory = " +
              System.getProperty("user.dir"));
        String aStr = null;
        FileInputStream aFile = new FileInputStream(path);
        InputStreamReader aInReader = new InputStreamReader(aFile);
        BufferedReader theBufReader = new BufferedReader(aInReader);

        while ((aStr = theBufReader.readLine()) != null) {
            String[] dataLine = aStr.split(";");
            rows.add(dataLine);
        }
        return rows;
    }

    
}
