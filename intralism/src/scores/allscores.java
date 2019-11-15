package scores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class allscores {
	
	public static String[][] getAllScores(String link) throws IOException {
		Document doc = Jsoup.connect(link).get();
		String test = doc.toString();
		BufferedReader bufReader = new BufferedReader(new StringReader(test));
		String line=null;
		String allscores[][] = new String[151][7];
		
		while( (line=bufReader.readLine()) != null )
		{
			if(line.contains("Cardiac Sound") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[0][0] = "【東方Vocal／Trance】 Cardiac Sound";
		    	allscores[0][1] = functions.getScore(bufReader.readLine());
		    	allscores[0][2] = functions.getAcc(bufReader.readLine());
		    	allscores[0][3] = functions.getMiss(bufReader.readLine());
		    	allscores[0][4] = functions.getPoints(bufReader.readLine());
		    	allscores[0][5] = "11.71";
		    	allscores[0][6] = "Not Broken";
		    	
			} else if(line.contains("3rd Prototype") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[1][0] = "3rd Prototype - Together [NCS Release]";
		    	allscores[1][1] = functions.getScore(bufReader.readLine());
		    	allscores[1][2] = functions.getAcc(bufReader.readLine());
		    	allscores[1][3] = functions.getMiss(bufReader.readLine());
		    	allscores[1][4] = functions.getPoints(bufReader.readLine());
		    	allscores[1][5] = "11.97";
		    	allscores[1][6] = "Not Broken";
		    	
			} else if(line.contains("Abo Tekashi") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[2][0] = "Abo Tekashi - Hoshi no Kanaderu Uta (music box)";
		    	allscores[2][1] = functions.getScore(bufReader.readLine());
		    	allscores[2][2] = functions.getAcc(bufReader.readLine());
		    	allscores[2][3] = functions.getMiss(bufReader.readLine());
		    	allscores[2][4] = functions.getPoints(bufReader.readLine());
		    	allscores[2][5] = "3.07";
		    	allscores[2][6] = "Broken";
		    	
			} else if(line.contains("Ether Strike") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[3][0] = "Akira Complex - Ether Strike";
		    	allscores[3][1] = functions.getScore(bufReader.readLine());
		    	allscores[3][2] = functions.getAcc(bufReader.readLine());
		    	allscores[3][3] = functions.getMiss(bufReader.readLine());
		    	allscores[3][4] = functions.getPoints(bufReader.readLine());
		    	allscores[3][5] = "18.87";
		    	allscores[3][6] = "Idk";
		    	
			} else if(line.contains("Alvaro Soler") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[4][0] = "Alvaro Soler - Sofia";
		    	allscores[4][1] = functions.getScore(bufReader.readLine());
		    	allscores[4][2] = functions.getAcc(bufReader.readLine());
		    	allscores[4][3] = functions.getMiss(bufReader.readLine());
		    	allscores[4][4] = functions.getPoints(bufReader.readLine());
		    	allscores[4][5] = "6.83";
		    	allscores[4][6] = "Broken";
		    	
			} else if(line.contains("Divine Sorrow") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[5][0] = "Avicii feat, Wyclef Jean - Divine Sorrow";
		    	allscores[5][1] = functions.getScore(bufReader.readLine());
		    	allscores[5][2] = functions.getAcc(bufReader.readLine());
		    	allscores[5][3] = functions.getMiss(bufReader.readLine());
		    	allscores[5][4] = functions.getPoints(bufReader.readLine());
		    	allscores[5][5] = "8.02";
		    	allscores[5][6] = "Not Broken";
		    	
			} else if(line.contains("A Boat Beneath") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[6][0] = "AWKWARD i - A Boat Beneath a Sunny Sky [Remix by Arjen Lubach]";
		    	allscores[6][1] = functions.getScore(bufReader.readLine());
		    	allscores[6][2] = functions.getAcc(bufReader.readLine());
		    	allscores[6][3] = functions.getMiss(bufReader.readLine());
		    	allscores[6][4] = functions.getPoints(bufReader.readLine());
		    	allscores[6][5] = "7.69";
		    	allscores[6][6] = "Not Broken";
		    	
			} else if(line.contains("Antithese") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[7][0] = "Blacklolita - Antithese";
		    	allscores[7][1] = functions.getScore(bufReader.readLine());
		    	allscores[7][2] = functions.getAcc(bufReader.readLine());
		    	allscores[7][3] = functions.getMiss(bufReader.readLine());
		    	allscores[7][4] = functions.getPoints(bufReader.readLine());
		    	allscores[7][5] = "19.36";
		    	allscores[7][6] = "Idk";
		    	
			} else if(line.contains("Breathe") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[8][0] = "Breathe";
		    	allscores[8][1] = functions.getScore(bufReader.readLine());
		    	allscores[8][2] = functions.getAcc(bufReader.readLine());
		    	allscores[8][3] = functions.getMiss(bufReader.readLine());
		    	allscores[8][4] = functions.getPoints(bufReader.readLine());
		    	allscores[8][5] = "12.37";
		    	allscores[8][6] = "Broken";
		    	
			} else if(line.contains("Bring me to life") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[9][0] = "Bring me to life - DaTweekaz Remix (cut)";
		    	allscores[9][1] = functions.getScore(bufReader.readLine());
		    	allscores[9][2] = functions.getAcc(bufReader.readLine());
		    	allscores[9][3] = functions.getMiss(bufReader.readLine());
		    	allscores[9][4] = functions.getPoints(bufReader.readLine());
		    	allscores[9][5] = "7.55";
		    	allscores[9][6] = "Not Broken";
		    	
			} else if(line.contains("Bryce Fox") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[10][0] = "Bryce Fox - Horns (STéLOUSE Remix)";
		    	allscores[10][1] = functions.getScore(bufReader.readLine());
		    	allscores[10][2] = functions.getAcc(bufReader.readLine());
		    	allscores[10][3] = functions.getMiss(bufReader.readLine());
		    	allscores[10][4] = functions.getPoints(bufReader.readLine());
		    	allscores[10][5] = "10.23";
		    	allscores[10][6] = "Broken";
		    	
			} else if(line.contains("Bassline Yatteru") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[11][0] = "Camellia - Bassline Yatteru? LOL [feat, Nanahira] [cut]";
		    	allscores[11][1] = functions.getScore(bufReader.readLine());
		    	allscores[11][2] = functions.getAcc(bufReader.readLine());
		    	allscores[11][3] = functions.getMiss(bufReader.readLine());
		    	allscores[11][4] = functions.getPoints(bufReader.readLine());
		    	allscores[11][5] = "9.61";
		    	allscores[11][6] = "Broken";
		    	
			} else if(line.contains("GHOST") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[12][0] = "Camellia - GHOST";
		    	allscores[12][1] = functions.getScore(bufReader.readLine());
		    	allscores[12][2] = functions.getAcc(bufReader.readLine());
		    	allscores[12][3] = functions.getMiss(bufReader.readLine());
		    	allscores[12][4] = functions.getPoints(bufReader.readLine());
		    	allscores[12][5] = "35.38";
		    	allscores[12][6] = "Idk";
		    	
			} else if(line.contains("Be Wild") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[13][0] = "Camellia feat, Yukacco - Be Wild [cut]";
		    	allscores[13][1] = functions.getScore(bufReader.readLine());
		    	allscores[13][2] = functions.getAcc(bufReader.readLine());
		    	allscores[13][3] = functions.getMiss(bufReader.readLine());
		    	allscores[13][4] = functions.getPoints(bufReader.readLine());
		    	allscores[13][5] = "14.86";
		    	allscores[13][6] = "Broken";
		    	
			} else if(line.contains("Mirai Puzzle") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[14][0] = "Chino (CV, Minase Inori) - Mirai Puzzle (cut)";
		    	allscores[14][1] = functions.getScore(bufReader.readLine());
		    	allscores[14][2] = functions.getAcc(bufReader.readLine());
		    	allscores[14][3] = functions.getMiss(bufReader.readLine());
		    	allscores[14][4] = functions.getPoints(bufReader.readLine());
		    	allscores[14][5] = "6.56";
		    	allscores[14][6] = "Broken";
		    	
			} else if(line.contains("Ugoku, Ugoku") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[15][0] = "Chito (Inori Minase) & Yuuri (Yurika Kubo) - Ugoku, Ugoku";
		    	allscores[15][1] = functions.getScore(bufReader.readLine());
		    	allscores[15][2] = functions.getAcc(bufReader.readLine());
		    	allscores[15][3] = functions.getMiss(bufReader.readLine());
		    	allscores[15][4] = functions.getPoints(bufReader.readLine());
		    	allscores[15][5] = "6.73";
		    	allscores[15][6] = "Not Broken";
		    	
			} else if(line.contains("The Awakening") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[16][0] = "Christian Baczyk - The Awakening [Star Wars Tribute]";
		    	allscores[16][1] = functions.getScore(bufReader.readLine());
		    	allscores[16][2] = functions.getAcc(bufReader.readLine());
		    	allscores[16][3] = functions.getMiss(bufReader.readLine());
		    	allscores[16][4] = functions.getPoints(bufReader.readLine());
		    	allscores[16][5] = "2.72";
		    	allscores[16][6] = "Not Broken";
		    	
			} else if(line.contains("Chroma - I") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[17][0] = "Chroma - I";
		    	allscores[17][1] = functions.getScore(bufReader.readLine());
		    	allscores[17][2] = functions.getAcc(bufReader.readLine());
		    	allscores[17][3] = functions.getMiss(bufReader.readLine());
		    	allscores[17][4] = functions.getPoints(bufReader.readLine());
		    	allscores[17][5] = "21.73";
		    	allscores[17][6] = "idk";
		    	
			} else if(line.contains("cillia - FIRST") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[18][0] = "cillia - FIRST";
		    	allscores[18][1] = functions.getScore(bufReader.readLine());
		    	allscores[18][2] = functions.getAcc(bufReader.readLine());
		    	allscores[18][3] = functions.getMiss(bufReader.readLine());
		    	allscores[18][4] = functions.getPoints(bufReader.readLine());
		    	allscores[18][5] = "11.27";
		    	allscores[18][6] = "Not Broken";
		    	
			} else if(line.contains("Clannad ED") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[19][0] = "Clannad ED";
		    	allscores[19][1] = functions.getScore(bufReader.readLine());
		    	allscores[19][2] = functions.getAcc(bufReader.readLine());
		    	allscores[19][3] = functions.getMiss(bufReader.readLine());
		    	allscores[19][4] = functions.getPoints(bufReader.readLine());
		    	allscores[19][5] = "3.55";
		    	allscores[19][6] = "Broken";
		    	
			} else if(line.contains("ClariS - Hitorigoto") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[20][0] = "ClariS - Hitorigoto";
		    	allscores[20][1] = functions.getScore(bufReader.readLine());
		    	allscores[20][2] = functions.getAcc(bufReader.readLine());
		    	allscores[20][3] = functions.getMiss(bufReader.readLine());
		    	allscores[20][4] = functions.getPoints(bufReader.readLine());
		    	allscores[20][5] = "8.38";
		    	allscores[20][6] = "Not Broken";
		    	
			} else if(line.contains("Miracle Colors") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[21][0] = "Colors * Slash - Miracle Colors * Honjitsu mo Ijou Nashi!";
		    	allscores[21][1] = functions.getScore(bufReader.readLine());
		    	allscores[21][2] = functions.getAcc(bufReader.readLine());
		    	allscores[21][3] = functions.getMiss(bufReader.readLine());
		    	allscores[21][4] = functions.getPoints(bufReader.readLine());
		    	allscores[21][5] = "17.44";
		    	allscores[21][6] = "Not Broken";
		    	
			} else if(line.contains("Acid Wolfpack") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[22][0] = "Coyote Kisses - Acid Wolfpack";
		    	allscores[22][1] = functions.getScore(bufReader.readLine());
		    	allscores[22][2] = functions.getAcc(bufReader.readLine());
		    	allscores[22][3] = functions.getMiss(bufReader.readLine());
		    	allscores[22][4] = functions.getPoints(bufReader.readLine());
		    	allscores[22][5] = "14.83";
		    	allscores[22][6] = "Broken";
		    	
			} else if(line.contains("Crywolf - Epilogue") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[23][0] = "Crywolf - Epilogue [Ossuary] (Cataclasm)";
		    	allscores[23][1] = functions.getScore(bufReader.readLine());
		    	allscores[23][2] = functions.getAcc(bufReader.readLine());
		    	allscores[23][3] = functions.getMiss(bufReader.readLine());
		    	allscores[23][4] = functions.getPoints(bufReader.readLine());
		    	allscores[23][5] = "3.69";
		    	allscores[23][6] = "Not Broken";
		    	
			} else if(line.contains("Cupidz - Sheet (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[24][0] = "Cupidz - Sheet (cut)";
		    	allscores[24][1] = functions.getScore(bufReader.readLine());
		    	allscores[24][2] = functions.getAcc(bufReader.readLine());
		    	allscores[24][3] = functions.getMiss(bufReader.readLine());
		    	allscores[24][4] = functions.getPoints(bufReader.readLine());
		    	allscores[24][5] = "11.72";
		    	allscores[24][6] = "Not Broken";
		    	
			} else if(line.contains("Technologic") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[25][0] = "Daft Punk - Technologic";
		    	allscores[25][1] = functions.getScore(bufReader.readLine());
		    	allscores[25][2] = functions.getAcc(bufReader.readLine());
		    	allscores[25][3] = functions.getMiss(bufReader.readLine());
		    	allscores[25][4] = functions.getPoints(bufReader.readLine());
		    	allscores[25][5] = "8.91";
		    	allscores[25][6] = "Broken";
		    	
			} else if(line.contains("DANCE TILL YOU'RE DEAD") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[26][0] = "DANCE TILL YOU'RE DEAD";
		    	allscores[26][1] = functions.getScore(bufReader.readLine());
		    	allscores[26][2] = functions.getAcc(bufReader.readLine());
		    	allscores[26][3] = functions.getMiss(bufReader.readLine());
		    	allscores[26][4] = functions.getPoints(bufReader.readLine());
		    	allscores[26][5] = "12.08";
		    	allscores[26][6] = "Broken";
		    	
			} else if(line.contains("Derpy - Nyan Nyan Dance") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[27][0] = "Derpy - Nyan Nyan Dance";
		    	allscores[27][1] = functions.getScore(bufReader.readLine());
		    	allscores[27][2] = functions.getAcc(bufReader.readLine());
		    	allscores[27][3] = functions.getMiss(bufReader.readLine());
		    	allscores[27][4] = functions.getPoints(bufReader.readLine());
		    	allscores[27][5] = "12.09";
		    	allscores[27][6] = "Not Broken";
		    	
			} else if(line.contains("Destination Calabria") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[28][0] = "Destination Calabria - Alex Gaudino";
		    	allscores[28][1] = functions.getScore(bufReader.readLine());
		    	allscores[28][2] = functions.getAcc(bufReader.readLine());
		    	allscores[28][3] = functions.getMiss(bufReader.readLine());
		    	allscores[28][4] = functions.getPoints(bufReader.readLine());
		    	allscores[28][5] = "8.52";
		    	allscores[28][6] = "Not Broken";
		    	
			} else if(line.contains("Die Antwoord - Alien") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[29][0] = "Die Antwoord - Alien";
		    	allscores[29][1] = functions.getScore(bufReader.readLine());
		    	allscores[29][2] = functions.getAcc(bufReader.readLine());
		    	allscores[29][3] = functions.getMiss(bufReader.readLine());
		    	allscores[29][4] = functions.getPoints(bufReader.readLine());
		    	allscores[29][5] = "10.54";
		    	allscores[29][6] = "Broken";
		    	
			} else if(line.contains("Alquimia") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[30][0] = "Different Heaven & EH!DE - Alquimia";
		    	allscores[30][1] = functions.getScore(bufReader.readLine());
		    	allscores[30][2] = functions.getAcc(bufReader.readLine());
		    	allscores[30][3] = functions.getMiss(bufReader.readLine());
		    	allscores[30][4] = functions.getPoints(bufReader.readLine());
		    	allscores[30][5] = "18.85";
		    	allscores[30][6] = "idk";
		    	
			} else if(line.contains("DJ Myosuke - Black Territory") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[31][0] = "DJ Myosuke - Black Territory";
		    	allscores[31][1] = functions.getScore(bufReader.readLine());
		    	allscores[31][2] = functions.getAcc(bufReader.readLine());
		    	allscores[31][3] = functions.getMiss(bufReader.readLine());
		    	allscores[31][4] = functions.getPoints(bufReader.readLine());
		    	allscores[31][5] = "18.86";
		    	allscores[31][6] = "idk";
		    	
			} else if(line.contains("Domestic na kanojo OP") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[32][0] = "Domestic na kanojo OP";
		    	allscores[32][1] = functions.getScore(bufReader.readLine());
		    	allscores[32][2] = functions.getAcc(bufReader.readLine());
		    	allscores[32][3] = functions.getMiss(bufReader.readLine());
		    	allscores[32][4] = functions.getPoints(bufReader.readLine());
		    	allscores[32][5] = "15.71";
		    	allscores[32][6] = "Not Broken";
		    	
			} else if(line.contains("Drop - Granat") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[33][0] = "Drop - Granat";
		    	allscores[33][1] = functions.getScore(bufReader.readLine());
		    	allscores[33][2] = functions.getAcc(bufReader.readLine());
		    	allscores[33][3] = functions.getMiss(bufReader.readLine());
		    	allscores[33][4] = functions.getPoints(bufReader.readLine());
		    	allscores[33][5] = "6.79";
		    	allscores[33][6] = "Broken";
		    	
			} else if(line.contains("Duca - Nekoichi [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[34][0] = "Duca - Nekoichi [cut]";
		    	allscores[34][1] = functions.getScore(bufReader.readLine());
		    	allscores[34][2] = functions.getAcc(bufReader.readLine());
		    	allscores[34][3] = functions.getMiss(bufReader.readLine());
		    	allscores[34][4] = functions.getPoints(bufReader.readLine());
		    	allscores[34][5] = "8.02";
		    	allscores[34][6] = "Not Broken";
		    	
			} else if(line.contains("East of Eden") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[35][0] = "East of Eden";
		    	allscores[35][1] = functions.getScore(bufReader.readLine());
		    	allscores[35][2] = functions.getAcc(bufReader.readLine());
		    	allscores[35][3] = functions.getMiss(bufReader.readLine());
		    	allscores[35][4] = functions.getPoints(bufReader.readLine());
		    	allscores[35][5] = "8.1";
		    	allscores[35][6] = "Not Broken";
		    	
			} else if(line.contains("Limited Dimension") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[36][0] = "EastNewSound - Limited Dimension";
		    	allscores[36][1] = functions.getScore(bufReader.readLine());
		    	allscores[36][2] = functions.getAcc(bufReader.readLine());
		    	allscores[36][3] = functions.getMiss(bufReader.readLine());
		    	allscores[36][4] = functions.getPoints(bufReader.readLine());
		    	allscores[36][5] = "6.18";
		    	allscores[36][6] = "Broken";
		    	
			} else if(line.contains("EnV – Anubis") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[37][0] = "EnV – Anubis";
		    	allscores[37][1] = functions.getScore(bufReader.readLine());
		    	allscores[37][2] = functions.getAcc(bufReader.readLine());
		    	allscores[37][3] = functions.getMiss(bufReader.readLine());
		    	allscores[37][4] = functions.getPoints(bufReader.readLine());
		    	allscores[37][5] = "9.64";
		    	allscores[37][6] = "Not Broken";
		    	
			} else if(line.contains("Feint - Outbreak") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[38][0] = "Feint - Outbreak [feat, MYLK] [cut]";
		    	allscores[38][1] = functions.getScore(bufReader.readLine());
		    	allscores[38][2] = functions.getAcc(bufReader.readLine());
		    	allscores[38][3] = functions.getMiss(bufReader.readLine());
		    	allscores[38][4] = functions.getPoints(bufReader.readLine());
		    	allscores[38][5] = "11.28";
		    	allscores[38][6] = "Broken";
		    	
			} else if(line.contains("Futari No Kimochi (Flute)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[39][0] = "Futari No Kimochi (Flute)";
		    	allscores[39][1] = functions.getScore(bufReader.readLine());
		    	allscores[39][2] = functions.getAcc(bufReader.readLine());
		    	allscores[39][3] = functions.getMiss(bufReader.readLine());
		    	allscores[39][4] = functions.getPoints(bufReader.readLine());
		    	allscores[39][5] = "2.71";
		    	allscores[39][6] = "Not Broken";
		    	
			} else if(line.contains("GARNiDELiA - Gokuraku Jodo [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[40][0] = "GARNiDELiA - Gokuraku Jodo [cut]";
		    	allscores[40][1] = functions.getScore(bufReader.readLine());
		    	allscores[40][2] = functions.getAcc(bufReader.readLine());
		    	allscores[40][3] = functions.getMiss(bufReader.readLine());
		    	allscores[40][4] = functions.getPoints(bufReader.readLine());
		    	allscores[40][5] = "8.34";
		    	allscores[40][6] = "Not Broken";
		    	
			} else if(line.contains("Nurture (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[41][0] = "Glacier feat, Brenna Myers - Nurture (cut)";
		    	allscores[41][1] = functions.getScore(bufReader.readLine());
		    	allscores[41][2] = functions.getAcc(bufReader.readLine());
		    	allscores[41][3] = functions.getMiss(bufReader.readLine());
		    	allscores[41][4] = functions.getPoints(bufReader.readLine());
		    	allscores[41][5] = "4.59";
		    	allscores[41][6] = "Not Broken";
		    	
			} else if(line.contains("guardin - Solitary") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[42][0] = "guardin - Solitary";
		    	allscores[42][1] = functions.getScore(bufReader.readLine());
		    	allscores[42][2] = functions.getAcc(bufReader.readLine());
		    	allscores[42][3] = functions.getMiss(bufReader.readLine());
		    	allscores[42][4] = functions.getPoints(bufReader.readLine());
		    	allscores[42][5] = "10.36";
		    	allscores[42][6] = "Broken";
		    	
			} else if(line.contains("Halozy - Brilliant Colors") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[43][0] = "Halozy - Brilliant Colors";
		    	allscores[43][1] = functions.getScore(bufReader.readLine());
		    	allscores[43][2] = functions.getAcc(bufReader.readLine());
		    	allscores[43][3] = functions.getMiss(bufReader.readLine());
		    	allscores[43][4] = functions.getPoints(bufReader.readLine());
		    	allscores[43][5] = "10.24";
		    	allscores[43][6] = "Broken";
		    	
			} else if(line.contains("Halozy - Three Magic") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[44][0] = "Halozy - Three Magic";
		    	allscores[44][1] = functions.getScore(bufReader.readLine());
		    	allscores[44][2] = functions.getAcc(bufReader.readLine());
		    	allscores[44][3] = functions.getMiss(bufReader.readLine());
		    	allscores[44][4] = functions.getPoints(bufReader.readLine());
		    	allscores[44][5] = "13.17";
		    	allscores[44][6] = "Not Broken";
		    	
			} else if(line.contains("Halsey ‒ Gasoline") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[45][0] = "Halsey ‒ Gasoline";
		    	allscores[45][1] = functions.getScore(bufReader.readLine());
		    	allscores[45][2] = functions.getAcc(bufReader.readLine());
		    	allscores[45][3] = functions.getMiss(bufReader.readLine());
		    	allscores[45][4] = functions.getPoints(bufReader.readLine());
		    	allscores[45][5] = "6.73";
		    	allscores[45][6] = "Not Broken";
		    	
			} else if(line.contains("HopeX - Into The Clouds (Nightcore)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[46][0] = "HopeX - Into The Clouds (Nightcore)";
		    	allscores[46][1] = functions.getScore(bufReader.readLine());
		    	allscores[46][2] = functions.getAcc(bufReader.readLine());
		    	allscores[46][3] = functions.getMiss(bufReader.readLine());
		    	allscores[46][4] = functions.getPoints(bufReader.readLine());
		    	allscores[46][5] = "23.51";
		    	allscores[46][6] = "Not Broken";
		    	
			} else if(line.contains("Hydelic - Connected [Yours Forever] [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[47][0] = "Hydelic - Connected [Yours Forever] [cut]";
		    	allscores[47][1] = functions.getScore(bufReader.readLine());
		    	allscores[47][2] = functions.getAcc(bufReader.readLine());
		    	allscores[47][3] = functions.getMiss(bufReader.readLine());
		    	allscores[47][4] = functions.getPoints(bufReader.readLine());
		    	allscores[47][5] = "5.19";
		    	allscores[47][6] = "Not Broken";
		    	
			} else if(line.contains("Imperio - \"Atlantis\"") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[48][0] = "Imperio - \"Atlantis\"";
		    	allscores[48][1] = functions.getScore(bufReader.readLine());
		    	allscores[48][2] = functions.getAcc(bufReader.readLine());
		    	allscores[48][3] = functions.getMiss(bufReader.readLine());
		    	allscores[48][4] = functions.getPoints(bufReader.readLine());
		    	allscores[48][5] = "6.83";
		    	allscores[48][6] = "Broken";
		    	
			} else if(line.contains("Indigo Child - Nostalgia") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[49][0] = "Indigo Child - Nostalgia";
		    	allscores[49][1] = functions.getScore(bufReader.readLine());
		    	allscores[49][2] = functions.getAcc(bufReader.readLine());
		    	allscores[49][3] = functions.getMiss(bufReader.readLine());
		    	allscores[49][4] = functions.getPoints(bufReader.readLine());
		    	allscores[49][5] = "1.88";
		    	allscores[49][6] = "Broken";
		    	
			} else if(line.contains("iNO - Suishoku Komachi Melancholia") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[50][0] = "iNO - Suishoku Komachi Melancholia";
		    	allscores[50][1] = functions.getScore(bufReader.readLine());
		    	allscores[50][2] = functions.getAcc(bufReader.readLine());
		    	allscores[50][3] = functions.getMiss(bufReader.readLine());
		    	allscores[50][4] = functions.getPoints(bufReader.readLine());
		    	allscores[50][5] = "6.5";
		    	allscores[50][6] = "Not Broken";
		    	
			} else if(line.contains("Ito Kanako - Fatima (Steins;Gate 0)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[51][0] = "Ito Kanako - Fatima (Steins;Gate 0)";
		    	allscores[51][1] = functions.getScore(bufReader.readLine());
		    	allscores[51][2] = functions.getAcc(bufReader.readLine());
		    	allscores[51][3] = functions.getMiss(bufReader.readLine());
		    	allscores[51][4] = functions.getPoints(bufReader.readLine());
		    	allscores[51][5] = "10.58";
		    	allscores[51][6] = "Broken";
		    	
			} else if(line.contains("JAKIN - Bipolar (feat. Generic)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[52][0] = "JAKIN - Bipolar (feat. Generic)";
		    	allscores[52][1] = functions.getScore(bufReader.readLine());
		    	allscores[52][2] = functions.getAcc(bufReader.readLine());
		    	allscores[52][3] = functions.getMiss(bufReader.readLine());
		    	allscores[52][4] = functions.getPoints(bufReader.readLine());
		    	allscores[52][5] = "19.37";
		    	allscores[52][6] = "Not Broken";
		    	
			} else if(line.contains("Wowie Zowie!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[53][0] = "jubeat clan (Hommarju) - Wowie Zowie!";
		    	allscores[53][1] = functions.getScore(bufReader.readLine());
		    	allscores[53][2] = functions.getAcc(bufReader.readLine());
		    	allscores[53][3] = functions.getMiss(bufReader.readLine());
		    	allscores[53][4] = functions.getPoints(bufReader.readLine());
		    	allscores[53][5] = "20.25";
		    	allscores[53][6] = "idk";
		    	
			} else if(line.contains("id=1611574921") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[54][0] = "K/DA - POP/STARS";
		    	allscores[54][1] = functions.getScore(bufReader.readLine());
		    	allscores[54][2] = functions.getAcc(bufReader.readLine());
		    	allscores[54][3] = functions.getMiss(bufReader.readLine());
		    	allscores[54][4] = functions.getPoints(bufReader.readLine());
		    	allscores[54][5] = "12.48";
		    	allscores[54][6] = "Broken";
		    	
			} else if(line.contains("Kenny B - Parijs") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[55][0] = "Kenny B - Parijs";
		    	allscores[55][1] = functions.getScore(bufReader.readLine());
		    	allscores[55][2] = functions.getAcc(bufReader.readLine());
		    	allscores[55][3] = functions.getMiss(bufReader.readLine());
		    	allscores[55][4] = functions.getPoints(bufReader.readLine());
		    	allscores[55][5] = "7.29";
		    	allscores[55][6] = "Broken";
		    	
			} else if(line.contains("Kara Kara Kara") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[56][0] = "Kikuo - Kara Kara Kara no Kara";
		    	allscores[56][1] = functions.getScore(bufReader.readLine());
		    	allscores[56][2] = functions.getAcc(bufReader.readLine());
		    	allscores[56][3] = functions.getMiss(bufReader.readLine());
		    	allscores[56][4] = functions.getPoints(bufReader.readLine());
		    	allscores[56][5] = "28.72";
		    	allscores[56][6] = "idk";
		    	
			} else if(line.contains("Chikatto Chika Chika") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[57][0] = "Konomi Kohara - Chikatto Chika Chika [Sati Akura Cover]";
		    	allscores[57][1] = functions.getScore(bufReader.readLine());
		    	allscores[57][2] = functions.getAcc(bufReader.readLine());
		    	allscores[57][3] = functions.getMiss(bufReader.readLine());
		    	allscores[57][4] = functions.getPoints(bufReader.readLine());
		    	allscores[57][5] = "11.03";
		    	allscores[57][6] = "Broken";
		    	
			} else if(line.contains("Laur -\"Sound Chimera\"") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[58][0] = "Laur -\"Sound Chimera\"";
		    	allscores[58][1] = functions.getScore(bufReader.readLine());
		    	allscores[58][2] = functions.getAcc(bufReader.readLine());
		    	allscores[58][3] = functions.getMiss(bufReader.readLine());
		    	allscores[58][4] = functions.getPoints(bufReader.readLine());
		    	allscores[58][5] = "28.28";
		    	allscores[58][6] = "idk";
		    	
			} else if(line.contains("Electric Daisy Violin") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[59][0] = "Lindsey Stirling - Electric Daisy Violin";
		    	allscores[59][1] = functions.getScore(bufReader.readLine());
		    	allscores[59][2] = functions.getAcc(bufReader.readLine());
		    	allscores[59][3] = functions.getMiss(bufReader.readLine());
		    	allscores[59][4] = functions.getPoints(bufReader.readLine());
		    	allscores[59][5] = "17.16";
		    	allscores[59][6] = "Broken";
		    	
			} else if(line.contains("Sweet Love") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[60][0] = "Liviu Hodor - Sweet Love [Feat, Mona]";
		    	allscores[60][1] = functions.getScore(bufReader.readLine());
		    	allscores[60][2] = functions.getAcc(bufReader.readLine());
		    	allscores[60][3] = functions.getMiss(bufReader.readLine());
		    	allscores[60][4] = functions.getPoints(bufReader.readLine());
		    	allscores[60][5] = "8.21";
		    	allscores[60][6] = "Not Broken";
		    	
			} else if(line.contains("Lobby") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[61][0] = "Lobby";
		    	allscores[61][1] = functions.getScore(bufReader.readLine());
		    	allscores[61][2] = functions.getAcc(bufReader.readLine());
		    	allscores[61][3] = functions.getMiss(bufReader.readLine());
		    	allscores[61][4] = functions.getPoints(bufReader.readLine());
		    	allscores[61][5] = "8.62";
		    	allscores[61][6] = "Broken";
		    	
			} else if(line.contains("Death Bringer") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[62][0] = "Lord Swan3x & RYVI - Death Bringer";
		    	allscores[62][1] = functions.getScore(bufReader.readLine());
		    	allscores[62][2] = functions.getAcc(bufReader.readLine());
		    	allscores[62][3] = functions.getMiss(bufReader.readLine());
		    	allscores[62][4] = functions.getPoints(bufReader.readLine());
		    	allscores[62][5] = "15.69";
		    	allscores[62][6] = "idk";
		    	
			} else if(line.contains("Moonlight Sonata") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[63][0] = "Ludwig van Beethoven - Moonlight Sonata [Mvt, 1]";
		    	allscores[63][1] = functions.getScore(bufReader.readLine());
		    	allscores[63][2] = functions.getAcc(bufReader.readLine());
		    	allscores[63][3] = functions.getMiss(bufReader.readLine());
		    	allscores[63][4] = functions.getPoints(bufReader.readLine());
		    	allscores[63][5] = "2.18";
		    	allscores[63][6] = "Not Broken";
		    	
			} else if(line.contains("M-O-T-U - Snowman") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[64][0] = "M-O-T-U - Snowman [feat, Hatsune Miku] [cut]";
		    	allscores[64][1] = functions.getScore(bufReader.readLine());
		    	allscores[64][2] = functions.getAcc(bufReader.readLine());
		    	allscores[64][3] = functions.getMiss(bufReader.readLine());
		    	allscores[64][4] = functions.getPoints(bufReader.readLine());
		    	allscores[64][5] = "5.03";
		    	allscores[64][6] = "Not Broken";
		    	
			} else if(line.contains("A Bella!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[65][0] = "M2U - A Bella! [feat, Lucy]";
		    	allscores[65][1] = functions.getScore(bufReader.readLine());
		    	allscores[65][2] = functions.getAcc(bufReader.readLine());
		    	allscores[65][3] = functions.getMiss(bufReader.readLine());
		    	allscores[65][4] = functions.getPoints(bufReader.readLine());
		    	allscores[65][5] = "10.31";
		    	allscores[65][6] = "Not Broken";
		    	
			} else if(line.contains("Mahoutsukai no Yome (Opening ST) - Here") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[66][0] = "Mahoutsukai no Yome (Opening ST) - Here";
		    	allscores[66][1] = functions.getScore(bufReader.readLine());
		    	allscores[66][2] = functions.getAcc(bufReader.readLine());
		    	allscores[66][3] = functions.getMiss(bufReader.readLine());
		    	allscores[66][4] = functions.getPoints(bufReader.readLine());
		    	allscores[66][5] = "11.23";
		    	allscores[66][6] = "Broken";
		    	
			} else if(line.contains("Mantis Lords") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[67][0] = "Mantis Lords";
		    	allscores[67][1] = functions.getScore(bufReader.readLine());
		    	allscores[67][2] = functions.getAcc(bufReader.readLine());
		    	allscores[67][3] = functions.getMiss(bufReader.readLine());
		    	allscores[67][4] = functions.getPoints(bufReader.readLine());
		    	allscores[67][5] = "11.11";
		    	allscores[67][6] = "idk";
		    	
			} else if(line.contains("White Happy") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[68][0] = "MARETU ft. Hatsune Miku - White Happy";
		    	allscores[68][1] = functions.getScore(bufReader.readLine());
		    	allscores[68][2] = functions.getAcc(bufReader.readLine());
		    	allscores[68][3] = functions.getMiss(bufReader.readLine());
		    	allscores[68][4] = functions.getPoints(bufReader.readLine());
		    	allscores[68][5] = "17.83";
		    	allscores[68][6] = "Broken";
		    	
			} else if(line.contains("Marnik - Up") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[69][0] = "Marnik - Up & Down";
		    	allscores[69][1] = functions.getScore(bufReader.readLine());
		    	allscores[69][2] = functions.getAcc(bufReader.readLine());
		    	allscores[69][3] = functions.getMiss(bufReader.readLine());
		    	allscores[69][4] = functions.getPoints(bufReader.readLine());
		    	allscores[69][5] = "9.76";
		    	allscores[69][6] = "Not Broken";
		    	
			} else if(line.contains("Marshmello - FRIENDS") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[70][0] = "Marshmello - FRIENDS";
		    	allscores[70][1] = functions.getScore(bufReader.readLine());
		    	allscores[70][2] = functions.getAcc(bufReader.readLine());
		    	allscores[70][3] = functions.getMiss(bufReader.readLine());
		    	allscores[70][4] = functions.getPoints(bufReader.readLine());
		    	allscores[70][5] = "10.46";
		    	allscores[70][6] = "Not Broken";
		    	
			} else if(line.contains("Bad Apple!!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[71][0] = "Masayoshi Minoshima - Bad Apple!! [feat. Nomico]";
		    	allscores[71][1] = functions.getScore(bufReader.readLine());
		    	allscores[71][2] = functions.getAcc(bufReader.readLine());
		    	allscores[71][3] = functions.getMiss(bufReader.readLine());
		    	allscores[71][4] = functions.getPoints(bufReader.readLine());
		    	allscores[71][5] = "11.25";
		    	allscores[71][6] = "Not Broken";
		    	
			} else if(line.contains("Minecraft Piano Theme") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[72][0] = "Minecraft Piano Theme";
		    	allscores[72][1] = functions.getScore(bufReader.readLine());
		    	allscores[72][2] = functions.getAcc(bufReader.readLine());
		    	allscores[72][3] = functions.getMiss(bufReader.readLine());
		    	allscores[72][4] = functions.getPoints(bufReader.readLine());
		    	allscores[72][5] = "2.68";
		    	allscores[72][6] = "Not Broken";
		    	
			} else if(line.contains("Michi to Ren-chon") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[73][0] = "Mizutani Hiromi - Hidamari Michi to Ren-chon";
		    	allscores[73][1] = functions.getScore(bufReader.readLine());
		    	allscores[73][2] = functions.getAcc(bufReader.readLine());
		    	allscores[73][3] = functions.getMiss(bufReader.readLine());
		    	allscores[73][4] = functions.getPoints(bufReader.readLine());
		    	allscores[73][5] = "2.12";
		    	allscores[73][6] = "Broken";
		    	
			} else if(line.contains("Monetochka — It is a Pain") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[74][0] = "Monetochka — It is a Pain";
		    	allscores[74][1] = functions.getScore(bufReader.readLine());
		    	allscores[74][2] = functions.getAcc(bufReader.readLine());
		    	allscores[74][3] = functions.getMiss(bufReader.readLine());
		    	allscores[74][4] = functions.getPoints(bufReader.readLine());
		    	allscores[74][5] = "11.1";
		    	allscores[74][6] = "idk";
		    	
			} else if(line.contains("Monetochka — Mom, I don't drop siegs") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[75][0] = "Monetochka — Mom, I don't drop siegs";
		    	allscores[75][1] = functions.getScore(bufReader.readLine());
		    	allscores[75][2] = functions.getAcc(bufReader.readLine());
		    	allscores[75][3] = functions.getMiss(bufReader.readLine());
		    	allscores[75][4] = functions.getPoints(bufReader.readLine());
		    	allscores[75][5] = "5.77";
		    	allscores[75][6] = "Broken";
		    	
			} else if(line.contains("id=1574185982") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[76][0] = "My Heart";
		    	allscores[76][1] = functions.getScore(bufReader.readLine());
		    	allscores[76][2] = functions.getAcc(bufReader.readLine());
		    	allscores[76][3] = functions.getMiss(bufReader.readLine());
		    	allscores[76][4] = functions.getPoints(bufReader.readLine());
		    	allscores[76][5] = "11.5";
		    	allscores[76][6] = "Not Broken";
		    	
			} else if(line.contains("Namice – Perfection") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[77][0] = "Namice – Perfection";
		    	allscores[77][1] = functions.getScore(bufReader.readLine());
		    	allscores[77][2] = functions.getAcc(bufReader.readLine());
		    	allscores[77][3] = functions.getMiss(bufReader.readLine());
		    	allscores[77][4] = functions.getPoints(bufReader.readLine());
		    	allscores[77][5] = "7.56";
		    	allscores[77][6] = "Broken";
		    	
			} else if(line.contains("Nega/squared - Mellow") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[78][0] = "Nega/squared - Mellow";
		    	allscores[78][1] = functions.getScore(bufReader.readLine());
		    	allscores[78][2] = functions.getAcc(bufReader.readLine());
		    	allscores[78][3] = functions.getMiss(bufReader.readLine());
		    	allscores[78][4] = functions.getPoints(bufReader.readLine());
		    	allscores[78][5] = "6.59";
		    	allscores[78][6] = "Not Broken";
		    	
			} else if(line.contains("Nekomata Master - Sleepless Days") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[79][0] = "Nekomata Master - Sleepless Days [feat, Mayumi Morinaga]";
		    	allscores[79][1] = functions.getScore(bufReader.readLine());
		    	allscores[79][2] = functions.getAcc(bufReader.readLine());
		    	allscores[79][3] = functions.getMiss(bufReader.readLine());
		    	allscores[79][4] = functions.getPoints(bufReader.readLine());
		    	allscores[79][5] = "6.89";
		    	allscores[79][6] = "Broken";
		    	
			} else if(line.contains("Never Say Die One Hunderd Mix [Intro]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[80][0] = "Never Say Die One Hunderd Mix [Intro]";
		    	allscores[80][1] = functions.getScore(bufReader.readLine());
		    	allscores[80][2] = functions.getAcc(bufReader.readLine());
		    	allscores[80][3] = functions.getMiss(bufReader.readLine());
		    	allscores[80][4] = functions.getPoints(bufReader.readLine());
		    	allscores[80][5] = "12.87";
		    	allscores[80][6] = "idk";
		    	
			} else if(line.contains("The Family - Hej Monica") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[81][0] = "Nic & The Family - Hej Monica (PewDiePie cover) (Party In Backyard Remix)";
		    	allscores[81][1] = functions.getScore(bufReader.readLine());
		    	allscores[81][2] = functions.getAcc(bufReader.readLine());
		    	allscores[81][3] = functions.getMiss(bufReader.readLine());
		    	allscores[81][4] = functions.getPoints(bufReader.readLine());
		    	allscores[81][5] = "7.85";
		    	allscores[81][6] = "Broken";
		    	
			} else if(line.contains("Nicolas Dominique - Yay! (PonyTime Rework)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[82][0] = "Nicolas Dominique - Yay! (PonyTime Rework)";
		    	allscores[82][1] = functions.getScore(bufReader.readLine());
		    	allscores[82][2] = functions.getAcc(bufReader.readLine());
		    	allscores[82][3] = functions.getMiss(bufReader.readLine());
		    	allscores[82][4] = functions.getPoints(bufReader.readLine());
		    	allscores[82][5] = "11.21";
		    	allscores[82][6] = "Not Broken";
		    	
			} else if(line.contains("Nienna - Oonagh (Nightcore)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[83][0] = "Nienna - Oonagh (Nightcore)";
		    	allscores[83][1] = functions.getScore(bufReader.readLine());
		    	allscores[83][2] = functions.getAcc(bufReader.readLine());
		    	allscores[83][3] = functions.getMiss(bufReader.readLine());
		    	allscores[83][4] = functions.getPoints(bufReader.readLine());
		    	allscores[83][5] = "7.81";
		    	allscores[83][6] = "Broken";
		    	
			} else if(line.contains("Night of Nights") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[84][0] = "Night of Nights";
		    	allscores[84][1] = functions.getScore(bufReader.readLine());
		    	allscores[84][2] = functions.getAcc(bufReader.readLine());
		    	allscores[84][3] = functions.getMiss(bufReader.readLine());
		    	allscores[84][4] = functions.getPoints(bufReader.readLine());
		    	allscores[84][5] = "24.29";
		    	allscores[84][6] = "idk";
		    	
			} else if(line.contains("NightHawk22 - Perfect Storm") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[85][0] = "NightHawk22 - Perfect Storm";
		    	allscores[85][1] = functions.getScore(bufReader.readLine());
		    	allscores[85][2] = functions.getAcc(bufReader.readLine());
		    	allscores[85][3] = functions.getMiss(bufReader.readLine());
		    	allscores[85][4] = functions.getPoints(bufReader.readLine());
		    	allscores[85][5] = "19.93";
		    	allscores[85][6] = "idk";
		    	
			} else if(line.contains("No title - GRRP Remix") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[86][0] = "No title - GRRP Remix - English Cover【KIRA feat, rachie】";
		    	allscores[86][1] = functions.getScore(bufReader.readLine());
		    	allscores[86][2] = functions.getAcc(bufReader.readLine());
		    	allscores[86][3] = functions.getMiss(bufReader.readLine());
		    	allscores[86][4] = functions.getPoints(bufReader.readLine());
		    	allscores[86][5] = "17.64";
		    	allscores[86][6] = "Broken";
		    	
			} else if(line.contains("Omoi - Teo") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[87][0] = "Omoi - Teo";
		    	allscores[87][1] = functions.getScore(bufReader.readLine());
		    	allscores[87][2] = functions.getAcc(bufReader.readLine());
		    	allscores[87][3] = functions.getMiss(bufReader.readLine());
		    	allscores[87][4] = functions.getPoints(bufReader.readLine());
		    	allscores[87][5] = "15.06";
		    	allscores[87][6] = "Not Broken";
		    	
			} else if(line.contains("Oskar Schuster - Singur") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[88][0] = "Oskar Schuster - Singur";
		    	allscores[88][1] = functions.getScore(bufReader.readLine());
		    	allscores[88][2] = functions.getAcc(bufReader.readLine());
		    	allscores[88][3] = functions.getMiss(bufReader.readLine());
		    	allscores[88][4] = functions.getPoints(bufReader.readLine());
		    	allscores[88][5] = "3.46";
		    	allscores[88][6] = "Not Broken";
		    	
			} else if(line.contains("Oskar Schuster - Wunder") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[89][0] = "Oskar Schuster - Wunder";
		    	allscores[89][1] = functions.getScore(bufReader.readLine());
		    	allscores[89][2] = functions.getAcc(bufReader.readLine());
		    	allscores[89][3] = functions.getMiss(bufReader.readLine());
		    	allscores[89][4] = functions.getPoints(bufReader.readLine());
		    	allscores[89][5] = "2.87";
		    	allscores[89][6] = "Broken";
		    	
			} else if(line.contains("OST The Rising of the Shield Hero") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[90][0] = "OST The Rising of the Shield Hero";
		    	allscores[90][1] = functions.getScore(bufReader.readLine());
		    	allscores[90][2] = functions.getAcc(bufReader.readLine());
		    	allscores[90][3] = functions.getMiss(bufReader.readLine());
		    	allscores[90][4] = functions.getPoints(bufReader.readLine());
		    	allscores[90][5] = "11.99";
		    	allscores[90][6] = "idk";
		    	
			} else if(line.contains("Overlord Op 1") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[91][0] = "Overlord Op 1";
		    	allscores[91][1] = functions.getScore(bufReader.readLine());
		    	allscores[91][2] = functions.getAcc(bufReader.readLine());
		    	allscores[91][3] = functions.getMiss(bufReader.readLine());
		    	allscores[91][4] = functions.getPoints(bufReader.readLine());
		    	allscores[91][5] = "12.36";
		    	allscores[91][6] = "Broken";
		    	
			} else if(line.contains("P4koo - Gothique Resonance") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[92][0] = "P4koo - Gothique Resonance";
		    	allscores[92][1] = functions.getScore(bufReader.readLine());
		    	allscores[92][2] = functions.getAcc(bufReader.readLine());
		    	allscores[92][3] = functions.getMiss(bufReader.readLine());
		    	allscores[92][4] = functions.getPoints(bufReader.readLine());
		    	allscores[92][5] = "23.91";
		    	allscores[92][6] = "idk";
		    	
			} else if(line.contains("Paganini - 24 Caprices Opus1 #5 in A Minor") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[93][0] = "Paganini - 24 Caprices Opus1 #5 in A Minor";
		    	allscores[93][1] = functions.getScore(bufReader.readLine());
		    	allscores[93][2] = functions.getAcc(bufReader.readLine());
		    	allscores[93][3] = functions.getMiss(bufReader.readLine());
		    	allscores[93][4] = functions.getPoints(bufReader.readLine());
		    	allscores[93][5] = "29.68";
		    	allscores[93][6] = "idk";
		    	
			} else if(line.contains("Madeon ‒ Shelter [Remix by happy30]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[94][0] = "Porter Robinson & Madeon ‒ Shelter [Remix by happy30]";
		    	allscores[94][1] = functions.getScore(bufReader.readLine());
		    	allscores[94][2] = functions.getAcc(bufReader.readLine());
		    	allscores[94][3] = functions.getMiss(bufReader.readLine());
		    	allscores[94][4] = functions.getPoints(bufReader.readLine());
		    	allscores[94][5] = "5.55";
		    	allscores[94][6] = "Not Broken";
		    	
			} else if(line.contains("Prism Magical - DJ SHARPNEL hardrave remix") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[95][0] = "Prism Magical - DJ SHARPNEL hardrave remix";
		    	allscores[95][1] = functions.getScore(bufReader.readLine());
		    	allscores[95][2] = functions.getAcc(bufReader.readLine());
		    	allscores[95][3] = functions.getMiss(bufReader.readLine());
		    	allscores[95][4] = functions.getPoints(bufReader.readLine());
		    	allscores[95][5] = "11.29";
		    	allscores[95][6] = "Broken";
		    	
			} else if(line.contains("Pskovskoe") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[96][0] = "Pskovskoe";
		    	allscores[96][1] = functions.getScore(bufReader.readLine());
		    	allscores[96][2] = functions.getAcc(bufReader.readLine());
		    	allscores[96][3] = functions.getMiss(bufReader.readLine());
		    	allscores[96][4] = functions.getPoints(bufReader.readLine());
		    	allscores[96][5] = "8.42";
		    	allscores[96][6] = "Not Broken";
		    	
			} else if(line.contains("Qrispy Joybox - Yuuki no Pendant") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[97][0] = "Qrispy Joybox - Yuuki no Pendant [feat, Chata]";
		    	allscores[97][1] = functions.getScore(bufReader.readLine());
		    	allscores[97][2] = functions.getAcc(bufReader.readLine());
		    	allscores[97][3] = functions.getMiss(bufReader.readLine());
		    	allscores[97][4] = functions.getPoints(bufReader.readLine());
		    	allscores[97][5] = "11.36";
		    	allscores[97][6] = "Broken";
		    	
			} else if(line.contains("R3 Music Box - Curtain Call!!!!!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[98][0] = "R3 Music Box - Curtain Call!!!!!";
		    	allscores[98][1] = functions.getScore(bufReader.readLine());
		    	allscores[98][2] = functions.getAcc(bufReader.readLine());
		    	allscores[98][3] = functions.getMiss(bufReader.readLine());
		    	allscores[98][4] = functions.getPoints(bufReader.readLine());
		    	allscores[98][5] = "3.9";
		    	allscores[98][6] = "Not Broken";
		    	
			} else if(line.contains("Rameses B – Infinity") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[99][0] = "Rameses B – Infinity";
		    	allscores[99][1] = functions.getScore(bufReader.readLine());
		    	allscores[99][2] = functions.getAcc(bufReader.readLine());
		    	allscores[99][3] = functions.getMiss(bufReader.readLine());
		    	allscores[99][4] = functions.getPoints(bufReader.readLine());
		    	allscores[99][5] = "11.18";
		    	allscores[99][6] = "Not Broken";
		    	
			} else if(line.contains("Rameses B – Visionary") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[100][0] = "Rameses B – Visionary";
		    	allscores[100][1] = functions.getScore(bufReader.readLine());
		    	allscores[100][2] = functions.getAcc(bufReader.readLine());
		    	allscores[100][3] = functions.getMiss(bufReader.readLine());
		    	allscores[100][4] = functions.getPoints(bufReader.readLine());
		    	allscores[100][5] = "11.42";
		    	allscores[100][6] = "Not Broken";
		    	
			} else if(line.contains("Ravel Nightstar - Flower Bless") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[101][0] = "Ravel Nightstar - Flower Bless";
		    	allscores[101][1] = functions.getScore(bufReader.readLine());
		    	allscores[101][2] = functions.getAcc(bufReader.readLine());
		    	allscores[101][3] = functions.getMiss(bufReader.readLine());
		    	allscores[101][4] = functions.getPoints(bufReader.readLine());
		    	allscores[101][5] = "19.75";
		    	allscores[101][6] = "idk";
		    	
			} else if(line.contains("Reign[Radio Edit]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[102][0] = "Reign[Radio Edit] - Maison & Dragon Feat, Amba Sheperd";
		    	allscores[102][1] = functions.getScore(bufReader.readLine());
		    	allscores[102][2] = functions.getAcc(bufReader.readLine());
		    	allscores[102][3] = functions.getMiss(bufReader.readLine());
		    	allscores[102][4] = functions.getPoints(bufReader.readLine());
		    	allscores[102][5] = "9.51";
		    	allscores[102][6] = "Not Broken";
		    	
			} else if(line.contains("Royal Blood - Out of the Black") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[103][0] = "Royal Blood - Out of the Black";
		    	allscores[103][1] = functions.getScore(bufReader.readLine());
		    	allscores[103][2] = functions.getAcc(bufReader.readLine());
		    	allscores[103][3] = functions.getMiss(bufReader.readLine());
		    	allscores[103][4] = functions.getPoints(bufReader.readLine());
		    	allscores[103][5] = "12.29";
		    	allscores[103][6] = "idk";
		    	
			} else if(line.contains("S3RL - Scary Movie") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[104][0] = "S3RL - Scary Movie";
		    	allscores[104][1] = functions.getScore(bufReader.readLine());
		    	allscores[104][2] = functions.getAcc(bufReader.readLine());
		    	allscores[104][3] = functions.getMiss(bufReader.readLine());
		    	allscores[104][4] = functions.getPoints(bufReader.readLine());
		    	allscores[104][5] = "16.91";
		    	allscores[104][6] = "Broken";
		    	
			} else if(line.contains("Sakakibara Yui - Doki Doki kokoro Flavor") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[105][0] = "Sakakibara Yui - Doki Doki kokoro Flavor";
		    	allscores[105][1] = functions.getScore(bufReader.readLine());
		    	allscores[105][2] = functions.getAcc(bufReader.readLine());
		    	allscores[105][3] = functions.getMiss(bufReader.readLine());
		    	allscores[105][4] = functions.getPoints(bufReader.readLine());
		    	allscores[105][5] = "10.19";
		    	allscores[105][6] = "Broken";
		    	
			} else if(line.contains("Sakuraburst - Cherry Blossoms") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[106][0] = "Sakuraburst - Cherry Blossoms Explode Across The Dying Horizons (cut)";
		    	allscores[106][1] = functions.getScore(bufReader.readLine());
		    	allscores[106][2] = functions.getAcc(bufReader.readLine());
		    	allscores[106][3] = functions.getMiss(bufReader.readLine());
		    	allscores[106][4] = functions.getPoints(bufReader.readLine());
		    	allscores[106][5] = "7.19";
		    	allscores[106][6] = "Not Broken";
		    	
			} else if(line.contains("Sapphire - Never More (English Cover)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[107][0] = "Sapphire - Never More (English Cover)";
		    	allscores[107][1] = functions.getScore(bufReader.readLine());
		    	allscores[107][2] = functions.getAcc(bufReader.readLine());
		    	allscores[107][3] = functions.getMiss(bufReader.readLine());
		    	allscores[107][4] = functions.getPoints(bufReader.readLine());
		    	allscores[107][5] = "3.71";
		    	allscores[107][6] = "Not Broken";
		    	
			} else if(line.contains("Seo9 - Explosion") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[108][0] = "Seo9 - Explosion";
		    	allscores[108][1] = functions.getScore(bufReader.readLine());
		    	allscores[108][2] = functions.getAcc(bufReader.readLine());
		    	allscores[108][3] = functions.getMiss(bufReader.readLine());
		    	allscores[108][4] = functions.getPoints(bufReader.readLine());
		    	allscores[108][5] = "19.61";
		    	allscores[108][6] = "idk";
		    	
			} else if(line.contains("Seunghwan Lee - True Eternity") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[109][0] = "Seunghwan Lee - True Eternity (Vocal - Emily) (Short Version)";
		    	allscores[109][1] = functions.getScore(bufReader.readLine());
		    	allscores[109][2] = functions.getAcc(bufReader.readLine());
		    	allscores[109][3] = functions.getMiss(bufReader.readLine());
		    	allscores[109][4] = functions.getPoints(bufReader.readLine());
		    	allscores[109][5] = "2.91";
		    	allscores[109][6] = "Not Broken";
		    	
			} else if(line.contains("Sky Of Scarlet Perception (Folk Remix)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[110][0] = "Sky Of Scarlet Perception (Folk Remix)";
		    	allscores[110][1] = functions.getScore(bufReader.readLine());
		    	allscores[110][2] = functions.getAcc(bufReader.readLine());
		    	allscores[110][3] = functions.getMiss(bufReader.readLine());
		    	allscores[110][4] = functions.getPoints(bufReader.readLine());
		    	allscores[110][5] = "7.24";
		    	allscores[110][6] = "Broken";
		    	
			} else if(line.contains("Soulji - Murder (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[111][0] = "Soulji - Murder (cut)";
		    	allscores[111][1] = functions.getScore(bufReader.readLine());
		    	allscores[111][2] = functions.getAcc(bufReader.readLine());
		    	allscores[111][3] = functions.getMiss(bufReader.readLine());
		    	allscores[111][4] = functions.getPoints(bufReader.readLine());
		    	allscores[111][5] = "15.22";
		    	allscores[111][6] = "Not Broken";
		    	
			} else if(line.contains("Sporty-O - Let Me Hit It") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[112][0] = "Sporty-O - Let Me Hit It";
		    	allscores[112][1] = functions.getScore(bufReader.readLine());
		    	allscores[112][2] = functions.getAcc(bufReader.readLine());
		    	allscores[112][3] = functions.getMiss(bufReader.readLine());
		    	allscores[112][4] = functions.getPoints(bufReader.readLine());
		    	allscores[112][5] = "8.58";
		    	allscores[112][6] = "Broken";
		    	
			} else if(line.contains("Star Driver - 5 Centimeters per second") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[113][0] = "Star Driver - 5 Centimeters per second";
		    	allscores[113][1] = functions.getScore(bufReader.readLine());
		    	allscores[113][2] = functions.getAcc(bufReader.readLine());
		    	allscores[113][3] = functions.getMiss(bufReader.readLine());
		    	allscores[113][4] = functions.getPoints(bufReader.readLine());
		    	allscores[113][5] = "10.55";
		    	allscores[113][6] = "Not Broken";
		    	
			} else if(line.contains("Subtact - Tunnel Vision [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[114][0] = "Subtact - Tunnel Vision [cut]";
		    	allscores[114][1] = functions.getScore(bufReader.readLine());
		    	allscores[114][2] = functions.getAcc(bufReader.readLine());
		    	allscores[114][3] = functions.getMiss(bufReader.readLine());
		    	allscores[114][4] = functions.getPoints(bufReader.readLine());
		    	allscores[114][5] = "10.96";
		    	allscores[114][6] = "Not Broken";
		    	
			} else if(line.contains("Tabinotochuu") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[115][0] = "Tabinotochuu";
		    	allscores[115][1] = functions.getScore(bufReader.readLine());
		    	allscores[115][2] = functions.getAcc(bufReader.readLine());
		    	allscores[115][3] = functions.getMiss(bufReader.readLine());
		    	allscores[115][4] = functions.getPoints(bufReader.readLine());
		    	allscores[115][5] = "5.75";
		    	allscores[115][6] = "Not Broken";
		    	
			} else if(line.contains("Taska Black - We Would Never Do") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[116][0] = "Taska Black - We Would Never Do (feat, Nevve) [Live Session]";
		    	allscores[116][1] = functions.getScore(bufReader.readLine());
		    	allscores[116][2] = functions.getAcc(bufReader.readLine());
		    	allscores[116][3] = functions.getMiss(bufReader.readLine());
		    	allscores[116][4] = functions.getPoints(bufReader.readLine());
		    	allscores[116][5] = "5.18";
		    	allscores[116][6] = "Broken";
		    	
			} else if(line.contains("Tears for Fears ‒ Mad World [Cover by Adam Lambert]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[117][0] = "Tears for Fears ‒ Mad World [Cover by Adam Lambert]";
		    	allscores[117][1] = functions.getScore(bufReader.readLine());
		    	allscores[117][2] = functions.getAcc(bufReader.readLine());
		    	allscores[117][3] = functions.getMiss(bufReader.readLine());
		    	allscores[117][4] = functions.getPoints(bufReader.readLine());
		    	allscores[117][5] = "5.64";
		    	allscores[117][6] = "Broken";
		    	
			} else if(line.contains("The Fat Rat - Fly Away") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[118][0] = "The Fat Rat - Fly Away";
		    	allscores[118][1] = functions.getScore(bufReader.readLine());
		    	allscores[118][2] = functions.getAcc(bufReader.readLine());
		    	allscores[118][3] = functions.getMiss(bufReader.readLine());
		    	allscores[118][4] = functions.getPoints(bufReader.readLine());
		    	allscores[118][5] = "5.71";
		    	allscores[118][6] = "Not Broken";
		    	
			} else if(line.contains("The Piano") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[119][0] = "The Piano";
		    	allscores[119][1] = functions.getScore(bufReader.readLine());
		    	allscores[119][2] = functions.getAcc(bufReader.readLine());
		    	allscores[119][3] = functions.getMiss(bufReader.readLine());
		    	allscores[119][4] = functions.getPoints(bufReader.readLine());
		    	allscores[119][5] = "4.25";
		    	allscores[119][6] = "Not Broken";
		    	
			} else if(line.contains("TheFatRat - MAYDAY") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[120][0] = "TheFatRat - MAYDAY (feat, Laura Brehm)";
		    	allscores[120][1] = functions.getScore(bufReader.readLine());
		    	allscores[120][2] = functions.getAcc(bufReader.readLine());
		    	allscores[120][3] = functions.getMiss(bufReader.readLine());
		    	allscores[120][4] = functions.getPoints(bufReader.readLine());
		    	allscores[120][5] = "7.72";
		    	allscores[120][6] = "Broken";
		    	
			} else if(line.contains("Thriftworks - Moon Juice") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[121][0] = "Thriftworks - Moon Juice";
		    	allscores[121][1] = functions.getScore(bufReader.readLine());
		    	allscores[121][2] = functions.getAcc(bufReader.readLine());
		    	allscores[121][3] = functions.getMiss(bufReader.readLine());
		    	allscores[121][4] = functions.getPoints(bufReader.readLine());
		    	allscores[121][5] = "6.38";
		    	allscores[121][6] = "idk";
		    	
			} else if(line.contains("Tia - The Glory Days (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[122][0] = "Tia - The Glory Days (cut)";
		    	allscores[122][1] = functions.getScore(bufReader.readLine());
		    	allscores[122][2] = functions.getAcc(bufReader.readLine());
		    	allscores[122][3] = functions.getMiss(bufReader.readLine());
		    	allscores[122][4] = functions.getPoints(bufReader.readLine());
		    	allscores[122][5] = "9.23";
		    	allscores[122][6] = "Broken";
		    	
			} else if(line.contains("Tokyo Machine - Epic") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[123][0] = "Tokyo Machine - Epic";
		    	allscores[123][1] = functions.getScore(bufReader.readLine());
		    	allscores[123][2] = functions.getAcc(bufReader.readLine());
		    	allscores[123][3] = functions.getMiss(bufReader.readLine());
		    	allscores[123][4] = functions.getPoints(bufReader.readLine());
		    	allscores[123][5] = "11.92";
		    	allscores[123][6] = "Not Broken";
		    	
			} else if(line.contains("Tokyo Machine - ROCK IT") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[124][0] = "Tokyo Machine - ROCK IT";
		    	allscores[124][1] = functions.getScore(bufReader.readLine());
		    	allscores[124][2] = functions.getAcc(bufReader.readLine());
		    	allscores[124][3] = functions.getMiss(bufReader.readLine());
		    	allscores[124][4] = functions.getPoints(bufReader.readLine());
		    	allscores[124][5] = "7.64";
		    	allscores[124][6] = "Broken";
		    	
			} else if(line.contains("Touhou - Lullaby of Deserted Hell (Vocal remix)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[125][0] = "Touhou - Lullaby of Deserted Hell (Vocal remix)";
		    	allscores[125][1] = functions.getScore(bufReader.readLine());
		    	allscores[125][2] = functions.getAcc(bufReader.readLine());
		    	allscores[125][3] = functions.getMiss(bufReader.readLine());
		    	allscores[125][4] = functions.getPoints(bufReader.readLine());
		    	allscores[125][5] = "4.99";
		    	allscores[125][6] = "Broken";
		    	
			} else if(line.contains("Touhou - Road of Apotropiac God ~ Dark Road") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[126][0] = "Touhou - Road of Apotropiac God ~ Dark Road";
		    	allscores[126][1] = functions.getScore(bufReader.readLine());
		    	allscores[126][2] = functions.getAcc(bufReader.readLine());
		    	allscores[126][3] = functions.getMiss(bufReader.readLine());
		    	allscores[126][4] = functions.getPoints(bufReader.readLine());
		    	allscores[126][5] = "12.23";
		    	allscores[126][6] = "Broken";
		    	
			} else if(line.contains("Touhou - Shanghai Alice of Meiji 17 (orchestral)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[127][0] = "Touhou - Shanghai Alice of Meiji 17 (orchestral)";
		    	allscores[127][1] = functions.getScore(bufReader.readLine());
		    	allscores[127][2] = functions.getAcc(bufReader.readLine());
		    	allscores[127][3] = functions.getMiss(bufReader.readLine());
		    	allscores[127][4] = functions.getPoints(bufReader.readLine());
		    	allscores[127][5] = "15.52";
		    	allscores[127][6] = "Not Broken";
		    	
			} else if(line.contains("Touhou - The Sealed Away Youkai ~ Lost Place") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[128][0] = "Touhou - The Sealed Away Youkai ~ Lost Place";
		    	allscores[128][1] = functions.getScore(bufReader.readLine());
		    	allscores[128][2] = functions.getAcc(bufReader.readLine());
		    	allscores[128][3] = functions.getMiss(bufReader.readLine());
		    	allscores[128][4] = functions.getPoints(bufReader.readLine());
		    	allscores[128][5] = "20.88";
		    	allscores[128][6] = "Broken";
		    	
			} else if(line.contains("Touhou ~ Beloved Tomboyish Girl (Waltz remix)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[129][0] = "Touhou ~ Beloved Tomboyish Girl (Waltz remix)";
		    	allscores[129][1] = functions.getScore(bufReader.readLine());
		    	allscores[129][2] = functions.getAcc(bufReader.readLine());
		    	allscores[129][3] = functions.getMiss(bufReader.readLine());
		    	allscores[129][4] = functions.getPoints(bufReader.readLine());
		    	allscores[129][5] = "5.72";
		    	allscores[129][6] = "Broken";
		    	
			} else if(line.contains("Touhou ~ Luna dial") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[130][0] = "Touhou ~ Luna dial & Flowering Night (Orchestra)";
		    	allscores[130][1] = functions.getScore(bufReader.readLine());
		    	allscores[130][2] = functions.getAcc(bufReader.readLine());
		    	allscores[130][3] = functions.getMiss(bufReader.readLine());
		    	allscores[130][4] = functions.getPoints(bufReader.readLine());
		    	allscores[130][5] = "15.1";
		    	allscores[130][6] = "Not Broken";
		    	
			} else if(line.contains("Tripzy Leary - Departure") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[131][0] = "Tripzy Leary - Departure";
		    	allscores[131][1] = functions.getScore(bufReader.readLine());
		    	allscores[131][2] = functions.getAcc(bufReader.readLine());
		    	allscores[131][3] = functions.getMiss(bufReader.readLine());
		    	allscores[131][4] = functions.getPoints(bufReader.readLine());
		    	allscores[131][5] = "9.72";
		    	allscores[131][6] = "Not Broken";
		    	
			} else if(line.contains("id=1671843539") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[132][0] = "Tristam - Once Again";
		    	allscores[132][1] = functions.getScore(bufReader.readLine());
		    	allscores[132][2] = functions.getAcc(bufReader.readLine());
		    	allscores[132][3] = functions.getMiss(bufReader.readLine());
		    	allscores[132][4] = functions.getPoints(bufReader.readLine());
		    	allscores[132][5] = "16.62";
		    	allscores[132][6] = "Not Broken";
		    	
			} else if(line.contains("Tristam and Braken - Frame of Mind") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[133][0] = "Tristam and Braken - Frame of Mind";
		    	allscores[133][1] = functions.getScore(bufReader.readLine());
		    	allscores[133][2] = functions.getAcc(bufReader.readLine());
		    	allscores[133][3] = functions.getMiss(bufReader.readLine());
		    	allscores[133][4] = functions.getPoints(bufReader.readLine());
		    	allscores[133][5] = "8.61";
		    	allscores[133][6] = "Broken";
		    	
			} else if(line.contains("TUMENECO - こんなに月が绮丽な夜は(off vocal)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[134][0] = "TUMENECO - こんなに月が绮丽な夜は(off vocal)";
		    	allscores[134][1] = functions.getScore(bufReader.readLine());
		    	allscores[134][2] = functions.getAcc(bufReader.readLine());
		    	allscores[134][3] = functions.getMiss(bufReader.readLine());
		    	allscores[134][4] = functions.getPoints(bufReader.readLine());
		    	allscores[134][5] = "6.24";
		    	allscores[134][6] = "Broken";
		    	
			} else if(line.contains("Owen Was Her") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[135][0] = "U,N Owen Was Her? (Big Room remix)";
		    	allscores[135][1] = functions.getScore(bufReader.readLine());
		    	allscores[135][2] = functions.getAcc(bufReader.readLine());
		    	allscores[135][3] = functions.getMiss(bufReader.readLine());
		    	allscores[135][4] = functions.getPoints(bufReader.readLine());
		    	allscores[135][5] = "18.53";
		    	allscores[135][6] = "idk";
		    	
			} else if(line.contains("Usa - Tsumi no Namae (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[136][0] = "Usa - Tsumi no Namae (cut)";
		    	allscores[136][1] = functions.getScore(bufReader.readLine());
		    	allscores[136][2] = functions.getAcc(bufReader.readLine());
		    	allscores[136][3] = functions.getMiss(bufReader.readLine());
		    	allscores[136][4] = functions.getPoints(bufReader.readLine());
		    	allscores[136][5] = "5.52";
		    	allscores[136][6] = "Broken";
		    	
			} else if(line.contains("There's Supposed to Be a Cheat Code for Happiness") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[137][0] = "Utata-P feat, Yuzuki Yukari - There's Supposed to Be a Cheat Code for Happiness";
		    	allscores[137][1] = functions.getScore(bufReader.readLine());
		    	allscores[137][2] = functions.getAcc(bufReader.readLine());
		    	allscores[137][3] = functions.getMiss(bufReader.readLine());
		    	allscores[137][4] = functions.getPoints(bufReader.readLine());
		    	allscores[137][5] = "7.8";
		    	allscores[137][6] = "Not Broken";
		    	
			} else if(line.contains("Vena Cava - Ohana") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[138][0] = "Vena Cava - Ohana";
		    	allscores[138][1] = functions.getScore(bufReader.readLine());
		    	allscores[138][2] = functions.getAcc(bufReader.readLine());
		    	allscores[138][3] = functions.getMiss(bufReader.readLine());
		    	allscores[138][4] = functions.getPoints(bufReader.readLine());
		    	allscores[138][5] = "14.87";
		    	allscores[138][6] = "Broken";
		    	
			} else if(line.contains("Take A Hint [Nightcore cover]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[139][0] = "Victoria Justice & Elizabeth Gillies - Take A Hint [Nightcore cover]";
		    	allscores[139][1] = functions.getScore(bufReader.readLine());
		    	allscores[139][2] = functions.getAcc(bufReader.readLine());
		    	allscores[139][3] = functions.getMiss(bufReader.readLine());
		    	allscores[139][4] = functions.getPoints(bufReader.readLine());
		    	allscores[139][5] = "9.44";
		    	allscores[139][6] = "Broken";
		    	
			} else if(line.contains("Waffle - Precious (Day 9)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[140][0] = "Waffle - Precious (Day 9)";
		    	allscores[140][1] = functions.getScore(bufReader.readLine());
		    	allscores[140][2] = functions.getAcc(bufReader.readLine());
		    	allscores[140][3] = functions.getMiss(bufReader.readLine());
		    	allscores[140][4] = functions.getPoints(bufReader.readLine());
		    	allscores[140][5] = "4.85";
		    	allscores[140][6] = "Broken";
		    	
			} else if(line.contains("Waterflame - Glorious Morning 2") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[141][0] = "Waterflame - Glorious Morning 2";
		    	allscores[141][1] = functions.getScore(bufReader.readLine());
		    	allscores[141][2] = functions.getAcc(bufReader.readLine());
		    	allscores[141][3] = functions.getMiss(bufReader.readLine());
		    	allscores[141][4] = functions.getPoints(bufReader.readLine());
		    	allscores[141][5] = "19.53";
		    	allscores[141][6] = "Broken";
		    	
			} else if(line.contains("Skrillex - Killa") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[142][0] = "Wiwek & Skrillex - Killa [feat, Elliphant]";
		    	allscores[142][1] = functions.getScore(bufReader.readLine());
		    	allscores[142][2] = functions.getAcc(bufReader.readLine());
		    	allscores[142][3] = functions.getMiss(bufReader.readLine());
		    	allscores[142][4] = functions.getPoints(bufReader.readLine());
		    	allscores[142][5] = "8.17";
		    	allscores[142][6] = "Not Broken";
		    	
			} else if(line.contains("josh pan (sakuraburst Remix)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[143][0] = "X&G - Whiplash ft, josh pan (sakuraburst Remix)";
		    	allscores[143][1] = functions.getScore(bufReader.readLine());
		    	allscores[143][2] = functions.getAcc(bufReader.readLine());
		    	allscores[143][3] = functions.getMiss(bufReader.readLine());
		    	allscores[143][4] = functions.getPoints(bufReader.readLine());
		    	allscores[143][5] = "21.29";
		    	allscores[143][6] = "idk";
		    	
			} else if(line.contains("Yonder voice-Ember of spring") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[144][0] = "Yonder voice-Ember of spring";
		    	allscores[144][1] = functions.getScore(bufReader.readLine());
		    	allscores[144][2] = functions.getAcc(bufReader.readLine());
		    	allscores[144][3] = functions.getMiss(bufReader.readLine());
		    	allscores[144][4] = functions.getPoints(bufReader.readLine());
		    	allscores[144][5] = "5.74";
		    	allscores[144][6] = "Broken";
		    	
			} else if(line.contains("Yooh - \"MariannE \"") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[145][0] = "Yooh - \"MariannE \"";
		    	allscores[145][1] = functions.getScore(bufReader.readLine());
		    	allscores[145][2] = functions.getAcc(bufReader.readLine());
		    	allscores[145][3] = functions.getMiss(bufReader.readLine());
		    	allscores[145][4] = functions.getPoints(bufReader.readLine());
		    	allscores[145][5] = "21.2";
		    	allscores[145][6] = "idk";
		    	
			} else if(line.contains("YUC'e - intro-duck-tion!! [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[146][0] = "YUC'e - intro-duck-tion!! [cut]";
		    	allscores[146][1] = functions.getScore(bufReader.readLine());
		    	allscores[146][2] = functions.getAcc(bufReader.readLine());
		    	allscores[146][3] = functions.getMiss(bufReader.readLine());
		    	allscores[146][4] = functions.getPoints(bufReader.readLine());
		    	allscores[146][5] = "8.66";
		    	allscores[146][6] = "Broken";
		    	
			} else if(line.contains("Yuikonnu - Kakushigoto [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[147][0] = "Yuikonnu - Kakushigoto [cut]";
		    	allscores[147][1] = functions.getScore(bufReader.readLine());
		    	allscores[147][2] = functions.getAcc(bufReader.readLine());
		    	allscores[147][3] = functions.getMiss(bufReader.readLine());
		    	allscores[147][4] = functions.getPoints(bufReader.readLine());
		    	allscores[147][5] = "8.08";
		    	allscores[147][6] = "Broken";
		    	
			} else if(line.contains("Ayaponzu ‒ Super Nuko World") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[148][0] = "Yuikonnu & Ayaponzu - Super Nuko World";
		    	allscores[148][1] = functions.getScore(bufReader.readLine());
		    	allscores[148][2] = functions.getAcc(bufReader.readLine());
		    	allscores[148][3] = functions.getMiss(bufReader.readLine());
		    	allscores[148][4] = functions.getPoints(bufReader.readLine());
		    	allscores[148][5] = "8.79";
		    	allscores[148][6] = "Broken";
		    	
			} else if(line.contains("miko - Soumatou Labyrinth") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[149][0] = "Yunomi feat, Momobako & miko - Soumatou Labyrinth";
		    	allscores[149][1] = functions.getScore(bufReader.readLine());
		    	allscores[149][2] = functions.getAcc(bufReader.readLine());
		    	allscores[149][3] = functions.getMiss(bufReader.readLine());
		    	allscores[149][4] = functions.getPoints(bufReader.readLine());
		    	allscores[149][5] = "10.35";
		    	allscores[149][6] = "Not Broken";
		    	
			} else if(line.contains("そでをぬらした") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[150][0] = "そでをぬらした";
		    	allscores[150][1] = functions.getScore(bufReader.readLine());
		    	allscores[150][2] = functions.getAcc(bufReader.readLine());
		    	allscores[150][3] = functions.getMiss(bufReader.readLine());
		    	allscores[150][4] = functions.getPoints(bufReader.readLine());
		    	allscores[150][5] = "4.08";
		    	allscores[150][6] = "Broken";
		    	
			}
	
		}
		
		double realpoints = 0;
		double rankedpoints = 0;
		double maximumpoints = 0;
		for(int i = 0; i<allscores.length;i++) {
			if(allscores[i][0] != null) {
				double points = Double.parseDouble(allscores[i][4]);
				double maxpoints = Double.parseDouble(allscores[i][5]);
				double actpoints = points;
				realpoints += points;
				maximumpoints += maxpoints;
				
				if(allscores[i][6] == "Broken") {
					if(points == maxpoints) {
						if(allscores[i][0] == "Indigo Child - Nostalgia") {
							allscores[i][4] = 1.87 + "";
						} else if(allscores[i][0] == "Mizutani Hiromi - Hidamari Michi to Ren-chon") {
							allscores[i][4] = 2.11 + "";
						} else if(allscores[i][0] == "Oskar Schuster - Wunder") {
							allscores[i][4] = 2.86 + "";
						} else {
							actpoints = points - 0.01;
							allscores[i][4] = actpoints + "";
						}
					}
					rankedpoints +=  actpoints;
				} else {
					rankedpoints +=  points;
				}
			}
		}
		realpoints = (double)Math.round(realpoints * 100)/100;
		rankedpoints = (double)Math.round(rankedpoints * 100)/100;
		maximumpoints = (double)Math.round(maximumpoints * 100)/100;
		
		return allscores;
	}

}
