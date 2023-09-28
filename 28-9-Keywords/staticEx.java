package com.keywords;

public class staticEx 
{
	static int count =0;
	
	public staticEx() 
	{
		// TODO Auto-generated constructor stub
		
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		
		staticEx s1 =new staticEx();
		staticEx s2 =new staticEx();
		staticEx s3 =new staticEx();
		
		
	}
	
}
