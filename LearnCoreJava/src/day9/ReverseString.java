package day9;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method1
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.next();
		String rev ="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
