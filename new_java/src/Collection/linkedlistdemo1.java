package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistdemo1 {

	public static void main(String[] args) {
		// Daeclare linkedlist List 
		
				//LinkedList <Integer>l = new LinkedList<Integer>();
				//linkedList <String>l = new LinkedList<String>();
				//List l= new LinkedList();
				LinkedList l= new LinkedList();
				
				//Add new elements to linkedList
				l.add(100);
				l.add("Rishabh");
				l.add("Java");
				l.add(1.15);
				l.add(true);
				
				System.out.println("print all values of LinkedList"+l);
				
				// check size of Linkedlist
				
				System.out.println(l.size());
				
				//Remove elements to linkedList
				
				//l.remove(1);
				//l.remove("Java");
				//System.out.println(l.remove("Java"));
				//System.out.println("After removing elements from the linked List"+l);
			 
				// Retrieve specific elements
				
				System.out.println(l.get(2));
			
			    // change element
				l.set(2, "Python");
				System.out.println("after change the value"+l);
			
			
			// search --- contains // returns true or false
				
				System.out.println(l.contains("java"));
			
				System.out.println(l.contains("Python"));
			
			// is Empty
				System.out.println(l.isEmpty());
			
			
			// Reading elements from the LinkedList
				//1) using for loop
				
				/*
				 * System.out.println("Reading elements from the LinkedList"); 
				 * for(int i=0;i<l.size();i++) 
				 * { 
				 * System.out.println(l.get(i));
				 *  }
				 */
			     //2) using for each loop
				
				
				/*
				 * System.out.println("Reading elements from the LinkedList");
				 * 
				 * for(Object e:l) 
				 * {
				 *  System.out.println(e);
				 *   }
				 * 
				 */
			
			// using Iterator 
				
				Iterator it= l.iterator();
			     while(	it.hasNext())
			{
				System.out.println(it.next());
			}
			
			
			

	}

}
