package scores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class inputFrame {
	
	public static void main(String[]args) throws IOException {
		JPanel panel = new JPanel();
		
		JFrame menu = new JFrame("Intralism Score Checker");
		menu.setVisible(true);
		menu.add(panel);
		menu.setLocation(800, 200);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField input = new JTextField("Place your profile link here");
		input.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				input.setText("");
			}
		});
		panel.add(input);
		
		JButton enter = new JButton("Check");
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					main.openWindow(input.getText());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(enter);
		
		JButton credit = new JButton("Credits");
		credit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Credits");
				frame.setBounds(100,100,610,130);
				frame.setResizable(false);
				frame.setVisible(true);
				
				String[] texts = {"This program was created by Ludeo.", "Special Thanks to FlyingRabidUnicornPig(FlyingRabidUnicornPig™#5435) for helping me out", 
						"with the Code and Special Thanks to Kiri(Kiri#0001) for checking all the maps if they are broken or not.", 
						"I will try to keep this program up to date. If you have any questions, feel free to write me a message", "on Discord (Ludeo#8554)."};
				
				for(int i = 0; i < 5; i++) {
					JLabel text = new JLabel(texts[i]);
					text.setBounds(10,10+i*15,580,15);
					frame.add(text);
				}
				
				JLabel trash = new JLabel("");
				trash.setBounds(500,70,0,0);
				frame.add(trash);
			}
		});
		panel.add(credit);

		menu.pack();
	}

}
