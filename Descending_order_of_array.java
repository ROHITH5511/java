package Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Descending_order_of_array {
	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		int[] array = {1,3,2,9,4,8,6,5,7};

		// Loop through the array, starting at the first index
		for (int i = 0; i < array.length; i++) {
		    // Assume the current element is the largest
		    int largest = array[i];
		    int indexoflargest = i;

		    // Loop through the rest of the array
		    for (int j = i + 1; j < array.length; j++) {
		        // If we find a larger element
		        if (array[j] > largest) {
		            // Set the current element as the largest
		            largest = array[j];
		            // And update the index of the largest element
		            indexoflargest = j;
		        }
		    }

		    // Swap the current element with the largest element found
		    int temp = array[i];
		    array[i] = array[indexoflargest];
		    array[indexoflargest] = temp;
		}

		// Print the sorted array
		System.out.println("descending order of array = "+Arrays.toString(array));
		rk.close();
	}

}
