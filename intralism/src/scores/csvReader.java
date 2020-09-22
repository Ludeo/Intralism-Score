package scores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class csvReader {
	
	public csvReader() {
		
	}

    public String[][] getCSVContent(String path){

        try {

        	String line = "";
        	
            BufferedReader br = new BufferedReader(new FileReader(path));
            
            String[][] result = new String[252][4];
            int count = 0;
            
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
