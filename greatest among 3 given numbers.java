// Write a Java program that takes three numbers from the user and prints the greatest number

package Java_basics; 

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.println("Enter number_1 :- ");
		System.out.println("Enter number_2 :- ");
		System.out.println("Enter number_3 :- ");
		 int number_1 = rk.nextInt();
		 int number_2 = rk.nextInt();
		 int number_3 = rk.nextInt();
		 
		 if (number_1 > number_2 && number_1 > number_3) {
			 System.out.println(number_1+" is a greatest number than" +number_2 +" and " +number_3);
		 }
		 else if(number_2 > number_1 && number_2 > number_3) {
			 System.out.println(number_2+" is a greatest number than" +number_1 +" and "  +number_3);
		 }
	
		 else {
			 System.out.println(number_3+ " is greater number than " +number_1 +" and " +number_2 );
		 }
		 rk.close();
	
    }
    
}
