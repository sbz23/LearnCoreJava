package collectionLearning;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();//default capacity 16, load factor 0.75
		//HashSet hs = new HashSet(100); //initial capacity 100
		//HashSet hs = new HashSet(100, (float)0.90);
		//HashSet <Integer> hs = new HashSet<Integer>();
		
		//add objects or elements into hashset
		hs.add("string");
		hs.add(1000);
		hs.add(10.54);
		hs.add('D');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);
		
		//remove
		hs.remove(true);
		System.out.println("After removing element:n "+hs);
		
		//contains
		System.out.println(hs.contains('D'));
		
		//isEmpty()
		System.out.println(hs.isEmpty());
		
		//Reading objects using for each
		/*for(Object value : hs) {
			System.out.println(value);
		}*/
		
			Iterator it = hs.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next()); 
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
