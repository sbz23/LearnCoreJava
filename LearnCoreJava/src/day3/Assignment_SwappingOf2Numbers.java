package day3;

public class Assignment_SwappingOf2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b =20;
		System.out.println("old value of a is: "+a);
		System.out.println("old value of b is: "+b);
		
		int c = b;
		b=a;
		a=c;
		System.out.println("new value of a is: "+a);
		System.out.println("new value of b is: "+b);
		
		
		//without using third temporary variable
		int x = 30;
		int y = 20;
		System.out.println("Before swap: x= "+x +",y= "+y);
		x=x+y; //50
		y=x-y; //30
		x=x-y; //20
		System.out.println("After swap: x= "+x +",y= "+y);
		

	}

}
