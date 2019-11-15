package scores;

public class functions {
	
	public static String getScore(String line) {
		String score = line;
		int anumber = score.indexOf(">");  
    	int bnumber = score.toString().indexOf("<", anumber);
    	score = score.substring(anumber+1, bnumber);
		return score;
	}
	
	public static String getAcc(String line) {
		String acc = line;
    	int anumber = acc.indexOf(">");  
    	int bnumber = acc.toString().indexOf("<", anumber);
    	acc = acc.substring(anumber+1, bnumber);
    	return acc;
	}
	
	public static String getMiss(String line) {
		String miss = line;
    	int anumber = miss.indexOf(">");  
    	int bnumber = miss.toString().indexOf("<", anumber);
    	miss = miss.substring(anumber+1, bnumber);
    	return miss;
	}
	
	public static String getPoints(String line) {
		String points = line;
    	int anumber = points.indexOf(">");  
    	int bnumber = points.toString().indexOf("<", anumber);
    	points = points.substring(anumber+1, bnumber);
    	return points;
	}

}
