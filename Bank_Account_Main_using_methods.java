package Methods;

public class Bank_Account_Main_using_methods {

	public static void main(String[] args) {
		Bank_Account_methods obj = new Bank_Account_methods();
		double initial_amount = 0;
		System.out.println("Intial amount = "+initial_amount);
		System.out.println("Rupees "+obj.deposit(10000)+" deposited successfully");
		System.out.println("Withdrawl rupees "+obj.withdrawl(1000)+" successfully");
		System.out.println("Balance = "+obj.get_balance());
		

	}

}
