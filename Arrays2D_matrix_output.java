package Arrays_2D;

import java.util.Scanner;

public class Arrays2D_matrix_output{
	public static void main(String[] args) {
		int [][] array = new int [3][4];
		Scanner rk = new Scanner (System.in);
		System.out.println("Enter array elements: ");
		
		
		// user input for an array // 
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array[i].length;j++) {
				array[i][j] = rk.nextInt();
			}
		
		}
		
		// for matrix output of an array //
		
		for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] +"  ");
            }
            System.out.println();
		
		}
		
	}
	

}
