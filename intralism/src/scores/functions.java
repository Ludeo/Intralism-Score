package scores;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class functions {
	
	public static int getScore(String line) {
		String score = line;
		int anumber = score.indexOf(">");  
    	int bnumber = score.toString().indexOf("<", anumber);
    	score = score.substring(anumber+1, bnumber);
		return Integer.parseInt(score.replaceAll("\\s+",""));
	}
	
	public static double getAcc(String line) {
		String acc = line;
    	int anumber = acc.indexOf(">");  
    	int bnumber = acc.toString().indexOf("<", anumber);
    	acc = acc.substring(anumber+1, bnumber);
    	acc = acc.replaceAll("\\n+", "");
    	return Double.parseDouble(acc.replaceAll("%", ""));
	}
	
	public static int getMiss(String line) {
		String miss = line;
    	int anumber = miss.indexOf(">");  
    	int bnumber = miss.toString().indexOf("<", anumber);
    	miss = miss.substring(anumber+1, bnumber);
    	return Integer.parseInt(miss.replaceAll("\\s+", ""));
	}
	
	public static double getPoints(String line) {
		String points = line;
    	int anumber = points.indexOf(">");  
    	int bnumber = points.toString().indexOf("<", anumber);
    	points = points.substring(anumber+1, bnumber);
    	return Double.parseDouble(points.replaceAll("\\s+", ""));
	}
	
	public static double[] recalc(Object allscores[][]) {
		double totalacc = 0;
		int totalmiss = 0;
		double totaldifference = 0;
		int hundredcount = 0;
		double realpoints = 0;
		double rankedpoints = 0;
		double maximumpoints = 0;
		int mapcount = allscores.length;
		
		for(int i = 0; i<allscores.length;i++) {
			if(allscores[i][0] != null) {
				double points = (double) allscores[i][4];
				double maxpoints = (double) allscores[i][5];
				double actpoints = points;
				realpoints += points;
				maximumpoints += maxpoints;
				
				if(allscores[i][7].toString().contentEquals("Broken")) {
					System.out.println("test");
					if(points == maxpoints) {
						
						if(allscores[i][0] == "Indigo Child - Nostalgia") {
							allscores[i][4] = (double) 1.87;
							actpoints = points - 0.01;
						} else if(allscores[i][0] == "Mizutani Hiromi - Hidamari Michi to Ren-chon") {
							allscores[i][4] = (double) 2.11;
							actpoints = points - 0.01;
						} else if(allscores[i][0] == "Oskar Schuster - Wunder") {
							allscores[i][4] = (double) 2.86;
							actpoints = points - 0.01;
						} else {
							actpoints = points - 0.01;
							allscores[i][4] = (double) actpoints;
						}
					}
					
					rankedpoints +=  actpoints;
				} else {
					rankedpoints +=  points;
				}
				
				totalacc += (double) allscores[i][2];
				totalmiss += (int) allscores[i][3];
				
				double a = (double) allscores[i][5];
				double b = (double) allscores[i][4];
				allscores[i][6] = (double) a - b;
				totaldifference += (double) allscores[i][6];
				
				if((double)allscores[i][2] == (double) 100.00) {
					hundredcount++;
				}
				
			}
		}
		
		double avgaccexact = totalacc / mapcount;
		double avgacc = (double)Math.round(avgaccexact * 10000)/10000;
		
		double avgmiss = (double)totalmiss / mapcount;
		avgmiss = (double) Math.round(avgmiss * 100)/100;
		
		totaldifference = (double) Math.round(totaldifference * 100)/100;
		
		realpoints = (double)Math.round(realpoints * 100)/100;
		rankedpoints = (double)Math.round(rankedpoints * 100)/100;
		maximumpoints = (double)Math.round(maximumpoints * 100)/100;
		
		double[] result = {avgmiss, avgacc, rankedpoints, realpoints, maximumpoints, totaldifference, hundredcount};
		return result;
		
	}
	
	public static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

}
