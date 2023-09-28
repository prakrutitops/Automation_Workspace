package com.keywords;


class M1
{
	String color="black";
}
class M2 extends M1
{
	String color="white";
	
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);//parent class value
	}
}


public class SuperEx 
{
	public static void main(String[] args)
	{
		M2 m =new M2();
		m.display();
	}
}
