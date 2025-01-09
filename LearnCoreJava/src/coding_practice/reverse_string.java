package coding_practice;

import java.util.Scanner;

class reverse_string{
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.next();  //shushdshd
		String rev ="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("The reversed String is: "+rev);
		
	}
}