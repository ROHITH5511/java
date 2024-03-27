package Methods;
import java.util.Scanner;
public class Method_Banking {
	public static double current_balance = 0;
	public static double balance;
	public static void welcome(String c_name) {
		System.out.println("Hello " + c_name + " Welcome to the bank of SBI ");	
	}
	
	public static void  Deposit(int amount) {
		current_balance += amount; 
		if (amount >0){
		}		
	}
	
	public static void withdrawl(int withdrawl_amount) {
		if(current_balance > withdrawl_amount && withdrawl_amount>=0) {
			current_balance = current_balance-withdrawl_amount;
		}
	}
	
	public static void check_balance (double balance) {
			balance = current_balance;
		}
	
	public static void quit() {
		
	}
		
	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.println("enter your name: ");
		String c_name = rk.next(); 
		welcome(c_name);
		System.out.println("choose one option :- \n 1.Deposit \n 2.Withdrawl \n 3.Check balance \n 4.Quit");
		int choice = 0;
		while(choice !=4) {
			System.out.println("enter your choice: ");
		
		choice = rk.nextInt();
		rk.nextLine();
		
		if(choice == 1) {
			System.out.println("enter the amount to deposit: ");
			int amount = rk.nextInt();
			Deposit(amount);		
		}
		
		if(choice == 2) {
			System.out.println("enter the amount to withdrawl: ");
			int withdrawl_amount = rk.nextInt();
			withdrawl(withdrawl_amount);
			
		}
		
		if (choice == 3) {
			System.out.println("balance:- ");
			check_balance(balance);	
		}
		
		
		if(choice==4) {
			if(choice>5) {				
				quit();						
			}
			System.out.println("Thank you visit again");
		}
		
		 System.out.println("current balnce = "+current_balance);
		}
		
		rk.close();
	}

}
