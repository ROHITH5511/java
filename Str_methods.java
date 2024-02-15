package java_basics;

public class Str_methods {

	public static void main(String[] args) {
		
		String name = "Rohith";
		String name_1 = "Kumar";
		
		
		// different types of STRING METHODS are used //
		
		System.out.println(name.charAt(5));       
		System.out.println(name.codePointAt(4));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.compareTo(name_1));
		System.out.println(name.codePointBefore(6));
		System.out.println(name.hashCode());
		System.out.println(name.length());
		System.out.println(name_1.replaceAll(name_1, name));
		System.out.println(name_1.strip());
		System.out.println(name_1.getBytes());
		
		
	}

}
