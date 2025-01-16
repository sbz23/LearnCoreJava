package coding_practice;

public class CountFrequencyofCharacterString3 {

	public static void main(String[] args) {
		String word = "ashuasdfarregjhajkljkjankkhkasdfgaa";
		char character = 'a';
		word = word.toLowerCase();
		int count =0;
		
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)== character) {
				count ++;
			}
		}
		System.out.println(count);

	}

}
