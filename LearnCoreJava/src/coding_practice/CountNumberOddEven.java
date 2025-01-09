package coding_practice;

public class CountNumberOddEven {

	public static void main(String[] args) {
		int number = 783438472;
		int even_count=0;
		int odd_count=0;
		for(;number!=0;number/=10) {
			int digit = number%10;
			if(digit%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			
			
		}
		System.out.println(even_count);
		System.out.println(odd_count);

	}

}
