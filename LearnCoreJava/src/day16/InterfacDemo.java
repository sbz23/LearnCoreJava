package day16;
//abstraction : hiding implementation but showing only functionality to user
//abstraction can be achieved using interface and abstract class.
//Interface is blueprint of class, and contains final and static variables and abstract methods(allowed default and static method from java 8)
//Abstract method is method which contains signature but not body(unimplemented method)
//methods in interface are public
//interface supports functionality of multiple inheritance
//we can define interface using interface keyword
//a class extends another class, a interface extends another interface but a class implements an interface
//we can create object reference for interface but cannot instantiate interface

interface Shape {
	
	int length=10;  //by default final and static
	int width =20;
	
	void circle();   //abstract method
	
	default void square() {   
		System.out.println("this is square....default method");
	}
	
	static void rectangle() {
		System.out.println("this is rectangle....static method");
	}
	
}



public class InterfacDemo implements Shape {
	
	public void circle() {
		System.out.println("this is circle....abstract method");
	}
	
	void triangle() {
		System.out.println("this is triangle...");
	}

	public static void main(String[] args) {
		//Scenario1
		InterfacDemo iobj = new InterfacDemo();
		iobj.circle(); //abstract
		iobj.square(); //default
	    Shape.rectangle();  //static method can be accessed without object creation but it is created in interface so, interface name needs to be mentioned
	    System.out.println(Shape.length+Shape.width);
	    System.out.println(iobj.length+iobj.width);  //not a good practice to access static variable using object,should access using interface
	    iobj.triangle(); 
	    
	    //Scenario2  //this example of abstraction as we don't know implementation,accessing through interface
		Shape sh = new InterfacDemo();
		sh.circle();
		sh.square();
		//sh.rectangle(); //static method cannot be accessed as we have created object for class
		Shape.rectangle(); //accessed through interface name
		//sh.triangle();  //cannot access, it is created in class not interface
	    
	}


}
//why are we creating abstract method in interface
//initial stages developer's will create interface and abstract methods, once they get full details they will implement using classes
//Selenium WebDriver is a interface
//they are implement by different browser classes



