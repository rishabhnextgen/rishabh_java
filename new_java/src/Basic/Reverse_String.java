package Basic;
import java.util.*;

public class Reverse_String {

	    public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		
		String str = scn.nextLine();
		char[] ch= str.toCharArray();
		System.out.println("reverse of the string is");
         int j= ch.length;
          for(int i=j; i>0;i--)
{
	      System.out.print(ch[i-1]);
}
	}

}
