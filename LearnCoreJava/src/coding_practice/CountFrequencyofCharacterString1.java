package coding_practice;

public class CountFrequencyofCharacterString1 {

	public static void main(String[] args) {
		
		String s = "Java programming java oops";
		
		int totalcount = s.length();
		int totalcount_after_remove = s.replace("a","").length();
		
		int count = totalcount-totalcount_after_remove;
		System.out.println(count);

	}

}
