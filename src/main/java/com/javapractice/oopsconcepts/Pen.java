package com.javapractice.oopsconcepts;


class Student
{
	String name;
	int rollno;
	int age;
	
	
	Student()
	{
		System.out.println("Default constructor calling !!!!!");
	}
	
	Student(String name , int rollno, int age)
	{
		this.name = name;
		this.age= age;
		this.rollno= rollno;
		
		System.out.println("paramterized constructor calling !!!!!");
	}
	
	Student(Student s2)
	{
		this.name = s2.name;
		this.age= s2.age;
		this.rollno= s2.rollno;
		
		System.out.println("copy constructor calling !!!!!");

	}
	
	
	public void info()
	{
		
		System.out.println(name+" "+rollno+" "+age);
	}
	
	
}


public class Pen {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name="rohit";
		s1.rollno=15;
		s1.age=23;

		s1.info();		
		
		Student s2 = new Student("yogesh",15, 26);	 // calling parameterized
		s2.info();
		
		
		Student s3 = new Student(s2); // copy constructor calling 
		s3.info();
		
		
	}
	
	

}
