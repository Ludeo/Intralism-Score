package scores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class inputFrame {
	
	public static void main(String[]args) throws IOException {
		
		//String[][] test = allscores.getAllScores("https://intralism.khb-soft.ru/?player=76561198143629166");
		String link = "";
		
		JPanel panel = new JPanel();
		panel.setSize(600, 400);
		
		JFrame menu = new JFrame("");
		menu.setVisible(true);
		menu.add(panel);
		menu.setLocation(800, 400);
		menu.setSize(600,400);
		
		JTextField input = new JTextField("");
		input.setText("Place your profile link here");
		input.setSize(100,20);
		panel.add(input);
		
		
		JButton enter = new JButton("Check");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					main.openWindow(input.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		enter.setBounds(10, 10, 60, 20);
		enter.setVisible(true);
		panel.add(enter);
		
		
		
		menu.pack();
		
	}

}
