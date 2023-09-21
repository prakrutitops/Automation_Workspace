package com.oop;

public class CopyEx 
{
	
	int id;
	String name;
	
	//1st constructor
	CopyEx(int i,String n) 
	{
		// TODO Auto-generated constructor stub
		id=i;
		name =n;
	}
	
	//2nd constructor
	CopyEx(CopyEx c)
	{
		System.out.println("C2 value :"+c.id+" "+c.name);
	}
	
	
	public static void main(String[] args) 
	{
		CopyEx c1 =new CopyEx(101,"A");
		CopyEx c2 =new CopyEx(c1);
		
	}
}
