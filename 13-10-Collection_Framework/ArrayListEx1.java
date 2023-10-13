package com.a1310;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String>arraylist = new ArrayList<>();
		
		arraylist.add("Android");
		arraylist.add("Java");
		arraylist.add("Php");
		arraylist.add("Ios");
		
		ArrayList<String>arraylist2 = new ArrayList<>();
		
		arraylist2.add("A1");
		arraylist2.add("B1");
		arraylist2.add("C1");
		arraylist2.add("D1");
		arraylist2.add("Android");
		
		//System.out.println(arraylist);
		
		//arraylist.addAll(arraylist2);
		//arraylist.remove(1);
		//arraylist.removeAll(arraylist2);
		
		arraylist.retainAll(arraylist2);//common detail
		
		//fetch detail
		Iterator <String> i = arraylist.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}
}
