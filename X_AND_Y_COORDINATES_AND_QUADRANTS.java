/* Write a Java Program that takes the x and y coordinates of a point as input and determines in which quadrant the point lies. Consider the following quadrant definitions.
• Quadrant 1 – Both x and y are positive
• Quadrant 2 – x is negative and y is positive
• Quadrant 3 – Both x and y are negative
• Quadrant 4 – x is Positive and y is negative  */

package Java_basics;

import java.util.Scanner;

public class X_AND_Y_COORDINATES_AND_QUADRANTS {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.print("enter the coordinate of X : ");
		int x = rk.nextInt();
		System.out.print("Enter the coordinate of Y : ");
		int y = rk.nextInt();
		if(x>=0 && y>=0) {
			System.out.println("both X and Y are Positive");
		}
		else if(x<=-1 && y>=0) {
			System.out.println("X is negative and Y is positive");
		}
		else if(x<=-1 && y<=-1) {
			System.out.println("Both X and Y are negative");
		}
		else if(x>=0 && y<=-1) {
			System.out.println("X is positive and Y is negative");
		}
		rk.close();
	}

}
