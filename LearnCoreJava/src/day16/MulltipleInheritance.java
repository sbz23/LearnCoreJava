package day16;

public class MulltipleInheritance implements I1,I2{
	
	public void m1() {
		System.out.println("this is m1");
	}
	
    public void m2() {
    	System.out.println("this is m2");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulltipleInheritance mi = new MulltipleInheritance();
		mi.m1();
		mi.m2();
	   System.out.println(mi.x);

	}

}
//abstract class vs Interface
//1.abstract keyword                                                              1.interface keyword
//2.subclasses extends abstract class                                             2.subclasses implements interfaces
//3.abstract class can have implemented methods and 0 or more abstract methods    3.Java8 onwards interfaces can have default and static methods
//4.we can extend only one abstract class                                         4.we can implement multiple interfaces
