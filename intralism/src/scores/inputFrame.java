package scores;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class InputFrame {
    private static JPanel panel;

    public static void main(String[] args) {
	CSVReader reader = new CSVReader();

	panel = new JPanel();

	JFrame menu = new JFrame("Intralism Score Checker");
	menu.setVisible(true);
	menu.add(panel);
	menu.setLocation(800, 200);
	menu.setResizable(false);
	menu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	JTextField input = new JTextField("Place your profile link here");
	input.addMouseListener(new MouseAdapter() {
	    @Override
	    public void mouseClicked(MouseEvent e) {
		input.setText("");
	    }
	});
	panel.add(input);

	JButton enter = new JButton("Check");
	enter.addActionListener(e -> {
	    try {
		Main.openWindow(input.getText());
	    } catch (SocketTimeoutException e1) {
		JOptionPane.showMessageDialog(InputFrame.getJPanel(), "Couldn't build up a connection. Try again",
			"Warning", JOptionPane.WARNING_MESSAGE);
	    } catch (IOException e1) {
		e1.printStackTrace();
	    }
	});
	panel.add(enter);

	JButton checkLast = new JButton("Last Checked");
	checkLast.addActionListener(e -> {

	    String[][] lastChecked = reader.getCSVContent("config.csv");

	    try {
		Main.openWindow(lastChecked[0][1]);
	    } catch (SocketTimeoutException e1) {
		JOptionPane.showMessageDialog(InputFrame.getJPanel(), "Couldn't build up a connection. Try again",
			"Warning", JOptionPane.WARNING_MESSAGE);
	    } catch (IOException e1) {
		e1.printStackTrace();
	    }

	});
	panel.add(checkLast);

	JButton playerlist = new JButton("Player List");
	playerlist.addActionListener(e -> Functions.openPlayerList());
	panel.add(playerlist);

	JButton settings = new JButton("Settings");
	settings.addActionListener(e -> Functions.openSettingFrame(menu));
	panel.add(settings);

	Map<String, String> configMap = Functions.getConfigMap();
	boolean darkmode = Boolean.parseBoolean(configMap.get("DarkMode"));

	if (darkmode) {
	    panel.setBackground(Color.DARK_GRAY);
	    input.setBackground(Color.DARK_GRAY);
	    input.setForeground(Color.WHITE);
	    enter.setBackground(Color.GRAY);
	    enter.setForeground(Color.white);
	    settings.setBackground(Color.GRAY);
	    settings.setForeground(Color.white);
	    checkLast.setBackground(Color.GRAY);
	    checkLast.setForeground(Color.white);
	    playerlist.setBackground(Color.GRAY);
	    playerlist.setForeground(Color.white);
	}

	menu.pack();
    }

    public static JPanel getJPanel() {
	return panel;
    }

}
