package Loop_concepts;

public class Whileloop_Evennumbers_sum {

	public static void main(String[] args) {
		
		int sum = 0;
		int number = 1;
		while(number<=10) {
			if(number%2==0) {
				System.out.println(number);
				sum = sum+number;
			}
			number++;
		}
		System.out.println("Sum of all even numbers : "+sum);

	}

}
