package Stirng_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringScan {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name[] = new String[4];
		for(int i=0;i<name.length;i++) {
			name[i]= sc.next();
			
		}
		System.out.println(Arrays.toString(name));
		
		
	}

}
