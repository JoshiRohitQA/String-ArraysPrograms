package Stirng_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDoubleScan {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salarry[]=new double[4];
		for(int i =0;i<salarry.length;i++) {
			salarry[i]=sc.nextDouble();
			
		}
		System.out.println(Arrays.toString(salarry));
	}

}
