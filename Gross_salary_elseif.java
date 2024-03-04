package Java_basics;
import java.util.Scanner;
public class Gross_salary_elseif {

	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		System.out.print("Enter the salary :-");
		int salary = rk.nextInt();
		if (salary>=1000 && salary<=10000) {
			int HRA = salary *20/100;
			System.out.println("HRA = "+HRA);
			int DA = salary*80/100;
			System.out.println("DA = "+DA);
			System.out.println("HRA + DA = "+(HRA+DA));
			System.out.println("Gross salary = "+(salary+HRA+DA));
		}
		else if(salary>10000 && salary<=20000) {
			int HRA = salary*25/100;
			System.out.println("HRA = "+HRA);
			int DA = salary*90/100;
			System.out.println("DA = "+DA);
			System.out.println("HRA + DA = "+(HRA+DA));
			System.out.println("Gross salary = "+(salary+HRA+DA));
		}
		else if (salary>20000) {
			int HRA = salary*30/100;
			System.out.println("HRA = "+HRA);
			int DA = salary*95/100;
			System.out.println("DA = "+DA);
			System.out.println("HRA + DA = "+(HRA+DA));
			System.out.println("Gross salary = "+(salary+HRA+DA));
			}
		else {
			System.out.println(" not valid ");
		}
		rk.close();
	}
}
