
public class AccountingMethodApp {
	
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		valueOfSupply = 10000;
		vatRate = 0.1;
		expenseRate = 0.3;
		double vat = getVat();
		double expense = getExpense();
		double income = getIncome(expense);
		double total = getTotal(vat);
		
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
		
		int i = 0;
		while (i < dividendRates.length) {
			System.out.println("Dividend1: " + income * dividendRates[i]);
			i = i + 1;
		}
	}

	public static double getTotal(double vat) {
		return valueOfSupply + vat;
	}

	public static double getIncome(double expense) {
		return valueOfSupply - expense;
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getVat() {
		return valueOfSupply * vatRate;
	}

}
