package Basic;


class neeraj{
	void write()
	{
		System.out.println("neeraj can write better");
		
	}

void sing()
{
	System.out.println("neeraj can sing a song");
}
}
class rishabh extends neeraj
{
	
	
	void run()
	{
		System.out.println("rishabh can run better");
	}
void cook()
{
	System.out.println("rishabh can cook better");
}

}



public class Overloading {

	public static void main(String[] args) {
	rishabh r= new rishabh();
	r.write();
	r.sing();
	r.cook();
	
	

	}

}
