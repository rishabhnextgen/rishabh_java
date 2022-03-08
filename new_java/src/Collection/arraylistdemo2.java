package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistdemo2 {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		al.add("a");
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("b");
		al.add("c");
		
		System.out.println("First array List"+al);
	// Add all ements in another arraylist
		
		ArrayList al2= new ArrayList();
		al2.addAll(al);
		
	
		System.out.println("second array List"+al2);
	
	
	// remove all elemnts from Arraylist
		
		al2.removeAll(al2);
	
	System.out.println("After removing "+al2);
	
	
	//sorting elements in the first array
	
	Collections.sort(al);
	
	System.out.println("After sorting "+al);
	// sorting in reverse order 
	
	Collections.sort(al,Collections.reverseOrder());
	System.out.println("After sorting in reverse order"+al);
	
	// Shuffle element 
	
	Collections.shuffle(al);
	System.out.println("after shuffle "+al);
	
	
	
	
	}

}
