package day12;

public class OverLoadMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadMainMethod ob = new OverLoadMainMethod();
		ob.main(100);
		ob.main(10,20);

	}
	
	void main(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);

	}
	
	void main(int a,int b) {
		System.out.println("Sum: "+(a+b));

	}

}
