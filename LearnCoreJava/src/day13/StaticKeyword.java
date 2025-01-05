package day13;

public class StaticKeyword {
  // static keyword applicable for variable and method
	//static methods can access static variable and methods directly without creating any object
	//static can access non static stuff through object
	//non static method can access everything directly
	
	static int a =10;//static variable
	int b=20;
	
	static void m1() {
		System.out.println("This is m1 static method...");
	}
	
	void m2() {
		System.out.println("this is m2 non static method....");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		m1();
		
		StaticKeyword s = new StaticKeyword();
		System.out.println(s.b);
		s.m2();
		
		//meaning of system.out.println(");
		//classname.stringvariable.method();
		//system is predefined class
		//out is printstream type static variable
		//print and println are method belong printstring class
		

	}

}
