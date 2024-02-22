package java_basics;


import java.util.Scanner;                          // IMPORTING SCANNER CLASS //
public class Celcius_temperature_calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);            // SCANNER CLASS INPUT SYSTEM OPENING //
		System.out.print("degree in fahreinheit :-  ");
		double fahrenheit = sc.nextDouble();             // ASSIGNED DOUBLE DATA TYPE FOR FAHREINHEIT //
		
		double celcius = ((5*(fahrenheit-32))/9);        // FORMULA FOR CONVERTING FAHREINHEIT TO CELCIUS USING DOUBLE DATA TYPE //
		System.out.println(fahrenheit + " degree in fahreheit is equal to " + celcius + " in celcius");
		
		sc.close();                                       // SCANNER CLASS CLOSED //

	}

}
