package Loops_Concept;

import java.util.Scanner;

public class Amstrong_number_using_loops {

	public static void main(String[] args) {
		Scanner rk = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = rk.nextInt();

        // Store the original number
        int originalnumber = number;

        // Initialize sum
        int sum = 0;

        // Digit extraction loop
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        // Comparison
        if (sum == originalnumber) {
            System.out.println(originalnumber + " is an Armstrong number.");
        }
        else {
            System.out.println(originalnumber + " is not an Armstrong number.");
        }

        rk.close();

	}

}
