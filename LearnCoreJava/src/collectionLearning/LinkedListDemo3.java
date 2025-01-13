package collectionLearning;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add("Dog");
		l.add("Cat");
		l.add("Horse");
		
		System.out.println(l);
		l.addFirst("Tiger");
		l.addLast("Monkey");
		System.out.println(l);
		
		System.out.println(l.getLast());
		System.out.println(l.getFirst());
		
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);

	}

}
