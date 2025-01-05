package day15;

public class Animal {
	
	String color = "White";
	
	void eat() {
		System.out.println("eating..");
	}
	
	Animal(){
		System.out.println("This is animal..");
	}
	
	Animal(String name){
		System.out.println(name);
	}
	
}

class Dog extends Animal{
	
	String color ="Black";
	
	void displayColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	void eat() {
		System.out.println("eating bread..");
		super.eat();
	}
	
	Dog(){
		super();//it will try to invoke parent class constructor is is optional, even not mentioned still it will invoke parent class constructor
		System.out.println("This is dog...");
	}
	
	Dog(String name){
		super(name);
	}
	
}


