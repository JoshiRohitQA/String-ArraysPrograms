package Stirng_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {
	public static void main(String[] args) {
		
		int rollno[] = new int[3];
		Scanner s1 = new Scanner(System.in);
		for(int i=0;i<rollno.length;i++) {
			  rollno[i]=s1.nextInt();
			  
		}
		
		System.out.println(Arrays.toString(rollno));
		
	}

}
