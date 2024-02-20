package java_basics;

import java.util.Scanner;
public class Nested_if_statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter your number :-  ");
		int number = sc.nextInt();
		if(number%5==0) {
			if(number%11==0) {
				System.out.println("divisible by 5 & 11");
			}
			else {
				System.out.println(" not divisible by 5 & 11");
			}
		}
		else {
			System.out.println("not divisible by 5 & 11" );
		}
		sc.close();
	}

}
