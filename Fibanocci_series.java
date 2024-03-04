package Loop_concepts;
import java.util.Scanner;                  // Scanner class importing initiated //
public class Fibanocci_series {

	public static void main(String[] args) {
		Scanner rk = new Scanner(System.in);         // Scanner class input system initiated
		System.out.print("enter a your limit :-  ");
		int limit = rk.nextInt();          // assigned integer data type for the user input value //
		int number = 0;
		int number_1 = 1;
		System.out.println(" "+number);
		System.out.println(" "+number_1);
		for(int i=2;i<=limit;i++) {            // for loop initiated with integer data type //
			int number_2 = number+number_1;
			System.out.println(" " +number_2);
			number = number_1;                 // swapping of number to number_1 //
			number_1 = number_2;               // swapping of number_1 to number_2 //
		}
		rk.close();                           // Scanner class closed //

	}
}
