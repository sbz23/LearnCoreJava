package collectionLearning;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		String animals[] = {"Dog", "Cat" , "Goat"};
		
		for(String value : animals) {
			
			System.out.println(value);
			
		}
		ArrayList al = new ArrayList(Arrays.asList(animals));
		System.out.println(al);
		

	}

}
