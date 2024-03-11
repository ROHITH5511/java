package Array_Concepts;
import java.util.Arrays;
import java.util.Scanner;
public class Array_using_for_loop {

	public static void main(String[] args) {
		int [] array = new int [5];
		Scanner rk = new Scanner (System.in);
		System.out.println("Enter your elements : ");
		for (byte i = 0;i <array.length;i++) {
			array[i] = rk.nextInt();
		}
		System.out.println("Array of given elements: "+Arrays.toString(array));
		System.out.println("Length of array is: "+array.length);
		System.out.println("index of array: "+array[2]);
		rk.close();

	}

}
