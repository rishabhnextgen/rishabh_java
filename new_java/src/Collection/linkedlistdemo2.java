package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class linkedlistdemo2 {

	
	public static void main(String[] args) {
		
		
		LinkedList l= new LinkedList();
		
		l.add("a");
		l.add("x");
		l.add("y");
		l.add("z");
		l.add("b");
		l.add("c");
		
		System.out.println("First linked List"+l);
	// Add all ements in another Linkedlist
		
		LinkedList l2= new LinkedList();
		l2.addAll(l);
		
	
		System.out.println("second linked List"+l2);
	

		// remove all elemnts from Linkedlist
			
			l2.removeAll(l2);
		
		System.out.println("After removing "+l2);
		
		
		//sorting elements in the first array
		
		Collections.sort(l);
		
		System.out.println("After sorting "+l);
		// sorting in reverse order 
		
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("After sorting in reverse order"+l);
		
		// Shuffle element 
		
		Collections.shuffle(l);
		System.out.println("after shuffle "+l);
		
		
		
	}
}
