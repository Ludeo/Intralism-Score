package scores;

import java.awt.Graphics2D;
import java.awt.Image;
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
		int mapcount = allscores.length;
		double totalacc = 0;
		int totalmiss = 0;
		double totaldifference = 0;
		int hundredcount = 0;
		String pictureLink = "";
		
		for(int i = 0; i<allscores.length;i++) {
			allscores[i][1] = (int) 0;
			allscores[i][2] = (double)0;
			allscores[i][3] = (int)0;
			allscores[i][4] = (double)0.0;
			allscores[i][6] = (double)0.0;
		}
		
		allscores[0][0] = (String)"【東方Vocal／Trance】 Cardiac Sound";
    	allscores[0][5] = (double) 11.71;
    	allscores[0][7] = (String)"Not Broken";
    	
		allscores[1][0] = (String)"3rd Prototype - Together [NCS Release]";
		allscores[1][5] = (double) 11.97;
    	allscores[1][7] = (String)"Not Broken";
    	
		allscores[2][0] = (String)"Abo Tekashi - Hoshi no Kanaderu Uta (music box)";
		allscores[2][5] = (double) 3.07;
    	allscores[2][7] = (String)"Broken";
    	
		allscores[3][0] = (String)"Akira Complex - Ether Strike";	
		allscores[3][5] = (double) 18.87;
    	allscores[3][7] = (String)"Not Broken";
    	
		allscores[4][0] = (String)"Alvaro Soler - Sofia";
		allscores[4][5] = (double) 6.83;
    	allscores[4][7] = (String)"Broken";
    	
    	allscores[5][0] = (String)"Avicii feat, Wyclef Jean - Divine Sorrow";
    	allscores[5][5] = (double) 8.02;
    	allscores[5][7] = (String)"Not Broken";
    	
    	allscores[6][0] = (String)"AWKWARD i - A Boat Beneath a Sunny Sky [Remix by Arjen Lubach]";
    	allscores[6][5] = (double) 7.69;
    	allscores[6][7] = (String)"Not Broken";
    	
    	allscores[7][0] = (String)"Blacklolita - Antithese";
    	allscores[7][5] = (double) 19.36;
    	allscores[7][7] = (String)"Not Broken";
    	
    	allscores[8][0] = (String)"Breathe";
    	allscores[8][5] = (double) 12.37;
    	allscores[8][7] = (String)"Broken";
    	
    	allscores[9][0] = (String)"Bring me to life - DaTweekaz Remix (cut)";
    	allscores[9][5] = (double) 7.55;
    	allscores[9][7] = (String)"Not Broken";
    	
    	allscores[10][0] = (String)"Bryce Fox - Horns (STéLOUSE Remix)";
    	allscores[10][5] = (double) 10.23;
    	allscores[10][7] = (String)"Broken";
    	
    	allscores[11][0] = (String)"Camellia - Bassline Yatteru? LOL [feat, Nanahira] [cut]";
    	allscores[11][5] = (double) 9.61;
    	allscores[11][7] = (String)"Broken";
    	
    	allscores[12][0] = (String)"Camellia - GHOST";
    	allscores[12][5] = (double) 35.38;
    	allscores[12][7] = (String)"Not Broken";
    	
    	allscores[13][0] = (String)"Camellia feat, Yukacco - Be Wild [cut]";
    	allscores[13][5] = (double) 14.86;
    	allscores[13][7] = (String)"Broken";
    	
    	allscores[14][0] = (String)"Chino (CV, Minase Inori) - Mirai Puzzle (cut)";
    	allscores[14][5] = (double) 6.56;
    	allscores[14][7] = (String)"Broken";
    	
    	allscores[15][0] = (String)"Chito (Inori Minase) & Yuuri (Yurika Kubo) - Ugoku, Ugoku";
    	allscores[15][5] = (double) 6.73;
    	allscores[15][7] = (String)"Not Broken";
    	
    	allscores[16][0] = (String)"Christian Baczyk - The Awakening [Star Wars Tribute]";
    	allscores[16][5] = (double) 2.72;
    	allscores[16][7] = (String)"Not Broken";
    	
    	allscores[17][0] = (String)"Chroma - I";
    	allscores[17][5] = (double) 21.73;
    	allscores[17][7] = (String)"Broken";
    	
    	allscores[18][0] = (String)"cillia - FIRST";
    	allscores[18][5] = (double) 11.27;
    	allscores[18][7] = (String)"Not Broken";
    	
    	allscores[19][0] = (String)"Clannad ED";
    	allscores[19][5] = (double) 3.55;
    	allscores[19][7] = (String)"Broken";
    	
    	allscores[20][0] = (String)"ClariS - Hitorigoto";
    	allscores[20][5] = (double) 8.38;
    	allscores[20][7] = (String)"Not Broken";
    	
    	allscores[21][0] = (String)"Colors * Slash - Miracle Colors * Honjitsu mo Ijou Nashi!";
    	allscores[21][5] = (double) 17.44;
    	allscores[21][7] = (String)"Not Broken";
    	
    	allscores[22][0] = (String)"Coyote Kisses - Acid Wolfpack";
    	allscores[22][5] = (double) 14.83;
    	allscores[22][7] = (String)"Broken";
    	
    	allscores[23][0] = (String)"Crywolf - Epilogue [Ossuary] (Cataclasm)";
    	allscores[23][5] = (double) 3.69;
    	allscores[23][7] = (String)"Not Broken";
    	
    	allscores[24][0] = (String)"Cupidz - Sheet (cut)";
    	allscores[24][5] = (double) 11.72;
    	allscores[24][7] = (String)"Not Broken";
    	
    	allscores[25][0] = (String)"Daft Punk - Technologic";
    	allscores[25][5] = (double) 8.91;
    	allscores[25][7] = (String)"Broken";
    	
    	allscores[26][0] = (String)"DANCE TILL YOU'RE DEAD";
    	allscores[26][5] = (double) 12.08;
    	allscores[26][7] = (String)"Broken";
    	
    	allscores[27][0] = (String)"Derpy - Nyan Nyan Dance";
    	allscores[27][5] = (double) 12.09;
    	allscores[27][7] = (String)"Not Broken";
    	
    	allscores[28][0] = (String)"Destination Calabria - Alex Gaudino";
    	allscores[28][5] = (double) 8.52;
    	allscores[28][7] = (String)"Not Broken";
    	
    	allscores[29][0] = (String)"Die Antwoord - Alien";
    	allscores[29][5] = (double) 10.54;
    	allscores[29][7] = (String)"Broken";
    	
    	allscores[30][0] = (String)"Different Heaven & EH!DE - Alquimia";
    	allscores[30][5] = (double) 18.85;
    	allscores[30][7] = (String)"Not Broken";
    	
    	allscores[31][0] = (String)"DJ Myosuke - Black Territory";
    	allscores[31][5] = (double) 18.86;
    	allscores[31][7] = (String)"Not Broken";
    	
    	allscores[32][0] = (String)"Domestic na kanojo OP";
    	allscores[32][5] = (double) 15.71;
    	allscores[32][7] = (String)"Not Broken";
    	
    	allscores[33][0] = (String)"Drop - Granat";
    	allscores[33][5] = (double) 6.79;
    	allscores[33][7] = (String)"Broken";
    	
    	allscores[34][0] = (String)"Duca - Nekoichi [cut]";
    	allscores[34][5] = (double) 8.02;
    	allscores[34][7] = (String)"Not Broken";
    	
    	allscores[35][0] = (String)"East of Eden";
    	allscores[35][5] = (double) 8.1;
    	allscores[35][7] = (String)"Not Broken";
    	
    	allscores[36][0] = (String)"EastNewSound - Limited Dimension";
    	allscores[36][5] = (double) 6.18;
    	allscores[36][7] = (String)"Broken";
    	
    	allscores[37][0] = (String)"EnV – Anubis";
    	allscores[37][5] = (double) 9.64;
    	allscores[37][7] = (String)"Not Broken";
    	
    	allscores[38][0] = (String)"Feint - Outbreak [feat, MYLK] [cut]";
    	allscores[38][5] = (double) 11.28;
    	allscores[38][7] = (String)"Broken";
		
    	allscores[39][0] = (String)"Futari No Kimochi (Flute)";
    	allscores[39][5] = (double) 2.71;
    	allscores[39][7] = (String)"Not Broken";
    	
    	allscores[40][0] = (String)"GARNiDELiA - Gokuraku Jodo [cut]";
    	allscores[40][5] = (double) 8.34;
    	allscores[40][7] = (String)"Not Broken";
    	
    	allscores[41][0] = (String)"Glacier feat, Brenna Myers - Nurture (cut)";
    	allscores[41][5] = (double) 4.59;
    	allscores[41][7] = (String)"Not Broken";
    	
    	allscores[42][0] = (String)"guardin - Solitary";
    	allscores[42][5] = (double) 10.36;
    	allscores[42][7] = (String)"Broken";
    	
    	allscores[43][0] = (String)"Halozy - Brilliant Colors";
    	allscores[43][5] = (double) 10.24;
    	allscores[43][7] = (String)"Broken";
    	
    	allscores[44][0] = (String)"Halozy - Three Magic";
    	allscores[44][5] = (double) 13.12;
    	allscores[44][7] = (String)"Not Broken";
    	
    	allscores[45][0] = (String)"Halsey ‒ Gasoline";
    	allscores[45][5] = (double) 6.73;
    	allscores[45][7] = (String)"Not Broken";
    	
    	allscores[46][0] = (String)"HopeX - Into The Clouds (Nightcore)";
    	allscores[46][5] = (double) 23.51;
    	allscores[46][7] = (String)"Not Broken";
    	
    	allscores[47][0] = (String)"Hydelic - Connected [Yours Forever] [cut]";
    	allscores[47][5] = (double) 5.19;
    	allscores[47][7] = (String)"Not Broken";
    	
    	allscores[48][0] = (String)"Imperio - \"Atlantis\"";
    	allscores[48][5] = (double) 6.83;
    	allscores[48][7] = (String)"Broken";
    	
    	allscores[49][0] = (String)"Indigo Child - Nostalgia";
    	allscores[49][5] = (double) 1.88;
    	allscores[49][7] = (String)"Broken";
    	
    	allscores[50][0] = (String)"iNO - Suishoku Komachi Melancholia";
    	allscores[50][5] = (double) 6.5;
    	allscores[50][7] = (String)"Not Broken";
    	
    	allscores[51][0] = (String)"Ito Kanako - Fatima (Steins;Gate 0)";
    	allscores[51][5] = (double) 10.58;
    	allscores[51][7] = (String)"Broken";
    	
    	allscores[52][0] = (String)"JAKIN - Bipolar (feat. Generic)";
    	allscores[52][5] = (double) 19.37;
    	allscores[52][7] = (String)"Not Broken";
    	
    	allscores[53][0] = (String)"jubeat clan (Hommarju) - Wowie Zowie!";
    	allscores[53][5] = (double) 20.25;
    	allscores[53][7] = (String)"Not Broken";
    	
    	allscores[54][0] = (String)"K/DA - POP/STARS";
    	allscores[54][5] = (double) 12.48;
    	allscores[54][7] = (String)"Broken";
    	
    	allscores[55][0] = (String)"Kenny B - Parijs";
    	allscores[55][5] = (double) 7.29;
    	allscores[55][7] = (String)"Broken";
    	
    	allscores[56][0] = (String)"Kikuo - Kara Kara Kara no Kara";
    	allscores[56][5] = (double) 28.72;
    	allscores[56][7] = (String)"Broken";
    	
    	allscores[57][0] = (String)"Konomi Kohara - Chikatto Chika Chika [Sati Akura Cover]";
    	allscores[57][5] = (double) 11.03;
    	allscores[57][7] = (String)"Broken";
    	
    	allscores[58][0] = (String)"Laur -\"Sound Chimera\"";
    	allscores[58][5] = (double) 28.28;
    	allscores[58][7] = (String)"Not Broken";
    	
    	allscores[59][0] = (String)"Lindsey Stirling - Electric Daisy Violin";
    	allscores[59][5] = (double) 17.16;
    	allscores[59][7] = (String)"Broken";
    	
    	allscores[60][0] = (String)"Liviu Hodor - Sweet Love [Feat, Mona]";
    	allscores[60][5] = (double) 8.21;
    	allscores[60][7] = (String)"Not Broken";
    	
    	allscores[61][0] = (String)"Lobby";
    	allscores[61][5] = (double) 8.62;
    	allscores[61][7] = (String)"Broken";
    	
    	allscores[62][0] = (String)"Lord Swan3x & RYVI - Death Bringer";
    	allscores[62][5] = (double) 15.69;
    	allscores[62][7] = (String)"Broken";
    	
    	allscores[63][0] = (String)"Ludwig van Beethoven - Moonlight Sonata [Mvt, 1]";
    	allscores[63][5] = (double) 2.18;
    	allscores[63][7] = (String)"Not Broken";
    	
    	allscores[64][0] = (String)"M-O-T-U - Snowman [feat, Hatsune Miku] [cut]";
    	allscores[64][5] = (double) 5.03;
    	allscores[64][7] = (String)"Not Broken";
    	
    	allscores[65][0] = (String)"M2U - A Bella! [feat, Lucy]";
    	allscores[65][5] = (double) 10.31;
    	allscores[65][7] = (String)"Not Broken";
    	
    	allscores[66][0] = (String)"Mahoutsukai no Yome (Opening ST) - Here";
    	allscores[66][5] = (double) 11.23;
    	allscores[66][7] = (String)"Broken";
    	
    	allscores[67][0] = (String)"Mantis Lords";
    	allscores[67][5] = (double) 11.11;
    	allscores[67][7] = (String)"Broken";
    	
    	allscores[68][0] = (String)"MARETU ft. Hatsune Miku - White Happy";
    	allscores[68][5] = (double) 17.83;
    	allscores[68][7] = (String)"Broken";
    	
    	allscores[69][0] = (String)"Marnik - Up & Down";
    	allscores[69][5] = (double) 9.76;
    	allscores[69][7] = (String)"Not Broken";
    	
    	allscores[70][0] = (String)"Marshmello - FRIENDS";
    	allscores[70][5] = (double) 10.46;
    	allscores[70][7] = (String)"Not Broken";
    	
    	allscores[71][0] = (String)"Masayoshi Minoshima - Bad Apple!! [feat. Nomico]";
    	allscores[71][5] = (double) 11.25;
    	allscores[71][7] = (String)"Not Broken";
    	
    	allscores[72][0] = (String)"Minecraft Piano Theme";
    	allscores[72][5] = (double) 2.68;
    	allscores[72][7] = (String)"Not Broken";
    	
    	allscores[73][0] = (String)"Mizutani Hiromi - Hidamari Michi to Ren-chon";
    	allscores[73][5] = (double) 2.12;
    	allscores[73][7] = (String)"Broken";
    	
    	allscores[74][0] = (String)"Monetochka — It is a Pain";
    	allscores[74][5] = (double) 11.1;
    	allscores[74][7] = (String)"Not Broken";
    	
    	allscores[75][0] = (String)"Monetochka — Mom, I don't drop siegs";
    	allscores[75][5] = (double) 5.77;
    	allscores[75][7] = (String)"Broken";
    	
    	allscores[76][0] = (String)"My Heart";
    	allscores[76][5] = (double) 11.5;
    	allscores[76][7] = (String)"Not Broken";
    	
    	allscores[77][0] = (String)"Namice – Perfection";
    	allscores[77][5] = (double) 7.56;
    	allscores[77][7] = (String)"Broken";
    	
    	allscores[78][0] = (String)"Nega/squared - Mellow";
    	allscores[78][5] = (double) 6.59;
    	allscores[78][7] = (String)"Not Broken";
    	
    	allscores[79][0] = (String)"Nekomata Master - Sleepless Days [feat, Mayumi Morinaga]";
    	allscores[79][5] = (double) 6.89;
    	allscores[79][7] = (String)"Broken";
    	
    	allscores[80][0] = (String)"Never Say Die One Hunderd Mix [Intro]";
    	allscores[80][5] = (double) 12.87;
    	allscores[80][7] = (String)"Broken";
    	
    	allscores[81][0] = (String)"Nic & The Family - Hej Monica (PewDiePie cover) (Party In Backyard Remix)";
    	allscores[81][5] = (double) 7.85;
    	allscores[81][7] = (String)"Broken";
    	
    	allscores[82][0] = (String)"Nicolas Dominique - Yay! (PonyTime Rework)";
    	allscores[82][5] = (double) 11.21;
    	allscores[82][7] = (String)"Not Broken";
    	
    	allscores[83][0] = (String)"Nienna - Oonagh (Nightcore)";
    	allscores[83][5] = (double) 7.81;
    	allscores[83][7] = (String)"Broken";
    	
    	allscores[84][0] = (String)"Night of Nights";
    	allscores[84][5] = (double) 24.29;
    	allscores[84][7] = (String)"Not Broken";
    	
    	allscores[85][0] = (String)"NightHawk22 - Perfect Storm";
    	allscores[85][5] = (double) 19.93;
    	allscores[85][7] = (String)"Not Broken";
    	
    	allscores[86][0] = (String)"No title - GRRP Remix - English Cover【KIRA feat, rachie】";
    	allscores[86][5] = (double) 17.64;
    	allscores[86][7] = (String)"Broken";
    	
    	allscores[87][0] = (String)"Omoi - Teo";
    	allscores[87][5] = (double) 15.06;
    	allscores[87][7] = (String)"Not Broken";
    	
    	allscores[88][0] = (String)"Oskar Schuster - Singur";
    	allscores[88][5] = (double) 3.46;
    	allscores[88][7] = (String)"Not Broken";
    	
    	allscores[89][0] = (String)"Oskar Schuster - Wunder";
    	allscores[89][5] = (double) 2.87;
    	allscores[89][7] = (String)"Broken";
    	
    	allscores[90][0] = (String)"OST The Rising of the Shield Hero";
    	allscores[90][5] = (double) 11.99;
    	allscores[90][7] = (String)"Broken";
    	
    	allscores[91][0] = (String)"Overlord Op 1";
    	allscores[91][5] = (double) 12.36;
    	allscores[91][7] = (String)"Broken";
    	
    	allscores[92][0] = (String)"P4koo - Gothique Resonance";
    	allscores[92][5] = (double) 23.91;
    	allscores[92][7] = (String)"Broken";
    	
    	allscores[93][0] = (String)"Paganini - 24 Caprices Opus1 #5 in A Minor";
    	allscores[93][5] = (double) 29.68;
    	allscores[93][7] = (String)"Not Broken";
    	
    	allscores[94][0] = (String)"Porter Robinson & Madeon ‒ Shelter [Remix by happy30]";
    	allscores[94][5] = (double) 5.55;
    	allscores[94][7] = (String)"Not Broken";
    	
    	allscores[95][0] = (String)"Prism Magical - DJ SHARPNEL hardrave remix";
    	allscores[95][5] = (double) 11.29;
    	allscores[95][7] = (String)"Broken";
    	
    	allscores[96][0] = (String)"Pskovskoe";
    	allscores[96][5] = (double) 8.42;
    	allscores[96][7] = (String)"Not Broken";
    	
    	allscores[97][0] = (String)"Qrispy Joybox - Yuuki no Pendant [feat, Chata]";
    	allscores[97][5] = (double) 11.36;
    	allscores[97][7] = (String)"Broken";
    	
    	allscores[98][0] = (String)"R3 Music Box - Curtain Call!!!!!";
    	allscores[98][5] = (double) 3.9;
    	allscores[98][7] = (String)"Not Broken";
    	
    	allscores[99][0] = (String)"Rameses B – Infinity";
    	allscores[99][5] = (double) 11.18;
    	allscores[99][7] = (String)"Not Broken";
    	
    	allscores[100][0] = (String)"Rameses B – Visionary";
    	allscores[100][5] = (double) 11.42;
    	allscores[100][7] = (String)"Not Broken";
    	
    	allscores[101][0] = (String)"Ravel Nightstar - Flower Bless";
    	allscores[101][5] = (double) 19.75;
    	allscores[101][7] = (String)"Not Broken";
    	
    	allscores[102][0] = (String)"Reign[Radio Edit] - Maison & Dragon Feat, Amba Sheperd";
    	allscores[102][5] = (double) 9.51;
    	allscores[102][7] = (String)"Not Broken";
    	
    	allscores[103][0] = (String)"Royal Blood - Out of the Black";
    	allscores[103][5] = (double) 12.29;
    	allscores[103][7] = (String)"Broken";
    	
    	allscores[104][0] = (String)"S3RL - Scary Movie";
    	allscores[104][5] = (double) 16.91;
    	allscores[104][7] = (String)"Broken";
    	
    	allscores[105][0] = (String)"Sakakibara Yui - Doki Doki kokoro Flavor";
    	allscores[105][5] = (double) 10.19;
    	allscores[105][7] = (String)"Broken";
    	
    	allscores[106][0] = (String)"Sakuraburst - Cherry Blossoms Explode Across The Dying Horizons (cut)";
    	allscores[106][5] = (double) 7.19;
    	allscores[106][7] = (String)"Not Broken";
    	
    	allscores[107][0] = (String)"Sapphire - Never More (English Cover)";
    	allscores[107][5] = (double) 3.71;
    	allscores[107][7] = (String)"Not Broken";
    	
    	allscores[108][0] = (String)"Seo9 - Explosion";
    	allscores[108][5] = (double) 19.61;
    	allscores[108][7] = (String)"Not Broken";
    	
    	allscores[109][0] = (String)"Seunghwan Lee - True Eternity (Vocal - Emily) (Short Version)";
    	allscores[109][5] = (double) 2.91;
    	allscores[109][7] = (String)"Not Broken";
    	
    	allscores[110][0] = (String)"Sky Of Scarlet Perception (Folk Remix)";
    	allscores[110][5] = (double) 7.24;
    	allscores[110][7] = (String)"Broken";
    	
    	allscores[111][0] = (String)"Soulji - Murder (cut)";
    	allscores[111][5] = (double) 15.22;
    	allscores[111][7] = (String)"Not Broken";
    	
    	allscores[112][0] = (String)"Sporty-O - Let Me Hit It";
    	allscores[112][5] = (double) 8.58;
    	allscores[112][7] = (String)"Broken";
    	
    	allscores[113][0] = (String)"Star Driver - 5 Centimeters per second";
    	allscores[113][5] = (double) 10.55;
    	allscores[113][7] = (String)"Not Broken";
    	
    	allscores[114][0] = (String)"Subtact - Tunnel Vision [cut]";
    	allscores[114][5] = (double) 10.96;
    	allscores[114][7] = (String)"Not Broken";
    	
    	allscores[115][0] = (String)"Tabinotochuu";
    	allscores[115][5] = (double) 5.75;
    	allscores[115][7] = (String)"Not Broken";
    	
    	allscores[116][0] = (String)"Taska Black - We Would Never Do (feat, Nevve) [Live Session]";
    	allscores[116][5] = (double) 5.18;
    	allscores[116][7] = (String)"Broken";
    	
    	allscores[117][0] = (String)"Tears for Fears ‒ Mad World [Cover by Adam Lambert]";
    	allscores[117][5] = (double) 5.64;
    	allscores[117][7] = (String)"Broken";
    	
    	allscores[118][0] = (String)"The Fat Rat - Fly Away";
    	allscores[118][5] = (double) 5.71;
    	allscores[118][7] = (String)"Not Broken";
    	
    	allscores[119][0] = (String)"The Piano";
    	allscores[119][5] = (double) 4.25;
    	allscores[119][7] = (String)"Not Broken";
    	
    	allscores[120][0] = (String)"TheFatRat - MAYDAY (feat, Laura Brehm)";
    	allscores[120][5] = (double) 7.72;
    	allscores[120][7] = (String)"Broken";
    	
    	allscores[121][0] = (String)"Thriftworks - Moon Juice";
    	allscores[121][5] = (double) 6.38;
    	allscores[121][7] = (String)"Not Broken";
    	
    	allscores[122][0] = (String)"Tia - The Glory Days (cut)";
    	allscores[122][5] = (double) 9.23;
    	allscores[122][7] = (String)"Broken";
    	
    	allscores[123][0] = (String)"Tokyo Machine - Epic";
    	allscores[123][5] = (double) 11.92;
    	allscores[123][7] = (String)"Not Broken";
    	
    	allscores[124][0] = (String)"Tokyo Machine - ROCK IT";
    	allscores[124][5] = (double) 7.64;
    	allscores[124][7] = (String)"Broken";
    	
    	allscores[125][0] = (String)"Touhou - Lullaby of Deserted Hell (Vocal remix)";
    	allscores[125][5] = (double) 4.99;
    	allscores[125][7] = (String)"Broken";
    	
    	allscores[126][0] = (String)"Touhou - Road of Apotropiac God ~ Dark Road";
    	allscores[126][5] = (double) 12.23;
    	allscores[126][7] = (String)"Broken";
    	
    	allscores[127][0] = (String)"Touhou - Shanghai Alice of Meiji 17 (orchestral)";
    	allscores[127][5] = (double) 15.52;
    	allscores[127][7] = (String)"Not Broken";
    	
    	allscores[128][0] = (String)"Touhou - The Sealed Away Youkai ~ Lost Place";
    	allscores[128][5] = (double) 20.88;
    	allscores[128][7] = (String)"Broken";
    	
    	allscores[129][0] = (String)"Touhou ~ Beloved Tomboyish Girl (Waltz remix)";
    	allscores[129][5] = (double) 5.72;
    	allscores[129][7] = (String)"Broken";
    	
    	allscores[130][0] = (String)"Touhou ~ Luna dial & Flowering Night (Orchestra)";
    	allscores[130][5] = (double) 15.1;
    	allscores[130][7] = (String)"Not Broken";
    	
    	allscores[131][0] = (String)"Tripzy Leary - Departure";
    	allscores[131][5] = (double) 9.72;
    	allscores[131][7] = (String)"Not Broken";
    	
    	allscores[132][0] = (String)"Tristam - Once Again";
    	allscores[132][5] = (double) 16.62;
    	allscores[132][7] = (String)"Not Broken";
    	
    	allscores[133][0] = (String)"Tristam and Braken - Frame of Mind";
    	allscores[133][5] = (double) 8.61;
    	allscores[133][7] = (String)"Broken";
    	
    	allscores[134][0] = (String)"TUMENECO - こんなに月が绮丽な夜は(off vocal)";
    	allscores[134][5] = (double) 6.24;
    	allscores[134][7] = (String)"Broken";
    	
    	allscores[135][0] = (String)"U,N Owen Was Her? (Big Room remix)";
    	allscores[135][5] = (double) 18.53;
    	allscores[135][7] = (String)"Not Broken";
    	
    	allscores[136][0] = (String)"Usa - Tsumi no Namae (cut)";
    	allscores[136][5] = (double) 5.52;
    	allscores[136][7] = (String)"Broken";
    	
    	allscores[137][0] = (String)"Utata-P feat, Yuzuki Yukari - There's Supposed to Be a Cheat Code for Happiness";
    	allscores[137][5] = (double) 7.8;
    	allscores[137][7] = (String)"Not Broken";
    	
    	allscores[138][0] = (String)"Vena Cava - Ohana";
    	allscores[138][5] = (double) 14.87;
    	allscores[138][7] = (String)"Broken";
    	
    	allscores[139][0] = (String)"Victoria Justice & Elizabeth Gillies - Take A Hint [Nightcore cover]";
    	allscores[139][5] = (double) 9.44;
    	allscores[139][7] = (String)"Broken";
    	
    	allscores[140][0] = (String)"Waffle - Precious (Day 9)";
    	allscores[140][5] = (double) 4.85;
    	allscores[140][7] = (String)"Broken";
    	
    	allscores[141][0] = (String)"Waterflame - Glorious Morning 2";
    	allscores[141][5] = (double) 19.53;
    	allscores[141][7] = (String)"Broken";
    	
    	allscores[142][0] = (String)"Wiwek & Skrillex - Killa [feat, Elliphant]";
    	allscores[142][5] = (double) 8.17;
    	allscores[142][7] = (String)"Not Broken";
    	
    	allscores[143][0] = (String)"X&G - Whiplash ft, josh pan (sakuraburst Remix)";
    	allscores[143][5] = (double) 21.29;
    	allscores[143][7] = (String)"Not Broken";
    	
    	allscores[144][0] = (String)"Yonder voice-Ember of spring";
    	allscores[144][5] = (double) 5.74;
    	allscores[144][7] = (String)"Broken";
    	
    	allscores[145][0] = (String)"Yooh - \"MariannE \"";
    	allscores[145][5] = (double) 21.2;
    	allscores[145][7] = (String)"Not Broken";
    	
    	allscores[146][0] = (String)"YUC'e - intro-duck-tion!! [cut]";
    	allscores[146][5] = (double) 8.66;
    	allscores[146][7] = (String)"Broken";
    	
    	allscores[147][0] = (String)"Yuikonnu - Kakushigoto [cut]";
    	allscores[147][5] = (double) 8.08;
    	allscores[147][7] = (String)"Broken";
    	
    	allscores[148][0] = (String)"Yuikonnu & Ayaponzu - Super Nuko World";
    	allscores[148][5] = (double) 8.79;
    	allscores[148][7] = (String)"Broken";
    	
    	allscores[149][0] = (String)"Yunomi feat, Momobako & miko - Soumatou Labyrinth";
    	allscores[149][5] = (double) 10.35;
    	allscores[149][7] = (String)"Not Broken";
    	
    	allscores[150][0] = (String)"そでをぬらした";
    	allscores[150][5] = (double) 4.08;
    	allscores[150][7] = (String)"Broken";
    	
    	allscores[151][0] = (String)"UNDEAD CORPORATION - Setsugetsu Ouka no Kuni";
    	allscores[151][5] = (double) 2.73;
    	allscores[151][7] = (String)"Not Broken";
    	
    	allscores[152][0] = (String)"Taio Cruz - Telling The World (Rio OST)";
    	allscores[152][5] = (double) 7.62;
    	allscores[152][7] = (String)"Broken";
    	
    	allscores[153][0] = (String)"This Game - No Game No Life";
    	allscores[153][5] = (double) 9.88;
    	allscores[153][7] = (String)"Not Broken";
    	
    	allscores[154][0] = (String)"The Super Ball - RIN! RIN HI! HI!";
    	allscores[154][5] = (double) 13.45;
    	allscores[154][7] = (String)"Broken";
    	
    	allscores[155][0] = (String)"DJ TOTTO - Precious * Star [feat. Enako]";
    	allscores[155][5] = (double) 13.49;
    	allscores[155][7] = (String)"Broken";
    	
    	allscores[156][0] = (String)"One Shot, One Kill - Varien";
    	allscores[156][5] = (double) 18.6;
    	allscores[156][7] = (String)"Not Broken";
    	
    	allscores[157][0] = (String)"Roomie - Brofist (feat. PewDiePie)";
    	allscores[157][5] = (double) 10.55;
    	allscores[157][7] = (String)"Not Broken";
    	
    	allscores[158][0] = (String)"SAO Alternative: GGO Ryusei - Eir Aoi";
    	allscores[158][5] = (double) 6.43;
    	allscores[158][7] = (String)"Broken";
    	
    	allscores[159][0] = (String)"Chochocho! Yuru Yuri*Capriccio!!!";
    	allscores[159][5] = (double) 17.06;
    	allscores[159][7] = (String)"Broken";
    	
    	allscores[160][0] = (String)"Max Brhon - Cyberpunk";
    	allscores[160][5] = (double) 23.23;
    	allscores[160][7] = (String)"Broken";
    	
    	allscores[161][0] = (String)"Pastel*Palettes - DISCOTHEQUE";
    	allscores[161][5] = (double) 9.02;
    	allscores[161][7] = (String)"Not Broken";
    	
    	allscores[162][0] = (String)"Hashimoto Yukari - Lost My Pieces (Toradora!)";
    	allscores[162][5] = (double) 4.48;
    	allscores[162][7] = (String)"Not Broken";
    	
    	allscores[163][0] = (String)"LiSA - Oath Sign";
    	allscores[163][5] = (double) 10.29;
    	allscores[163][7] = (String)"Broken";
    	
    	allscores[164][0] = (String)"ДЕТИ RAVE (DETI RAVE) - КАК В ПОСЛЕДНИЙ РАЗ (AS THE LAST TIME)";
    	allscores[164][5] = (double) 13.75;
    	allscores[164][7] = (String)"Not Broken";
    	
    	allscores[165][0] = (String)"Loki / Thaehan - Ohayou !";
    	allscores[165][5] = (double) 18.5;
    	allscores[165][7] = (String)"Not Broken";
    	
    	allscores[166][0] = (String)"Seiryu - Blue Dragon";
    	allscores[166][5] = (double) 20.78;
    	allscores[166][7] = (String)"Not Broken";
    	
    	allscores[167][0] = (String)"Jin ft.Lia - days (TV size)";
    	allscores[167][5] = (double) 4.84;
    	allscores[167][7] = (String)"Not Broken";
    	
    	allscores[168][0] = (String)"A.O.E. - Crystal Clocks and Music Box";
    	allscores[168][5] = (double) 12.64;
    	allscores[168][7] = (String)"Not Broken";
    	
    	allscores[169][0] = (String)"F777 - The Seven Seas";
    	allscores[169][5] = (double) 19.59;
    	allscores[169][7] = (String)"Not Broken";
    	
    	allscores[170][0] = (String)"Witch's Slave - Trappola Bewitching";
    	allscores[170][5] = (double) 21.79;
    	allscores[170][7] = (String)"Not Broken";
    	
    	allscores[171][0] = (String)"Billie Eilish - bad guy [bad]";
    	allscores[171][5] = (double) 10.1;
    	allscores[171][7] = (String)"Not Broken";
    	
    	allscores[172][0] = (String)"Asami Imai - Asayake no Starmine (TV Size)";
    	allscores[172][5] = (double) 5.57;
    	allscores[172][7] = (String)"Not Broken";
    	
    	allscores[173][0] = (String)"Daft Punk - Rinzler (TRON)";
    	allscores[173][5] = (double) 14.79;
    	allscores[173][7] = (String)"Not Broken";
    	
    	allscores[174][0] = (String)"Diamond Eyes - Hold On";
    	allscores[174][5] = (double) 10.87;
    	allscores[174][7] = (String)"Broken";
    	
    	allscores[175][0] = (String)"Panda Eyes & Teminite - Immortal Flame (ft. Anna Yvette)";
    	allscores[175][5] = (double) 19.68;
    	allscores[175][7] = (String)"idk";
    	
    	allscores[176][0] = (String)"HyuN - Illusion of Inflict";
    	allscores[176][5] = (double) 25.93;
    	allscores[176][7] = (String)"Not Broken";
    	
    	allscores[177][0] = (String)"Menu (Full)";
    	allscores[177][5] = (double) 4.13;
    	allscores[177][7] = (String)"Not Broken";
    	
    	allscores[178][0] = (String)"Survive Said The Prophet - Mukanjyo (Vinland Saga)";
    	allscores[178][5] = (double) 11.54;
    	allscores[178][7] = (String)"Broken";
    	
    	allscores[179][0] = (String)"fripSide - Black Bullet";
    	allscores[179][5] = (double) 11.96;
    	allscores[179][7] = (String)"Not Broken";
    	
    	allscores[180][0] = (String)"KAYZO x RIOT - Wake Up";
    	allscores[180][5] = (double) 19.49;
    	allscores[180][7] = (String)"Broken";
    	
    	allscores[181][0] = (String)"ONE OK ROCK - Liar";
    	allscores[181][5] = (double) 22.65;
    	allscores[181][7] = (String)"Broken";
    	
    	allscores[182][0] = (String)"FELT - In my room";
    	allscores[182][5] = (double) 8.92;
    	allscores[182][7] = (String)"Not Broken";
    	
    	allscores[183][0] = (String)"GAMERS! - Kanemoto Hisako & Iwami Manaka & Ookubo Rumi";
    	allscores[183][5] = (double) 10.98;
    	allscores[183][7] = (String)"Broken";
    	
    	allscores[184][0] = (String)"Jens.O - \"Somebody\" (nightcore mix)";
    	allscores[184][5] = (double) 11.81;
    	allscores[184][7] = (String)"idk";
    	
    	allscores[185][0] = (String)"Stonebank - Ripped To Pieces [Cut]";
    	allscores[185][5] = (double) 15.6;
    	allscores[185][7] = (String)"Not Broken";
    	
    	allscores[186][0] = (String)"P*Light - Gekkou Ranbu";
    	allscores[186][5] = (double) 22.41;
    	allscores[186][7] = (String)"Broken";
    	
    	allscores[187][0] = (String)"Hajimari Road - Love Live!";
	    allscores[187][5] = (double) 11.8;
	    allscores[187][7] = (String)"Not Broken";

	    allscores[188][0] = (String)"Pascal Michael Stiefel - Peace and Tranquility";
	    allscores[188][5] = (double) 6.7;
	    allscores[188][7] = (String)"Broken";

	    allscores[189][0] = (String)"Sayuri x MY FIRST STORY - Reimei (TV Size)";
	    allscores[189][5] = (double) 11.81;
	    allscores[189][7] = (String)"Not Broken";

	    allscores[190][0] = (String)"YURiKA - Kyoumen no Nami (TV size)";
	    allscores[190][5] = (double) 7.78;
	    allscores[190][7] = (String)"Not Broken";

	    allscores[191][0] = (String)"SYN - Danger";
	    allscores[191][5] = (double) 22.08;
	    allscores[191][7] = (String)"Broken";
	    
	    allscores[192][0] = (String)"Beginning";
	    allscores[192][5] = (double) 7.38;
	    allscores[192][7] = (String)"Not Broken";
	    
	    allscores[193][0] = (String)"Miyuri - I'm Still Waiting For You (feat. 60s Radio)";
	    allscores[193][5] = (double) 7.82;
	    allscores[193][7] = (String)"Not Broken";
	   
	    allscores[194][0] = (String)"Aya Hirano - Bouken Desho Desho (TV size)";
	    allscores[194][5] = (double) 11.56;
	    allscores[194][7] = (String)"Not Broken";
	    
	    allscores[195][0] = (String)"Aya Hirano - Hare Hare Yukai (TV size)";
	    allscores[195][5] = (double) 12.64;
	    allscores[195][7] = (String)"Not Broken";
	    
	    allscores[196][0] = (String)"Camellia - Shun no Seafood o Ikashita Curry Fuumi Paella ~808 Chef no Twerk to Trap Jitate~";
	    allscores[196][5] = (double) 25.83;
	    allscores[196][7] = (String)"idk";
	    
	    allscores[197][0] = (String)"ROUND TABLE ft. Nino - Puzzle (Welcome To The N.H.K)";
	    allscores[197][5] = (double) 7.11;
	    allscores[197][7] = (String)"idk";
	    
	    allscores[198][0] = (String)"Megurine Luka - Lie";
	    allscores[198][5] = (double) 7.59;
	    allscores[198][7] = (String)"Not Broken";
	    
	    allscores[199][0] = (String)"Ayano Mashiro - ideal white (TV size)";
	    allscores[199][5] = (double) 10.77;
	    allscores[199][7] = (String)"Not Broken";
	    
	    allscores[200][0] = (String)"KANA-BOON - Silhouette";
	    allscores[200][5] = (double) 11.44;
	    allscores[200][7] = (String)"Broken";
	    
	    allscores[201][0] = (String)"Frederic - Kanashii Ureshii";
	    allscores[201][5] = (double) 12.78;
	    allscores[201][7] = (String)"Broken";
	    
	    allscores[202][0] = (String)"Kotori ft. Stessie - Blooms [cut]";
	    allscores[202][5] = (double) 18.65;
	    allscores[202][7] = (String)"Broken";
	    
	    allscores[203][0] = (String)"Hatsune Miku - Rubik's Cube";
	    allscores[203][5] = (double) 31.3;
	    allscores[203][7] = (String)"Broken";
    	
	    allscores[204][0] = (String)"Empty Town";
	    allscores[204][5] = (double) 6.19;
	    allscores[204][7] = (String)"Not Broken";
	    
	    allscores[205][0] = (String)"earthmind - Another Heaven (game ver.)";
	    allscores[205][5] = (double) 12.12;
	    allscores[205][7] = (String)"Broken";
	    
	    allscores[206][0] = (String)"Haruka Tomatsu - Resolution (TV Size)";
	    allscores[206][5] = (double) 12.57;
	    allscores[206][7] = (String)"Broken";
	   
	    allscores[207][0] = (String)"MC MENTAL @ HIS BEST";
	    allscores[207][5] = (double) 22.99;
	    allscores[207][7] = (String)"Not Broken";
	    
	    allscores[208][0] = (String)"OISHII - ONIGIRI FREEWAY";
	    allscores[208][5] = (double) 27.29;
	    allscores[208][7] = (String)"Not Broken";
	    
	    allscores[209][0] = (String)"【﻿ｎｅｖｅｒ　ｇｉｖｅ　ｕｐ】";
	    allscores[209][5] = (double) 5.21;
	    allscores[209][7] = (String)"Not Broken";
	    
	    allscores[210][0] = (String)"Luis Fonsi, Omoi and R3 Music Box - Teopacito ft. Will Stetson";
	    allscores[210][5] = (double) 9.27;
	    allscores[210][7] = (String)"Not Broken";
	    
	    allscores[211][0] = (String)"ASCA - Resister (TV size)";
	    allscores[211][5] = (double) 13.69;
	    allscores[211][7] = (String)"Broken";
	    
	    allscores[212][0] = (String)"SHK - Halloween Party";
	    allscores[212][5] = (double) 20.58;
	    allscores[212][7] = (String)"Broken";
	    
	    allscores[213][0] = (String)"Bad Apple!! feat.nomico (Camellia’s “Bad Psy!!” Remix)";
	    allscores[213][5] = (double) 37.16;
	    allscores[213][7] = (String)"idk";
	    
	    allscores[214][0] = (String)"Run Girls, Run! - Slide Ride";
	    allscores[214][5] = (double) 11;
	    allscores[214][7] = (String)"idk";
	    
	    allscores[215][0] = (String)"suzumu ft. soraru - Zetsubousei Hero Chiryouyaku (Danganronpa)";
	    allscores[215][5] = (double) 22.09;
	    allscores[215][7] = (String)"idk";
	    
	    allscores[216][0] = (String)"F777 - Deadlocked";
	    allscores[216][5] = (double) 24.1;
	    allscores[216][7] = (String)"idk";
	    
	    allscores[217][0] = (String)"【Yooh】Road To The LegenD";
	    allscores[217][5] = (double) 31.18;
	    allscores[217][7] = (String)"idk";
	    
	    allscores[218][0] = (String)"Lantern";
	    allscores[218][5] = (double) 3.96;
	    allscores[218][7] = (String)"idk";
	    
	    allscores[219][0] = (String)"Shiori (TV Size ver)";
	    allscores[219][5] = (double) 11.31;
	    allscores[219][7] = (String)"idk";
	    
	    allscores[220][0] = (String)"Ziyoou-vachi - Kaen";
	    allscores[220][5] = (double) 11.95;
	    allscores[220][7] = (String)"idk";
	    
	    allscores[221][0] = (String)"YOASOBI - Halcyon";
	    allscores[221][5] = (double) 16.13;
	    allscores[221][7] = (String)"idk";
	    
	    allscores[222][0] = (String)"Shiggy Jr. - Oyasumi";
	    allscores[222][5] = (double) 19.62;
	    allscores[222][7] = (String)"idk";
	    
	    allscores[223][0] = (String)"YOASOBI - Yoru ni Kakeru";
	    allscores[223][5] = (double) 20.22;
	    allscores[223][7] = (String)"idk";
	    
	    allscores[224][0] = (String)"Niko - Night Of Fire";
	    allscores[224][5] = (double) 29.63;
	    allscores[224][7] = (String)"idk";
	    
	    allscores[225][0] = (String)"Camellia - Blackmagik Blazing";
	    allscores[225][5] = (double) 37.41;
	    allscores[225][7] = (String)"idk";
	    
	    allscores[226][0] = (String)"Gram vs Kobaryo - Yggdrasil";
	    allscores[226][5] = (double) 42.84;
	    allscores[226][7] = (String)"idk";
	    
	    allscores[227][0] = (String)"R3 Music Box- Harumachi Clover";
	    allscores[227][5] = (double) 5.59;
	    allscores[227][7] = (String)"idk";
	    
	    allscores[228][0] = (String)"IGNITE - Aoi Eir";
	    allscores[228][5] = (double) 11.16;
	    allscores[228][7] = (String)"idk";
	    
	    allscores[229][0] = (String)"Eir Aoi - MEMORIA (TV size)";
	    allscores[229][5] = (double) 12.77;
	    allscores[229][7] = (String)"idk";
	    
	    allscores[230][0] = (String)"Yuki no Youni (TV Size ver.)";
	    allscores[230][5] = (double) 14.71;
	    allscores[230][7] = (String)"idk";
	    
	    allscores[231][0] = (String)"umu - Ai no Sukima";
	    allscores[231][5] = (double) 14.99;
	    allscores[231][7] = (String)"idk";
	    
	    allscores[232][0] = (String)"Yubi Bouenkyou (TV Size ver.)";
	    allscores[232][5] = (double) 15.14;
	    allscores[232][7] = (String)"idk";
	    
	    allscores[233][0] = (String)"The Peggies - Kimi No Sei (TV size)";
	    allscores[233][5] = (double) 15.41;
	    allscores[233][7] = (String)"idk";
	    
	    allscores[234][0] = (String)"NEFFEX - Rumors (nightcore)";
	    allscores[234][5] = (double) 23.23;
	    allscores[234][7] = (String)"idk";
	    
	    allscores[235][0] = (String)"Resurrection Spell - ZUN (LeaF Remix)";
	    allscores[235][5] = (double) 34.23;
	    allscores[235][7] = (String)"idk";
	    
	    allscores[236][0] = (String)"Camellia - EXiT this Earth's Atomosphere";
	    allscores[236][5] = (double) 39.09;
	    allscores[236][7] = (String)"idk";
	    
	    allscores[237][0] = (String)"Kobaryo - Villain Virus ( feat. Camellia )";
	    allscores[237][5] = (double) 39.38;
	    allscores[237][7] = (String)"idk";
	    
	    allscores[238][0] = (String)"40MP ft. Chano - Natsukoi Hanabi [cut]";
	    allscores[238][5] = (double) 7.98;
	    allscores[238][7] = (String)"idk";
	   
	    allscores[239][0] = (String)"binaria - Kamiiro Awase (Danganronpa 3)";
	    allscores[239][5] = (double) 9.33;
	    allscores[239][7] = (String)"idk";
	    
	    allscores[240][0] = (String)"LiSA - Crossing Fields";
	    allscores[240][5] = (double) 10.18;
	    allscores[240][7] = (String)"idk";
	    
	    allscores[241][0] = (String)"【MMD】Go home Homura, you are drunk【ハピトリ】";
	    allscores[241][5] = (double) 14.06;
	    allscores[241][7] = (String)"idk";
	    
	    allscores[242][0] = (String)"ReoNa - ANIMA (TV size)";
	    allscores[242][5] = (double) 14.14;
	    allscores[242][7] = (String)"idk";
	    
	    allscores[243][0] = (String)"Maon Kurosaki ft. TRUSTRICK - DEAD OR LIE (Danganronpa 3)";
	    allscores[243][5] = (double) 15.43;
	    allscores[243][7] = (String)"idk";
	    
	    allscores[244][0] = (String)"The Peggies - Centimeter (TV Size)";
	    allscores[244][5] = (double) 19.75;
	    allscores[244][7] = (String)"idk";
	    
	    allscores[245][0] = (String)"Nameless - Milk Crown on Sonnetica";
	    allscores[245][5] = (double) 25.08;
	    allscores[245][7] = (String)"idk";
	    
	    allscores[246][0] = (String)"nano - Omoide Kakera";
	    allscores[246][5] = (double) 26.13;
	    allscores[246][7] = (String)"idk";
	    
	    allscores[247][0] = (String)"t+pazolite & Getty - Twisted Drop Party";
	    allscores[247][5] = (double) 27.97;
	    allscores[247][7] = (String)"idk";
	    
	    allscores[248][0] = (String)"Camellia - (The) Immortal Scream";
	    allscores[248][5] = (double) 37.26;
	    allscores[248][7] = (String)"idk";
	    
	    allscores[249][0] = (String)"DJ Myosuke & Noizenecio - Architecture";
	    allscores[249][5] = (double) 39.35;
	    allscores[249][7] = (String)"idk";
	    
	    allscores[250][0] = (String)"Camellia - K.Y.A.F.A";
	    allscores[250][5] = (double) 46.92;
	    allscores[250][7] = (String)"idk";
	    
		while( (line=bufReader.readLine()) != null )
		{
			
			//Cardiac Sound
			if(line.contains("id=1811072134") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[0][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[0][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[0][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[0][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //3rd Prototype
			} else if(line.contains("id=1704895505") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[1][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[1][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[1][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[1][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Abo Tekashi
			} else if(line.contains("id=1683505368") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[2][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[2][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[2][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[2][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Ether Strike
			} else if(line.contains("id=1686048107") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[3][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[3][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[3][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[3][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Alvaro Soler
			} else if(line.contains("id=1087340967") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[4][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[4][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[4][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[4][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Divine Sorrow
			} else if(line.contains("id=1639866845") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[5][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[5][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[5][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[5][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //A Boat Beneath
			} else if(line.contains("id=1427616858") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[6][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[6][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[6][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[6][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Antithese
			} else if(line.contains("id=1705133913") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[7][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[7][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[7][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[7][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Breathe
			} else if(line.contains("id=1638167679") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[8][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[8][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[8][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[8][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Bring me to life
			} else if(line.contains("id=1732064685") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[9][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[9][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[9][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[9][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Bryce Fox
			} else if(line.contains("id=1775957817") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[10][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[10][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[10][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[10][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Bassline Yatteru
			} else if(line.contains("id=1641292718") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[11][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[11][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[11][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[11][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //GHOST
			} else if(line.contains("id=1770413751") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[12][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[12][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[12][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[12][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Be Wild
			} else if(line.contains("id=1474838603") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[13][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[13][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[13][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[13][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Mirai Puzzle
			} else if(line.contains("id=1369101193") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[14][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[14][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[14][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[14][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Ugoku, Ugoku
			} else if(line.contains("id=1182570441") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[15][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[15][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[15][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[15][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //The Awakening
			} else if(line.contains("id=1248864821") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[16][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[16][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[16][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[16][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Chroma - I
			} else if(line.contains("id=1703638341") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[17][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[17][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[17][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[17][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //cillia - FIRST
			} else if(line.contains("id=1708871582") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[18][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[18][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[18][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[18][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Clannad ED
			} else if(line.contains("id=1751446394") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[19][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[19][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[19][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[19][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //ClariS - Hitorigoto
			} else if(line.contains("id=1366448932") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[20][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[20][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[20][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[20][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Miracle Colors
			} else if(line.contains("id=1714013816") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[21][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[21][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[21][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[21][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Acid Wolfpack
			} else if(line.contains("id=1756030124") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[22][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[22][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[22][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[22][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Crywolf - Epilogue
			} else if(line.contains("id=1204259918") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[23][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[23][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[23][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[23][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Cupidz - Sheet (cut)
			} else if(line.contains("id=1708178993") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[24][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[24][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[24][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[24][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Technologic
			} else if(line.contains("id=1105441757") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[25][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[25][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[25][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[25][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //DANCE TILL YOU'RE DEAD
			} else if(line.contains("id=1657537406") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[26][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[26][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[26][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[26][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Derpy - Nyan Nyan Dance
			} else if(line.contains("id=1666157980") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[27][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[27][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[27][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[27][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Destination Calabria
			} else if(line.contains("id=1729066501") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[28][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[28][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[28][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[28][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Die Antwoord - Alien
			} else if(line.contains("id=1597911769") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[29][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[29][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[29][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[29][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Alquimia
			} else if(line.contains("id=799269798") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[30][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[30][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[30][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[30][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //DJ Myosuke - Black Territory
			} else if(line.contains("id=1694410555") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[31][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[31][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[31][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[31][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Domestic na kanojo OP
			} else if(line.contains("id=1772841829") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[32][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[32][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[32][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[32][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Drop - Granat
			} else if(line.contains("id=874878066") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[33][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[33][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[33][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[33][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Duca - Nekoichi [cut]
			} else if(line.contains("id=1695619624") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[34][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[34][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[34][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[34][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //East of Eden
			} else if(line.contains("id=1642450599") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[35][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[35][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[35][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[35][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Limited Dimension
			} else if(line.contains("id=1811074665") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[36][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[36][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[36][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[36][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //EnV – Anubis
			} else if(line.contains("id=1332644700") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[37][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[37][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[37][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[37][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Feint - Outbreak
			} else if(line.contains("id=1399104761") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[38][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[38][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[38][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[38][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Futari No Kimochi (Flute)
			} else if(line.contains("id=1702274583") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[39][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[39][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[39][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[39][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //GARNiDELiA - Gokuraku Jodo [cut]
			} else if(line.contains("id=1543616220") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[40][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[40][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[40][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[40][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Nurture (cut)
			} else if(line.contains("id=1332220461") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[41][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[41][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[41][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[41][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //guardin - Solitary
			} else if(line.contains("id=1756067471") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[42][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[42][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[42][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[42][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Halozy - Brilliant Colors
			} else if(line.contains("id=1811078624") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[43][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[43][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[43][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[43][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Halozy - Three Magic
			} else if(line.contains("id=1811080231") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[44][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[44][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[44][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[44][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Halsey ‒ Gasoline
			} else if(line.contains("id=1177138211") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[45][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[45][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[45][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[45][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //HopeX - Into The Clouds (Nightcore)
			} else if(line.contains("id=1750187045") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[46][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[46][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[46][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[46][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Hydelic - Connected [Yours Forever] [cut]
			} else if(line.contains("id=1566047041") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[47][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[47][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[47][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[47][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Imperio - \"Atlantis\"
			} else if(line.contains("id=1811092823") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[48][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[48][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[48][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[48][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Indigo Child - Nostalgia
			} else if(line.contains("id=1173308623") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[49][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[49][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[49][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[49][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //iNO - Suishoku Komachi Melancholia
			} else if(line.contains("id=1628107578") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[50][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[50][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[50][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[50][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Ito Kanako - Fatima (Steins;Gate 0)
			} else if(line.contains("id=1750402328") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[51][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[51][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[51][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[51][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //JAKIN - Bipolar (feat. Generic)
			} else if(line.contains("id=1785427605") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[52][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[52][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[52][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[52][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Wowie Zowie!
			} else if(line.contains("id=1752575261") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[53][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[53][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[53][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[53][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //K/DA - POP/STARS
			} else if(line.contains("id=1611574921") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[54][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[54][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[54][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[54][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Kenny B - Parijs
			} else if(line.contains("id=1231165179") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[55][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[55][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[55][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[55][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Kara Kara Kara
			} else if(line.contains("id=1750124831") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[56][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[56][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[56][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[56][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Chikatto Chika Chika
			} else if(line.contains("id=1741811674") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[57][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[57][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[57][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[57][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Laur -\"Sound Chimera\"
			} else if(line.contains("id=1811082780") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[58][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[58][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[58][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[58][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Electric Daisy Violin
			} else if(line.contains("id=1739109132") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[59][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[59][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[59][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[59][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Sweet Love
			} else if(line.contains("id=1426793464") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[60][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[60][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[60][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[60][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Lobby
			} else if(line.contains("id=1683502765") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[61][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[61][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[61][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[61][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Death Bringer
			} else if(line.contains("id=1183164899") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[62][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[62][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[62][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[62][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Moonlight Sonata
			} else if(line.contains("id=896296812") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[63][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[63][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[63][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[63][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //M-O-T-U - Snowman
			} else if(line.contains("id=1588843169") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[64][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[64][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[64][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[64][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //A Bella!
			} else if(line.contains("id=1537768924") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[65][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[65][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[65][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[65][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Mahoutsukai no Yome (Opening ST) - Here
			} else if(line.contains("id=1642326199") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[66][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[66][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[66][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[66][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Mantis Lords
			} else if(line.contains("id=1750020078") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[67][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[67][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[67][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[67][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //White Happy
			} else if(line.contains("id=1761373329") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[68][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[68][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[68][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[68][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Marnik - Up
			} else if(line.contains("id=1766551847") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[69][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[69][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[69][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[69][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Marshmello - FRIENDS
			} else if(line.contains("id=1413139396") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[70][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[70][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[70][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[70][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Masayoshi Minoshima - Bad Apple!! [feat. Nomico]
			} else if(line.contains("id=1772811738") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[71][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[71][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[71][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[71][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Minecraft Piano Theme
			} else if(line.contains("id=1748928257") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[72][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[72][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[72][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[72][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Michi to Ren-chon
			} else if(line.contains("id=1339039202") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[73][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[73][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[73][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[73][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Monetochka — It is a Pain
			} else if(line.contains("id=1409891733") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[74][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[74][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[74][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[74][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Monetochka — Mom, I don't drop siegs
			} else if(line.contains("id=1385471970") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[75][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[75][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[75][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[75][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //My Heart
			} else if(line.contains("id=1574185982") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[76][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[76][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[76][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[76][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Namice – Perfection
			} else if(line.contains("id=1267684493") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[77][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[77][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[77][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[77][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Nega/squared - Mellow
			} else if(line.contains("id=1745935736") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[78][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[78][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[78][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[78][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Nekomata Master - Sleepless Days
			} else if(line.contains("id=1586522137") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[79][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[79][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[79][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[79][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Never Say Die One Hunderd Mix [Intro]
			} else if(line.contains("id=1127109361") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[80][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[80][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[80][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[80][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //The Family - Hej Monica
			} else if(line.contains("id=1284067740") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[81][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[81][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[81][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[81][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Nicolas Dominique - Yay! (PonyTime Rework)
			} else if(line.contains("id=1716936794") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[82][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[82][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[82][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[82][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Nienna - Oonagh (Nightcore)
			} else if(line.contains("id=1707153886") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[83][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[83][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[83][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[83][4] = (double) functions.getPoints(bufReader.readLine());

		    //Night of Nights
			} else if(line.contains("id=1538711674") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[84][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[84][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[84][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[84][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //NightHawk22 - Perfect Storm
			} else if(line.contains("id=1555883157") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[85][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[85][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[85][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[85][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //No title - GRRP Remix
			} else if(line.contains("id=1755133207") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[86][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[86][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[86][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[86][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Omoi - Teo
			} else if(line.contains("id=1431886365") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[87][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[87][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[87][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[87][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Oskar Schuster - Singur
			} else if(line.contains("id=957356807") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[88][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[88][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[88][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[88][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Oskar Schuster - Wunder
			} else if(line.contains("id=1177506304") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[89][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[89][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[89][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[89][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //OST The Rising of the Shield Hero
			} else if(line.contains("id=1688254000") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[90][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[90][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[90][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[90][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Overlord Op 1
			} else if(line.contains("id=1424176859") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[91][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[91][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[91][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[91][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //P4koo - Gothique Resonance
			} else if(line.contains("id=1741864264") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[92][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[92][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[92][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[92][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Paganini - 24 Caprices Opus1 #5 in A Minor
			} else if(line.contains("id=1231705233") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[93][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[93][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[93][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[93][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Madeon ‒ Shelter [Remix by happy30]
			} else if(line.contains("id=907198288") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[94][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[94][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[94][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[94][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Prism Magical - DJ SHARPNEL hardrave remix
			} else if(line.contains("id=1748212015") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[95][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[95][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[95][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[95][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Pskovskoe
			} else if(line.contains("id=1473100359") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[96][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[96][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[96][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[96][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Qrispy Joybox - Yuuki no Pendant
			} else if(line.contains("id=1719081703") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[97][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[97][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[97][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[97][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //R3 Music Box - Curtain Call!!!!!
			} else if(line.contains("id=1782347099") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[98][0] = (String)"R3 Music Box - Curtain Call!!!!!";
		    	allscores[98][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[98][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[98][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[98][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Rameses B – Infinity
			} else if(line.contains("id=1396116622") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[99][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[99][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[99][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[99][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Rameses B – Visionary
			} else if(line.contains("id=1629365516") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[100][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[100][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[100][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[100][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Ravel Nightstar - Flower Bless
			} else if(line.contains("id=1695723816") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[101][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[101][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[101][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[101][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Reign[Radio Edit]
			} else if(line.contains("id=1649521157") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[102][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[102][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[102][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[102][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Royal Blood - Out of the Black
			} else if(line.contains("id=1150567214") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[103][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[103][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[103][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[103][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //S3RL - Scary Movie
			} else if(line.contains("id=1660451804") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[104][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[104][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[104][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[104][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Sakakibara Yui - Doki Doki kokoro Flavor
			} else if(line.contains("id=1709333087") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[105][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[105][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[105][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[105][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Sakuraburst - Cherry Blossoms
			} else if(line.contains("id=1293942635") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[106][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[106][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[106][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[106][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Sapphire - Never More (English Cover)
			} else if(line.contains("id=1146871676") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[107][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[107][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[107][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[107][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Seo9 - Explosion
			} else if(line.contains("id=1638121398") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[108][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[108][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[108][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[108][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Seunghwan Lee - True Eternity
			} else if(line.contains("id=1282767793") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[109][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[109][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[109][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[109][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Sky Of Scarlet Perception (Folk Remix)
			} else if(line.contains("id=1614485073") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[110][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[110][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[110][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[110][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Soulji - Murder (cut)
			} else if(line.contains("id=1805768053") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[111][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[111][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[111][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[111][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Sporty-O - Let Me Hit It
			} else if(line.contains("id=1755961412") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[112][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[112][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[112][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[112][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Star Driver - 5 Centimeters per second
			} else if(line.contains("id=1778643834") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[113][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[113][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[113][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[113][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Subtact - Tunnel Vision [cut]
			} else if(line.contains("id=1667365214") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[114][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[114][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[114][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[114][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Tabinotochuu
			} else if(line.contains("id=1638166984") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[115][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[115][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[115][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[115][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Taska Black - We Would Never Do
			} else if(line.contains("id=1382291775") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[116][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[116][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[116][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[116][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Tears for Fears ‒ Mad World [Cover by Adam Lambert]
			} else if(line.contains("id=837660715") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[117][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[117][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[117][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[117][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //The Fat Rat - Fly Away
			} else if(line.contains("id=1752202545") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[118][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[118][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[118][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[118][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //The Piano
			} else if(line.contains("id=1679405252") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[119][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[119][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[119][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[119][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //TheFatRat - MAYDAY
			} else if(line.contains("id=1360907697") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[120][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[120][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[120][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[120][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Thriftworks - Moon Juice
			} else if(line.contains("id=1291188685") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[121][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[121][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[121][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[121][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Tia - The Glory Days (cut)
			} else if(line.contains("id=1266649657") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[122][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[122][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[122][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[122][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Tokyo Machine - Epic
			} else if(line.contains("id=1683444823") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[123][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[123][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[123][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[123][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Tokyo Machine - ROCK IT
			} else if(line.contains("id=1656300520") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[124][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[124][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[124][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[124][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Touhou - Lullaby of Deserted Hell (Vocal remix)
			} else if(line.contains("id=1643983704") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[125][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[125][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[125][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[125][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Touhou - Road of Apotropiac God ~ Dark Road
			} else if(line.contains("id=1665743380") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[126][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[126][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[126][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[126][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Touhou - Shanghai Alice of Meiji 17 (orchestral)
			} else if(line.contains("id=1700444388") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[127][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[127][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[127][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[127][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Touhou - The Sealed Away Youkai ~ Lost Place
			} else if(line.contains("id=1738427223") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[128][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[128][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[128][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[128][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Touhou ~ Beloved Tomboyish Girl (Waltz remix)
			} else if(line.contains("id=1547746558") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[129][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[129][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[129][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[129][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Touhou ~ Luna dial
			} else if(line.contains("id=1623707650") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[130][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[130][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[130][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[130][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Tripzy Leary - Departure
			} else if(line.contains("id=1664288951") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[131][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[131][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[131][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[131][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //Tristam - Once Again
			} else if(line.contains("id=1671843539") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[132][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[132][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[132][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[132][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Tristam and Braken - Frame of Mind
			} else if(line.contains("id=1745693781") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[133][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[133][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[133][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[133][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //TUMENECO - こんなに月が绮丽な夜は(off vocal)
			} else if(line.contains("id=916962639") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[134][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[134][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[134][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[134][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Owen Was Her
			} else if(line.contains("id=1767360081") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[135][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[135][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[135][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[135][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Usa - Tsumi no Namae (cut)
			} else if(line.contains("id=1365620370") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[136][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[136][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[136][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[136][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //There's Supposed to Be a Cheat Code for Happiness
			} else if(line.contains("id=880078120") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[137][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[137][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[137][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[137][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Vena Cava - Ohana
			} else if(line.contains("id=1757884263") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[138][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[138][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[138][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[138][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Take A Hint [Nightcore cover]
			} else if(line.contains("id=1159514800") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[139][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[139][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[139][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[139][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Waffle - Precious (Day 9)
			} else if(line.contains("id=1745211014") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[140][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[140][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[140][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[140][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Waterflame - Glorious Morning 2
			} else if(line.contains("id=1763256128") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[141][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[141][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[141][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[141][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Skrillex - Killa
			} else if(line.contains("id=1385747569") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[142][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[142][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[142][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[142][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //josh pan (sakuraburst Remix)
			} else if(line.contains("id=1775798104") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[143][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[143][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[143][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[143][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Yonder voice-Ember of spring
			} else if(line.contains("id=1811064014") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[144][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[144][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[144][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[144][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Yooh - \"MariannE \"
			} else if(line.contains("id=1811081594") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[145][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[145][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[145][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[145][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //YUC'e - intro-duck-tion!! [cut]
			} else if(line.contains("id=1711470854") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[146][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[146][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[146][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[146][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Yuikonnu - Kakushigoto [cut]
			} else if(line.contains("id=1572846458") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[147][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[147][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[147][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[147][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Ayaponzu ‒ Super Nuko World
			} else if(line.contains("id=1278033234") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[148][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[148][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[148][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[148][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //miko - Soumatou Labyrinth
			} else if(line.contains("id=1244533138") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[149][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[149][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[149][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[149][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //dそでをぬらした
			} else if(line.contains("id=1752739959") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[150][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[150][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[150][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[150][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //UNDEAD CORPORATION - Setsugetsu Ouka no Kuni
			} else if(line.contains("id=1819047015") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[151][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[151][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[151][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[151][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Taio Cruz - Telling The World (Rio OST)
			} else if(line.contains("id=1844276301") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[152][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[152][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[152][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[152][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //This Game - No Game No Life
			} else if(line.contains("id=1779840853") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[153][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[153][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[153][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[153][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //The Super Ball - RIN! RIN HI! HI!
			} else if(line.contains("id=1861205670") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[154][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[154][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[154][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[154][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //DJ TOTTO - Precious * Star [feat. Enako]
			} else if(line.contains("id=1812086885") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[155][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[155][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[155][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[155][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //One Shot, One Kill - Varien
			} else if(line.contains("id=1866760502") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[156][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[156][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[156][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[156][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Roomie - Brofist (feat. PewDiePie)
			} else if(line.contains("id=1870361108") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[157][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[157][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[157][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[157][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //SAO Alternative: GGO Ryusei - Eir Aoi
			} else if(line.contains("id=1768879053") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[158][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[158][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[158][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[158][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Chochocho! Yuru Yuri*Capriccio!!!
			} else if(line.contains("id=1840851482") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[159][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[159][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[159][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[159][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Max Brhon - Cyberpunk
			} else if(line.contains("id=1862026990") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[160][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[160][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[160][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[160][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Pastel*Palettes - DISCOTHEQUE
			} else if(line.contains("id=1802649851") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[161][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[161][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[161][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[161][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Hashimoto Yukari - Lost My Pieces (Toradora!)
			} else if(line.contains("id=1799361924") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[162][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[162][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[162][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[162][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //LiSA - Oath Sign
			} else if(line.contains("id=1856225972") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[163][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[163][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[163][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[163][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //ДЕТИ RAVE (DETI RAVE) - КАК В ПОСЛЕДНИЙ РАЗ (AS THE LAST TIME)
			} else if(line.contains("id=1860408052") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[164][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[164][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[164][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[164][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Loki / Thaehan - Ohayou !
			} else if(line.contains("id=1881490561") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[165][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[165][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[165][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[165][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Seiryu - Blue Dragon
			} else if(line.contains("id=1856152685") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[166][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[166][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[166][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[166][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Jin ft.Lia - days (TV size)
			} else if(line.contains("id=1823978385") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[167][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[167][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[167][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[167][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //A.O.E. - Crystal Clocks and Music Box
			} else if(line.contains("id=1852995711") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[168][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[168][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[168][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[168][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //F777 - The Seven Seas
			} else if(line.contains("id=1879884976") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[169][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[169][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[169][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[169][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Witch's Slave - Trappola Bewitching
			} else if(line.contains("id=1831988857") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[170][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[170][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[170][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[170][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Billie Eilish - bad guy [bad]
			} else if(line.contains("id=1838521753") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[171][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[171][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[171][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[171][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Asami Imai - Asayake no Starmine (TV Size)
			} else if(line.contains("id=1793769410") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[172][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[172][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[172][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[172][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Daft Punk - Rinzler (TRON)
			} else if(line.contains("id=1841758143") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[173][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[173][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[173][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[173][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Diamond Eyes - Hold On
			} else if(line.contains("id=1846081459") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[174][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[174][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[174][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[174][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Teminite - Immortal Flame (ft. Anna Yvette)
			} else if(line.contains("id=1877814777") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[175][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[175][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[175][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[175][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //HyuN - Illusion of Inflict
			} else if(line.contains("id=1881057326") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[176][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[176][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[176][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[176][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Menu (Full)
			} else if(line.contains("id=1795810557") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[177][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[177][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[177][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[177][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Survive Said The Prophet - Mukanjyo (Vinland Saga)
			} else if(line.contains("id=1818838006") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[178][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[178][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[178][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[178][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //fripSide - Black Bullet
			} else if(line.contains("id=1811889244") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[179][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[179][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[179][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[179][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //KAYZO x RIOT - Wake Up
			} else if(line.contains("id=1828678082") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[180][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[180][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[180][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[180][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //ONE OK ROCK - Liar
			} else if(line.contains("id=1794511853") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[181][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[181][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[181][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[181][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //FELT - In my room
			} else if(line.contains("id=1782060189") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[182][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[182][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[182][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[182][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //GAMERS! - Kanemoto Hisako
			} else if(line.contains("id=1840661006") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[183][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[183][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[183][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[183][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Jens.O - \"Somebody\" (nightcore mix)
			} else if(line.contains("id=1887235081") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[184][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[184][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[184][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[184][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Stonebank - Ripped To Pieces [Cut]
			} else if(line.contains("id=1887702626") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[185][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[185][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[185][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[185][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //P*Light - Gekkou Ranbu
			} else if(line.contains("id=1761108709") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[186][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[186][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[186][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[186][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Hajimari Road - Love Live!
			} else if(line.contains("id=1768720886") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[187][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[187][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[187][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[187][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Pascal Michael Stiefel - Peace and Tranquility
			} else if(line.contains("id=1778581611") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[188][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[188][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[188][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[188][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Sayuri x MY FIRST STORY - Reimei (TV Size)
			} else if(line.contains("id=1822998201") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[189][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[189][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[189][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[189][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //YURiKA - Kyoumen no Nami (TV size)
			} else if(line.contains("id=1796543284") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[190][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[190][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[190][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[190][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //SYN - Danger
			} else if(line.contains("id=1776986801") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[191][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[191][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[191][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[191][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Beginning
			} else if(line.contains("id=1903213479") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[192][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[192][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[192][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[192][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Miyuri - I'm Still Waiting For You (feat. 60s Radio)
			} else if(line.contains("id=1759511802") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[193][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[193][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[193][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[193][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Aya Hirano - Bouken Desho Desho (TV size)
			} else if(line.contains("id=1890500151") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[194][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[194][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[194][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[194][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Aya Hirano - Hare Hare Yukai (TV size)
			} else if(line.contains("id=1890324507") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[195][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[195][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[195][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[195][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Camellia - Shun no Seafood o Ikashita Curry Fuumi Paella ~808 Chef no Twerk to Trap Jitate~
			} else if(line.contains("id=1827147292") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[196][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[196][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[196][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[196][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //ROUND TABLE ft. Nino - Puzzle (Welcome To The N.H.K)
			} else if(line.contains("id=1910749591") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[197][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[197][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[197][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[197][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Megurine Luka - Lie
			} else if(line.contains("id=1779074638") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[198][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[198][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[198][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[198][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Ayano Mashiro - ideal white (TV size)
			} else if(line.contains("id=1887231051") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[199][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[199][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[199][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[199][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //KANA-BOON - Silhouette
			} else if(line.contains("id=1900420437") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[200][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[200][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[200][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[200][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Frederic - Kanashii Ureshii
			} else if(line.contains("id=1901706571") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[201][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[201][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[201][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[201][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Kotori ft. Stessie - Blooms [cut]
			} else if(line.contains("id=1890148480") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[202][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[202][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[202][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[202][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Hatsune Miku - Rubik's Cube
			} else if(line.contains("id=1888140143") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[203][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[203][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[203][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[203][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //Empty Town	
			} else if(line.contains("id=1907104763") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[204][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[204][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[204][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[204][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //earthmind - Another Heaven (game ver.)
			} else if(line.contains("id=1846909072") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[205][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[205][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[205][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[205][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //Haruka Tomatsu - Resolution (TV Size)
			} else if(line.contains("id=1888267358") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[206][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[206][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[206][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[206][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //MC MENTAL @ HIS BEST
			} else if(line.contains("id=1919844928") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[207][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[207][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[207][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[207][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //OISHII - ONIGIRI FREEWAY
			} else if(line.contains("id=2064931987") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[208][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[208][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[208][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[208][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //(ｎｅｖｅｒ　ｇｉｖｅ　ｕｐ】
			} else if(line.contains("id=1907765496") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[209][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[209][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[209][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[209][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //Luis Fonsi, Omoi and R3 Music Box - Teopacito ft. Will Stetson
			} else if(line.contains("id=1902452783") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[210][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[210][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[210][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[210][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //ASCA - Resister (TV size)
			} else if(line.contains("id=1840669212") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[211][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[211][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[211][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[211][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //SHK - Halloween Party
			} else if(line.contains("id=1903321442") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[212][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[212][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[212][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[212][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //Bad Apple!! feat.nomico (Camellia’s “Bad Psy!!” Remix)
			} else if(line.contains("id=1896581440") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[213][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[213][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[213][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[213][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Run Girls, Run! - Slide Ride
			} else if(line.contains("id=1777356015") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[214][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[214][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[214][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[214][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //suzumu ft. soraru - Zetsubousei Hero Chiryouyaku (Danganronpa)
			} else if(line.contains("id=1951935727") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[215][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[215][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[215][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[215][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //F777 - Deadlocked
			} else if(line.contains("id=1914753805") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[216][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[216][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[216][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[216][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //【Yooh】Road To The LegenD
			} else if(line.contains("id=1905633693") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[217][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[217][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[217][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[217][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Lantern
			} else if(line.contains("id=1910887038") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[218][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[218][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[218][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[218][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Shiori (TV Size ver)
			} else if(line.contains("id=2134510960") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[219][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[219][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[219][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[219][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Ziyoou-vachi - Kaen
			} else if(line.contains("id=1963602584") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[220][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[220][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[220][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[220][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //YOASOBI - Halcyon
			} else if(line.contains("id=2131089175") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[221][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[221][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[221][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[221][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Shiggy Jr. - Oyasumi
			} else if(line.contains("id=2052265540") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[222][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[222][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[222][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[222][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //YOASOBI - Yoru ni Kakeru
			} else if(line.contains("id=2123835932") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[223][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[223][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[223][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[223][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Niko - Night Of Fire
			} else if(line.contains("id=1904013813") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[224][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[224][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[224][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[224][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Camellia - Blackmagik Blazing
			} else if(line.contains("id=1921294420") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[225][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[225][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[225][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[225][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Gram vs Kobaryo - Yggdrasil
			} else if(line.contains("id=1910039909") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[226][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[226][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[226][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[226][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //R3 Music Box- Harumachi Clover
			} else if(line.contains("id=2172937437") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[227][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[227][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[227][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[227][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //IGNITE - Aoi Eir
			} else if(line.contains("id=1964925329") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[228][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[228][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[228][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[228][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Eir Aoi - MEMORIA (TV size)
			} else if(line.contains("id=2158332826") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[229][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[229][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[229][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[229][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Yuki no Youni (TV Size ver.)
			} else if(line.contains("id=2151481158") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[230][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[230][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[230][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[230][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //umu - Ai no Sukima
			} else if(line.contains("id=2091344220") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[231][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[231][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[231][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[231][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Yubi Bouenkyou (TV Size ver.)
			} else if(line.contains("id=2153187284") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[232][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[232][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[232][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[232][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //The Peggies - Kimi No Sei (TV size)
			} else if(line.contains("id=2165197313") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[233][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[233][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[233][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[233][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //NEFFEX - Rumors (nightcore)
			} else if(line.contains("id=2124606559") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[234][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[234][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[234][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[234][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Resurrection Spell - ZUN (LeaF Remix)
			} else if(line.contains("id=1907450401") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[235][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[235][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[235][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[235][4] = (double) functions.getPoints(bufReader.readLine());
		    
		    //Camellia - EXiT this Earth's Atomosphere
			} else if(line.contains("id=2171144726") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[236][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[236][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[236][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[236][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Kobaryo - Villain Virus ( feat. Camellia )
			} else if(line.contains("id=2009226030") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[237][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[237][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[237][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[237][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //40MP ft. Chano - Natsukoi Hanabi [cut]
			} else if(line.contains("id=1997370859") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[238][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[238][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[238][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[238][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //binaria - Kamiiro Awase (Danganronpa 3)
			} else if(line.contains("id=2002066464") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[239][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[239][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[239][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[239][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //LiSA - Crossing Fields
			} else if(line.contains("id=1975569166") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[240][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[240][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[240][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[240][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //【MMD】Go home Homura, you are drunk【ハピトリ】
			} else if(line.contains("id=1773058875") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[241][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[241][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[241][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[241][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //ReoNa - ANIMA (TV size)
			} else if(line.contains("id=2180027908") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[242][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[242][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[242][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[242][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Maon Kurosaki ft. TRUSTRICK - DEAD OR LIE (Danganronpa 3)
			} else if(line.contains("id=1962527031") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[243][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[243][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[243][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[243][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //The Peggies - Centimeter (TV Size)
			} else if(line.contains("id=2185743185") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[244][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[244][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[244][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[244][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Nameless - Milk Crown on Sonnetica
			} else if(line.contains("id=1995767467") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[245][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[245][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[245][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[245][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //nano - Omoide Kakera
			} else if(line.contains("id=2013237230") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[246][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[246][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[246][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[246][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //t+pazolite & Getty - Twisted Drop Party
			} else if(line.contains("id=1967894644") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[247][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[247][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[247][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[247][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Camellia - (The) Immortal Scream
			} else if(line.contains("id=2153714721") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[248][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[248][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[248][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[248][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //DJ Myosuke & Noizenecio - Architecture
			} else if(line.contains("id=2164248155") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[249][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[249][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[249][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[249][4] = (double) functions.getPoints(bufReader.readLine());
		    	
		    //Camellia - K.Y.A.F.A
			} else if(line.contains("id=2180608464") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[250][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[250][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[250][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[250][4] = (double) functions.getPoints(bufReader.readLine());
		    	
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
		
		double realpoints = 0;
		double rankedpoints = 0;
		double maximumpoints = 0;
		for(int i = 0; i<allscores.length;i++) {
			if(allscores[i][0] != null) {
				double points = (double) allscores[i][4];
				double maxpoints = (double) allscores[i][5];
				double actpoints = points;
				realpoints += points;
				maximumpoints += maxpoints;
				
				if(allscores[i][7] == "Broken") {
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
		profilepic = resize(profilepic,100,100);
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
	
	private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

}
