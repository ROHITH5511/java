package Loop_concepts;
import java.util.Scanner;                                    // IMPORTED SCANNER CLASS //
public class While_Loop_Guess_A_Number {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.println("Enter your SECRETE number :- "); 
		int secrete_number = rk.nextInt();                     // INITIATED INTEGER DATA TYPE AND SCANNER CLASS FOR SECRETE NUMBER //
		
		System.out.println("Enter your GUESS number :- ");
		int guess_number = rk.nextInt();                        // INITIATED INTEGER DATA TYPE AND SCANNER CLASS FOR GUESSING A  NUMBER //
		
		while(guess_number!=secrete_number) {                    // WHILE LOOP INITIATED //
			if(guess_number>secrete_number) {
				System.out.println(guess_number+" GUESS number is HIGHER");
			}
			else {
				System.out.println(guess_number+" Guess number is LOWER");
			}
			System.out.println("guess again");
			guess_number = rk.nextInt();                    
		}                                                        // CLOSED INTEGER DATA TYPE AND SCANNER CLASS FOR GUESSING A NUMBER AGAIN //
		
		System.out.println(guess_number+" CONGRATULATIONS YOUR GUESS IS RIGHT");
		rk.close();                                              // SCANNER CLASS CLOSED //

	}

}
