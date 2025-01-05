package day19;

import java.util.Scanner;

//Exception is an event which will cause program termination due to invalid input
//Errors are logical and syntactical

//types of exceptions : checked and unchecked
//checked will identified by complier(Interrupted Exception,IO,FileNotFound)   
//unchecked --> Not identified by java compiler(NullPointerException, Arithmetic, ArrayIndexOutOfBounds)
//try and catch block -- need to use both together
//All exceptions are classes part of java.lang package
public class ExceptionDemo {

	public static void main(String[] args) {
	
		System.out.println("Program is started.......");
		Scanner sc = new Scanner(System.in);
		
		//Example 1 
//		System.out.println("Enter a number: ");
//		int num = sc.nextInt();
//		System.out.println(100/num);  //ArithmeticException
		
		//Example 2
//		int a[]=new int[5];
//		System.out.println("Enter the position(0-4): ");
//		int pos = sc.nextInt();
//		
//		System.out.println("Enter the value: ");
//		int value = sc.nextInt();
//		
//		a[pos]=value;  //ArrayIndexOutOfBoundsException
//		
//		System.out.println(a[pos]);
		
		
		//Example 3 
//		String s ="welcome";
//		int num = Integer.parseInt(s); //NumberFormatException
//		System.out.println(num);
		
		//Example 4
		String s=null;  //NullPointerException
		System.out.println(s.length());
		
		
		System.out.println("Program is completed.......");
		

	}

}
