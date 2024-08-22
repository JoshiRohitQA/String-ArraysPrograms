package Stirng_Arrays;

import java.util.Arrays;

public class ArrayCopy {
	
	public static void main(String[] args) {
		
		double Esalary[]=new double[3];
		Esalary[0]=7185.32;
		Esalary[1]=7245.32;
		Esalary[2]=73445.32;
		
		double Msalary[]=new double[3];
		
		for(int i=0;i<Esalary.length;i++) {
		Msalary[i]= Esalary[i];
		
		}
		
		System.out.println("The old array is->");
		System.out.println(Arrays.toString(Esalary));
		System.out.println("After copying the new array is->");
		System.out.println(Arrays.toString(Msalary));
		
	}

}
