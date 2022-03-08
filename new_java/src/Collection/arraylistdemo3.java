package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylistdemo3 {

	
	// Convert Array into arrayList

	
	public static void main(String[] args) {
		
		String arr[]= {"dog","cat","monkey"};// array 
		
		//print alll value of array
		
		for(String value:arr)
		{
			System.out.println(value);
		}

ArrayList al= new ArrayList(Arrays.asList(arr));// convert into array list

	
	
	System.out.println(al);
	
	}
}