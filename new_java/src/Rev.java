
import java.util.*;
public class Rev {

	public static void main(String[] args) {
		
		  Scanner scn= new Scanner(System.in); 
		  System.out.println("Enter the string");
		  
		  String a= scn.nextLine();
		 
		
		int b= a.length();
		String rev=" ";
		for(int i=b-1;i>=0;i--)
			{
			rev=rev+a.charAt(i);
			
		}
		System.out.println(rev);
	}

}
