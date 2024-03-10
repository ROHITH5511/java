/* Write java program that calculates and categorized a persons Body Mass Index (BMI) based on their weight and height. The BMI categories are
• Underweight: BMI < 18.5
• Normal: 18.5 <= BMI < 25
• Overweight: 25 <= BMI < 30
• Obese: BMI >= 30   */

package Java_basics;

import java.util.Scanner;

public class BMI_Calculation {

	public static void main(String[] args) {
		Scanner rk = new Scanner(System.in);
        System.out.println(" Enter your choice :-  \n 1.Metrics \n 2.Standard \n 3.both");
        int choice = rk.nextInt();
        rk.nextLine(); 

        if (choice == 1 || choice == 3) {
            System.out.print("Input weight in kilogram: ");
            double weight = rk.nextDouble();
            System.out.print("Input height in meters: ");
            double height = rk.nextDouble();
            double BMI = weight / (height * height);
            System.out.print("\nYour BMI is " + BMI + ".");
            main(BMI);
        }

        if (choice == 2 || choice == 3) {
            System.out.print("Input weight in pounds: ");
            double weight = rk.nextDouble();
            System.out.print("Input height in feet and inches: ");
            double heightFeet = rk.nextDouble();
            double heightInches = rk.nextDouble();
            double heightInMeters = heightFeet * 0.3048 + heightInches * 0.0254;
            double BMI = (weight * 0.453592) / (heightInMeters * heightInMeters);
            System.out.print("\nYour BMI is " + BMI + ".");
            main(BMI);
        }
        rk.close();
    }

    public static void main(double BMI) {
        if (BMI < 18.5) {
            System.out.print(" You are underweight.");
        } else if (BMI >=18 && BMI < 25) {
            System.out.print(" You are normal weight.");
        } else if (BMI>=25 && BMI < 30) {
            System.out.print(" You are overweight.");
        }
        else if(BMI >=30) {
       	 System.out.println("You are obessed");
        }
        else {
            System.out.print(" ");
        }

	}

}
