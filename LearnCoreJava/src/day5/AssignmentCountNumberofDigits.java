package day5;

public class AssignmentCountNumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number=12345689645324353L;
		int count=0;
	    while(number!=0) {
	    	number=number/10; //1234568,123456,12345,1234,123,12,1,0
	    	count++; //1,2,3,4,5,6,7,8
	    }
		System.out.println(count);//8

	}

}
