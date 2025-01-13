package collectionLearning;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		HashSet <Integer> set1 = new HashSet<Integer>();
		//Union, Intersection, Difference
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		System.out.println("HashSet1: "+set1);
		
		HashSet <Integer> set2 = new HashSet<Integer>();
		//Union, Intersection, Difference
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println("HashSet2: "+set2);
		
		//Union 
		set1.addAll(set2);
		System.out.println("Union: "+set1);
		
		//intersection
		set1.retainAll(set2);	
		System.out.println("Intersection: "+set1);
		
		//differnce
		set1.removeAll(set2);
		System.out.println("Difference: "+set1);
		
		//subset
		set1.containsAll(set2);
		System.out.println("Subset: "+set1);
		
	}

}
