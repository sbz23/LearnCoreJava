package day7;

import java.util.Scanner;

public class FindNumberofDuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]= {29,44,55,67,89,29,02};
		System.out.println("Enter a number from array: ");
		int num = sc.nextInt();
		int count =0;
		for(int x : a) {
			if(x==num) {
				count++;
			}
			
		}
		System.out.println("count of "+ num +" is :"+ count);
	}
		

}
