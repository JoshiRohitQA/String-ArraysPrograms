package Stirng_Arrays;

import java.util.Arrays;

public class CharAlpha {
	
	static int count_of_alphabet =0;
	static int count_of_numeric =0;
	static int count_of_spaces =0;
	
	
	public static void main(String[] args) {
		
			String input1 = "kv no 8976 bangalore";
			char[]c1= input1.toCharArray();
			System.out.println(Arrays.toString(c1));
			
			for(int i=0;i<input1.length();i++) {
			
			boolean answer= Character.isAlphabetic(c1[i]);
			
		//	System.out.println(answer);
			
			if(answer==true) {
				count_of_alphabet++;
				
			}
			
			}
			System.out.println("The total alphabets are ->"+ count_of_alphabet);
			
		
			

			
			System.out.println("finding numeric");
			
			for(int i=0;i<input1.length();i++) {
				
				boolean answer1= Character.isDigit(c1[i]);
				
			//	System.out.println(answer1);
				
				if(answer1==true) {
					count_of_numeric++;
					
				}
				
				}
				System.out.println("The total numerics are ->"+ count_of_numeric);
				
				
				
			
			
			System.out.println("finding space");
			
			for(int i=0;i<input1.length();i++) {
				
				boolean answer2= Character.isSpace(c1[i]);
				
			//	System.out.println(answer2);
				
				if(answer2==true) {
					count_of_spaces++;
					
				}
				
				}
				System.out.println("The total spaces are ->"+ count_of_spaces);
				
				}
			
		}
	


