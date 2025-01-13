package collectionLearning;

import java.util.Iterator;
import java.util.LinkedList;

//when insertion and deletion operations are more arraylist is not preffered because it will cause shifting of elements and performance issue
// linkedlist we have nodes
//when more number of retrival linkedlist is not preffered because it will refer to all node will increase time
public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add("Selenium");
		ll.add(483573);
		ll.add(54387.22);
		ll.add('A');
		ll.add(true);
		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		ll.remove(3);
		System.out.println("After removing, new list"+ll);
		

		//ll.remove(483573); //index out of bound only index we can remove
		//System.out.println("After removing, new list"+ll);
		
		ll.add(3, "Myjava");
		System.out.println("After insertion: "+ll);
		
		System.out.println(ll.get(3));
		
		ll.set(5, 'X');
		System.out.println("After replacing: "+ll);
		
		System.out.println(ll.contains("Myjava"));//true
		System.out.println(ll.contains("c#"));//false
		
		//isEmpty()
		System.out.println(ll.isEmpty()); //false
		
		/*for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i)); 
		}
		
		 System.out.println("Reading elements using foreach loop");
		 for(Object x : ll) {
			System.out.println(x);
		}
		 */
		 Iterator it = ll.iterator();
			while(it.hasNext()) {
				System.out.println(it.next()); 
			}
			
		
	}

}
