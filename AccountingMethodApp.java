class Accounting {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static double[] dividendRates;
	
	public static void print() {
		System.out.println("SupplyPrice: " + valueOfSupply);
		System.out.println("vatRate: " + vatRate);
		System.out.println("expensRate: " + expenseRate);
		System.out.println("vat: " + getVat());
		System.out.println("expense: " + getExpense());
		System.out.println("income: " + getIncome());
		System.out.println("total : " + getTotal());
	
		int i = 0;
		while (i < dividendRates.length) {
			System.out.println("Dividend1: " + getIncome() * dividendRates[i]);
			i = i + 1;
		}
	}

	public static double getTotal() {
		return valueOfSupply + getVat();
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	public static double getVat() {
		return valueOfSupply * vatRate;
	}
	
}

public class AccountingMethodApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accounting.valueOfSupply = 10000;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.dividendRates = new double[] {0.5, 0.3, 0.1};
		Accounting.print();
		
	}

}
