package com.a1310;

import java.util.LinkedList;

public class LinkedListEx1 
{
	public static void main(String[] args) 
	{
		
		LinkedList<String>list = new LinkedList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.addFirst("e");//first
		list.addLast("f");//last
		
		System.out.println(list);
		
	}
}
