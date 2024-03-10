package Java_basics;

import java.util.Scanner;

public class Check_Floating_Numbers_Decimals_Same_OR_Not {

	public static void main(String[] args) {
		Scanner rk  = new Scanner (System.in);
		System.out.print("Input floating point number :- ");
		float number = rk.nextFloat();
		System.out.print("input floating point number_1 :- ");
		float number_1 = rk.nextFloat();
		if(number==number_1) {
			System.out.println("Given floating number is same");
		}
		else {
			System.out.println("They are different");
		}
		rk.close();
	}

}
