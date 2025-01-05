package day17;

public class WrapperClasses {

	public static void main(String[] args) {
		
		int i = 10; //primitive
		double d = 1.233;
		char c ='l';
		boolean bool = true;
		
		//converting primitive data to object is autoboxing
		Integer iobj = i;  //object
		Double dobj=d;
		Character cobj=c;
		Boolean bobj=bool;
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		//converting object type data to primitive is unboxing
		int intvalue=iobj;
		double doublevalue =dobj;

	}

}
