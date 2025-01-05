package day12;

public class CallbyValue {

	public static void main(String[] args) {
		// call by value passing copy of the variable, original value will not be changed
		Test t = new Test();
		int number=100;
		System.out.println("Before method: "+number);
		t.m1(number);
		System.out.println("After method:  "+number);

	}

}
