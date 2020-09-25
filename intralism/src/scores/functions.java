package scores;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class functions {
	
	public static String[] getMapDetail(String score, String acc, String miss, String points) {
		String[] inputvalues = {score, acc, miss, points};
		String[] outputvalues = new String[4];
		
		for(int i = 0; i < inputvalues.length; i++) {
			
			String value = inputvalues[i];
			int anumber = value.indexOf(">");  
	    	int bnumber = value.toString().indexOf("<", anumber);
	    	value = value.substring(anumber+1, bnumber);
	    	
	    	if(i != 1) outputvalues[i] = value.replaceAll("\\s+","");
	    	else {
	    		value = value.replaceAll("\\n+", "");
	    		outputvalues[i] = value.replaceAll("%", "");
	    	}
		}
		
		return outputvalues;
	}
	
	public static double[] recalc(Object allscores[][]) {
		double totalacc = 0, totaldifference = 0, realpoints = 0, rankedpoints = 0, maximumpoints = 0;
		int totalmiss = 0, hundredcount = 0, mapcount = allscores.length;
		
		for(int i = 0; i<allscores.length;i++) {
			if(allscores[i][0] != null) {
				double points = (double) allscores[i][4];
				double maxpoints = (double) allscores[i][5];
				double actpoints = points;
				realpoints += points;
				maximumpoints += maxpoints;
				
				if(allscores[i][7].toString().contentEquals("Broken")) {
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
