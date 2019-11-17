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
	
	public static void openWindow(String link) throws IOException {
		
		JFrame frame = new JFrame("Scores");
		frame.setBounds(770,300,100,600);
		Container content = frame.getContentPane();
		
		JTable table = new JTable(new table_Model(link));
		JScrollPane scroll = new JScrollPane(table);
		content.add(scroll, BorderLayout.CENTER);
		frame.setVisible(true);
		
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
		table.setRowSorter(sorter);
		
		frame.pack();
	}

}
