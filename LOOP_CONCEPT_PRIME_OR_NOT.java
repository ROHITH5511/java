/* Write a java program to check whether a given number is prime or not?  */

package Loop_concepts;

import java.util.Scanner;

public class LOOP_CONCEPT_PRIME_OR_NOT {

	public static void main(String[] args) {
		 Scanner rk = new Scanner(System.in);
	        System.out.print("Enter a number to check if it's prime: ");
	        int number = rk.nextInt();
	        boolean Prime = true;        
	        if (number <= 1) {
	            Prime = false;
	        }	       
	        
	        // Check for divisibility from 2 to the square root of the number
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	        	if (number % i == 0) {
	            	
	                // If the number is divisible by any number between 2 and its square root, it's not prime
	                Prime = false;
	               
	                break;	            
	               // Exit the loop as soon as a divisor is found
	           
	            }
	        }	        
	        if (Prime) {
	        	
	            System.out.println(number + " is a prime number.");
	        } 
	        else {
	            System.out.println(number + " is not a prime number.");
	        }     
	        rk.close();
	}

}
