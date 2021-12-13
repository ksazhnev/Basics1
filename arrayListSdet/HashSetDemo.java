package arrayListSdet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	/*
	 * 1) Heterogeneous data is allowed 2) Insertion order is not preserved 3)
	 * Duplicate elements is not allowed 4) Multiple nulls are not allowed/only
	 * single null is allowed
	 *
	 */

	public static void main(String[] args) {

		// HashSet <String> hs = new HashSet <String>();

		// HashSet hs = new HashSet ();

		Set hs = new HashSet();

		// Add elements to the hashset

		hs.add(100);
		hs.add(10.5);
		hs.add("welcome");
		hs.add(null);
		hs.add('A');
		hs.add("Hello");
		hs.add(100); // because it is duplicate it will store one element
		System.out.println(hs);

		System.out.println(hs);

		System.out.println(hs.size());

		// insertion
		// hs.add(2,"Hi"); //incorrect don't have index in HashSet
		hs.add("Hi");
		System.out.println(hs);

		// remove value

		hs.remove(10.5);
		System.out.println(hs);

		// retrieve specific element

		// hs.get(); // not possible

		// contains - true/false

		System.out.println(hs.contains(100));

		// isEmpty(); check is the Hash list is empty true/false

		System.out.println(hs.isEmpty());

		hs.clear();
		
		System.out.println(hs.isEmpty());
		//read values
		
		for ( Object x:hs) {
			System.out.println(x);
		}
		
	}

}
