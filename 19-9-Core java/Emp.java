package com.oop;

public class Emp 
{
	//Data Members,Variables
	int id;
	String fname,lname,email,mobile;
	
	//method
	void display()
	{
		//body part
		System.out.println(id+" "+fname+" "+lname+" "+email+" "+mobile);
	}
	
	
	public static void main(String[] args) 
	{
		//object
		Emp e1 = new Emp();
		
		//value assign
		e1.id=101;
		e1.fname="Prakruti";
		e1.lname="Vyas";
		e1.email="prakruti@gmail.com";
		e1.mobile="9275003605";
		
		Emp e2 = new Emp();
		
		e2.id=102;
		e2.fname="Mitesh";
		e2.lname="Vaja";
		e2.email="mitesh@gmail.com";
		e2.mobile="9724004242";
		
		
		Emp e3 = new Emp();
		
		e3.id=103;
		e3.fname="Brijesh";
		e3.lname="Pandey";
		e3.email="brijesh@gmail.com";
		e3.mobile="8899889978";
		
		/*
		 * System.out.println(e1.id+" "+e1.fname+" "+e1.lname+" "+e1.email+" "+e1.mobile
		 * );
		 * 
		 * System.out.println(e2.id+" "+e2.fname+" "+e2.lname+" "+e2.email+" "+e2.mobile
		 * );
		 * 
		 * System.out.println(e3.id+" "+e3.fname+" "+e3.lname+" "+e3.email+" "+e3.mobile
		 * );
		 */
		
		//Display
		e1.display();
		e2.display();
		e3.display();
		
		
		
		 
		
	}
	
}
