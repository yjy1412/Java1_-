
public class AccountingMethodApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Accounting a = new Accounting();
		a.vatRate = 0.1;
		a.valueOfSupply = 10000;
		a.expenseRate = 0.3;
		a.dividendRates = new double[] {0.5, 0.3, 0.1};
		a.print();
		
	}

}
