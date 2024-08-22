package Stirng_Arrays;

import java.util.Arrays;

public class ArrayFun {
	public static void main(String[] args) {
		
		int rollno[]= new int[3];
		
		rollno[0]= 21;
		rollno[0]=3332;
		rollno[1]= 233;
		rollno[2]= 23111;
		
		
	/*	System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]); */
		
	/*	for(int i =0;i<=2;i++) {
			System.out.println(rollno[i]); 
			
			}*/
		
		Arrays.sort(rollno);
		
		System.out.println(Arrays.toString(rollno));
		
		String name[]= new String[3];
		
		name[0]="rohit";
		name[1]="sandeep";
		name[2]="atul";
		
		System.out.println(Arrays.toString(name));
		}

	
}


	



	
	

	




