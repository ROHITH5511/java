package Loop_concepts;

public class Printing_patterns_Nested_For_loop {

	public static void main(String[] args) {
		for (byte i=1; i<=5; i++) {
			for(byte j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
