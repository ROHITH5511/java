package Java_basics;

import java.util.Scanner;

public class Operator_Assigning_To_2_Numbers {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.print("enter number1:- ");
		float num1 = rk.nextFloat();
		System.out.print("enter number2:- ");
		float num2 = rk.nextFloat();
		System.out.print("enter the operator:- ");
		char operator = rk.next().charAt(0) ;
		double result;
		if(operator == '+') {
			 result = num1+num2;
			System.out.println(result);
		}
		else if (operator == '*') {
			result = num1 * num2;
			System.out.println(result);
		}
		else if(operator == '-') {
			result = num1-num2;
			System.out.println(result);
		}
		else if(operator == '%') {
			if(num2 %2 == 0) {
			}
			result = num1%num2;
			System.out.println(result);
		}
		else if(operator == '/') {
			if(num2==0) {
			}
			result = num1/num2;
			System.out.println(result);
		}
		else {
			System.out.println("Enter a valid operator");
		}
		
		rk.close();
	}

} 
