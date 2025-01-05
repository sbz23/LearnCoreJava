package day12;

public class CallbyReference {

	public static void main(String[] args) {
		// Call by reference
		Test test = new Test();
		
		test.number=100;
		
		System.out.println("Value Before method "+test.number);
		
		test.m2(test);
		
		System.out.println("Value After method  "+test.number);

	}

}
