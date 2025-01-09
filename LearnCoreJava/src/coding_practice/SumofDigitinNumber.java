package coding_practice;

public class SumofDigitinNumber {

	public static void main(String[] args) {
		int number = 12987545;
		//write code here
		int sum =0;
		for(;number!=0;number/=10) {
			int digit = number %10;
			sum = sum + digit;
		}
		System.out.println(sum);

	}

}
