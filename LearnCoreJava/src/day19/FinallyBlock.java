package day19;

public class FinallyBlock {

	public static void main(String[] args) {


		String s ="welcome";
		try {
		System.out.println(s.length());
		}catch(ArithmeticException e) {
			System.out.println("Exception handled");
			
		}
		
		finally{   //optional block it will always get executed if there is exception or no exception
			//whenever we want to execute set of statements always without depending on exception we use finally block
			//
			System.out.println("Entered into finally block");
		}

	}

}
