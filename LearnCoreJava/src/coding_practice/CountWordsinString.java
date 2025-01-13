package coding_practice;

public class CountWordsinString {

	public static void main(String[] args) {
		
		String s = "This is a sample string with several words";
		int count =1;
		for(int i=0;i<s.length();i++) {
		if( (s.charAt(i)==' ')  && (s.charAt(i+1)!=' ')) {
			count++;
		}
		

	}
		System.out.println(count);
	}
}
