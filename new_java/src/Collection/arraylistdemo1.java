package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylistdemo1 {
	public static void main(String[] args) {
		// Daeclare array List 
		
		//ArrayList <Integer>al = new ArrayList<Integer>();
		//ArrayList <String>al = new ArrayList<String>();
		//List al= new ArrayList();
		ArrayList al= new ArrayList();
		
		//Add new elements to arrayList
		al.add(100);
		al.add("Rishabh");
		al.add("Java");
		al.add(1.15);
		al.add(true);
		
		System.out.println("print all values of ArrayList"+al);
		
		// check size of arraylist
		
		System.out.println(al.size());
		
		//Remove elements to arrayList
		
		//al.remove(1);
		//al.remove("Java");
		//System.out.println(al.remove("Java"));
		//System.out.println("After removing elements from the array List"+al);
	 
		// Retrieve specific elements
		
		System.out.println(al.get(2));
	
	    // change element
		al.set(2, "Python");
		System.out.println("after change the value"+al);
	
	
	// search --- contains // returns true or false
		
		System.out.println(al.contains("java"));
	
		System.out.println(al.contains("Python"));
	
	// is Empty
		System.out.println(al.isEmpty());
	
	
	// Reading elements from the ArrayList
		//1) using for loop
		
		/*
		 * System.out.println("Reading elements from the ArrayList"); 
		 * for(int i=0;i<al.size();i++) 
		 * { 
		 * System.out.println(al.get(i));
		 *  }
		 */
	     //2) using for each loop
		
		
		/*
		 * System.out.println("Reading elements from the ArrayList");
		 * 
		 * for(Object e:al) { System.out.println(e); }
		 * 
		 */
	
	// using Iterator 
		
		Iterator it= al.iterator();
	     while(	it.hasNext())
	{
		System.out.println(it.next());
	}
	
	
	
	
	
	}

}
