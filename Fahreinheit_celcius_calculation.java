package java_basics;


import java.util.Scanner;                         // IMPORTING SCANNER CLASS //

public class Fahreinheit_celcius_calculation {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);      // SCANNER CLASS INPUT SYSTEM OPENED WITH A VARIABLE SC //
		System.out.print("Enter the degree of celcius :-  ");
		
		double celcius = sc.nextDouble();           //  DOUBLE DATA TYPE ASSIGNED FOR VARIABLE CELCIUS //
		double fahreinheit = ((9f*celcius)/5f)+32;   // DOUBLE DATA TYPE ASSIGNED FOR VARIABLE FAHREINHEIT WITH FORMULA)
		System.out.println(celcius + " degree in celcius is equal to " + fahreinheit + " in fahreinheit ");
		
		sc.close();                                // SCANNER CLASS CLOSE //
		

	}

}
