package Java_basics;
import java.util.Scanner;
public class Marks_with_Percentage_elseif {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);

		System.out.print(" enter your marks in Physics :- ");
		byte Physics = rk.nextByte();
		
		System.out.print("enter your marks in Chemistry :- ");
		byte Chemistry = rk.nextByte();
		
		System.out.print("Enter your marks in Biology :- ");
		byte Biology = rk.nextByte();
		
		System.out.print("Enter your marks in Mathematics :- ");
		byte Mathematics = rk.nextByte();
		
		System.out.print("Enter your marks in Computer :- ");
		byte Computer = rk.nextByte();
		float total_marks = 500;
		float marks = (Physics+Chemistry+Biology+Mathematics+Computer);
		System.out.println("total marks = "+" " +marks);
		float percentage = (marks)/total_marks*100;
		System.out.println("percentage = "+" "+percentage+"%");
		if (percentage <=100 && percentage >=90) {
			System.out.println("Grade = Grade A");
		}
		else if (percentage<90 && percentage>=80) {
			System.out.println("Grade = Grade B");
		}
		else if(percentage<80 && percentage>=70) {
			System.out.println("Grade = Grade C");
		}
		else if(percentage<70 && percentage>=60) {
			System.out.println("Grade = Grade D");
		}
		else if(percentage<60 && percentage>=40) {
			System.out.println("Grade = Grade E");
		}
		else if(percentage<40) {
			System.out.println("Grade = Grade F");
		}
		else {
			System.out.println("not valid");
		}
		}
	}