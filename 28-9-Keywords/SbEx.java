package com.keywords;

public class SbEx 
{

	//static block will always executed before main method
	
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome");
	}
	
	static
	{
		System.out.println("Hello");
	}
}
