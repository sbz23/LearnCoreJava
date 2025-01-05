package day3;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var = exp ? result1 : result2
		//ex1
		/*
		 * int a=200,b=100; int res = (a<b) ? a : b; //if expression is true first value
		 * will assign to result //and if first value is false second value will assign
		 * to result System.out.println(res);
		 * 
		 * //ex2 int c=100,d=200; int reslt = (c<d) ? c : d; System.out.println(reslt);
		 */
		
		int person_age=15;
		String result = (person_age>=18) ? "eligible to vote" : "not eligible to vote" ;
		System.out.println(result);

	}

}
