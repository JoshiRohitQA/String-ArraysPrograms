package Stirng_Arrays;

import java.util.Arrays;

public class ArrayCheck {

	public static void main(String[] args) {
		
		int rollno[]=new int[4];
		rollno[0]=100;
		rollno[1]=200;
		rollno[2]=300;
		rollno[3]=400;
		
		
		int givenNumber=300;
		
		for(int i=0;i<rollno.length;i++) {
			if(rollno[i]==givenNumber) {
				System.out.println("It is a part of array at the posiiton->" +i);
			}
			else {
				System.out.println("Sorry not found");
			}
		}
		
		
	
		
		
	}
}
