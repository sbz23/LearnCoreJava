package day5;

public class AssignmentSumofDigitinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int num = 746347;
	  int sum=0;
	  while(num!=0) {
		  int digit = num%10;
		  sum = sum+digit;
		  num/=10;
	  }
	  System.out.println(sum);
	}

}
