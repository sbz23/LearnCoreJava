package day15;

class Bank{
	
	double roi() {
		return 0;
	}
}


class ICICI extends Bank{  //overriding method
	double roi() {
		return 10.5;
	}
	
}

class SBI extends Bank{  //overriding method
	double roi() {
		return 9.5;
	}
	
}


public class MethodOverriding {

	public static void main(String[] args) {
		// overiding is possible only in multiple classes (inheritance)
		//we should not change method signature (name,parameter,return type of method) but body we should change
		//method names are same
		//within single class we can't override thats why we need two classes
		//only with inheritance override concept is possible
		ICICI ic = new ICICI();
		System.out.println(ic.roi());
		
		SBI sb = new SBI();
		System.out.println(sb.roi());
		

	}

}
//Overloading vs Overriding
//overriding is possible only in multiple classes (inheritance)
		//we should not change method signature (name,parameter,return type of method) but body we should change
		//method names are same
		//within single class we can't override thats why we need two classes
		//only with inheritance override concept is possible

//overloading is possible in single and multiple classes
        //we should change method signature
        //method name is same
        //we can overload in single class
        //belongs to polymorphism concept