package scores;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

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
		int totalmiss = 0, hundredcount = 0, mapcount = allscores.length, notplayed = 0;
		
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
				
				if((double)allscores[i][2] == (double) 100.00) hundredcount++;
				
				if((int) allscores[i][1] == 0) notplayed++;
				
			}
		}
		
		double avgaccexact = totalacc / (mapcount-notplayed);
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
	
	public static void saveLastChecked(String link) {
		csvReader reader = new csvReader();
		String[][] players = reader.getCSVContent("savedplayers.csv");
		players[0][1] = link;
		
		try {
			FileWriter csvWriter = new FileWriter("savedplayers.csv");
			for(int i=0; i<players.length; i++) {
				if(i == 0) csvWriter.append(players[i][0] + "," + players[i][1]);
				else csvWriter.append("\n" + players[i][0] + "," + players[i][1]);
			}
			csvWriter.flush();
			csvWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void openPlayerList() {
		JList<Player> list = new JList<>();
		DefaultListModel<Player> model = new DefaultListModel<>();
		
		csvReader reader = new csvReader();
		String[][] players = reader.getCSVContent("savedplayers.csv");
		
		for(int i = 1; i < players.length; i++) {
			model.addElement(new Player(players[i][0], players[i][1]));
		}
		
		list.setModel(model);
		
		JFrame frame1 = new JFrame();
		frame1.setSize(200,590);
		frame1.setVisible(true);
		frame1.setResizable(false);
		frame1.setLayout(null);
		
		JScrollPane playerScrollPane = new JScrollPane(list);
		playerScrollPane.setBounds(10,10,165,470);
		frame1.add(playerScrollPane);
		
		JButton check = new JButton("Check");
		check.setBounds(10,490,165,20);
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					main.openWindow(model.get(list.getSelectedIndex()).getId());
					frame1.dispose();
					openPlayerList();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
				
			}
		});
		frame1.add(check);
		
		JButton addbtn = new JButton("add");
		addbtn.setBounds(10,520,80,20);
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				JFrame addframe = new JFrame("Add player");
				addframe.setSize(245,110);
				addframe.setLocationRelativeTo(frame1);
				addframe.setVisible(true);
				addframe.setResizable(false);
				addframe.setLayout(null);
				
				JTextField nametf = new JTextField("Name");
				nametf.setBounds(10,10,100,20);
				nametf.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e3) {
						nametf.setText("");
					}
				});
				addframe.add(nametf);
				
				JTextField linktf = new JTextField("Link");
				linktf.setBounds(120,10,100,20);
				linktf.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e3) {
						linktf.setText("");
					}
				});
				addframe.add(linktf);
				
				JButton addbtn = new JButton("Add");
				addbtn.setBounds(10,40,100,20);
				addbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e3) {
						String name = nametf.getText();
						String link = linktf.getText();
						
						csvReader reader = new csvReader();
						String[][] players = reader.getCSVContent("savedplayers.csv");
						System.out.println(players.length);
						
						try {
							FileWriter csvWriter = new FileWriter("savedplayers.csv");
							for(int i=0; i<players.length; i++) {
								
								if(i == 0) {
									if(!players[i][0].contentEquals("LastChecked")) csvWriter.append("LastChecked,https://intralism.khb-soft.ru/?player=76561198143629166\n");
									csvWriter.append(players[i][0] + "," + players[i][1]);
								}
								else csvWriter.append("\n" + players[i][0] + "," + players[i][1]);
							}
							csvWriter.append("\n" + name + "," + link);
							csvWriter.flush();
							csvWriter.close();
							addframe.dispose();
							frame1.dispose();
							openPlayerList();
						} catch (IOException e) {
							e.printStackTrace();
						} catch(NullPointerException e) {
							try {
								FileWriter csvWriter2 = new FileWriter("savedplayers.csv");
								csvWriter2.append("LastChecked,https://intralism.khb-soft.ru/?player=76561198143629166");
								csvWriter2.append("\n" + name + "," + link);
								csvWriter2.flush();
								csvWriter2.close();
								addframe.dispose();
								frame1.dispose();
								openPlayerList();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					}
				});
				addframe.add(addbtn);
				
			}
		});
		frame1.add(addbtn);
		
		JButton delbtn = new JButton("remove");
		delbtn.setBounds(95,520,80,20);
		delbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				String name = model.get(list.getSelectedIndex()).getName();
				String link = model.get(list.getSelectedIndex()).getId();
				
				csvReader reader = new csvReader();
				String[][] players = reader.getCSVContent("savedplayers.csv");
				
				try {
					FileWriter csvWriter = new FileWriter("savedplayers.csv");
					for(int i=0; i<players.length; i++) {
						if(!(players[i][0].contentEquals(name) && players[i][1].contentEquals(link))) {
							if(i == 0) csvWriter.append(players[i][0] + "," + players[i][1]);
							else csvWriter.append("\n" + players[i][0] + "," + players[i][1]);
						}
						
					}
					csvWriter.flush();
					csvWriter.close();
					frame1.dispose();
					openPlayerList();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		frame1.add(delbtn);
	}

}
