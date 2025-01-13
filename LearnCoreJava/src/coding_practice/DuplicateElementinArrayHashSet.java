package coding_practice;

import java.util.HashSet;

public class DuplicateElementinArrayHashSet {

	public static void main(String[] args) {
		String arr[] = {"java", "c","c#","python","java"};
		HashSet <String>h = new HashSet<String>();
		
		for(String l : arr) {
			if(h.add(l)==false) {
				System.out.println("Found Duplicate element: "+l);
			}
		}
		

	}

}
