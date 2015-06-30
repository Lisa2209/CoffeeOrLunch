

//		regression.addDate();
//		regression.addDate(3.0,3.0);
//		regression.addDate(4.0,3.5);
//		double intercept = regression.getIntercept();
//		double slope = regression.getSlope();


import org.apache.commons.math3.stat.regression.SimpleRegression;


public class CoffeeOrLunch {

	public static void main(String[] args) {

		CSVReader csv = new CSVReader();
		String cofLunData[][] =csv.load();

		SimpleRegression regression = new SimpleRegression();
		String cof = null;
		String lun = null;
		String code = null;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++)

				if (j == 0) {
					cof = cofLunData[i][j];
				}
				else if (j == 1){
					lun = cofLunData[i][j];
				}
				else if (j == 3){
					code = cofLunData[i][j];
				}

			Double dbcof = Double.parseDouble(cof);
			Double dblun = Double.parseDouble(lun);
			Double dbcode = Double.parseDouble(code);

			regression.addData(dbcof,dblun);
			regression.addData(dblun,dbcode);

		}
	}
}
