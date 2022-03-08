package Basic;

public class Constructor_Exmaple {
	
	public Constructor_Exmaple(int age, String name, String surname) {
		super();
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	int age;
	String name;
	String surname;
	
	void Details()
	{
		System.out.println(name +"this is student name details");
	}

	void full_details()
	{
		System.out.println(surname+ "this is full details");
	}
	
	public static void main(String[] args) {
		Constructor_Exmaple c1= new Constructor_Exmaple(12,"rishabh","srivastava");
		Constructor_Exmaple c2= new Constructor_Exmaple(43,"shayam","Asthana");
		c1.Details();
		c2.full_details();
		
		
		
		
		
	}

}
