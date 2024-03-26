package Methods;

public class Methods_sample_prog {
	public static int f = 100;    // created a global variable //
	public static void add() {    // initiated a method of static with name of add //
		int a = 20;
		int b = 30;
		int c = a+b+f;
		System.out.println("The Addition of "+a+" and "+ b+"and"+f+" = " + c );
	}
	
	public void sub() {        // initiated a method of non static with name sub //
		int a = 100;
		int b = 50;
		System.out.println("The Substraction of "+a+" and "+ b+" = " +(a-b));
	}	
	
	public void mul(int a,int b) {     // initiated a method of non static with name mul //
		int c = a*b+f;
		System.out.println("The multiplication of "+a  +" * "  +b  + " + " +f +" = " + c);
	}
	public static void main(String[] args) {
		Methods_sample_prog object = new Methods_sample_prog();   // created an object for non static type //
		add();                // given method name for getting output of add method which is a static//
		object.sub();         // Initiated object with the method name for getting output of sub which is non static//
		object.mul(20, 10);   // Initiated object with the method name for getting output of sub which is non static//
	}

}
