package Loop_concepts;
import java.util.Scanner;
public class While_Loop_Guess_A_Number {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.println("Enter your SECRETE number :- ");
		int secrete_number = rk.nextInt();
		
		System.out.println("Enter your GUESS number :- ");
		int guess_number = rk.nextInt();
		
		while(guess_number!=secrete_number) {
			if(guess_number>secrete_number) {
				System.out.println(guess_number+" GUESS number is HIGHER");
			}
			else {
				System.out.println(guess_number+" Guess number is LOWER");
			}
			System.out.println("guess again");
			guess_number = rk.nextInt();
		}
		
		System.out.println(guess_number+" CONGRATULATIONS YOUR GUESS IS RIGHT");
		rk.close();

	}

}
