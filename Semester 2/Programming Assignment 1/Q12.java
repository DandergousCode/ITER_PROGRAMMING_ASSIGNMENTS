/*
  	Write a Java class Flower that has three instance variables of type String, int, and float, 
	which respectively represent the name of the flower, its number of petals, and price. Your 
	class must include a method that initializes each variable to an appropriate value, and your 
	class should include methods for setting the value of each type, and getting the value of each
	type.
*/

class Flower
{
	String name_of_the_flower;
	int noOF_petals;
	int price;
	
	public String getName_of_the_flower() 
	{
		return name_of_the_flower;
	}
	public int getNoOF_petals() 
	{
		return noOF_petals;
	}
	public int getPrice() 
	{
		return price;
	}
	
	
	public void setName_of_the_flower(String name_of_the_flower) 
	{
		this.name_of_the_flower = name_of_the_flower;
	}
	public void setNoOF_petals(int noOF_petals) 
	{
		this.noOF_petals = noOF_petals;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
}



public class Q12 
{
	public static void main(String[] args) 
	{
		Flower f = new Flower();
		f.setName_of_the_flower("Rose");
		f.setNoOF_petals(10);
		f.setPrice(8);
		
		System.out.println("Flower : "+f.getName_of_the_flower()+"\n"+"Petals : "+f.getNoOF_petals()+"\n"+"Price : "+f.getPrice());
	}
}