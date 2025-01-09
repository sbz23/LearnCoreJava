package coding_practice;

public class ReplaceVowelwithX {

	public static void main(String[] args) {
		String input = "Shubham";
		input=input.toLowerCase();
		
		char inputArray[] = input.toCharArray();
		
		StringBuilder result = new  StringBuilder();
		for(char currentCharacter :input.toCharArray()) {
			if(currentCharacter=='a' || currentCharacter=='e' || currentCharacter=='i' || currentCharacter=='o' 
					|| currentCharacter =='u') {
				
				result.append('x');
				
			}
			else {
				result.append(currentCharacter);
			}
		}
		
		System.out.println(result.toString());

	}

}
