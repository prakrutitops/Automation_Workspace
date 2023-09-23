package com.oop;

class A
{
	//Method
	void a()
	{
		System.out.println("A Accessed");
	}
	
}
class B extends A
{
	//Method
		void b()
		{
			System.out.println("B Accessed");
		}
}


public class SingleInEx 
{
	public static void main(String[] args) {
		
		
		B b1 =new B();
		
		b1.a();
		b1.b();
		
	}
}
