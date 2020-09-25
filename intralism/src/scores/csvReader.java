package scores;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

public class csvReader {
	
	public csvReader() {
		
	}

    public String[][] getCSVContent(String path){

        try {

        	LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(path));
        	lineNumberReader.skip(Long.MAX_VALUE);
        	int lines = lineNumberReader.getLineNumber();
        	lineNumberReader.close();
        	
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), Charset.forName("UTF-8")));
            
            String[][] result = new String[lines+1][4];
            
            int count = 0;
            String line = "";
            
            while ((line = br.readLine()) != null) {
            	
                String[] entry = line.split(",");
                
                for(int i=0; i<entry.length;i++) result[count][i] = entry[i];

                count++;
                
            }
            
            br.close();
            return result;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;

    }

}
