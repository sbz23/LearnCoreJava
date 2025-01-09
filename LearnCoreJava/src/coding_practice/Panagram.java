package coding_practice;

public class Panagram {

	public static void main(String[] args) {
		// panagram is string which contains all english alphabet
		String input ="The quick brown fox jumps over the lazy dog";
		input = input.toLowerCase();
		
		boolean result = checkpangram(input);
		if(result) {
			System.out.println("its pangram");
		}
		else {
			System.out.println("its not pangram");
		}
	

	}
	
	static boolean checkpangram(String input) {
		if(input.length()<26) {
			return false;
		}
		for(char i ='a';i<='z';i++) {
			if(input.indexOf(i)<0) {
				return false;
			}
		}
	return true;	
	}
}
