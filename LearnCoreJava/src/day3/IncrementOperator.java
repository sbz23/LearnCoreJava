package day3;

public class IncrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a =10; //a= a+1; a++; System.out.println(a);
		 */
		
		//post increment
		int a =10;
		int res =a++;  //first it will store in variable then get incremented
		System.out.println(res);
		
		//pre increment
		int b =10;
		int reslt = ++b; //first increment then it will get stored in variable
		System.out.println(reslt);
		
		

	}

}
