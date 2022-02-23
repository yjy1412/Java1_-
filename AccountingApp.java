
public class AccountingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double total = valueOfSupply + vat;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("SupplyPrice: " + valueOfSupply);
		System.out.println("vatRate: " + vatRate);
		System.out.println("expensRate: " + expenseRate);
		System.out.println("vat: " + vat);
		System.out.println("expense: " + expense);
		System.out.println("income: " + income);
		System.out.println("total : " + total);
		
		System.out.println("Dividend1: " + dividend1);
		System.out.println("Dividend2: " + dividend2);
		System.out.println("Dividend3: " + dividend3);
	}

}
