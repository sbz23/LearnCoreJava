package day9;

public class ReverseString2 {
	public static void main(String[]args) {
		
		//method 2 -- convert String to char array
		String s = "Shubham";
		String rev="";
		
		char ch[]=s.toCharArray();//convert string to character type array
	
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println("Reversed String is :"+rev);
	}

}
