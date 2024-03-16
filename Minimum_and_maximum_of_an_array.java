package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Minimum_and_maximum_of_an_array {
	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		int [] array = {10,2,3,4,5,6,7,8,9,1};
		int min = array[0];
		int max = array[0];
		for(int i=0; i<array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
            if(array[i] > max) {
                max = array[i];
            }
		}
		System.out.println("minimum element of an array = "+min);
		System.out.println("maximum element of an array = "+max);
	}

}
