/* sum of an array  */

package Arrays_2D;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_of_elements_in_array2D {
	public static void main(String[] args) {
Scanner rk = new Scanner (System.in);
		
		System.out.println("Enter your number of rows: ");
		int row = rk.nextInt();
		System.out.println("Enter your number of columns: ");
		int column = rk.nextInt();
		int array[][] = new int [row][column];
		int sum = 0;
		
		for (int i = 0; i<row;i++) {
			for (int j = 0;j<column;j++) {
				array[i][j] = rk.nextInt();
			}
		}
		
		for(int i = 0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int k = 0; k<array.length;k++) {
			for(int l = 0; l<array[k].length;l++) {
				sum += array[k][l];
			}
				
		}
		System.out.print("sum = "+ sum);
	
	}
}
			
	