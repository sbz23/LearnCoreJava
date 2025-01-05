package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	//Hashset--> implemented set interface
	//
	//Heterogeneous data-->allowed
	//insertion order --> not preserved (no indexing)
	//duplicate elements --> not allowed
	//multiple nulls not allowed
	public static void main(String[] args) {
		//Declaration
		HashSet myset = new HashSet();
		//HashSet<String> myset = new HashSet<String>();
		
		//adding elements to hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(null);
		myset.add(100);
		//printing hashset
		System.out.println(myset); 

		//size of hashset
		System.out.println(myset.size());
		//removing element
		myset.remove(10.5); //remove value
		System.out.println("after removing: "+myset);
		
		//insertion is not possible in hashing
		//accessing specific element is also not possible
		//convert hashset to arraylist we can access then
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//read all elements using for each 
		for(Object x: myset) {
			System.out.println(x);
		}
		//iterator
		Iterator <Object> it = myset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//clearing all elements in hashset
		myset.clear();
		System.out.println("After clearing: "+myset);
		
		
		

	}

}
