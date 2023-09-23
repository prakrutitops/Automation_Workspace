package com.oop;

class D
{
	void d()
	{
		System.out.println("D");
	}
}
class E extends D
{
	void e()
	{
		System.out.println("E");
	}
}
interface F
{
	void f();
	
}
class G extends E implements F
{
	void g()
	{
		System.out.println("G");
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("F");
	}
}

public class HybridEx 
{
	public static void main(String[] args) {
		
		
		G g1 =new G();
		g1.d();
		g1.e();
		g1.f();
		g1.g();
	}
}
