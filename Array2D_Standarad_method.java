package Arrays_2D;
public class Array2D_Standarad_method {
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};		
		// printing array in matrix form //
		System.out.println("Matrix form: ");
		for(int i = 0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			// move the next line for the row //
			System.out.println();
		}
	}
}
