package Basic;
import java.util.*;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class revere2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String str=scan.nextLine();
		String rev = "";
		int name=str.length();
		for(int i=name-1; i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
			
		}
		System.out.println(rev);

	}

}
