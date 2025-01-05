package day15;
//we cannot change value of variable, method and class if final keyword is used
class Test{
	final int x=100;  //value of variable is constant
}


public class finalKeyword {

	public static void main(String[] args) {
		Test t = new Test();
		//t.x =200;  //change not possible as x is final variable
		System.out.println(t.x);

	}

}
