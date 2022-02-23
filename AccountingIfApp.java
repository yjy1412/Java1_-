
public class AccountingIfApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double total = valueOfSupply + vat;
		
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		
		System.out.println("SupplyPrice: " + valueOfSupply);
		System.out.println("vatRate: " + vatRate);
		System.out.println("expensRate: " + expenseRate);
		System.out.println("vat: " + vat);
		System.out.println("expense: " + expense);
		System.out.println("income: " + income);
		System.out.println("total : " + total);
		
		if (valueOfSupply < 10000) {
			System.out.println("Dividend1: " + income);
		} else {
			int i = 0;
			while (i < dividendRates.length) {
				System.out.println("Dividend1: " + income * dividendRates[i]);
				i = i + 1;
			}
		}
		System.out.println("Git push test!!");
		
	}

}
