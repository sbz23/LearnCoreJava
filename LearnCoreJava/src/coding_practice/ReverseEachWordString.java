package coding_practice;

public class ReverseEachWordString {

	public static void main(String[] args) {
		String str ="Welcome to java";
		
		String words[] = str.split(" ");
		String rev="";
		
		for(String s : words) {
			String reverseword="";
			for(int i=s.length()-1;i>=0;i--) {
				reverseword= reverseword + s.charAt(i);
			}
			
			rev = rev+reverseword+" ";
		}
		System.out.println(rev);
	}

}
