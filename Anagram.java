package Stirng_Arrays;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String name ="ram";
		String name1 ="arm";
		
		if(name.length()!=name1.length()) {
			System.out.println("No Anagram");
			
		}
		else {
			char[]c1=name.toCharArray();
			char[]c2=name1.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			boolean ans = Arrays.equals(c1, c2);
			System.out.println(ans);
			
			if(ans==true) {
				System.out.println("The given string is anagram");
			}
			
			else {
				System.out.println("Not the anagram");
			}
			
		}
	}

}
