package coding_practice;

import java.util.HashMap;

public class CountFrequencyofCharacterString2 {

	public static void main(String[] args) {
		// Map is associative array, key and value pair, duplicates not allowed
		//Time complexity is constant in searching and insertion
		String input = "madam";
		//output : m=2, a=2,d=1
		HashMap<Character,Integer> f = new HashMap<Character,Integer>();  
		char inputArray[] = input.toCharArray();
		
		for(char character : inputArray) {
		
			f.put(character,f.getOrDefault(character,0)+1);	
			
		}
		for(char c :f.keySet()) {
			System.out.println(c+ "  "+f.get(c));
		}
		

	}

}
