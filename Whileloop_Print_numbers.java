package Loop_concepts;

import java.util.Scanner;
public class Whileloop_Print_numbers {

	public static void main(String[] args) {
		Scanner rk = new Scanner(System.in);
		System.out.println("Enter the first number :- ");
		int first_number = rk.nextInt();
		System.out.println("Enter your limit :- ");
		int limit_number = rk.nextInt();
		
		while(first_number<=limit_number) {              // while loop initiated //
			System.out.println(first_number);            
			first_number++;
		}                                                // while loop closed //
		

	}

}
