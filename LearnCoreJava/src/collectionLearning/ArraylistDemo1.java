package collectionLearning;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistDemo1 {

	public static void main(String[] args) {
		
		//Declare ArrayList
		ArrayList al = new ArrayList();
	//	ArrayList <Integer> al = new ArrayList();
	//	ArrayList <String> al = new ArrayList();
		//List al = new ArrayList();
		
		//add new elements to arraylist
		al.add(1000);
		al.add("Data");
		al.add(15.55);
		al.add('a');
		al.add(true);
		
		System.out.println(al);
		
		//size()
		System.out.println("Size of arraylist is : "+al.size());
		
		//remove()
		//al.remove(1);
		al.remove("Data");
		System.out.println("After removing element: "+al);
		
		//insert a new element
		al.add(2,"python");
		System.out.println("After insertion: "+al);
		
		//reterive specific value
		System.out.println(al.get(2));
		
		//change element/replace
		al.set(2, "java");
		System.out.println("After replacing: "+al);
		
		//search - Contains()
		System.out.println(al.contains("java"));//true
		System.out.println(al.contains("c#"));//false
		
		//isEmpty()
		System.out.println(al.isEmpty()); //false
		
		//read the data : 3 approches for loop,for-each loop, iterator
		//System.out.println("Reading elements using for loop");
		/*for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i)); 
		}*/
		
		/* System.out.println("Reading elements using foreach loop");
		 * for(Object x : al) {
			System.out.println(x);
		}*/
		
		System.out.println("Reading elements using iterator method");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
