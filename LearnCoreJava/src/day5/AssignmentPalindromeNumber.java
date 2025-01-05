package day5;

public class AssignmentPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=75257;
		int temp = number; //12345
		int rev = 0;
		while(temp!=0) {
			int digit = temp%10;  //5,4,3,2,1
			rev = (rev*10)+digit; //5,54,543,5432,54321,
			temp=temp/10; //1234,123,12,1,0
		}
		//System.out.println(rev);
		if(number==rev) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome ");
		}
		

	}

}
