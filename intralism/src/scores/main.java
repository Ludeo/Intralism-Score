package scores;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class main {
	
	public static void openWindow(String link) throws IOException {
		String[][] rows = allscores.getAllScores(link);
		String[] columns = {"Map Name", "Score", "Acc", "Miss", "MyPoints", "MaxPoints", "Broken?"};
		
		JFrame frame = new JFrame("My Scores");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container content = frame.getContentPane();
		
		JTable table = new JTable(rows, columns);
		JScrollPane scroll = new JScrollPane(table);
		content.add(scroll, BorderLayout.CENTER);
		frame.setSize(1400, 1000);
		frame.setVisible(true);
		
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
		table.setRowSorter(sorter);

		List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
		sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
		sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
		sorter.setSortKeys(sortKeys);
	}

}
