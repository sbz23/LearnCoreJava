package day11;

public class Greetings {
	
	//no parameter no return value
	void m1() {
		System.out.println("Hello....");
	}
	
	//no parameters but returns value
	
	String m2() {
		return ("Helllo how are you");
	}
	
	//takes parameters but no return value
	void m3(String name) {
		System.out.println("Hello "+name);
	}
	
	//takes parameter and returns value
	String m4(String name){
		return("Hello "+name);
	}

}
