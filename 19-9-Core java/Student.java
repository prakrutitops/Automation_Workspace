package com.oop;

public class Student 
{
	
	int id;
	String fname,lname;
	
	public static void main(String[] args) 
	{
		//Object
		//classname objname = new classname();
		
		Student s1 = new Student();
		
		s1.id=101;
		s1.fname="Urvi";
		s1.lname="Mandani";
		
		Student s2 = new Student();
		
		s2.id=102;
		s2.fname="Aditya";
		s2.lname="Hingrajiya";
		
		System.out.println(s1.id+" "+s1.fname+" "+s1.lname);
		System.out.println(s2.id+" "+s2.fname+" "+s2.lname);
		
		
		
	}
	
}
