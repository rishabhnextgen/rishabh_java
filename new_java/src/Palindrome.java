
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= scn.nextInt();
		
		int temp;
		temp=n;
		int sum=0;
		int rev;
		while(n>0)
		{
			rev=n%10;
			sum=sum*10+rev;
			n=n/10;
			}
		
		if(temp==sum)
		{
			System.out.println("It is palindrome number ");
		}
		else {
			System.out.println("not a palindrome ");
		}
	
	}
}