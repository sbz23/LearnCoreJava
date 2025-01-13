package collectionLearning;

import java.util.PriorityQueue;

public class QueueDemo1 {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue();
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		
		System.out.println(q);
		
		//get head element  element() peak()
		System.out.println(q.element());
		System.out.println(q.peek());
		
		//remove element from queue remove()   poll()
		System.out.println(q.remove());
		System.out.println(q);
		//System.out.println(q.poll());

	}

}
