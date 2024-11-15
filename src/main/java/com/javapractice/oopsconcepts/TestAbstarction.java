package com.javapractice.oopsconcepts;


abstract class Animal
{
	Animal()
	{
		System.out.println("Animal constructor");
	}
	abstract void show();
	
}
class Horse extends Animal
{
	
	Horse()
	{
		System.out.println("Horse constructor");
	}
	public void show()
	{
		System.out.println(" Horse ");
	}
}

class Chicken extends Animal
{
	public void show()
	{
		System.out.println(" Chicken ");
	}
}

public class TestAbstarction {
	
	public static void main(String[] args) {
		
		
		Horse h = new Horse();
		h.show();
		
	}

}
