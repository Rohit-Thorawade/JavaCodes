package com.javapractice.oopsconcepts;


class Account
{
	public String name;
	protected int number;
	private String pwd;
	
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void show()
	{
		System.out.println(name+" "+number+" "+pwd);
	}
	
}
public class TestEncapsulation {
	
	public static void main(String[] args) {
		
		
		Account a = new Account();
		
		a.name="rohit00";
		a.number=123;
		
		a.setPwd("hery");
		
		a.show();
		
		
	}

}
