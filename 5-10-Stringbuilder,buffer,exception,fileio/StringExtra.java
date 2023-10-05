package com.a510;

public class StringExtra 
{
	public static void main(String[] args)
	{
		
		String s1 ="sachin";
		String s2 ="SAURAV";
		String s3 ="  tops  ";
		String s4 = "xyz is a programing language. xyz is working with open source";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.trim());
		System.out.println(s1.startsWith("sa"));
		System.out.println(s1.endsWith("n"));
		System.out.println(s4.replace("xyz","java"));
	}
}
