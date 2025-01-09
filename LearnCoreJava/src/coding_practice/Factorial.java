package coding_practice;

public class Factorial {

	public static void main(String[] args) {
		// 5! = 5 * 4 * 3 *2 *1
		int num = 5;
		//write code here
		int factorial =1;
		for(int i=1;i<=num;i++) {
			factorial = factorial * i;  //1 //2 //6 ////24 //120
		} 
		System.out.println(factorial);

	}

}
