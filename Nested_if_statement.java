package java_basics;

// IMPORTED SCANNER CLASS//
import java.util.Scanner;
public class Nested_if_statement {

	public static void main(String[] args) {
		// ASSIGNED SCANNER CLASS INPUT SYSTEM //
		Scanner sc = new Scanner (System.in);
		System.out.print("enter your number :-  ");
		
		// ASSIGNED INTEGER DATA TYPE //
		int number = sc.nextInt();
		
		// NESTED IF STATEMENT STARTED // 
		if(number%5==0) {
			if(number%11==0) {
				System.out.println("divisible by 5 & 11");
			}
			else {
				System.out.println(" not divisible by 5 & 11");
			}
		}
		// NESTED IF STATEMENT CLOSED //
		else {
			System.out.println("not divisible by 5 & 11" );
		}
		 // SCANNER CLASS CLOSED //
		sc.close();
	}

}
