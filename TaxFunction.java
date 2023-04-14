package lib;

public class TaxFunction extends Tax {

	private static int beforeTax;
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;
		tax = (int) Math.round(0.05 * (monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - beforeTax;

		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (isMarried = false && numberOfChildren >= 0) {
			beforeTax = 54000000;
		} else if (isMarried = yes) {
			beforeTax = 54000000 + 4500000;
		} else if (numberOfChildren >= 3) {
			beforeTax = 54000000 + 4500000;
		}

	}
	
}
