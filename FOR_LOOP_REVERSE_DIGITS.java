/* write a program to reverse the given Digits using For Loop ?  */

package Loop_concepts;

import java.util.Scanner;

public class FOR_LOOP_REVERSE_DIGITS {

	public static void main(String[] args) {
		Scanner rk = new Scanner(System.in);
        System.out.print("Enter a number to reverse its digits: ");
        int number = rk.nextInt();
        
        reverse(number);
        rk.close();
    }
    
    public static void reverse(int number) {
        // Convert the number to a string to iterate through its digits
        String numstr = Integer.toString(number);
        
        // Initialize an empty string to store the reversed digits
        String reversed_number = "";
      
        // Iterate through each character (digit) in the string in reverse order
        for (int i = numstr.length() - 1; i >= 0; i--) {
            // Add each digit to the beginning of the reversed string
            reversed_number += numstr.charAt(i);
        }
        
        // Convert the reversed string back to an integer
        int reversednum = Integer.parseInt(reversed_number);
        
        System.out.println("Reversed number: " + reversednum);

	}

}
