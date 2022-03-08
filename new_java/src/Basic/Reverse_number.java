package Basic;
import java.util.*;

public class Reverse_number {

	public static void main(String[] args)
	{
		int num=0;

		int revers=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter tyhe number");
		
		 num = scn.nextInt();
		
		while (num!=0) 
		{
		revers=revers*10;
		revers=revers+num%10;
		
		}

	}

}
