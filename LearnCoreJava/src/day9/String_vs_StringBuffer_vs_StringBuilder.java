package day9;

public class String_vs_StringBuffer_vs_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mutable-can change
		//string-->immutable
		String s="welcome";
		s.concat("to java");
		System.out.println(s);//welcome
		
		StringBuffer sb = new StringBuffer("welcome");
		sb.append("to java");
		System.out.println(sb);//String buffer is mutable
		

		StringBuilder sb2 = new StringBuilder("welcome");
		sb2.append("to java");
		System.out.println(sb2);//String builder is mutable
	
		//
	}

}
