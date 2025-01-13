package collectionLearning;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet <Integer> evennumber = new HashSet<Integer>();
		evennumber.add(2);
		evennumber.add(4);
		evennumber.add(6);
		
		System.out.println("Hashset: "+evennumber);
		
		//addAll()
		HashSet <Integer> number = new HashSet <Integer>();
		number.addAll(evennumber);
		System.out.println("Hashset: "+number);
		
		//removeAll()
		number.removeAll(evennumber);
		System.out.println("Hashset: "+number);
		
		
		

	}

}
