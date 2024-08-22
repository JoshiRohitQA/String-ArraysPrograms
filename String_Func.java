package Stirng_Arrays;

public class String_Func {
	
	public static void main(String[] args) {
		
		// String s1 ="Banaglore";
		String s1 = new String("Banaglore");
		System.out.println(s1.length());
		System.out.println(s1.charAt(7));
		System.out.println(s1.indexOf('g'));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(1, 5));// end index is 5-1 in result
	

	}
	
}
