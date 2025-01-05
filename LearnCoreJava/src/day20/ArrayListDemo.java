package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList mylist = new ArrayList();
		//List mylist = new ArrayList();
		//ArrayList <Integer> mylist = new ArrayList<Integer>();
		//ArrayList <String> mylist = new ArrayList<String>();
		
		//Adding data into arraylist
		mylist.add(100);
		mylist.add(10.8);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of arraylist
		System.out.println("Size of arraylist is: "+mylist.size());
		
		//Printing arraylist
		System.out.println("Printing data from arraylist: "+mylist);
		
		//Remove elements from arraylist
		mylist.remove(5);
		System.out.println("After removing: "+mylist);
		
		//Insert new element in arraylist
		mylist.add(3, "newvalue");
		System.out.println("After insertion" +mylist); 
		
		//modifying/replace the element in arraylist
		mylist.set(3, "java");
		System.out.println("After modfication: "+mylist);
		
		//access specific element from arraylist
		System.out.println(mylist.get(2));
		
		//read all elements from arraylist
		//1st approch normal for loop
//		for(int i=0;i<mylist.size();i++) {
//			System.out.println(mylist.get(i));
//		}
//		//2nd approch for each loop
//		for(Object x: mylist) {
//			System.out.println(x);
//		}
//		
		//using iterator 3rd approch
		Iterator <Object> it = mylist.iterator(); 
		while(it.hasNext()){//when using iterator while loop is preffered as we dont know number of elements in arraylist
			System.out.println(it.next());
		}
		
		//checking arraylist is empty or not
		System.out.println(mylist.isEmpty()); //false as arraylist is not empty
		
		//remove all data from arraylist  -->clear()
		ArrayList mylist2 = new ArrayList();
		mylist2.add('A');
		mylist2.add(true);
		mylist2.add(100);
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements: "+mylist);
		
		
			
		
		
		
		
		
		
		
		
		
	}

}
