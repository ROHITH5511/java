package Loop_concepts;

import java.util.Scanner;
public class Print_table {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.print(" Enter a number :- ");
		int number = rk.nextInt();
		System.out.println("number \t\t  \t   table ");
		for (byte i = 1 ; i<=30; i++ ) {
			
			System.out.println( "  "+ i+  "\t\t\t"  +" 5 x " +i +" = " +5*i);
		}
	}

}
