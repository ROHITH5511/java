package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Assending_order_of_array {
	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		int [] array = {1,2,6,8,4,3,9,5,7};
		Arrays.sort(array);
		for (int num : array) {
            System.out.print(num + " ");
		}
//		for (int i = 0; i<array.length;i++) {
//			for(int j =i+1;j<array.length;j++) {
//				if(array[i]>array[j]) {
//					int temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//					System.out.println(Arrays.toString(array));
//				}
//				
//			}
//		}
		
	}

}
