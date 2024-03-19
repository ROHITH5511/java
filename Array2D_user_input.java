/* give inputs of an array how many rows and columns you want and print output in matrix form? */
package Arrays_2D;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D_user_input {
	public static void main(String[] args) {
		
		Scanner rk = new Scanner (System.in);
		
		System.out.println("Enter your number of rows: ");
		int row = rk.nextInt();
		System.out.println("Enter your number of columns: ");
		int column = rk.nextInt();
		
		int [][] array = new int [row][column];
		System.out.println("Enter your array elements");
		
		for (int i = 0; i<row;i++) {
			for (int j = 0;j<column;j++) {
				array[i][j] = rk.nextInt();
			}
		}
		
		// printing matrix form //
		System.out.println("Matrix form: ");
		for(int i = 0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(array[i][j]+" ");
			}
			// move the next line for the row //
			System.out.println();
		}
	}

}
