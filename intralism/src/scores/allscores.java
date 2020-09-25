package scores;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import scores.functions;

public class allscores {
	
	public static Object[][] getAllScores(String link) throws IOException {
		Document doc = Jsoup.connect(link).get();
		String profileInfo = doc.toString();
		BufferedReader bufReader = new BufferedReader(new StringReader(profileInfo));
		String line=null;
		String user = "", globalrank = "", totalglobalrank = "", countryrank = "", totalcountryrank = "", country = "", pictureLink = "";
		
		csvReader reader = new csvReader();
		String[][] mapdata = reader.getCSVContent("scores.csv");
		Object allscores[][] = new Object[mapdata.length][8];
		
		for(int i = 0; i<allscores.length;i++) {
			mapdata[i][0] = mapdata[i][0].replaceAll("COMMA", ",");
			mapdata[i][0] = mapdata[i][0].replaceAll("QUOTE", "\"");
			allscores[i][0] = (String) mapdata[i][0];
			allscores[i][1] = (int) 0;
			allscores[i][2] = (double)0;
			allscores[i][3] = (int)0;
			allscores[i][4] = (double)0.0;
			allscores[i][5] = Double.parseDouble(mapdata[i][1]);
			allscores[i][6] = (double)0.0;
			allscores[i][7] = (String) mapdata[i][2];
		}
	    
		while( (line=bufReader.readLine()) != null )
		{
			
			if(line.contains("/sharedfiles/filedetails/") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				for(int i=0;i<mapdata.length;i++) {
					if(line.contains("id=" + mapdata[i][3])) {
						String[] mapDetail = functions.getMapDetail(bufReader.readLine(), bufReader.readLine(), bufReader.readLine(), bufReader.readLine());
						allscores[i][1] = Integer.parseInt(mapDetail[0]);
						allscores[i][2] = Double.parseDouble(mapDetail[1]);
				    	allscores[i][3] = Integer.parseInt(mapDetail[2]);
				    	allscores[i][4] = Double.parseDouble(mapDetail[3]);
					}
				}
  	
			} else if(line.contains("<title>")) {
				user = line;
		    	int anumber = user.indexOf(">");  
		    	int bnumber = user.toString().indexOf("<", anumber);
		    	user = user.substring(anumber+13, bnumber);
		    	
			} else if(line.contains("strong>Global Rank")) {
				line = bufReader.readLine();
				globalrank = line;
		    	int anumber = globalrank.indexOf("\">");  
		    	int bnumber = globalrank.toString().indexOf("</span", anumber);
		    	globalrank = globalrank.substring(anumber+2, bnumber);
		    	
		    	totalglobalrank = line;
		    	anumber = totalglobalrank.indexOf("</span>");
		    	totalglobalrank = totalglobalrank.substring(anumber+10, line.length());
		    	
			} else if(line.contains("Country Rank")) {
				line = bufReader.readLine();
				countryrank = line;
				int anumber = countryrank.indexOf("\">");
				int bnumber = countryrank.toString().indexOf("</span", anumber);
				countryrank = countryrank.substring(anumber+2, bnumber);
				
				totalcountryrank = line;
				anumber = totalcountryrank.indexOf("</span");
				totalcountryrank = totalcountryrank.substring(anumber+10, line.length());
				
			} else if(line.contains(">#")) {
				country = bufReader.readLine();
				int anumber = country.indexOf("title=\"");
				int bnumber = country.toString().indexOf("><span", anumber);
				country = country.substring(anumber+7,bnumber-1);
				
			} else if(line.contains("og:image")) {
				pictureLink = bufReader.readLine();
				int anumber = pictureLink.indexOf("content");
				int bnumber = pictureLink.toString().indexOf(">");
				pictureLink = pictureLink.substring(anumber+9, bnumber-1);
			}
	
		}
		
		double[] recalcResult = functions.recalc(allscores);
		double avgmiss = recalcResult[0], avgacc = recalcResult[1], rankedpoints = recalcResult[2], realpoints = recalcResult[3], maximumpoints = recalcResult[4], totaldifference = recalcResult[5];
		int hundredcount = (int) recalcResult[6];
		int mapcount = allscores.length;
		
		JFrame profileFrame = new JFrame(user + "'s Profile");
		profileFrame.setLocation(main.getJFrame().getX() - 470, main.getJFrame().getY());
		profileFrame.setSize(470,200);
		profileFrame.setVisible(true);
		profileFrame.setLayout(new FlowLayout());
		
		JLabel username = new JLabel(user);
		username.setFont(username.getFont().deriveFont(20.0f));
		
		JLabel profilepicture = new JLabel();
		URL url = new URL(pictureLink);
		BufferedImage profilepic = ImageIO.read(url);
		profilepic = functions.resize(profilepic,100,100);
		profilepicture.setIcon(new ImageIcon(profilepic));
		profileFrame.add(profilepicture);
		
		String[] lblList = {"Global Rank\n" + globalrank + " / " + totalglobalrank, country + " Rank\n" + countryrank + " / " + totalcountryrank, "AVG Misses\n" + avgmiss, "AVG Accuracy\n" + avgacc + " %",
				"Points\n" + rankedpoints, "Real Points\n" + realpoints, "Max Points\n" + maximumpoints, "Difference\n" + totaldifference, "100% Plays\n" + hundredcount, "Total Maps\n" + mapcount};
		
		for(int i=0; i < 10; i++) {
			String[] splitter = lblList[i].split("\n");
			JLabel label = new JLabel("<html><body> " + splitter[0] + "&nbsp;&nbsp;<br>" + splitter[1] + "&nbsp;&nbsp;&nbsp;&nbsp;</html></body>");
			profileFrame.add(label);
		}
		
		return allscores;
	}

}
