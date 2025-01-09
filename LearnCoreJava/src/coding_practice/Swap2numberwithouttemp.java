package coding_practice;

public class Swap2numberwithouttemp {

	public static void main(String[] args) {
		int a =20;
		int b= 30;
		int c =40;
		System.out.println("The value of a:"+a     +"    The value of b:"+b);
		
		//write code here
		a=a+b;//50
		b=a-b;//20
		a=a-b;//30
		System.out.println("The value of a:"+a     +"    The value of b:"+b);

	}

}
