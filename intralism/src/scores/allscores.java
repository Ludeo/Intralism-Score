package scores;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Allscores {

    private static final String SPAN = "</span";

    private Allscores() {
	throw new IllegalStateException("Utility class");
    }

    public static Object[][] getAllScores(String link) throws IOException {
	Document doc = Jsoup.connect(link).get();
	String profileInfo = doc.toString();
	BufferedReader bufReader = new BufferedReader(new StringReader(profileInfo));
	String line = null;
	String user = "";
	String globalrank = "";
	String totalglobalrank = "";
	String countryrank = "";
	String totalcountryrank = "";
	String country = "";
	String pictureLink = "";

	CSVReader reader = new CSVReader();
	String[][] mapdata = reader.getCSVContent("scores.csv");
	Object[][] allscores = Functions.fillAllscores(mapdata);

	while ((line = bufReader.readLine()) != null) {

	    if (line.contains("/sharedfiles/filedetails/") && !line.contains("Random") && !line.contains("Hidden")
		    && !line.contains("Endless")) {
		int i = Functions.findIForAllscores(line, mapdata);

		if (i != Integer.MAX_VALUE) {
		    String[] mapDetail = Functions.getMapDetail(bufReader.readLine(), bufReader.readLine(),
			    bufReader.readLine(), bufReader.readLine());
		    allscores[i][1] = Integer.parseInt(mapDetail[0]);
		    allscores[i][2] = Double.parseDouble(mapDetail[1]);
		    allscores[i][3] = Integer.parseInt(mapDetail[2]);
		    allscores[i][4] = Double.parseDouble(mapDetail[3]);
		}

	    } else if (line.contains("<title>")) {
		user = line;
		int anumber = user.indexOf(">");
		int bnumber = user.indexOf("<", anumber);
		user = user.substring(anumber + 13, bnumber);

	    } else if (line.contains("strong>Global Rank")) {
		line = bufReader.readLine();
		globalrank = line;
		int anumber = globalrank.indexOf("\">");
		int bnumber = globalrank.indexOf(SPAN, anumber);
		globalrank = globalrank.substring(anumber + 2, bnumber);

		totalglobalrank = line;
		anumber = totalglobalrank.indexOf("</span>");
		totalglobalrank = totalglobalrank.substring(anumber + 10, line.length());

	    } else if (line.contains("Country Rank")) {
		line = bufReader.readLine();
		countryrank = line;
		int anumber = countryrank.indexOf("\">");
		int bnumber = countryrank.indexOf(SPAN, anumber);
		countryrank = countryrank.substring(anumber + 2, bnumber);

		totalcountryrank = line;
		anumber = totalcountryrank.indexOf(SPAN);
		totalcountryrank = totalcountryrank.substring(anumber + 10, line.length());

	    } else if (line.contains(">#")) {
		country = bufReader.readLine();
		int anumber = country.indexOf("title=\"");
		int bnumber = country.indexOf("><span", anumber);
		country = country.substring(anumber + 7, bnumber - 1);

	    } else if (line.contains("og:image")) {
		pictureLink = bufReader.readLine();
		int anumber = pictureLink.indexOf("content");
		int bnumber = pictureLink.indexOf(">");
		pictureLink = pictureLink.substring(anumber + 9, bnumber - 1);
	    }

	}

	double[] recalcResult = Functions.recalc(allscores);
	double avgmiss = recalcResult[0];
	double avgacc = recalcResult[1];
	double rankedpoints = recalcResult[2];
	double realpoints = recalcResult[3];
	double maximumpoints = recalcResult[4];
	double totaldifference = recalcResult[5];
	double rankUpPoints = Functions.getRankUpPoints(link, globalrank, rankedpoints);

	int hundredcount = (int) recalcResult[6];
	int mapcount = allscores.length;

	JFrame profileFrame = new JFrame(user + "'s Profile");
	profileFrame.setLocation(Main.getJFrame().getX() - 470, Main.getJFrame().getY());
	profileFrame.setSize(540, 200);
	profileFrame.setVisible(true);

	JPanel profilePanel = new JPanel();
	profilePanel.setLayout(new FlowLayout());
	profilePanel.setSize(540, 200);
	profileFrame.add(profilePanel);

	JLabel profilepicture = new JLabel();
	URL url = new URL(pictureLink);
	BufferedImage profilepic = ImageIO.read(url);
	profilepic = Functions.resize(profilepic, 100, 100);
	profilepicture.setIcon(new ImageIcon(profilepic));
	profilePanel.add(profilepicture);

	String[] lblList = { "Global Rank\n" + globalrank + " / " + totalglobalrank,
		country + " Rank\n" + countryrank + " / " + totalcountryrank, "AVG Misses\n" + avgmiss,
		"AVG Accuracy\n" + avgacc + " %", "Points\n" + rankedpoints, "Real Points\n" + realpoints,
		"Max Points\n" + maximumpoints, "Difference\n" + totaldifference, "100% Plays\n" + hundredcount,
		"Total Maps\n" + mapcount, "Points till rankup\n" + rankUpPoints };

	for (int i = 0; i < 11; i++) {
	    String[] splitter = lblList[i].split("\n");
	    JLabel label = new JLabel("<html><body> " + splitter[0] + "&nbsp;&nbsp;<br>" + splitter[1]
		    + "&nbsp;&nbsp;&nbsp;&nbsp;</html></body>");
	    profilePanel.add(label);
	}

	Map<String, String> configMap = Functions.getConfigMap();

	boolean darkmode = Boolean.parseBoolean(configMap.get("DarkMode"));
	if (darkmode) {
	    profilePanel.setBackground(Color.DARK_GRAY);
	    profilePanel.setForeground(Color.WHITE);

	    Functions.changeDarkmodeProfileFrame(profilePanel.getComponents());
	}

	Functions.saveLastChecked(link);

	return allscores;
    }

}
