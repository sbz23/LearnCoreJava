package day14;
//hierarchyinheritance
class Parent {
	int a;
	void display(int a) {
		System.out.println(a);
	}
}

class Child1 extends Parent{
	int b;
	void show(int b) {
		System.out.println(b);
	}
}

class Child2 extends Parent{
	int c;
	void print(int c) {
		System.out.println(c);
	}
}





public class HierarchyInheritance {

	public static void main(String[] args) {
		
		Child1 c1=new Child1();
		c1.display(100);
		c1.show(220);
		
		Child2 c2=new Child2();
		c2.display(300);
		c2.print(520);

	}

}
