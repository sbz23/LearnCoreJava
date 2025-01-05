package day15;

public class TestSuper {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.displayColor();//black (by default printing new value which is from child)
		//we want get old value
		//using super keyword we can invoke immediate parent class variable
		//using super keyword we can invoke immediate parent class method
		//using super keyword we can invoke immediate parent class constructor
		//both parent and child class constructor will be executed by default
		//if we want only
		d.eat();

		Dog d1 = new Dog("elephant");
	}

} 
//overriding of constructor is not possibles
