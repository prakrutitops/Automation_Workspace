package com.a1310;

import java.util.LinkedHashSet;

public class LinkedHashSetEx1 
{
	public static void main(String[] args) {
		
		LinkedHashSet<String>set = new LinkedHashSet<>();
		
		set.add("ankit");
		set.add("bcd");
		set.add("curie");
		set.add("ditroit");
		set.add("ankit");
		
		System.out.println(set);
		
	}
}
