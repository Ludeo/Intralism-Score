package scores;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileWriter;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Functions {

    private static CSVReader reader = new CSVReader();
    private static final String PLAYERSCSV = "savedplayers.csv";
    private static final String CONFIGCSV = "config.csv";
    private static final String DARKMODETRUE = "Darkmode: true";
    private static final String DARKMODE = "DarkMode";

    private Functions() {
	throw new IllegalStateException("Utility class");
    }

    public static String[] getMapDetail(String score, String acc, String miss, String points) {
	String[] inputvalues = { score, acc, miss, points };
	String[] outputvalues = new String[4];

	for (int i = 0; i < inputvalues.length; i++) {

	    String value = inputvalues[i];
	    int anumber = value.indexOf(">");
	    int bnumber = value.indexOf("<", anumber);
	    value = value.substring(anumber + 1, bnumber);

	    if (i != 1) {
		outputvalues[i] = value.replaceAll("\\s+", "");
	    } else {
		value = value.replaceAll("\\n+", "");
		outputvalues[i] = value.replace("%", "");
	    }
	}

	return outputvalues;
    }

    public static double[] recalc(Object[][] allscores) {
	double totalacc = 0;
	double totaldifference = 0;
	double realpoints = 0;
	double rankedpoints = 0;
	double maximumpoints = 0;
	int totalmiss = 0;
	int hundredcount = 0;
	int mapcount = allscores.length;
	int notplayed = 0;

	for (int i = 0; i < allscores.length; i++) {
	    if (allscores[i][0] == null) {
		continue;
	    }

	    double points = (double) allscores[i][4];
	    double maxpoints = (double) allscores[i][5];
	    double actpoints = points;
	    realpoints += points;
	    maximumpoints += maxpoints;

	    if (allscores[i][7].toString().contentEquals("Broken")) {

		if (points == maxpoints) {
		    actpoints = points - 0.01;
		    allscores[i][4] = actpoints;
		}

		rankedpoints += actpoints;
	    } else {
		rankedpoints += points;
	    }

	    totalacc += (double) allscores[i][2];
	    totalmiss += (int) allscores[i][3];

	    double a = (double) allscores[i][5];
	    double b = (double) allscores[i][4];
	    allscores[i][6] = a - b;
	    totaldifference += (double) allscores[i][6];

	    if ((double) allscores[i][2] == 100.00) {
		hundredcount++;
	    }

	    if ((int) allscores[i][1] == 0) {
		notplayed++;
	    }

	}

	double avgaccexact = totalacc / (mapcount - notplayed);
	double avgacc = (double) Math.round(avgaccexact * 10000) / 10000;

	double avgmiss = (double) totalmiss / mapcount;
	avgmiss = (double) Math.round(avgmiss * 100) / 100;

	totaldifference = (double) Math.round(totaldifference * 100) / 100;

	realpoints = (double) Math.round(realpoints * 100) / 100;
	rankedpoints = (double) Math.round(rankedpoints * 100) / 100;
	maximumpoints = (double) Math.round(maximumpoints * 100) / 100;

	return new double[] { avgmiss, avgacc, rankedpoints, realpoints, maximumpoints, totaldifference, hundredcount };

    }

    public static double getRankUpPoints(String link, String globalrank, double points) throws IOException {
	String playerid = link.split("=")[1];
	int globalrankInt = Integer.parseInt(globalrank);
	int n = (globalrankInt - 1) / 100 + 1;

	if (globalrankInt % 100 == 1) {
	    n -= 1;
	}
	Document doc = Jsoup.connect("https://intralism.khb-soft.ru/?page=ranks&n=" + n).get();
	Elements tr = doc.select("tr");
	Element before = tr.get(0);
	Element current = tr.get(0);

	if (globalrankInt % 100 == 1) {
	    before = tr.get(tr.size() - 1);
	} else {
	    for (Element e : tr) {

		if (e.id().contains(playerid)) {
		    current = e;
		    break;
		}

		before = e;
	    }
	}

	double currentPoints = 0;
	if (globalrankInt % 100 == 1) {
	    before = tr.get(tr.size() - 1);
	    currentPoints = points;
	} else {
	    currentPoints = Double.parseDouble(current.select("td").get(3).text().replace(" ", ""));
	}

	double beforePoints = Double.parseDouble(before.select("td").get(3).text().replace(" ", ""));

	return Math.round((beforePoints - currentPoints) * 10000.0) / 10000.0;
    }

    public static BufferedImage resize(BufferedImage img, int height, int width) {
	Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	Graphics2D g2d = resized.createGraphics();
	g2d.drawImage(tmp, 0, 0, null);
	g2d.dispose();
	return resized;
    }

    public static void saveLastChecked(String link) {
	String[][] config = reader.getCSVContent(CONFIGCSV);
	config[0][1] = link;

	try (FileWriter csvWriter = new FileWriter(CONFIGCSV)) {
	    for (int i = 0; i < config.length; i++) {
		if (i == 0)
		    csvWriter.append(config[i][0] + "," + config[i][1]);
		else
		    csvWriter.append("\n" + config[i][0] + "," + config[i][1]);
	    }
	    csvWriter.flush();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void openPlayerList() {
	JList<Player> list = new JList<>();
	DefaultListModel<Player> model = new DefaultListModel<>();

	String[][] players = reader.getCSVContent(PLAYERSCSV);

	for (int i = 0; i < players.length; i++) {
	    model.addElement(new Player(players[i][0], players[i][1]));
	}

	list.setModel(model);

	JFrame frame = new JFrame("Player List");
	frame.setSize(200, 590);
	frame.setVisible(true);
	frame.setResizable(false);

	JPanel panel = new JPanel();
	panel.setSize(200, 590);
	panel.setLayout(null);
	frame.add(panel);

	JScrollPane playerScrollPane = new JScrollPane(list);
	playerScrollPane.setBounds(10, 10, 165, 470);
	panel.add(playerScrollPane);

	JButton check = new JButton("Check");
	check.setBounds(10, 490, 165, 20);
	check.addActionListener(e -> {
	    try {
		Main.openWindow(model.get(list.getSelectedIndex()).getId());
		frame.dispose();
		openPlayerList();
	    } catch (SocketTimeoutException e1) {
		JOptionPane.showMessageDialog(InputFrame.getJPanel(), "Couldn't build up a connection. Try again",
			"Warning", JOptionPane.WARNING_MESSAGE);
	    } catch (IOException e1) {
		e1.printStackTrace();
	    }
	});
	panel.add(check);

	JButton addbtn = new JButton("add");
	addbtn.setBounds(10, 520, 80, 20);
	addbtn.addActionListener(e -> openAddFrame(frame));
	panel.add(addbtn);

	JButton delbtn = new JButton("remove");
	delbtn.setBounds(95, 520, 80, 20);
	delbtn.addActionListener(e -> {
	    String name = model.get(list.getSelectedIndex()).getName();
	    String link = model.get(list.getSelectedIndex()).getId();

	    String[][] players2 = reader.getCSVContent(PLAYERSCSV);

	    removePlayer(players2, name, link, frame);
	});
	panel.add(delbtn);

	Map<String, String> config = getConfigMap();
	boolean darkmode = Boolean.parseBoolean(config.get(DARKMODE));
	if (darkmode) {
	    panel.setBackground(Color.DARK_GRAY);
	    check.setBackground(Color.GRAY);
	    check.setForeground(Color.WHITE);
	    addbtn.setBackground(Color.GRAY);
	    addbtn.setForeground(Color.WHITE);
	    delbtn.setBackground(Color.GRAY);
	    delbtn.setForeground(Color.WHITE);
	    list.setBackground(Color.GRAY);
	    list.setForeground(Color.WHITE);
	}
    }

    public static void removePlayer(String[][] players, String name, String link, JFrame frame1) {

	Map<String, String> playerMap = new HashMap<>();

	for (int i = 0; i < players.length; i++) {
	    playerMap.put(players[i][0], players[i][1]);
	}

	playerMap.remove(name, link);

	try (FileWriter csvWriter = new FileWriter(PLAYERSCSV)) {
	    int i = 0;

	    for (Map.Entry<String, String> map : playerMap.entrySet()) {

		if (i == 0) {
		    csvWriter.append(map.getKey() + "," + map.getValue());
		} else {
		    csvWriter.append("\n" + map.getKey() + "," + map.getValue());
		}

		i++;
	    }

	    csvWriter.flush();
	    frame1.dispose();
	    openPlayerList();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

    public static void openAddFrame(JFrame frame1) {
	JFrame addframe = new JFrame("Add player");
	addframe.setSize(245, 110);
	addframe.setLocationRelativeTo(frame1);
	addframe.setVisible(true);
	addframe.setResizable(false);

	JPanel panel = new JPanel();
	panel.setSize(245, 110);
	panel.setLayout(null);
	addframe.add(panel);

	JTextField nametf = new JTextField("Name");
	nametf.setBounds(10, 10, 100, 20);
	nametf.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		nametf.setText("");
	    }
	});
	panel.add(nametf);

	JTextField linktf = new JTextField("Link");
	linktf.setBounds(120, 10, 100, 20);
	linktf.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		linktf.setText("");
	    }
	});
	panel.add(linktf);

	JButton addbtn = new JButton("Add");
	addbtn.setBounds(10, 40, 100, 20);
	addbtn.addActionListener(e -> {
	    String name = nametf.getText();
	    String link = linktf.getText();

	    String[][] players = reader.getCSVContent(PLAYERSCSV);

	    try (FileWriter csvWriter = new FileWriter(PLAYERSCSV)) {

		if (players[0][0] == null) {
		    csvWriter.append(name + "," + link);
		} else {
		    for (int i = 0; i < players.length; i++) {
			if (i == 0) {
			    csvWriter.append(players[i][0] + "," + players[i][1]);
			} else {
			    csvWriter.append("\n" + players[i][0] + "," + players[i][1]);
			}

		    }
		    csvWriter.append("\n" + name + "," + link);
		}

		csvWriter.flush();
		addframe.dispose();
		frame1.dispose();
		openPlayerList();

	    } catch (IOException e2) {
		e2.printStackTrace();

	    }
	});
	panel.add(addbtn);

	Map<String, String> config = getConfigMap();
	boolean darkmode = Boolean.parseBoolean(config.get(DARKMODE));
	if (darkmode) {
	    panel.setBackground(Color.DARK_GRAY);
	    nametf.setBackground(Color.GRAY);
	    nametf.setForeground(Color.WHITE);
	    linktf.setBackground(Color.GRAY);
	    linktf.setForeground(Color.WHITE);
	    addbtn.setBackground(Color.GRAY);
	    addbtn.setForeground(Color.WHITE);

	}
    }

    public static Object[][] fillAllscores(String[][] mapdata) {
	Object[][] allscores = new Object[mapdata.length][8];
	for (int i = 0; i < allscores.length; i++) {
	    mapdata[i][0] = mapdata[i][0].replace("COMMA", ",");
	    mapdata[i][0] = mapdata[i][0].replace("QUOTE", "\"");
	    allscores[i][0] = mapdata[i][0];
	    allscores[i][1] = 0;
	    allscores[i][2] = 0.0;
	    allscores[i][3] = 0;
	    allscores[i][4] = 0.0;
	    allscores[i][5] = Double.parseDouble(mapdata[i][1]);
	    allscores[i][6] = 0.0;
	    allscores[i][7] = mapdata[i][2];
	}
	return allscores;
    }

    public static int findIForAllscores(String line, String[][] mapdata) {
	for (int i = 0; i < mapdata.length; i++) {
	    if (line.contains("id=" + mapdata[i][3])) {
		return i;
	    }
	}

	return Integer.MAX_VALUE;

    }

    public static Map<String, String> getConfigMap() {
	String[][] config = reader.getCSVContent(CONFIGCSV);
	HashMap<String, String> configMap = new HashMap<>();

	for (int i = 0; i < config.length; i++) {
	    configMap.put(config[i][0], config[i][1]);
	}
	return configMap;
    }

    public static void changeDarkmodeProfileFrame(Component[] comps) {
	for (Component comp : comps) {
	    comp.setForeground(Color.WHITE);
	}
    }

    public static void openSettingFrame(JFrame menu) {
	Map<String, String> config = getConfigMap();
	String darkmodetxt = config.get(DARKMODE);

	JFrame frame = new JFrame();
	frame.setSize(170, 150);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setLocationRelativeTo(menu);

	JPanel panel = new JPanel();
	frame.add(panel);

	JButton credit = new JButton("Credits");
	credit.addActionListener(e -> {
	    JFrame creditframe = new JFrame("Credits");
	    creditframe.setBounds(100, 100, 610, 170);
	    creditframe.setResizable(false);
	    creditframe.setVisible(true);

	    JPanel panelcredit = new JPanel();
	    panelcredit.setSize(610, 170);
	    creditframe.add(panelcredit);

	    String[] texts = { "This program was created by Ludeo.",
		    "Special Thanks to FlyingRabidUnicornPig(FlyingRabidUnicornPig™#5435) for helping me out",
		    "with the Code and Special Thanks to Kiri(Kiri#0001) for checking all the maps if they are broken"
			    + " or not.",
		    "I will try to keep this program up to date. If you have any questions, feel free to write me a "
			    + "message",
		    "on Discord (Ludeo#8554)." };

	    boolean darkmode = Boolean.parseBoolean(config.get(DARKMODE));

	    for (int i = 0; i < 5; i++) {
		JLabel text = new JLabel(texts[i]);
		text.setBounds(10, 10 + i * 15, 580, 15);
		panelcredit.add(text);

		if (darkmode) {
		    text.setForeground(Color.WHITE);
		}
	    }

	    JLabel trash = new JLabel("\n\n");
	    trash.setBounds(500, 70, 0, 0);
	    panelcredit.add(trash);

	    if (darkmode) {
		panelcredit.setBackground(Color.DARK_GRAY);
	    }
	});
	panel.add(credit);

	JButton darkmodebtn = new JButton("Darkmode: " + darkmodetxt);
	darkmodebtn.addActionListener(e -> {
	    if (darkmodebtn.getText().contentEquals(DARKMODETRUE)) {
		darkmodebtn.setText("Darkmode: false");
	    } else {
		darkmodebtn.setText(DARKMODETRUE);
	    }
	});
	panel.add(darkmodebtn);

	JButton savebtn = new JButton("Save");
	savebtn.addActionListener(e -> saveConfig(menu, frame, darkmodebtn));
	panel.add(savebtn);

	boolean darkmode = Boolean.parseBoolean(config.get(DARKMODE));

	if (darkmode) {
	    panel.setBackground(Color.DARK_GRAY);
	    credit.setBackground(Color.GRAY);
	    credit.setForeground(Color.WHITE);
	    darkmodebtn.setBackground(Color.GRAY);
	    darkmodebtn.setForeground(Color.WHITE);
	    savebtn.setBackground(Color.GRAY);
	    savebtn.setForeground(Color.WHITE);
	}
    }

    public static void saveConfig(JFrame menu, JFrame frame, JButton darkmodebtn) {
	String[][] config = reader.getCSVContent(CONFIGCSV);

	if (darkmodebtn.getText().contains("true")) {
	    config[1][1] = "true";
	} else {
	    config[1][1] = "false";
	}

	try (FileWriter csvWriter = new FileWriter(CONFIGCSV)) {
	    for (int i = 0; i < config.length; i++) {
		if (i == 0) {
		    csvWriter.append(config[i][0] + "," + config[i][1]);
		} else {
		    csvWriter.append("\n" + config[i][0] + "," + config[i][1]);
		}
	    }
	    csvWriter.flush();
	    frame.dispose();
	    menu.dispose();
	    InputFrame.main(null);

	} catch (IOException e2) {
	    e2.printStackTrace();
	}
    }

}
