package day5;

public class AssignmentReverseNumber {

	public static void main(String[] args) {
	 int num =834872;
	 int rev =0;
	 while(num!=0) {
		 int digit = num%10;
		 rev =(rev*10) + digit;
		 num/=10;
	 }

	 	System.out.println(rev);
	
	}
}
	
