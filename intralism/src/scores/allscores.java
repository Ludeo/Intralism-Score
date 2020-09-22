package scores;

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
		Object allscores[][] = new Object[251][8];
		String user = "";
		String globalrank = ""; 
		String totalglobalrank = ""; 
		String countryrank = "";
		String totalcountryrank = "";
		String country = "";
		String pictureLink = "";
		
		csvReader reader = new csvReader();
		String[][] mapdata = reader.getCSVContent("C://Users//lucas//eclipse-workspace//intralismScoreChecker//src//scores//scores.csv");
		
		for(int i = 0; i<allscores.length;i++) {
			mapdata[i][0] = mapdata[i][0].replaceAll("COMMA", ",");
			mapdata[i][0] = mapdata[i][0].replaceAll("&quot;", "\"");
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
						allscores[i][1] = (int) functions.getScore(bufReader.readLine());
				    	allscores[i][2] = (double) functions.getAcc(bufReader.readLine());
				    	allscores[i][3] = (int) functions.getMiss(bufReader.readLine());
				    	allscores[i][4] = (double) functions.getPoints(bufReader.readLine());
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
		double avgmiss = recalcResult[0];
		double avgacc = recalcResult[1];
		double rankedpoints = recalcResult[2];
		double realpoints = recalcResult[3];
		double maximumpoints = recalcResult[4];
		double totaldifference = recalcResult[5];
		int hundredcount = (int) recalcResult[6];
		int mapcount = allscores.length;

		JFrame profileFrame = new JFrame("Profile");
		profileFrame.setBounds(400,300,300,290);
		profileFrame.setResizable(false);
		profileFrame.setVisible(true);
		
		JLabel username = new JLabel(user);
		username.setBounds(120,10,200,20);
		username.setLayout(null);
		username.setFont(username.getFont().deriveFont(20.0f));
		profileFrame.add(username);
		
		JLabel profilepicture = new JLabel();
		profilepicture.setBounds(10,10,100,100);
		URL url = new URL(pictureLink);
		BufferedImage profilepic = ImageIO.read(url);
		profilepic = functions.resize(profilepic,100,100);
		profilepicture.setIcon(new ImageIcon(profilepic));
		profilepicture.setLayout(null);
		profileFrame.add(profilepicture);
		
		JLabel grank1 = new JLabel("Global Rank");
		grank1.setBounds(120,45,100,10);
		grank1.setLayout(null);
		profileFrame.add(grank1);
		
		JLabel grank2 = new JLabel(globalrank + " / " + totalglobalrank);
		grank2.setBounds(120,60,100,10);
		grank2.setLayout(null);
		profileFrame.add(grank2);
		
		JLabel crank1 = new JLabel(country + " Rank");
		crank1.setBounds(120,75,200,15);
		crank1.setLayout(null);
		profileFrame.add(crank1);
		
		JLabel crank2 = new JLabel(countryrank + " / " + totalcountryrank);
		crank2.setBounds(120,90,100,10);
		crank2.setLayout(null);
		profileFrame.add(crank2);
		
		JLabel avgmissl1 = new JLabel("AVG Misses");
		avgmissl1.setBounds(10,120,100,15);
		avgmissl1.setLayout(null);
		profileFrame.add(avgmissl1);
		
		JLabel avgmissl2 = new JLabel(avgmiss + "");
		avgmissl2.setBounds(10,135,100,10);
		avgmissl2.setLayout(null);
		profileFrame.add(avgmissl2);
		
		JLabel avgaccl1 = new JLabel("AVG Accuracy");
		avgaccl1.setBounds(100,120,100,15);
		avgaccl1.setLayout(null);
		profileFrame.add(avgaccl1);
		
		JLabel avgaccl2 = new JLabel(avgacc + " %");
		avgaccl2.setBounds(100,135,100,10);
		avgaccl2.setLayout(null);
		profileFrame.add(avgaccl2);
		
		JLabel pointsl1 = new JLabel("Points");
		pointsl1.setBounds(10,160,100,15);
		pointsl1.setLayout(null);
		profileFrame.add(pointsl1);
		
		JLabel pointsl2 = new JLabel(rankedpoints+"");
		pointsl2.setBounds(10,175,100,10);
		pointsl2.setLayout(null);
		profileFrame.add(pointsl2);
		
		JLabel realpointsl1 = new JLabel("Real Points");
		realpointsl1.setBounds(80,160,100,15);
		realpointsl1.setLayout(null);
		profileFrame.add(realpointsl1);
		
		JLabel realpointsl2 = new JLabel(realpoints + "");
		realpointsl2.setBounds(80,175,100,10);
		realpointsl2.setLayout(null);
		profileFrame.add(realpointsl2);
		
		JLabel rankedpointsl1 = new JLabel("Max Points");
		rankedpointsl1.setBounds(170,160,100,15);
		rankedpointsl1.setLayout(null);
		profileFrame.add(rankedpointsl1);
		
		JLabel rankedpointsl2 = new JLabel(maximumpoints + "");
		rankedpointsl2.setBounds(170,175,100,10);
		rankedpointsl2.setLayout(null);
		profileFrame.add(rankedpointsl2);
		
		JLabel pointdiffl1 = new JLabel("Difference");
		pointdiffl1.setBounds(10,205,100,15);
		pointdiffl1.setLayout(null);
		profileFrame.add(pointdiffl1);
		
		JLabel pointdiffl2 = new JLabel(totaldifference + "");
		pointdiffl2.setBounds(10,220,100,10);
		pointdiffl2.setLayout(null);
		profileFrame.add(pointdiffl2);
		
		JLabel hundredcountl1 = new JLabel("100% Plays");
		hundredcountl1.setBounds(80,205,100,15);
		hundredcountl1.setLayout(null);
		profileFrame.add(hundredcountl1);
		
		JLabel hundredcountl2 = new JLabel(hundredcount + "");
		hundredcountl2.setBounds(80,220,100,10);
		hundredcountl2.setLayout(null);
		profileFrame.add(hundredcountl2);
		
		JLabel totalmapl1 = new JLabel("Total Maps");
		totalmapl1.setBounds(155,205,100,15);
		totalmapl1.setLayout(null);
		profileFrame.add(totalmapl1);
		
		JLabel totalmapl2 = new JLabel(mapcount + "");
		totalmapl2.setBounds(155,220,100,15);
		totalmapl2.setLayout(null);
		profileFrame.add(totalmapl2);
		
		JLabel trash = new JLabel("");
		trash.setBounds(800,800,0,0);
		trash.setLayout(null);
		profileFrame.add(trash);
		
		return allscores;
	}

}
