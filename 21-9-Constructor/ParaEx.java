package com.oop;

public class ParaEx 
{
	//global variables
	int id;
	String name;
	
	//Parameterized
	public ParaEx(int id,String name) 
	{
		//local
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String[] args)
	{
		
		ParaEx p1 =new ParaEx(101,"A");
		ParaEx p2 =new ParaEx(102,"B");
		
		p1.display();
		p2.display();
	
	}
}
