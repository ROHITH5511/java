package Loop_concepts;
import java.util.Scanner;
public class While_Loop_Print_Tables {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.print("Enter a number :- ");
		int number = rk.nextInt();
		int i = 1;
        while(i <= 5) {
            System.out.println(number+" * "+i+" = "+ number * i);
            i++;
        }
	}

}
