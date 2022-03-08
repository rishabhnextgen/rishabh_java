package Collection;

import java.util.LinkedList;

public class linkedlistdemo3 {
	
	
	// Special meathod from Quee in Linked list
	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
		l.add("dog");
		l.add("dog");
		l.add("elephant");
		l.add("pig");
		l.add("gainda");

	System.out.println("Before adding "+l);
	l.addFirst("Tiger");
	l.addLast("Monkey");
	System.out.println(" After adding"+l);
	
	System.out.println(l.getFirst());
	
	System.out.println(l.getLast());
	
	
	//Remove first and Last element
	l.removeFirst();
	System.out.println("after removeing first element"+l);
	
	l.removeLast();
	System.out.println("after removing last element "+l);
	
	}

}
