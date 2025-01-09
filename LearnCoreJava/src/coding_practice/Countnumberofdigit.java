package coding_practice;

public class Countnumberofdigit {

	public static void main(String[] args) {
		int digit = 883533;
		int count=0;
		//write code here
		while(digit!=0) {
			digit/=10;
			count++;
		}
		System.out.println(count);

	}

}
