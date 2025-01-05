package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {
	//Hashmap implemented class from map interface
	//data is stored in key-value pairs
	
	//Heterogeneous data : allowed
	//insertion order : not preserved
	//duplicate elements: not allowed(key should not be duplicate)
	//multiple null not allowed

	public static void main(String[] args) {
		// Declaration
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "JOhn");
		hm.put(102, "Scott");
		hm.put(103, "marry");
		hm.put(104, "david");
		hm.put(102, "Albert");
		System.out.println(hm);
		System.err.println("Size of hashmap: "+hm.size());
		
		//remove pair
		hm.remove(104);
		System.out.println("after removing pair : "+hm);
		
		//access value of key
		System.out.println(hm.get(102));
		
		//get all keys from hashmap
		System.out.println(hm.keySet());
		
		//get all values
		System.out.println(hm.values());
		
		//key and value both
		System.out.println(hm.entrySet());
		
		//reading data from hashmap
		for(int k:hm.keySet()) {
			System.out.println(k+"     "+hm.get(k) );
		}
		
		
		//Using iterator
		Iterator<Entry<Integer,String>>it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry entry= it.next();
			System.out.println(entry.getKey()+"      "+entry.getValue());
		}
		
		hm.clear();
	
		

	}

}
