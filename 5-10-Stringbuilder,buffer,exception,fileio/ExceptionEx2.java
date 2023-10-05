package com.a510;

public class ExceptionEx2 
{
	static void validate(int age)
	{
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) 
	{
		
		validate(15);
		
	
		
	}
}
