class Accounting {
	public double valueOfSupply;
	public double vatRate;
	public double expenseRate;
	public double[] dividendRates;
	
	public void print() {
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
	public double getTotal() {
		return valueOfSupply + getVat();
	}
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	public double getVat() {
		return valueOfSupply * vatRate;
	}
}

public class AccountingClassApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accounting a = new Accounting();
		a.valueOfSupply = 10000;
		a.vatRate = 0.1;
		a.expenseRate = 0.3;
		a.dividendRates = new double[] {0.5, 0.3, 0.1};
		a.print();
		
		Accounting b = new Accounting();
		b.valueOfSupply = 20000;
		b.vatRate = 0.2;
		b.expenseRate = 0.7;
		b.dividendRates = new double[] {0.2, 0.4, 0.4};
		b.print();
		
	}

}
