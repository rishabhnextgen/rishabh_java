package Basic;

 class Dog {
	
	 void color()
	 {
		 System.out.println("this is dog color");
	 }
}

class cat extends Dog{
	void color2()
	{
		System.out.println("this is cat color");
	}
}
class rat extends cat{
	void color3()
	{
		System.out.println("this is rat color");
	}
}
public class Main {

	public static void main(String[] args) {
cat c= new cat();
c.color2();
rat r= new rat();
r.color2();

	}

}
