package com.poly;

public class OverloadingEx 
{
	
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a*b*c;
	}
	
	
	public static void main(String[] args) 
	{
		
		//when two or more methods having a same name
		//but number of parameters are diffrent
		
		
		System.out.println(add(2,3));//add
		System.out.println(add(6,5,2));//mul
		
	}
}
