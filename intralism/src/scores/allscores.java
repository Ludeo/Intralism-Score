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
		Object allscores[][] = new Object[214][8];
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
	    
	    allscores[197][0] = (String)"Creo - Unveil";
	    allscores[197][5] = (double) 2.97;
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
	    allscores[203][7] = (String)"idk";
    	
	    allscores[204][0] = (String)"Empty Town";
	    allscores[204][5] = (double) 6.19;
	    allscores[204][7] = (String)"Not Broken";
	    
	    allscores[205][0] = (String)"earthmind - Another Heaven (game ver.)";
	    allscores[205][5] = (double) 12.12;
	    allscores[205][7] = (String)"Broken";
	    
	    allscores[206][0] = (String)"Haruka Tomatsu - Resolution (TV Size)";
	    allscores[206][5] = (double) 12.36;
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
	    
		while( (line=bufReader.readLine()) != null )
		{
			if(line.contains("Cardiac Sound") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[0][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[0][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[0][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[0][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("3rd Prototype") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[1][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[1][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[1][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[1][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Abo Tekashi") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[2][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[2][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[2][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[2][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Ether Strike") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[3][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[3][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[3][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[3][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Alvaro Soler") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[4][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[4][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[4][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[4][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Divine Sorrow") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[5][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[5][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[5][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[5][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("A Boat Beneath") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[6][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[6][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[6][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[6][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Antithese") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[7][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[7][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[7][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[7][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Breathe") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[8][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[8][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[8][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[8][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Bring me to life") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[9][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[9][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[9][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[9][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Bryce Fox") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[10][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[10][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[10][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[10][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Bassline Yatteru") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[11][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[11][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[11][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[11][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("GHOST") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[12][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[12][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[12][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[12][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Be Wild") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[13][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[13][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[13][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[13][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Mirai Puzzle") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[14][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[14][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[14][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[14][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Ugoku, Ugoku") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[15][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[15][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[15][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[15][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("The Awakening") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[16][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[16][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[16][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[16][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Chroma - I") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[17][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[17][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[17][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[17][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("cillia - FIRST") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[18][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[18][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[18][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[18][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Clannad ED") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[19][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[19][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[19][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[19][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("ClariS - Hitorigoto") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[20][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[20][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[20][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[20][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Miracle Colors") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[21][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[21][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[21][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[21][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Acid Wolfpack") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[22][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[22][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[22][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[22][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Crywolf - Epilogue") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[23][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[23][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[23][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[23][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Cupidz - Sheet (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[24][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[24][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[24][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[24][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Technologic") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[25][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[25][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[25][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[25][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("DANCE TILL YOU'RE DEAD") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[26][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[26][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[26][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[26][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Derpy - Nyan Nyan Dance") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[27][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[27][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[27][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[27][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Destination Calabria") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[28][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[28][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[28][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[28][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Die Antwoord - Alien") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[29][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[29][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[29][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[29][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Alquimia") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[30][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[30][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[30][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[30][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("DJ Myosuke - Black Territory") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[31][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[31][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[31][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[31][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Domestic na kanojo OP") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[32][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[32][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[32][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[32][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Drop - Granat") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[33][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[33][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[33][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[33][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Duca - Nekoichi [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[34][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[34][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[34][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[34][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("East of Eden") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[35][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[35][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[35][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[35][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Limited Dimension") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[36][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[36][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[36][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[36][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("EnV – Anubis") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[37][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[37][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[37][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[37][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Feint - Outbreak") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[38][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[38][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[38][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[38][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Futari No Kimochi (Flute)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[39][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[39][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[39][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[39][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("GARNiDELiA - Gokuraku Jodo [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[40][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[40][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[40][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[40][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Nurture (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[41][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[41][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[41][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[41][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("guardin - Solitary") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[42][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[42][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[42][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[42][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Halozy - Brilliant Colors") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[43][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[43][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[43][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[43][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Halozy - Three Magic") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[44][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[44][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[44][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[44][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Halsey ‒ Gasoline") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[45][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[45][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[45][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[45][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("HopeX - Into The Clouds (Nightcore)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[46][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[46][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[46][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[46][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Hydelic - Connected [Yours Forever] [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[47][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[47][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[47][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[47][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Imperio - \"Atlantis\"") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[48][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[48][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[48][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[48][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Indigo Child - Nostalgia") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[49][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[49][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[49][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[49][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("iNO - Suishoku Komachi Melancholia") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[50][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[50][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[50][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[50][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Ito Kanako - Fatima (Steins;Gate 0)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[51][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[51][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[51][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[51][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("JAKIN - Bipolar (feat. Generic)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[52][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[52][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[52][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[52][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Wowie Zowie!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[53][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[53][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[53][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[53][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("id=1611574921") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[54][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[54][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[54][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[54][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Kenny B - Parijs") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[55][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[55][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[55][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[55][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Kara Kara Kara") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[56][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[56][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[56][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[56][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Chikatto Chika Chika") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[57][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[57][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[57][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[57][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Laur -\"Sound Chimera\"") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[58][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[58][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[58][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[58][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Electric Daisy Violin") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[59][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[59][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[59][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[59][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Sweet Love") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[60][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[60][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[60][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[60][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Lobby") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[61][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[61][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[61][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[61][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Death Bringer") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[62][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[62][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[62][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[62][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Moonlight Sonata") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[63][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[63][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[63][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[63][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("M-O-T-U - Snowman") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[64][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[64][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[64][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[64][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("A Bella!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[65][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[65][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[65][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[65][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Mahoutsukai no Yome (Opening ST) - Here") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[66][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[66][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[66][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[66][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Mantis Lords") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[67][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[67][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[67][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[67][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("White Happy") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[68][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[68][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[68][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[68][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Marnik - Up") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[69][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[69][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[69][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[69][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Marshmello - FRIENDS") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[70][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[70][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[70][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[70][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("id=1772811738") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[71][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[71][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[71][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[71][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Minecraft Piano Theme") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[72][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[72][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[72][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[72][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Michi to Ren-chon") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[73][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[73][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[73][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[73][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Monetochka — It is a Pain") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[74][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[74][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[74][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[74][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Monetochka — Mom, I don't drop siegs") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[75][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[75][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[75][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[75][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("id=1574185982") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[76][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[76][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[76][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[76][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Namice – Perfection") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[77][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[77][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[77][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[77][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Nega/squared - Mellow") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[78][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[78][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[78][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[78][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Nekomata Master - Sleepless Days") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[79][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[79][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[79][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[79][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Never Say Die One Hunderd Mix [Intro]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[80][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[80][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[80][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[80][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("The Family - Hej Monica") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[81][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[81][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[81][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[81][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Nicolas Dominique - Yay! (PonyTime Rework)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[82][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[82][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[82][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[82][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Nienna - Oonagh (Nightcore)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[83][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[83][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[83][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[83][4] = (double) functions.getPoints(bufReader.readLine());

		    	
			} else if(line.contains("Night of Nights") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[84][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[84][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[84][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[84][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("NightHawk22 - Perfect Storm") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[85][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[85][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[85][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[85][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("No title - GRRP Remix") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[86][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[86][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[86][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[86][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Omoi - Teo") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[87][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[87][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[87][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[87][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Oskar Schuster - Singur") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[88][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[88][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[88][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[88][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Oskar Schuster - Wunder") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[89][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[89][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[89][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[89][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("OST The Rising of the Shield Hero") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[90][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[90][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[90][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[90][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Overlord Op 1") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[91][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[91][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[91][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[91][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("P4koo - Gothique Resonance") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[92][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[92][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[92][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[92][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Paganini - 24 Caprices Opus1 #5 in A Minor") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[93][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[93][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[93][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[93][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Madeon ‒ Shelter [Remix by happy30]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[94][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[94][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[94][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[94][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Prism Magical - DJ SHARPNEL hardrave remix") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[95][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[95][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[95][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[95][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Pskovskoe") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[96][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[96][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[96][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[96][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Qrispy Joybox - Yuuki no Pendant") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[97][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[97][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[97][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[97][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("R3 Music Box - Curtain Call!!!!!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[98][0] = (String)"R3 Music Box - Curtain Call!!!!!";
		    	allscores[98][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[98][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[98][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[98][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Rameses B – Infinity") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[99][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[99][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[99][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[99][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Rameses B – Visionary") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[100][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[100][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[100][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[100][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Ravel Nightstar - Flower Bless") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[101][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[101][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[101][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[101][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Reign[Radio Edit]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[102][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[102][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[102][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[102][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Royal Blood - Out of the Black") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[103][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[103][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[103][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[103][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("S3RL - Scary Movie") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[104][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[104][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[104][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[104][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Sakakibara Yui - Doki Doki kokoro Flavor") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[105][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[105][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[105][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[105][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Sakuraburst - Cherry Blossoms") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[106][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[106][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[106][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[106][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Sapphire - Never More (English Cover)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[107][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[107][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[107][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[107][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Seo9 - Explosion") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[108][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[108][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[108][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[108][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Seunghwan Lee - True Eternity") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[109][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[109][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[109][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[109][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Sky Of Scarlet Perception (Folk Remix)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[110][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[110][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[110][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[110][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Soulji - Murder (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[111][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[111][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[111][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[111][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Sporty-O - Let Me Hit It") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[112][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[112][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[112][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[112][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Star Driver - 5 Centimeters per second") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[113][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[113][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[113][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[113][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Subtact - Tunnel Vision [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[114][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[114][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[114][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[114][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Tabinotochuu") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[115][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[115][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[115][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[115][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Taska Black - We Would Never Do") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[116][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[116][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[116][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[116][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Tears for Fears ‒ Mad World [Cover by Adam Lambert]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[117][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[117][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[117][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[117][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("id=1752202545") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[118][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[118][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[118][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[118][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("The Piano") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[119][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[119][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[119][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[119][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("TheFatRat - MAYDAY") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[120][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[120][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[120][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[120][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Thriftworks - Moon Juice") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[121][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[121][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[121][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[121][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Tia - The Glory Days (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[122][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[122][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[122][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[122][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Tokyo Machine - Epic") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[123][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[123][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[123][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[123][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Tokyo Machine - ROCK IT") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[124][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[124][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[124][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[124][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Touhou - Lullaby of Deserted Hell (Vocal remix)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[125][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[125][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[125][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[125][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Touhou - Road of Apotropiac God ~ Dark Road") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[126][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[126][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[126][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[126][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Touhou - Shanghai Alice of Meiji 17 (orchestral)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[127][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[127][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[127][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[127][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Touhou - The Sealed Away Youkai ~ Lost Place") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[128][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[128][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[128][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[128][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Touhou ~ Beloved Tomboyish Girl (Waltz remix)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[129][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[129][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[129][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[129][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Touhou ~ Luna dial") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[130][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[130][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[130][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[130][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Tripzy Leary - Departure") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[131][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[131][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[131][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[131][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("id=1671843539") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[132][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[132][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[132][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[132][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Tristam and Braken - Frame of Mind") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[133][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[133][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[133][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[133][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("TUMENECO - こんなに月が绮丽な夜は(off vocal)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[134][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[134][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[134][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[134][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Owen Was Her") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[135][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[135][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[135][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[135][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Usa - Tsumi no Namae (cut)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[136][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[136][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[136][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[136][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("There's Supposed to Be a Cheat Code for Happiness") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[137][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[137][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[137][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[137][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Vena Cava - Ohana") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[138][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[138][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[138][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[138][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Take A Hint [Nightcore cover]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[139][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[139][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[139][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[139][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Waffle - Precious (Day 9)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[140][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[140][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[140][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[140][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Waterflame - Glorious Morning 2") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[141][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[141][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[141][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[141][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Skrillex - Killa") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[142][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[142][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[142][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[142][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("josh pan (sakuraburst Remix)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[143][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[143][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[143][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[143][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Yonder voice-Ember of spring") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[144][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[144][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[144][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[144][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Yooh - \"MariannE \"") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[145][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[145][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[145][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[145][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("YUC'e - intro-duck-tion!! [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[146][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[146][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[146][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[146][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Yuikonnu - Kakushigoto [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[147][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[147][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[147][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[147][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Ayaponzu ‒ Super Nuko World") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[148][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[148][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[148][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[148][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("miko - Soumatou Labyrinth") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[149][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[149][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[149][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[149][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("そでをぬらした") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[150][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[150][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[150][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[150][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("UNDEAD CORPORATION - Setsugetsu Ouka no Kuni") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[151][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[151][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[151][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[151][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Taio Cruz - Telling The World (Rio OST)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[152][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[152][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[152][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[152][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("This Game - No Game No Life") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[153][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[153][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[153][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[153][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("The Super Ball - RIN! RIN HI! HI!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[154][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[154][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[154][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[154][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("DJ TOTTO - Precious * Star [feat. Enako]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[155][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[155][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[155][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[155][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("One Shot, One Kill - Varien") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[156][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[156][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[156][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[156][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Roomie - Brofist (feat. PewDiePie)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[157][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[157][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[157][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[157][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("SAO Alternative: GGO Ryusei - Eir Aoi") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[158][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[158][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[158][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[158][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Chochocho! Yuru Yuri*Capriccio!!!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[159][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[159][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[159][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[159][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Max Brhon - Cyberpunk") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[160][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[160][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[160][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[160][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Pastel*Palettes - DISCOTHEQUE") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[161][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[161][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[161][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[161][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Hashimoto Yukari - Lost My Pieces (Toradora!)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[162][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[162][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[162][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[162][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("LiSA - Oath Sign") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[163][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[163][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[163][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[163][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("ДЕТИ RAVE (DETI RAVE) - КАК В ПОСЛЕДНИЙ РАЗ (AS THE LAST TIME)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[164][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[164][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[164][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[164][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Loki / Thaehan - Ohayou !") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[165][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[165][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[165][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[165][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Seiryu - Blue Dragon") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[166][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[166][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[166][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[166][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Jin ft.Lia - days (TV size)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[167][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[167][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[167][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[167][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("A.O.E. - Crystal Clocks and Music Box") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[168][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[168][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[168][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[168][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("F777 - The Seven Seas") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[169][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[169][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[169][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[169][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Witch's Slave - Trappola Bewitching") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[170][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[170][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[170][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[170][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Billie Eilish - bad guy [bad]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[171][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[171][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[171][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[171][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Asami Imai - Asayake no Starmine (TV Size)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[172][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[172][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[172][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[172][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Daft Punk - Rinzler (TRON)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[173][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[173][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[173][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[173][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Diamond Eyes - Hold On") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[174][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[174][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[174][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[174][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Teminite - Immortal Flame (ft. Anna Yvette)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[175][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[175][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[175][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[175][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("HyuN - Illusion of Inflict") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[176][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[176][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[176][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[176][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Menu (Full)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[177][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[177][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[177][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[177][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Survive Said The Prophet - Mukanjyo (Vinland Saga)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[178][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[178][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[178][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[178][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("fripSide - Black Bullet") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[179][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[179][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[179][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[179][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("KAYZO x RIOT - Wake Up") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[180][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[180][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[180][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[180][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("ONE OK ROCK - Liar") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[181][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[181][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[181][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[181][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("FELT - In my room") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[182][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[182][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[182][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[182][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("GAMERS! - Kanemoto Hisako") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[183][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[183][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[183][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[183][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Jens.O - \"Somebody\" (nightcore mix)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[184][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[184][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[184][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[184][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Stonebank - Ripped To Pieces [Cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[185][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[185][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[185][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[185][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("P*Light - Gekkou Ranbu") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[186][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[186][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[186][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[186][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Hajimari Road - Love Live!") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[187][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[187][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[187][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[187][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Pascal Michael Stiefel - Peace and Tranquility") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[188][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[188][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[188][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[188][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Sayuri x MY FIRST STORY - Reimei (TV Size)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[189][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[189][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[189][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[189][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("YURiKA - Kyoumen no Nami (TV size)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[190][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[190][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[190][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[190][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("SYN - Danger") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[191][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[191][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[191][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[191][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Beginning") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[192][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[192][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[192][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[192][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Miyuri - I'm Still Waiting For You (feat. 60s Radio)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[193][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[193][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[193][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[193][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Aya Hirano - Bouken Desho Desho (TV size)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[194][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[194][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[194][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[194][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Aya Hirano - Hare Hare Yukai (TV size)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[195][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[195][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[195][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[195][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Camellia - Shun no Seafood o Ikashita Curry Fuumi Paella ~808 Chef no Twerk to Trap Jitate~") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[196][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[196][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[196][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[196][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Creo - Unveil") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[197][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[197][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[197][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[197][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Megurine Luka - Lie") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[198][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[198][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[198][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[198][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Ayano Mashiro - ideal white (TV size)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[199][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[199][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[199][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[199][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("KANA-BOON - Silhouette") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[200][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[200][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[200][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[200][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Frederic - Kanashii Ureshii") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[201][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[201][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[201][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[201][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Kotori ft. Stessie - Blooms [cut]") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[202][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[202][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[202][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[202][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Hatsune Miku - Rubik's Cube") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[203][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[203][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[203][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[203][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Empty Town") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[204][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[204][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[204][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[204][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("earthmind - Another Heaven (game ver.)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[205][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[205][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[205][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[205][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Haruka Tomatsu - Resolution (TV Size)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[206][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[206][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[206][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[206][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("MC MENTAL @ HIS BEST") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[207][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[207][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[207][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[207][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("OISHII - ONIGIRI FREEWAY") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[208][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[208][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[208][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[208][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("【﻿ｎｅｖｅｒ　ｇｉｖｅ　ｕｐ】") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[209][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[209][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[209][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[209][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("Luis Fonsi, Omoi and R3 Music Box - Teopacito ft. Will Stetson") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[210][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[210][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[210][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[210][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("ASCA - Resister (TV size)") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[211][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[211][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[211][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[211][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("SHK - Halloween Party") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
		    	allscores[212][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[212][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[212][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[212][4] = (double) functions.getPoints(bufReader.readLine());
		    	
			} else if(line.contains("id=1896581440") && !line.contains("Random") && !line.contains("Hidden") && !line.contains("Endless")) {
				allscores[213][1] = (int) functions.getScore(bufReader.readLine());
		    	allscores[213][2] = (double) functions.getAcc(bufReader.readLine());
		    	allscores[213][3] = (int) functions.getMiss(bufReader.readLine());
		    	allscores[213][4] = (double) functions.getPoints(bufReader.readLine());
		    	
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
