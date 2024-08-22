package Stirng_Arrays;

import java.util.Arrays;

public class Countofalpha_num_space_special {

static int count_of_alphabets=0;
static int count_of_numeric=0;
static int count_of_spaces=0;
static int count_of_special_characters=0;


public static void main(String[] args) {
	String test = "Automation testing programs @12345_Practice ";
	char[] t= test.toCharArray();
	System.out.println(Arrays.toString(t));
	
	for(int i=0;i<test.length();i++) {
	boolean ans=Character.isAlphabetic(t[i]);
		
	if(ans==true) {
		count_of_alphabets++;
	}
	}
	
	System.out.println("Total alphabets are -> "+ count_of_alphabets);
	
	System.out.println("Find count of numbers");
	
	for(int i=0;i<test.length();i++) {
	boolean ans1=Character.isDigit(t[i]);
	
	if(ans1==true) {
		count_of_numeric++;
	}
	}
	System.out.println("Total numbers are -> "+ count_of_numeric);
	
	
	System.out.println("Find number of spaces");
	
	for(int i=0;i<test.length();i++) {
		boolean ans2=Character.isSpace(t[i]);
		
		if(ans2==true) {
			count_of_spaces++;
		}
	}
	System.out.println("Total spaces are ->" + count_of_spaces);
	
	System.out.println("Find the number of special characters");
	
	count_of_special_characters = test.length() - (count_of_alphabets + count_of_numeric + count_of_spaces);
	
	System.out.println("Total special characters are-> " +count_of_special_characters);
	
	
	
	
}
	
	
}
	
	
	