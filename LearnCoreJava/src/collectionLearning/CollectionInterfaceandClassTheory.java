package collectionLearning;
//collection is interface
//collections is a class from java.util package 
//it provide certain number of methods to do action on collection object

//collection interface is implemented by List interface, Set interface, Queue interface

//list is child interface of collection
//insertion order preserved
//duplicates allowed
//classes that implements list : arraylist,linkedlist,vector 

//set is child interface of collection
//insertion order not preserved
//duplicates not allowed
//classes that implements set : Hashset,LinkedHashset

//Queue is child interface of collection
//prior to processing, FIFO concept
//priority implements queue



//Map interface : it is not child interface of collection interface
//key-value pair
//classes that implements map : hashmap, linkedhashmap hashtable

//methods available in collection interface
// add(object o)
// addAll(collection c)
// remove(object o)
// removeAll(collection c)
// retainAll(collection c)  --> except these objects all will be removed
// clear()
// isempty()
// size()
// contains(object o)
// containsAll(collection c)
// toArray(collection c)

//methods available in list
// add(index,object)
// addAll(index, collection c)
// remove(index)
// get(index)
// set(index,object)


//Arraylist
// ArrayList <String> al = new ArrayList   --> for specific type of object homogenous 
// we dont have sort method in arraylist
// collections.sort(al)
// collections.shuffle(al)


//Linkedlist
//it has some additional elements from dequeue
//most of the time linkedlist is used to create stack and queue FILO-->Stack, FIFO-->Queue
//allows duplicate
//insertion order preserved
//linked nodes --> every node has 3 parts --> previous node address, element, next node address
//linkedlist specific methods:
//addFirst()
//addLast()
//removeFirst()
//removeLast()
//getFirst()
//getLast()


//Hashset
//child of set interface
//duplicates not allwoed
//insertion order not preserved
//hashcode is concept used to store elements
//heterogenous data supported
//nulls supported
//searching faster
//default size is 16
//load factor/fill ratio : 0.75
//means when 75% of location is filled it will create new object
//hashset doesn't have any method of own all methods of set interface are present


//LinkedHashSet
//insertion order is preserved -- only difference from hashset

//Queue
//child interfaces are dequeue, blocking queue, blocking queue
//child classes are priority queue and linkedlist
//if you want to represent group of elements prior to processing then we use queue interface
//FIFO
//linkedlist and priority queue :insertion order preserved
//                               duplicate data allowed
//                               heterogenous data is allowed in linkedlist but not in priority queue
//add() -->if failed -->exception
//offer()-->if failed -->null
//element()-->if failed -->exception
//peak()-->if failed -->null
//remove()-->exception
//poll()-->null



//Map Interface
//hashmap and hastable implements map
//key-value pair map is used
//every key is object and every value is object
//map : duplicate keys are not allowed
//one key and value pair is called entry
//map is collection of entry


//Hashmap
//insertion order not preserved
//duplicate keys not allowed
//duplicate values allowed
//null key allowed once
//prefered when more search operations
//methods:
//put(key,value) --> add pair
//putAll(mapobject) 
//get(key)  -->get value
//remove(key) --> remove pair
//containsKey(key) --> key present or not
//containsValue(value)
//isEmpty()
//size()
//pair()
//keySet() -->return set objects with list of keys
//Values() --> return all values return collection
//entrySet()--> return entry set as set 
//Entry Interface --> interface in hashmap class -->getKey. getValue, setValue



//HashTable
//key value pair
//it is synchronized  -->main difference b/w hashmap and hashtable
//at a time one thread can access method
//thread-safe
//performance is poor compaired to hashmap
//null not accepted as key or value
//
//

































































public class CollectionInterfaceandClassTheory {
	public static void main(String[] args) {	
	}
}
