
public class Rev {

	public static void main(String[] args) {
		String a = "ANUPAM";
		int b= a.length();
		String rev="";
		for(int i=b-1;i>0;i--)
			{
			rev=rev+a.charAt(i);
			
		}
		System.out.println(rev);
	}

}
