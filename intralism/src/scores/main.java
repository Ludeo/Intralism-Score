package scores;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class main {
	
	private static JFrame frame;
	
	public static void openWindow(String link) throws IOException {
		
		frame = new JFrame("Scores");
		frame.setSize(100,600);
		frame.setLocationRelativeTo(null);
		Container content = frame.getContentPane();
		
		JTable table = new JTable(new table_Model(link));
		JScrollPane scroll = new JScrollPane(table);
		content.add(scroll, BorderLayout.CENTER);
		frame.setVisible(true);
		
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
		table.setRowSorter(sorter);
		
		frame.pack();
	}
	
	public static JFrame getJFrame() {
		return frame;
	}

}
