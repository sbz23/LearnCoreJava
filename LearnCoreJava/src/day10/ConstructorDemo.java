package day10;
//Constructor is special method which is used to intiate object, it is automatically called when an object is created.
public class ConstructorDemo {

	int x;
	int y;
	
	ConstructorDemo(){//default constructor - no parameters -we cannot have 2 default constructors
		x=10;
		y=12;
	}
	
	ConstructorDemo(int a, int b){ //parameterized constructor
		x=a;
		y=b;
		
	}
	
	void sum() {
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorDemo cd = new ConstructorDemo();//default constructor will be invoked
		ConstructorDemo cd = new ConstructorDemo(100,200);//parameterized constructor will be invoked
		cd.sum();
       //invoking multiple constructor with single object is not possible
	}

}
