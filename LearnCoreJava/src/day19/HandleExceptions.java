package day19;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		
		System.out.println("Program is started.......");
		Scanner sc = new Scanner(System.in);
		
		//Example 1 
//		System.out.println("Enter a number: ");
//		int num = sc.nextInt();
//		try {
//		System.out.println(100/num);  //ArithmeticException
//		}
//		catch(ArithmeticException e) {
//			System.out.println("Invalid data provided");
//			System.out.println(e.getMessage());
//		}
		
		//Example 2
		int a[]=new int[5];
		System.out.println("Enter the position(0-4): ");
		int pos = sc.nextInt();
		
		System.out.println("Enter the value: ");
		int value = sc.nextInt();
		try {
		a[pos]=value;  //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position..");
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("Program is completed.......");

	}

}
