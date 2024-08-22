package Stirng_Arrays;

import java.util.Arrays;

public class ArrayRever {
	public static void main(String[] args) {
		
		int oldarray[]=new int[3];
		oldarray[0]=7185;
		oldarray[1]=7245;
		oldarray[2]=73445;
		
		int reverse_array[]=new int[3];
		for(int i=0,k=reverse_array.length-1;i<oldarray.length;i++,k--) {
		
			reverse_array[k]=oldarray[i];
			
		}
		
		System.out.println(Arrays.toString(oldarray));
		System.out.println(Arrays.toString(reverse_array));
		
	}

}
