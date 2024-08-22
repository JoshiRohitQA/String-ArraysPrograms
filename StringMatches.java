package Stirng_Arrays;

public class StringMatches {
	
	public static void main(String[] args) {
		
		String a="ramu";
		
		System.out.println(a.matches("r(.*)"));// starts with r
		
		System.out.println(a.matches("...."));// 4 letters in string
		
		System.out.println(a.matches("(.*)u"));// ends with u
		
		System.out.println(a.matches("(.*)m(.*)"));// has m in string
		
	}

}
