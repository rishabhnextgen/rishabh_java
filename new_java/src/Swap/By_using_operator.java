package Swap;

public class By_using_operator {

	public static void main(String[] args) {
	int a= 100;
	int b=200;
	System.out.println("after swapping number is" +a+" "+b);
	
	/*
	 * a=a+b; // now a= 300
	 *  b=a-b; // now b= 100 
	 *  a=a-b; // now a= 200
	 */
	
	a=a*b;  //now a= 20000
	b= a/b; // now b= 100
	a=  a/b; //now a= 200
	System.out.println("before swapping number is" +a+" "+b);

	}

}
