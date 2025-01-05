package day12;

public class PassingParamsToMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main method is accepting string array type of parameter
		//we can pass parameter to main only in run time -->run configration-->arguments
		for(String s:args) {
			System.out.println(s);
		}

	}

}
