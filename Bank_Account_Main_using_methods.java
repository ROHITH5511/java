package Methods;

import java.util.Scanner;

public class Bank_Account_Main_using_methods {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		
		Bank_Account_methods obj = new Bank_Account_methods();
		
		System.out.println("enter your deposit amount: ");
		int amount = rk.nextInt();
		
		System.out.println("enter the amount to withdrawl: ");
		int withdrawl_amount = rk.nextInt();
		
		double initial_amount = 0;
		System.out.println("Intial amount = "+initial_amount);
		System.out.println("Rupees "+obj.deposit(amount)+" deposited successfully");
		System.out.println("Withdrawl rupees "+obj.withdrawl(withdrawl_amount)+" successfully");
		System.out.println("Balance = "+obj.get_balance());
		

	}

}
