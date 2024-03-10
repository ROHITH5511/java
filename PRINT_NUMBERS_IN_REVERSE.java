/* Write a program to print all natural numbers in reverse?  */

package Loop_concepts;

import java.util.Scanner;

public class PRINT_NUMBERS_IN_REVERSE {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.print("Enter the limit : ");
		int limit = rk.nextInt();	
		  int n = limit;
	        for (int i = n; i >= 1; i--) {
	            System.out.print(i+" ");
	        }
	        rk.close();
	}

}
