/*
 	Define an interface to declare methods display ( ) & count ( ). Another class contains a static 
 	data member maxcount, instance member name & method display ( ) to display name of a 
 	person, count the no. of characters present in the name of the person. 
*/
interface in1
{
	void display();
	void count();
}

class data implements in1
{
	static int maxcount;
	String member_name;
	
	@Override
	public void display()
	{
		System.out.println("Name of the person : "+member_name);
		System.out.println("Total characters present in the name : "+maxcount);
	}
	@Override
	public void count()
	{
		member_name = "Asguards";
		maxcount = member_name.replace("_", "").length();
	}
}


public class Q7 
{
	public static void main(String[] args) 
	{
		data d = new data();
		d.count();
		d.display();
	}
}