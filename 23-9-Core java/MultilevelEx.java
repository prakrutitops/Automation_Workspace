package com.oop;

class A1
{
	//Method
	void a()
	{
		System.out.println("A Accessed");
	}
	
}
class B1 extends A1
{
	//Method
		void b()
		{
			System.out.println("B Accessed");
		}
}
class C1 extends B1
{
	//Method
			void c()
			{
				System.out.println("C Accessed");
			}
}
class D1 extends C1
{
	//Method
			void d()
			{
				System.out.println("D Accessed");
			}
}


public class MultilevelEx 
{
	public static void main(String[] args) {
		
		
		D1 d =new D1();
		
		d.a();
		d.b();
		d.c();
		d.d();
		
	}
}
