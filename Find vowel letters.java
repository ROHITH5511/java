// Write a program to input any alphabet and check whether it is vowel or consonant ?

package Java_basics; 

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.print("Enter a character:- ");
		char alpha = rk.next().toUpperCase().charAt(0);
		if (Character.isLetter(alpha)) {
			if(alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
				System.out.println(alpha+ " is an vowel");
			}
			else {
				System.out.println(alpha+ " is not an vowel");
			}
		
		}
		else {
			System.out.println(alpha+ " enter a valid  character");
		}
		rk.close();
	
    }
    
}
 


