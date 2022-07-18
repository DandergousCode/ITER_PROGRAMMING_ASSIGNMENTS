/*
  	Create a class Point with instance variables x, y to represent co-ordinates of point and 
	instance method setPoint(). Write a Java program to find distance between two points using 
	a method findDistance(Point,Point).
*/

import java.util.Scanner;
class Point
{
	int  x,y;
	int distance;
	
	void setPoint()
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter co-ordinate : ");
		x = sc.nextInt();
		y = sc.nextInt();
	}
	void findDistance(Point p1, Point p2)
	{
		int a=p1.x-p2.x;
		int b=p1.y-p2.y;
		distance = (int)Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		System.out.println("First point is ("+p1.x+","+p1.y+")");
		System.out.println("Second point is ("+p2.x+","+p2.y+")");
		System.out.println("Distance between two points "+distance);
	}
}



public class Q11 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		
		System.out.println("Enter for point_1");
		p1.setPoint();
		System.out.println("Enter for point_2");
		p2.setPoint();
		p3.findDistance(p1,p2);
	}
}