import java.util.Scanner;
class PointType
{
	double x,y;
	void setData_Point(double x, double y)
	{
		this.x=x;
		this.y=y;
	}
	void display_Point()
	{
		System.out.println("Point : "+x+", "+y);
	}
	double getX() {return x;}
	double getY() {return y;}
}

class CircleType extends PointType
{
	double r;
	
	double r(PointType ob1, PointType ob2)
	{
		r = Math.sqrt(Math.pow(ob1.x-ob2.x, 2));
		return r;
	}
	double area()
	{
		double a = Math.PI*Math.pow(r, 2);
		return a;
	}
	double circumference()
	{
		double cm = 2*Math.PI*r;
		return cm;
	}
}


public class Q4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		CircleType c = new CircleType();
		CircleType c1 = new CircleType();
		CircleType c2 = new CircleType();
		
		System.out.println("First point co-ordinate: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		c1.setData_Point(x, y);
		
		System.out.println("Center point co-ordinate: ");
		double xx = sc.nextDouble();
		double yy = sc.nextDouble();
		c2.setData_Point(xx, yy);
		
		System.out.println("Co-Ordinate: ");
		c1.display_Point();
		System.out.println("Center");
		c2.display_Point();
		
		double r = c.r(c1, c2);
		System.out.println("Radius : "+r);
		double a = c.area();
		System.out.println("Area : "+a);
		double cmf = c.circumference();
		System.out.println("Circumference : "+cmf);
		sc.close();
	}
}