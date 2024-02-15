package java_basics;
import java.util.Scanner;                                        // importing scanner class //
public class Else_if_condition {

	public static void main(String[] args) {
		Scanner f = new Scanner (System.in);                      // opened scanner class and assigned "f"  for scanner class //
		System.out.println("enter your number:");
		int number = f.nextInt();                                 // assigned an integer data type for "f" which is a scanner class // 
		if(number>0) {                                            // else if condition started with if condition //
		System.out.println("it is a positive number");
		}
		else if(number<0) {                                       // else if condition applied // 
			System.out.println("it is a negative number");
		}
		else {                                                    // else if condition closed with else //
			System.out.println("given number is equal to 0");
		}
		f.close();                                                // scanner class closed //
	}

}
