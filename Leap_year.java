package java_basics;

import java.util.Scanner;                                       // IMPORTING SCANNER CLASS //
public class Leap_year {

	public static void main(String[] args) {          		    // ASSIGNING SCANNER CLASS INPUT SYSTEM OPENED //
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Your Year :- ");                // ASSIGNING SHORT DATA TYPE //
		short year = sc.nextShort();                            // NESTED IF AND IF ELSE STATEMENTS OPENED //
		if (year %100==0) {
			if (year%400==0) {
				System.out.println(year+"is a Leap Year");
			}
			else {
				System.out.println(year + "is not a Leap Year");
			}
			
		}
		else {
			if (year%4==0) {
				System.out.println(year+ "is a leap year");
			}
			else {
				System.out.println(year+"is not a Leap year");
			}
		}                                                        // NESTED IF AND IF ELSE STATEMENTS CLOSED //
		
		sc.close();                                             // SCANNER CLASS CLOSED //
		

	}

}
