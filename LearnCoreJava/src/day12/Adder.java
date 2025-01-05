package day12;

public class Adder {

		// Polymorphism --> one thing can have many forms
		//polymorphism can be achived with overloading
		//we can have methods with same name in a class but parameters/order of parameter should be different it is called method overloading
		//
	int a=10,b=20;
		void sum() {
			System.out.println(a+b);
		}
		
		void sum(int x,int y) {
			System.out.println(a+b);
		}
		
		void sum(double x,double y) {
			System.out.println(x+y);
		}
		
		void sum(int x, double y) {
			System.out.println(x*y);
		}
		void sum(double y, int x) {
			System.out.println(x/y);
		}


	}


