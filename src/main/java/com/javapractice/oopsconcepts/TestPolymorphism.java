package com.javapractice.oopsconcepts;

class Dog
{
	String name;
	int age;
	
	
	//method overloading
	public void sound(String name)
	{
		this.name=name;
		System.out.println(name+" barking!!!!");
	}
	
	public void sound(String name , int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name+" is of " +age+" years");
	}
	

	
	
}
public class TestPolymorphism {
	
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.sound("Tyson");
		d.sound("Tommy ",8);
		
		
		
	}

}
