package arrayListSdet;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Can restrict type of data Ex: Integer is key and String is the value
		//HashMap<Integer, String> hm = new HashMap<Integer, String>();
		//HashMap hm = new HashMap();
		
		Map hm = new HashMap(); // can use Interface to make the declaration
		
		//Adding pairs to hashmap..(pair=key, value)
		
		hm.put(101,"David");
		hm.put(102,"James");
		hm.put(103,"Mary");
		hm.put(104,"Garry");
		hm.put(101,"Bradd"); //is you add a duplicate key it will replace old value with a new 
		//value
		 
		
		
		System.out.println(hm); //{101=Bradd, 102=James, 103=Mary, 104=Garry}

		//remove 
		
		hm.remove(104); //key 
		System.out.println(hm);
		
		//extract value of a key
		
		System.out.println(hm.get(103));
		
		
		
// print only key from the has Map keySet(); will return all keys from the hash map
		System.out.println(hm.keySet());
		
		for(Object k: hm.keySet()) {
			System.out.println(k);
		}
		
		//print only values from the hash map
		
		for(Object k: hm.keySet()) {
			System.out.println(hm.get(k));
		}
		
		// print keys with values
		for(Object k: hm.keySet()) {
			System.out.println(k+"  "+hm.get(k));
		}
		//clear hashmap
		
		hm.clear();
		System.out.println(hm);
	}

}
