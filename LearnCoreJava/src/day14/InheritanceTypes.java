package day14;

 class A {
	 
	 int a;
	 void display() {
		 System.out.println(a);
	 }
 }
 
 
 class B extends A{  //single inheritance
	 
	 int b;
	 void show() {
		 System.out.println(b);
	 }
 }
 
 
 class 	C extends B{ //multilevel inheritance
	 int c;
	 void print() {
		 System.out.println(c);
	 }
 }




public class InheritanceTypes {

	public static void main(String[] args) {
		/*B b = new B();
		b.a=10;
		b.display();
		b.b=120;
		b.show();*/
		
		C c = new C();
		c.a=100;
		c.b=200;
		c.c=300;
		
		c.display();
		c.show();
		c.print();

	}

}
