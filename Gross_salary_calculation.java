package java_basics;

import java.util.Scanner;                                           // IMPORTING SCANNER CLASS //
public class Gross_salary_calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);                       // SCANNER CLASS INPUT SYSTEM OPENED //
		System.out.print("Enter your basic salary : ");
		int B_salary = sc.nextInt();                                // ASSIGNED INTEGER DATA TYPE //
		
		if (B_salary>=100 && B_salary<=10000) {                     // ASSIGNING ELSE IF STATEMENT // 
			int HRA = B_salary*20/100;
			int DA = B_salary*80/100;
			System.out.println("your Gross salary is : "+ (B_salary+HRA+DA));
		}
		else if (B_salary>10000 && B_salary<=20000) {
			int HRA = B_salary*25/100;
			int DA = B_salary*90/100;
			System.out.println("your Gross slary is : " +(B_salary+HRA+DA));
		}
		else if (B_salary>20000) {
			int HRA = B_salary*30/100;
			int DA = B_salary*95/100;
			System.out.println("Your Gross salary is : " +(B_salary+HRA+DA));
		
		}                                                             // ELSE IF STATEMENT CLOSED //
		
		sc.close();                                                   // SCANNER CLASS CLOSED //
		

	}

}
