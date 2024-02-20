package java_basics;

// IMPORTING SCANNER CLASS //

import java.util.Scanner;
public class Even_or_odd {

	public static void main(String[] args) {
		
		// ASSIGNING SCANNER CLASS INPUT SYSTEM //
		
		Scanner sc = new Scanner (System.in);
		System.out.print("enter a number :- ");
		
		// ASSIGNING INTEGER DATA TYPE FOR THE INPUT //
		int number = sc.nextInt();
		
		// IF ELSE STATEMENT OPENED //
		if(number%2==0) {
			System.out.println("given number is even number");
		}
		
		// IF ELSE STATEMENT CLOSED//
		else {
			System.out.println("given number is odd number");
		}
		
		// SCANNER CLASS CLOSED //
		sc.close();

	}

}
