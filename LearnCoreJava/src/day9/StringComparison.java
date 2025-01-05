
package day9;



public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="welcome";
		String s2="welcome";
		//case1
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//case 2
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		
		System.out.println(s3==s4); //== used for comparing objects
		System.out.println(s3.equals(s4));//equals() used for comparing values
		
		//case3
		String s5="abc";
		String s6=new String("abc");
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		
		//case4
		String s7="abc";
		String s8=new String("abc");
		String s9=s8;
		
		System.out.println(s7=s8);
		System.out.println(s7.equals(s8));
		System.out.println(s7==s9);//objects are same
		System.out.println(s8.equals(s9));//values of object are same
		
		
		
		
		
	}

}
