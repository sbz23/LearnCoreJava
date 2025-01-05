package day14;


class Abc{
	
}

class Xyz{
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		//multiple inheritance we cannot implement using class concept
		//we can achive that by interface concept
		//we cannot extend multiple classes because it creates ambiguity
		//in java every class extends from object class by default
		Abc obj =new Abc();
		obj.getClass();
		Xyz obj1 = new Xyz();
		obj1.getClass();
		
		

	}

}
// public static void main(String[] args){
//    public : is access modifier (public ,private ,protected, default) --> defines scope of method/class 
//    static : main method should be directly accessible without creating object so it directly called by JVM
//    void : returns nothing
//    String[] : string type of array   args: its a variable
//}
//  public static void main(String[] a) : valid
//  public static void main(String a[]) : valid
//  void main (String[] args) public static : invalid
//  public static void main(int[] a) : invalid
//  static public void main(String []args) : valid
//  static void public main(String[]args) : invalid (return type should be before main)
//
//