/* multiplication of 2 arrays */

package Arrays_2D;

import java.util.Scanner;

public class Multipication_2DArrays {

	public static void main(String[] args) {
Scanner rk = new Scanner (System.in);
		
		System.out.println("Enter your number of rows: ");
		int row = rk.nextInt();
		System.out.println("Enter your number of columns: ");
		int column = rk.nextInt();
		
		int [][] array1 = new int [row][column];
		
		
		System.out.println("Enter your number of rows: ");
		int row1 = rk.nextInt();
		System.out.println("Enter your number of columns: ");
		int column1 = rk.nextInt();
		
		int [][] array2 = new int [row1][column1];
		int [][] array3 = new int [row][column];
		
		 // giving inputs for array //
		for (int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				array1[i][j] = rk.nextInt();
			}
		}
		
		// giving inputs for array1 //
		for (int i = 0; i<row1;i++) {
			for (int j=0; j<column1;j++) {
				array2[i][j] = rk.nextInt();
			}
		}
		
		// printing array1 in matrix form //
		System.out.println("array1 elements: ");
		for (int i = 0;i<row;i++) {
			for(int j = 0;j<column;j++) {
				
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array2 elements: ");
		
		// printing array2 in matrix form //
		for (int i = 0;i<row1;i++) {
			for(int j = 0; j<column1;j++) {
				
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		
		// printing multiplication of 2 arrays //
		System.out.println("multiplication of array1 and array2: ");
		for (int i = 0;i<array1.length;i++) {
			for(int j = 0;j<array1[i].length;j++) {
				array3[i][j] = array1[i][j] * array2[i][j];
				System.out.print(array3[i][j]+" ");
			}
			System.out.println();
		}
		rk.close();
	}
}
