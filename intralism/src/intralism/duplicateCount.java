package intralism;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class duplicateCount{
	
	public static void main(String[] args) throws IOException {
		ArrayList<String> liste = new ArrayList<String>();
		BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\lucas\\eclipse-workspace\\intralism\\src\\intralism\\test.txt"));
		String test = file.readLine();
		Pattern p = Pattern.compile("[0-9]+\\.[0-9]+"); //\\d+(?:\\.\\d+)?
									
        Matcher m = p.matcher(test);
        while(m.find()) {
            liste.add(m.group());
        }
        
        int duplicateCount = 0;
        
        Map<String,Integer> valueCounter = new HashMap<>();
        //Iterate all the elements from list and prepare HashMap, Key is List Elements and value is duplicate element occurences 
        for(String str : liste){
            Integer val = valueCounter.get(str);
            if(valueCounter.get(str)==null){
                valueCounter.put(str,1); //if map does not contains key, put element with value 1
            }else{
                val = val+1;//val++, ++val
                valueCounter.put(str,val); //increment counter if map already exists element
                duplicateCount++;
            }
        }
        Set<Map.Entry<String, Integer>> entrySet = valueCounter.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"=>"+entry.getValue());
            }
        }
        System.out.println("\nTotal Amount of Duplicates: " + duplicateCount);
	}
}