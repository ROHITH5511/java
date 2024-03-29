package Methods;

public class Bank_Account_methods {
	public static double balance = 0;
	
	
	public double get_balance() {
		return balance;
	}
	
	public int deposit(int amount) {
		balance = balance+amount;
		return amount;
	}
	
	public int withdrawl(int withdrawl_amount) {
		balance = balance-withdrawl_amount;
		return withdrawl_amount;
		
	}
	

}
