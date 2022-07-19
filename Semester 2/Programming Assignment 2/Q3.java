/*
  	Write a Java program to declare a Class named as Student which contains roll number,
	name and course as instance variables and input_Student () and display_Student () as 
 	instance methods. A derived class Exam is created from the class Student . The derived 
 	class contains mark1, mark2, mark3 as instance variables representing the marks of three 
 	subjects and input_Marks () and display_Result () as instance methods. Create an array of 
 	objects of the Exam class and display the result of 5 students.
*/

import java.util.Scanner;
class Student
{
	String name;
	int roll_number;
	String course;
	Scanner sc = new Scanner(System.in);
	
	void input_Student(String n, int r, String c)
	{
		this.name=n;
		this.roll_number=r;
		this.course=c;
	}
	void display_Student()
	{
		System.out.println("NAME : "+name);
		System.out.println("ROLL : "+roll_number);
		System.out.println("CORSE : "+course);
	}
}


class Exam extends Student
{
	int mark1, mark2, mark3;
	
	void inputMarks(int m1, int m2, int m3)
	{
		this.mark1=m1;
		this.mark2=m2;
		this.mark3=m3;
	}
	void display_result()
	{
		super.display_Student();
		System.out.println("Marks1 : "+mark1);
		System.out.println("Marks2 : "+mark2);
		System.out.println("Marks3 : "+mark3);
	}
}


public class Q3 
{
	public static void main(String[] args) 
	{
		Exam[] e = new Exam[5];@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i;
		for (i=0; i<5; i++)
		{
			e[i] = new Exam();
			
			System.out.println("**Fillup student details**");			
			System.out.print("Enter name : ");
			String n = sc.next();
			System.out.print("Enter roll number : ");
			int r = sc.nextInt();
			System.out.print("Enter course : ");
			String c = sc.next();
			e[i].input_Student(n, r, c);
			
			System.out.println("\n**Enter marks of three subjects**");
			System.out.print("Enter marks1 : ");
			int m1 = sc.nextInt();
			System.out.print("Enter marks2 : ");
			int m2 = sc.nextInt();
			System.out.print("Enter marks3 : ");
			int m3 = sc.nextInt();
			e[i].inputMarks(m1, m2, m3);
		}
		
		for (i=0; i<5; i++)
		{
			System.out.println("\nStudent_"+(i+1));
			e[i].display_Student();
			e[i].display_result();
		}
	}
}