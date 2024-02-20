package java_basics;

import java.util.Scanner;                            // IMPORTING SCANNER CLASS //
public class Marks_and_grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);         // ASSIGNED SCANNER CLASS INPUT SYSTEM // 
		System.out.println("enter your marks");
		byte marks = sc.nextByte();                   // ASSIGNED BYTE DATA TYPE //
		
		if (marks>=100 & marks < 90) {                // ELSE IF STATEMENT OPENED // 
			System.out.println("grade A");
	}
		else if(marks>80 && marks <=90) {
			System.out.println("grade B");
		}
		else if (marks>=60 && marks<=80) {
			System.out.println("grade C");
		}
		else if(marks<60 && marks>=35) {
			System.out.println("grade D");
		}
		else if(marks<35) {
			System.out.println("better luck next time");
		}                                                 // ELSE IF STATEMENT CLOSED //

		sc.close();                                       // SCANNER CLASS CLOSED //
	}
}
