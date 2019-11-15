package intralism;

import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.helper.Validate;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;


public class instagram {
    public static void main(String args[]) throws Exception {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Link:");
    	String url = in.nextLine();
    	Document doc = Jsoup.connect(url).get();
    	int anumber = doc.toString().indexOf("display_url");  //16473
    	int bnumber = doc.toString().indexOf(".jpg", anumber);
    	System.out.println(doc.toString().substring(anumber+14, bnumber) + ".jpg");
    }
}