/*
  	Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a 
 	java program to display area of different shapes. 
*/

abstract class Shape
{
	abstract void area();
}

class Square extends Shape
{
	@Override
	public void area()
	{
		System.out.print("Area of the square : ");
		double side=4;
		double sa = Math.pow(side, 2);
		System.out.println(sa);
	}
}

class Triangle extends Shape
{
	@Override
	public void area()
	{
		System.out.print("Area of the triangle : ");
		double b=4;
		double h=3;
		double ta=(b*h)/2;
		System.out.println(ta);
	}
}

class Circle extends Shape
{
	@Override
	public void area()
	{
		System.out.print("Area of the circle : ");
		double r=10;
		double ca=Math.PI*Math.pow(r, 2);
		System.out.println(ca);
	}
}


public class Q6 
{
	public static void main(String[] args) 
	{
		Square s = new Square();
		Triangle t = new Triangle();
		Circle c = new Circle();
		s.area();
		t.area();
		c.area();
	}
}