package Stirng_Arrays;

import java.util.Arrays;

public class StringContains {
	
	public static void main(String[] args) {
		String a1 = "Manish Kumar Tiwari Test";
		System.out.println(a1.contains("Tiwari"));
	String[]name=a1.split(" ");
	System.out.println(Arrays.toString(name));
	
	String[]name1=a1.split(" ",3);
	System.out.println(Arrays.toString(name1));
		
		String a3="School";
		System.out.println(a3.repeat(4));
		
	}

}
