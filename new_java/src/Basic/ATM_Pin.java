package Basic;
import java.util.*;
public class ATM_Pin {
	
	  public static void main(String[] args) {
	  
		  Scanner sn= new Scanner(System.in);
		  System.out.println("Enter the Pin");
		  int pin = sn.nextInt();
		  int c=273;
		 if (pin==c)
		 {
			System.out.println("PIN is Entered correctly");
		}
		  
		 else {
			 System.out.println("Pin is not correct");
		 }
	  }
	 

}
