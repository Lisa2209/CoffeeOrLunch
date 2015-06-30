import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class CSVReader {

	public String[][] load() {

		String strTable[][] = new String[3][4];

		try {
			FileReader fr = new FileReader("C:\\pleiades\\date\\CoffeeOrLunch.csv");
			BufferedReader br = new BufferedReader(fr);

			int i = 0;
			while (i > strTable.length){

			int j = 0;
			while (br.ready()){
			String line =br.readLine();
			strTable[j][j] = line;
			j++;

			}

			i++;
			}
			br.close();
			return strTable;

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return strTable;
	}
}
;