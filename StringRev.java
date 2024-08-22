package Stirng_Arrays;

public class StringRev {

	public static void main(String[] args) {

		String input = "naman";
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {

			char c1 = input.charAt(i);
			output = output + c1;

		}
		System.out.println("The reverse of string is-> " + output);

				if(input.equals(output)) {
		  System.out.println("The given string is palindrome"); 
		  } 
				
				else {
		 System.out.println("Not a palindrome"); }
		 
	}

}
