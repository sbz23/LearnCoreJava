package day3;

public class DecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10; 
		//a= a-1; 
		a--;
		System.out.println(a);
		 
		
		//post decrement
		int b =10;
		int res =b--;  //first it will store in variable then get incremented
		System.out.println(res);
		
		//pre decrement
		int c =10;
		int reslt = --c; //first increment then it will get stored in variable
		System.out.println(reslt);

	}

}
