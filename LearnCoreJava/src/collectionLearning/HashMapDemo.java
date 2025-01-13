package collectionLearning;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap m = new HashMap();
		
		HashMap <Integer, String> m = new HashMap <Integer, String>();
		
		m.put(101, "john");
		m.put(102, "david");
		m.put(103, "scott");
		m.put(104, "mary");
		m.put(105, "tyre");
		
		System.out.println(m);
		
		System.out.println(m.get(104));
		
		m.remove(104);
		System.out.println(m);
		
		System.out.println(m.containsKey(102));
		System.out.println(m.containsKey(104));
		
		System.out.println(m.containsValue("shubham"));
		System.out.println(m.containsValue("john"));
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		System.out.println(m.entrySet());
		
		for(Object i:m.keySet()) {
			System.out.println(i+"  "+m.get(i));
		}
		
		
		//entry methods
		//***************
		for(Map.Entry entry :m.entrySet()){
		
			System.out.println(entry.getKey()+"   "+entry.getValue());;
			
		}
		

	}

}
