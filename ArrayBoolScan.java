package Stirng_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBoolScan {
	public static void main(String[] args) {
		boolean isTest[] = new boolean[4];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<isTest.length;i++) {
			isTest[i]=sc.nextBoolean();
			
		}
		System.out.println(Arrays.toString(isTest));
	}

}
