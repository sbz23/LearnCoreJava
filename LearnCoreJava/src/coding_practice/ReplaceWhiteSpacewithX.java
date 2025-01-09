package coding_practice;

public class ReplaceWhiteSpacewithX {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		input=input.toLowerCase();
		
		char inputArray[] = input.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(char currentcharacter : inputArray) {
			if(currentcharacter == ' ') {
				sb.append('x');
			}
			else {
				sb.append(currentcharacter);
			}
		}
		System.out.println("Output is: "+ sb.toString());
		
	}

}
