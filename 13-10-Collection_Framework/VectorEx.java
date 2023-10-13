package com.a1310;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) {
		
		Vector<String>v = new Vector<>(5);
		
		v.addElement("abcd");
		v.addElement("pqrs");
		v.addElement("defg");
		v.addElement("rtyu");
		v.addElement("rtyu");
		v.addElement("rtyu");
		v.addElement("defg");
		v.addElement("rtyu");
		v.addElement("rtyu");
		v.addElement("rtyu");
		v.addElement("rtyu");
		
		System.out.println("Size :"+v.size());
		System.out.println("Capacity: "+v.capacity());
		
		if(v.contains("huierhjktgrh"))
		{
			System.out.println("Data is available");
		}
		else
		{
			System.out.println("Data is not available");
		}
		
		
		
	}
}
