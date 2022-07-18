/*
  	Create a class Student with instance variables name, roll, mark and instance methods 
	setData(), display(). Write a Java program to create three objects of Student class to input 
	details of three different students and display the details. Enclose main() method inside 
	another class StudentDetails. (Use the setter method setData() to input details.)
*/

import java.util.Scanner;
class Student
{
	String name;
	int roll;
	int mark;
	Scanner sc = new Scanner(System.in);
	
	void setData()
	{
		System.out.print("Enter the name : ");
		name = sc.nextLine();
		System.out.print("Enter roll no : ");
		roll = sc.nextInt();
		System.out.print("Enter marks : ");
		mark = sc.nextInt();
	}
	void display()
	{
		System.out.println("Name of the student : "+name);
		System.out.println("Roll no : "+roll);
		System.out.println("Marks : "+mark);
	}
}


public class Q9 
{
	public static void main(String[] args) 
	{
		Student[] s = new Student[3];
		
		for (int i=0; i<s.length; i++)
		{
			s[i] = new Student();
		}
		for (Student student:s)
		{
			student.setData();
		}
		for (Student student:s)
		{
			student.display();
		}
	}
}