package Stirng_Arrays;

public class Average_Array {
	
	public static void main(String[] args) {
		
		int nos[]=new int[4];
		nos[0]=17;
		nos[1]=35;
		nos[2]=81;
		nos[3]=42;
		
		double sum=0;
		
		for(int i=0;i<nos.length;i++) {
			
			sum=sum+nos[i];
		}
		
		double average= sum/nos.length;
		System.out.println(average);
		
	}

}
