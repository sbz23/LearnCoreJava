package day5;

public class AssignmentCountNumberofEvenOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1445894;
		int even = 0;
		int odd =0;
		while(number!=0) {
			int digit = number%10;
			if(digit%2==0) {
				even++;
			}
			else {
				odd++;
			}
			
			number=number/10;
		}
		System.out.println(even);
		System.out.println(odd);

	}

		
  }
	




