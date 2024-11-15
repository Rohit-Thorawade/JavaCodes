package com.javapractice.oopsconcepts;

interface Animals
{
	void walk(); //By default public abstract
}

interface Herbivo
{
	void plant();
	
}
class Horses implements Animals, Herbivo
{

	public void walk() {
		// TODO Auto-generated method stub
		
		System.out.println("walk on 4 legs");
		
	}

	public void plant() {
		
		System.out.println("eating plant");
	}
	
}
public class TestPurerAbstraction {
	
	public static void main(String[] args) {
		
		Horses h = new Horses();
		h.walk();
		h.plant();
		
	}
	
	

}
