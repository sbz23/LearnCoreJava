package collectionLearning;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("F");
		l.add("T");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList new_l = new LinkedList();
		new_l.addAll(l);
		System.out.println(new_l);
		
		new_l.removeAll(l);
		System.out.println(new_l);
		
		Collections.sort(l);
		System.out.println("After sorting : "+l);
		
		//reverse sort
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Elements in the arraylist after sorting in reverse order: "+l);

	}

}
