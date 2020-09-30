package scores;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class CSVReader {

    public CSVReader() {
	// just creating an object for the reader
    }

    public String[][] getCSVContent(String path) {

	try (LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(path));
		BufferedReader br = new BufferedReader(
			new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8))) {

	    lineNumberReader.skip(Long.MAX_VALUE);
	    int lines = lineNumberReader.getLineNumber();

	    String[][] result = new String[lines + 1][4];

	    int count = 0;
	    String line = "";

	    while ((line = br.readLine()) != null) {

		String[] entry = line.split(",");
		result[count] = entry;

		count++;

	    }

	    return result;

	} catch (Exception e) {
	    JOptionPane.showMessageDialog(InputFrame.getJPanel(), "CSV-File missing or is empty", "Warning",
		    JOptionPane.WARNING_MESSAGE);
	}

	return new String[0][0];

    }

}
