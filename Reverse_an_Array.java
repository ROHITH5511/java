package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Reverse_an_Array {
	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
        rk.close();
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
	}
}