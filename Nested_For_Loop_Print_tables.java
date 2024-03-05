package Loop_concepts;
import java.util.Scanner;
public class Nested_For_Loop_Print_tables {

	public static void main(String[] args) {
		
		Scanner rk = new Scanner (System.in);
		
		System.out.println("Enter your limit for I :- ");
		System.out.println("Enter your limit for J :- ");
		
		int i_limt = rk.nextInt();
		int j_limit = rk.nextInt();
		
		for(int i=1;i<=i_limt;i++) {
			for(int j=1;j<=j_limit;j++) {
				System.out.println(i+ " x "+j+" = "+i*j);
			}
			System.out.println();
		}
		
		
		rk.close();
	}

}
