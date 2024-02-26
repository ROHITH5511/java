//  Write a Program to check whether a character is uppercase or lowercase alphabet //
package Java_basics; 

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		
		Scanner rk = new Scanner (System.in); 
		System.out.print("Enter  a character :- ");
		char char_1 = rk.next().charAt(0);
		rk.close();
		 checkCase(char_1);
    }

    public static void checkCase(char char_1) {
    	
        if (Character.isLowerCase(char_1)) {
            System.out.println(char_1 + " is a lowercase alphabet.");
        } else if (Character.isUpperCase(char_1)) {
            System.out.println(char_1 + " is an uppercase alphabet.");
        } else {
            System.out.println(char_1 + " is not an alphabet.");
        }
    
    }
    
}
