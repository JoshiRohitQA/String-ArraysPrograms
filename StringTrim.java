package Stirng_Arrays;

public class StringTrim {
	public static void main(String[] args) {
		String a = "my name is rohit";
		String b = " my name is roiht  ";
		System.out.println(a.trim());
		System.out.println(b.trim());
		
		String name = "Abhishek";
		String name1 ="abhishek";
		
		System.out.println(name.equals(name1));
		
		System.out.println(name.concat(" Kumar Tiwari"));
		
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(a.replace(" ", ""));
		
	}

}
