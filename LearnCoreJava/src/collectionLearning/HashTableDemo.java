package collectionLearning;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		
		//Hashtable t = new Hashtable(); //capacity 11 load factor 0.75
		Hashtable <Integer, String> t = new Hashtable <Integer, String>();
		
		t.put(101,"John");
		t.put(102,"Scott");
		t.put(103, "Tiger");
		
		System.out.println(t);
		
		System.out.println(t.get(103));
		t.remove(103);
		System.out.println(t);
		System.out.println(t.containsKey(101));
		
		System.out.println(t.containsValue("John"));
		
		System.out.println(t.isEmpty());
		
		System.out.println(t.keySet());
		System.out.println(t.values());
		
		for(int i : t.keySet()) {
			System.out.println(i+"  "+t.get(i));
		}
		
		//Entry specific method
		for(Map.Entry entry : t.entrySet()) {
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		//iterator
		Set s = t.entrySet();
		Iterator itr= s.iterator();
		while(itr.hasNext()) {
			Map.Entry e = (Entry) itr.next();
			System.out.println(e.getKey()+"    "+e.getValue());
			
		}
		

	}

}















