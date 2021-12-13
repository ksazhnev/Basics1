package arrayListSdet;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	/*
	 * 1) Heterogeneous data is allowed
	 * 2) Insertion order preserved (Index) (Will be printed in the same order)
	 * 3) Duplicate elements are allowed
	 * 4) Multiple nulls allowed
	 */
	public static void main(String[] args) {

		//Declaration can use wrapper class to particular data type
		//ArrayList <Integer> list = new ArrayList <Integer>();
		//ArrayList list = new ArrayList(); //Heterogeneous
		//Can also use Interface List to declalre arraylist it does not matter both are the same
		
		List list = new ArrayList();
		
		//Add elements into arraylist
		list.add(100);
		list.add(10.5);
		list.add("Welcome");
		list.add('a');
		list.add(true);
		list.add(null);
		
		//size of Arraylist
		
		System.out.println("size of arraylist: "+list.size());
		
		//display elements from arraylist
		
		System.out.println(list);
		
		//remove element from array list  index starts from 0
		
		list.remove(5);
		System.out.println(list);
		
		// add element will add at the end of the list list.add()
		
		//add element to specific index, also it is method overloading
		
		list.add(2,"Java");
		
		System.out.println(list);
		
		//read a specific element from array list
		
		System.out.println(list.get(1));
		
		//read individual  all elements 
		
		//enhanced for loop
		for(Object x: list) {
			System.out.println(x);
		}
		
		// for loop
		
		for(int i = 0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
			
			//remove all elements 
			
		list.clear();
		
		System.out.println("size of the elements: " +list.size());
		
		}
	}

}
