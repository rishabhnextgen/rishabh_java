package Interview;

public class Reverse_string {
	public static void main(String[] args) {
		
		String name= "Atal";
		int length= name.length();
		String rev="";
		for(int i=length-1;i>=0;i--)
			
		{
			rev= rev+name.charAt(i);
			
		}
		System.out.println(rev);
	}

}
