package coding_practice;

import java.util.Scanner;

public class palindromenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number=sc.nextInt();
		int temp= number;
		int rev=0;
		for(;number!=0;number/=10) {
			int digit = number%10;  //7  5
			rev = (rev*10) + digit; // 7  75
		}
		if(rev==temp) {
			System.out.println("PALINDROME NUMBER");
		}
		else {
			System.out.println("NOT PALINDROME NUMBER");
		}

	}

}
