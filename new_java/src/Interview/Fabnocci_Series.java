package Interview;


// series 01235813
public class Fabnocci_Series {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.print(n1+" "+n2);//     0 1
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;
			System.out.print(sum);
		n1=n2;// n1=0
		n2=sum; //  1
		
		}
		
	}

}
