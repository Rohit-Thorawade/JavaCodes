package com.javapractice.oopsconcepts;


class  Vehicle 
{
	String color;
	
	public void show()
	{
		System.out.println(" vehicle name ");
	}
	
}
class Car extends Vehicle 
{
	public void show()
	{
		System.out.println(" vehicle name Car ");
	}
}

class Truck extends Vehicle
{
	public void show()
	{
		System.out.println(" vehicle name Truck ");
	}
}

public class TestInheritance {
	
	public static void main(String[] args) {
		
		Car c = new Car();	
		c.color ="Red";	
		c.show();
		
		
		
	}

}
