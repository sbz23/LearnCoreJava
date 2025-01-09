package coding_practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 23456;
		int rev =0;
		//write code here
		while(num!=0) {
			int digit = num %10;  //6  //5 //4
			rev = (rev*10) + digit; //6 //65  //654
			num=num/10; //2345   //234 
		}
		System.out.println(rev);

	}

}
