package scores;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.io.IOException;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Main {

    private Main() {
	throw new IllegalStateException("Utility class");
    }

    private static JFrame frame;

    public static void openWindow(String link) throws IOException {
	Map<String, String> configMap = Functions.getConfigMap();

	frame = new JFrame("Scores");
	frame.setSize(100, 600);
	frame.setLocationRelativeTo(null);
	Container content = frame.getContentPane();

	JTable table = new JTable(new MyTableModel(link));
	JScrollPane scroll = new JScrollPane(table);
	content.add(scroll, BorderLayout.CENTER);
	frame.setVisible(true);

	TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
	table.setRowSorter(sorter);

	boolean darkmode = Boolean.parseBoolean(configMap.get("DarkMode"));
	if (darkmode) {
	    table.setBackground(Color.DARK_GRAY);
	    table.setForeground(Color.WHITE);
	}

	frame.pack();
    }

    public static JFrame getJFrame() {
	return frame;
    }

}
